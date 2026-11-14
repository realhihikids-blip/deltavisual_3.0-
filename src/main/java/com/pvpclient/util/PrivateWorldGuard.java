package com.pvpclient.util;

import com.pvpclient.config.ConfigManager;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ServerInfo;

public final class PrivateWorldGuard {
    private PrivateWorldGuard() {}

    public static boolean isAuthorized(MinecraftClient mc) {
        return true;
    }
}