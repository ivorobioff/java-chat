package local.me;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.configuration.BotConfiguration;

public class ChatService {
    private Chat chat = startChat();

    public String answer(String command) {
        return chat.multisentenceRespond(command);
    }

    private static Chat startChat() {
        var bot = new Bot(BotConfiguration.builder().name("dumb").path("src/main/resources").build());
        return new Chat(bot);
    }
}
