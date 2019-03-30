package main.java.pro.gamerexde.bot.Events;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.events.guild.member.GuildMemberLeaveEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**Created by Gamerexde**/
/**https://github.com/Gamerexde**/
/**-------------------------------*/
/**Enjoy!**/

public class LeaveEvent extends ListenerAdapter {
    public void onGuildMemberLeave(GuildMemberLeaveEvent e){
        /**Put your Text Channel Name here, copy the emojis and paste it if your*/
        /**text channels have emojis on it.*/
        TextChannel textChannel = e.getGuild().getTextChannelsByName("TEXT_CHANNEL_NAME",true).get(0);

        EmbedBuilder eb = new EmbedBuilder();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        eb.setTitle("Goodbye, " + e.getUser().getName() +"...", null);

        eb.setColor(Color.red);

        eb.setDescription("It's a shame that you have to go so early ... Continue your path outsider! ");
        eb.addField("", "Remember to read the rules if your withdrawal was a Punishment! " + "[Community Rules](https://rules.link)", false);
        eb.setThumbnail(e.getUser().getAvatarUrl());
        eb.setFooter("This user left the server on @ " + formatter.format(date), e.getGuild().getIconUrl());

        textChannel.sendMessage(eb.build()).queue();

    }
}
