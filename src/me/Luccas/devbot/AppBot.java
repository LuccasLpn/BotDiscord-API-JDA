package me.Luccas.devbot;

import me.Luccas.devbot.Domain.Embed;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;

public class AppBot implements EventListener{

    public static void main(String[] args) throws LoginException{

        JDA jda = JDABuilder.createDefault("")
                .addEventListeners(new AppBot())
                .build();
        jda.addEventListener(new Embed());
    }
    @Override
    public void onEvent(@NotNull GenericEvent genericEvent) {


    }
}
