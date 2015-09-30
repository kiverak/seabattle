import java.io.IOException;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {

        Conversation.welcome();
        Game.startGame();
        Conversation.goodBye();
    }
}
