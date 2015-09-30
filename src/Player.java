import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Player {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //спрашиваем имя игрока
    public static void askPlayerName(Player player) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        System.out.println("Как тебя зовут, игрок?");
        do {
            name = reader.readLine();
            if (name.equals("")){
                System.out.println("Введите имя");
            }
        } while (name.equals(""));
        player.setName(name);
        System.out.println("Привет, " + player.getName() + "!");
    }

    //получаем координаты выстрела вручную
    int getShootX(){
        System.out.println("Куда стрелять?");
        System.out.println("Введите координату Х");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        int shootX = Integer.parseInt(s);
        System.out.printf("Вы ввели X:%s\n", s);
        return shootX;
    }
    int getShootY(){
        System.out.println("Введите координату Y");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        int shootY = Integer.parseInt(s);
        System.out.printf("Вы ввели Y:%s\n", s);
        return shootY;
    }


}
