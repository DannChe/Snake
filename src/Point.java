/**
 * Created by Denis on 4/5/2016.
 */
public class Point {
    private int x;
    private int y;
    private char z;

    public Point(int x, int y, char z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void draw(char arr[][]){
        arr[x][y] = z;
    }
}
