package me.Luccas.devbot.Domain;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.time.Instant;
import java.util.List;

public class Join extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event){
        final List<TextChannel> textChannelsByName = event.getGuild().getTextChannelsByName("wellcome", true);
        final TextChannel please = textChannelsByName.get(0);
        EmbedBuilder eb = new EmbedBuilder();
        eb.setAuthor("@" + event.getMember().getUser().getAsTag(),
                null,
                "https://cdn.discordapp.com/attachments/815332091994177557/932438282468483152/logo.jpg");
        eb.setTitle("Entrada! " + ":clap:");
        eb.setDescription("@" + event.getMember().getUser().getAsTag() + ", Seja Bem-Vindo a Gaseous Design");
        eb.setThumbnail("https://cdn.discordapp.com/attachments/815332091994177557/932438282468483152/logo.jpg");
        eb.setColor(Color.black);
        eb.setImage("https://cdn.discordapp.com/attachments/815332091994177557/932474864323936376/bem-vindo.png");
        eb.setFooter("Gaseous Corp © Todos os Direitos Reservado! ",
                "https://cdn.discordapp.com/attachments/815332091994177557/932438282468483152/logo.jpg");
        eb.setTimestamp(Instant.now());
        please.sendMessageEmbeds(eb.build()).queue();
    }


}
