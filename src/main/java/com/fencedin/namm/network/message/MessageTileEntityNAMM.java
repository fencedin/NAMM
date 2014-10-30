package com.fencedin.namm.network.message;

import com.fencedin.namm.tileentity.TileEntityNAMM;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;

public class MessageTileEntityNAMM implements IMessage, IMessageHandler<MessageTileEntityNAMM, IMessage>
{
    public int x, y, z;
    public byte orientation, state;
    public String customName, owner;

    public MessageTileEntityNAMM()
    {
    }

    public MessageTileEntityNAMM(TileEntityNAMM tileEntityNAMM)
    {
        this.x = tileEntityNAMM.xCoord;
        this.y = tileEntityNAMM.yCoord;
        this.z = tileEntityNAMM.zCoord;
        this.orientation = (byte) tileEntityNAMM.getOrientation().ordinal();
        this.state = (byte) tileEntityNAMM.getState();
        this.customName = tileEntityNAMM.getCustomName();
        this.owner = tileEntityNAMM.getOwner();
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        this.x = buf.readInt();
        this.y = buf.readInt();
        this.z = buf.readInt();
        this.orientation = buf.readByte();
        this.state = buf.readByte();
        int customNameLength = buf.readInt();
        this.customName = new String(buf.readBytes(customNameLength).array());
        int ownerLength = buf.readInt();
        this.owner = new String(buf.readBytes(ownerLength).array());
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        buf.writeByte(orientation);
        buf.writeByte(state);
        buf.writeInt(customName.length());
        buf.writeBytes(customName.getBytes());
        buf.writeInt(owner.length());
        buf.writeBytes(owner.getBytes());
    }

    @Override
    public IMessage onMessage(MessageTileEntityNAMM message, MessageContext ctx)
    {
        TileEntity tileEntity = FMLClientHandler.instance().getClient().theWorld.getTileEntity(message.x, message.y, message.z);

        if (tileEntity instanceof TileEntityNAMM)
        {
            ((TileEntityNAMM) tileEntity).setOrientation(message.orientation);
            ((TileEntityNAMM) tileEntity).setState(message.state);
            ((TileEntityNAMM) tileEntity).setCustomName(message.customName);
            ((TileEntityNAMM) tileEntity).setOwner(message.owner);
        }

        return null;
    }

    @Override
    public String toString()
    {
        return String.format("MessageTileEntityNAMM - x:%s, y:%s, z:%s, orientation:%s, state:%s, customName:%s, owner:%s", x, y, z, orientation, state, customName, owner);
    }
}
