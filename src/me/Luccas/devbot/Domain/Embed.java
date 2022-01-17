package me.Luccas.devbot.Domain;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Objects;

public class Embed extends ListenerAdapter {



    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String [] message = event.getMessage().getContentRaw().split(" ");
        if(message.length == 1 && message[0].equalsIgnoreCase("!WellCome")){
        EmbedBuilder eb = new EmbedBuilder();
        eb.setAuthor("@"+event.getMember().getUser().getAsTag(),
                "https://cdn.discordapp.com/attachments/815332091994177557/932438282468483152/logo.jpg",
                "https://cdn.discordapp.com/attachments/815332091994177557/932438282468483152/logo.jpg");
        eb.setTitle("Entrada! " + ":clap:");
        eb.setDescription("@"+ event.getMember().getUser().getAsTag() + ", Seja Bem-Vindo a Gaseous Design");
        eb.setThumbnail("https://cdn.discordapp.com/attachments/815332091994177557/932438282468483152/logo.jpg");
        eb.setColor(Color.CYAN);
        eb.setImage("https://cdn.discordapp.com/attachments/815332091994177557/932474864323936376/bem-vindo.png");
        eb.setFooter("Gaseous Corp © Todos os Direitos Reservado! ", "https://cdn.discordapp.com/attachments/815332091994177557/932438282468483152/logo.jpg");
        eb.setTimestamp(Instant.now());
        event.getChannel().sendMessageEmbeds(eb.build()).queue();
        }

    }



}
