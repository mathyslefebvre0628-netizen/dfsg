package com.twinsession.config;
import com.mojang.datafixers.util.Pair;
import static com.twinsession.TwinSession.MOD_ID;
public class ModConfigs {
 public static SimpleConfig CONFIG; private static ModConfigProvider configs;
 public static int MAX_PLAYERS; public static boolean AUTO_WHITELIST; public static boolean AUTO_OP; public static boolean SPAWN_NEAR_PLAYER; public static int SPAWN_NEAR_PLAYER_RADIUS; public static boolean COPY_TEXTURE; public static boolean PREFIX_WITH_NUMBER;
 public static void registerConfigs(){configs=new ModConfigProvider();createConfigs();CONFIG=SimpleConfig.of(MOD_ID).provider(configs).request();assignConfigs();}
 private static void createConfigs(){configs.addKeyValuePair(new Pair<>("maxPlayers",8),"Max amount of re-joins per client.");configs.addKeyValuePair(new Pair<>("autoWhitelist",true),"Automatically whitelist if whitelist is enabled.");configs.addKeyValuePair(new Pair<>("autoOp",true),"Automatically op if original client is also op.");configs.addKeyValuePair(new Pair<>("spawnNearPlayer",true),"Spawn near the player.");configs.addKeyValuePair(new Pair<>("spawnNearPlayerRadius",10),"Spawn radius.");configs.addKeyValuePair(new Pair<>("copyTexture",true),"Copy player texture.");configs.addKeyValuePair(new Pair<>("prefixWithNumber",true),"Prefix duplicate username with number.");}
 private static void assignConfigs(){MAX_PLAYERS=CONFIG.getOrDefault("maxPlayers",8);AUTO_WHITELIST=CONFIG.getOrDefault("autoWhitelist",true);AUTO_OP=CONFIG.getOrDefault("autoOp",true);SPAWN_NEAR_PLAYER=CONFIG.getOrDefault("spawnNearPlayer",true);SPAWN_NEAR_PLAYER_RADIUS=CONFIG.getOrDefault("spawnNearPlayerRadius",10);COPY_TEXTURE=CONFIG.getOrDefault("copyTexture",true);PREFIX_WITH_NUMBER=CONFIG.getOrDefault("prefixWithNumber",true);}
}
