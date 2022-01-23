package me.Luccas.devbot;

import me.Luccas.devbot.Domain.Embed;
import me.Luccas.devbot.Domain.Join;
import me.Luccas.devbot.Domain.token;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;

public class AppBot implements EventListener{


    public static void main(String[] args) throws LoginException{
    token tk = new token();

        JDA jda = JDABuilder.createDefault(tk.getToken())
                .enableIntents(GatewayIntent.GUILD_MEMBERS)
                .addEventListeners(new AppBot())
                .build();
        jda.addEventListener(new Embed());
        jda.addEventListener(new Join());
    }
    @Override
    public void onEvent(@NotNull GenericEvent genericEvent) {


    }
}
