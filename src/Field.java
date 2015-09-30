public class Field {
    private static final int SIZE_X = 10;
    private static final int SIZE_Y = 10;
    private static char[][] cells = new char[SIZE_X][SIZE_Y];

    public static void init(){
        System.out.println("Инициализация игрового поля.");
        for (int i = 0; i < SIZE_X; i++) {
            for (int j = 0; j < SIZE_Y; j++) {
                cells[i][j] = '*';
            }
        }
    }

    public static void showField(){
        System.out.print("  ");
        for (int i = 0; i < SIZE_X; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE_X; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE_Y; j++) {
                System.out.print(cells[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getSizeX() {
        return SIZE_X;
    }

    public static int getSizeY() {
        return SIZE_Y;
    }
}
