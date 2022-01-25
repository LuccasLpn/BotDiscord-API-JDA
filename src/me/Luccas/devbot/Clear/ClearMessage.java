package me.Luccas.devbot.Clear;

import me.Luccas.devbot.AppBot;

import java.awt.*;
import java.util.*;
import java.util.List;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class ClearMessage extends ListenerAdapter {


    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
       String [] args = event.getMessage().getContentRaw().split("\\s+");

       if(args[0].equalsIgnoreCase(AppBot.prefix + "clear")){
          if(args.length < 2){
          }
          else {
              try {
                  List<Message> messages = event.getChannel().getHistory().retrievePast(Integer.parseInt(args[1])).complete();
                  event.getTextChannel().deleteMessages(messages).queue();

                  EmbedBuilder success = new EmbedBuilder();
                  success.setColor(Color.GREEN);
                  success.setTitle(":white_check_mark: Messagens Deletada");
                  event.getChannel().sendMessageEmbeds(success.build()).queue();
              }
              catch (IllegalArgumentException e){
                  if(e.toString().startsWith("")){
                      EmbedBuilder erro = new EmbedBuilder();
                      erro.setColor(0xff3923);
                      erro.setTitle(":x: Escolha Um Ranger Menor Para Deletar");
                      event.getChannel().sendMessageEmbeds(erro.build()).queue();
                  }
              }
          }
       }
    }
}
