package main.java.pro.gamerexde.bot.Events;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

/**Created by Gamerexde**/
/**https://github.com/Gamerexde**/
/**-------------------------------*/
/**Enjoy!**/

public class JoinEvent extends ListenerAdapter {
    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent e){
        TextChannel textChannel = e.getGuild().getTextChannelsByName("TEXT_CHANNEL_NAME",true).get(0);


        EmbedBuilder eb = new EmbedBuilder();
        Member member = e.getMember();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        eb.setTitle("Welcome, " + e.getUser().getName() +"!", null);

        eb.setColor(Color.red);

        eb.setDescription("Welcome to This Discord Server !.Here you can share interesting topics, talk and meet people ect... ");
        eb.addField("", "Do not forget to read the rules of the community! " + "[Community Rules](https://rules.link)", false);
        eb.setThumbnail(e.getUser().getAvatarUrl());
        eb.setFooter("This user joined the day @ " + formatter.format(date), e.getGuild().getIconUrl());

        textChannel.sendMessage(eb.build()).queue();

    }


}
