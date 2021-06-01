package com.tutrit.java.quickstart.magicball;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;

public class MainBall {
    public static void main(String[] args) {
        var log = LoggerFactory.getLogger("Asks");
        List <String> answers = List.of(
                //positive asks
                "It is certain",
                "It is decidedly so",
                "Without a doubt",
                "Yes — definitely",
                "You may rely on it",
                //indecisively positive asks
                "As I see it, yes",
                "Most likely",
                "Outlook good",
                "Signs point to yes",
                "Yes",
                //neutral asks
                "Reply hazy, try again",
                "Ask again later",
                "Better not tell you now",
                "Cannot predict now",
                "Concentrate and ask again",
                //negative asks
                "Don’t count on it",
                "My reply is no",
                "My sources say",
                "Outlook not so good",
                "Very doubtful"
        );
        var r = new Random();
        var rand = r.nextInt(50);
        log.info(answers.get(rand));
    }
}
