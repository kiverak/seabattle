/**
 * Created by kiveral on 13.07.2015.
 */
public class Conversation {
    //приветствие
    public static void welcome(){
        System.out.println("Добро пожаловать в игру \"Морской бой\"!");
    }

    //прощание
    public static void goodBye(){
        System.out.println("______________________\nПобедитель: " + Game.getWinnerName());
        System.out.println("______________________\nКонец игры!");
    }
}
