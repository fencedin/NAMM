package com.fencedin.namm.network;

import com.fencedin.namm.network.message.MessageTileEntityNAMM;
import com.fencedin.namm.reference.Reference;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class PacketHandler
{
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID.toLowerCase());

    public static void init()
    {
        INSTANCE.registerMessage(MessageTileEntityNAMM.class, MessageTileEntityNAMM.class, 0, Side.CLIENT);
    }
}