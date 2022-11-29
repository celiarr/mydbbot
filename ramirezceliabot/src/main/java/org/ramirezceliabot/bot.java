package org.ramirezceliabot;

import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

import javax.security.auth.login.LoginException;

public class bot {
    private final ShardManager shardManager;

    public bot() throws LoginException {
        String token = "MTA0MzQwMzY0MTI3NDUxMTQ0MQ.GICxGK.iIdieLWITf-PQn7vU5pscPH9k7Wpys3h4jNVsk";
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);
        builder.setStatus(OnlineStatus.ONLINE);
        shardManager = builder.build();
    }

    /**
     * Retrieves the bot shard manager.
     * @return the ShardManager instance for the bot.
     */
    public ShardManager getShardManager() { return shardManager; }

    /**
     * Main method where we start our bot.
     */
    public static void main(String[] args) {
        try {
            bot  bot = new bot();
        } catch (LoginException e) {
            System.out.println("ERROR: Provided bot token is invalid!");
        }
    }
}
