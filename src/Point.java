import java.util.Random;

/**
 * Created by kiverak on 13.07.2015.
 */
public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //получение случайной точки на поле
    public static Point getRandomPoint() {
        Random random = new Random();
        return new Point(random.nextInt(Field.getSizeX()), random.nextInt(Field.getSizeY()));
    }
}
