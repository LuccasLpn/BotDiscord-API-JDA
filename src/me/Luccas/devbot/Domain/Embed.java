package me.Luccas.devbot.Domain;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.time.Instant;

public class Embed extends ListenerAdapter {



    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String[] message = event.getMessage().getContentRaw().split(" ");
        if (message.length == 1 && message[0].equalsIgnoreCase("!Convite")){
            EmbedBuilder eb = new EmbedBuilder();
            eb.setTitle("CONVITE");
            eb.setDescription("https://discord.gg/7cjscrhV");
            eb.setImage("https://cdn.discordapp.com/attachments/815332091994177557/932474864588165160/convite.png");
            eb.setFooter("Gaseous Corp © Todos os Direitos Reservado! ",
                    "https://cdn.discordapp.com/attachments/815332091994177557/932438282468483152/logo.jpg");
            eb.setTimestamp(Instant.now());
            event.getChannel().sendMessageEmbeds(eb.build()).queue();
        }
        else if (message.length == 1 && message[0].equalsIgnoreCase("!Horario")){
            EmbedBuilder eb = new EmbedBuilder();
            eb.setTitle(":watch: | Horário de atendimento");
            eb.setDescription("Segunda á Sabádo das 14H ás 00h \n Domingos: Fechado");
            eb.setColor(Color.BLACK);
            eb.setFooter("Gaseous Corp © Todos os Direitos Reservado! ",
                    "https://cdn.discordapp.com/attachments/815332091994177557/932438282468483152/logo.jpg");
            eb.setTimestamp(Instant.now());
            event.getChannel().sendMessageEmbeds(eb.build()).queue();
        }
    }
}





