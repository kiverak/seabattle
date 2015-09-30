import java.io.IOException;
import java.util.Random;

public class Game {
    private static final int COUNT_OF_1_DECK_SHIPS = 4;
    private static final int COUNT_OF_2_DECK_SHIPS = 3;
    private static final int COUNT_OF_3_DECK_SHIPS = 2;
    private static final int COUNT_OF_4_DECK_SHIPS = 1;
    private static final int COUNT_OF_SHIPS = 10;
    private static Ship[] ships = new Ship[COUNT_OF_SHIPS];
    private static String winnerName;

    public static void startGame() throws IOException {
        Player player1 = new Player();
        Player player2 = new Player();
        Field field1 = new Field();
        Field field2 = new Field();

        Player.askPlayerName(player1);
        Player.askPlayerName(player2);
        field1.init();
        field2.init();
        field1.showField();
        System.out.println("_____________________\n");
        field2.showField();
        System.out.println("_____________________\n");
        createShips();

        winnerName = player1.getName();     //TODO определить победителя
    }

    public boolean isGameOver() {
        boolean isGameOver = true;          //TODO заглушка
        return isGameOver;
    }

    public static void createShips() {
        //создаём 4-палубные корабли
        for (int i = 0; i < COUNT_OF_4_DECK_SHIPS; i++) {
            ships[i] = new Ship(Point.getRandomPoint(), 4);          //создаём корабли

            //тут проверка на пересечение кораблей

            System.out.println("4-палубный корабль создан");
        }
        //создаём 3-палубные корабли
        for (int i = 0; i < COUNT_OF_3_DECK_SHIPS; i++) {
            ships[i] = new Ship(Point.getRandomPoint(), 3);          //создаём корабли

            //тут проверка на пересечение кораблей

            System.out.println("3-палубный корабль создан");
        }
        //создаём 2-палубные корабли
        for (int i = 0; i < COUNT_OF_2_DECK_SHIPS; i++) {
            ships[i] = new Ship(Point.getRandomPoint(), 2);          //создаём корабли

            //тут проверка на пересечение кораблей

            System.out.println("2-палубный корабль создан");
        }
        //создаём 1-палубные корабли
        for (int i = 0; i < COUNT_OF_1_DECK_SHIPS; i++) {
            ships[i] = new Ship(Point.getRandomPoint(), 1);          //создаём корабли

            //тут проверка на пересечение кораблей

            System.out.println("1-палубный корабль создан");
        }
    }

    public static String getWinnerName() {
        return winnerName;
    }
}