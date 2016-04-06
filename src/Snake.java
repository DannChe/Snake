import java.util.ArrayList;

/**
 * Created by Denis on 4/6/2016.
 */
public class Snake extends Point{
    private ArrayList<Point> list;
    private int x;
    private int y;
    private char z;

    public Snake(int x, int y, char z) {
        super(x, y, z);
        this.x = x;
        this.y = y;
        this.z = z;
        list = new ArrayList<>();
    }

    void createHead(){
        Point head = new Point(x, y, z);
        list.add(head);
    }

    public ArrayList<Point> getList() {
        return list;
    }

    void tail(){
        Point last = list.get(list.size() -1);
        int x = last.getX();
        int y = last.getY();
        char z = last.getZ();

        Point tail = new Point(x, y-1, z);
        list.add(tail);
    }

    @Override
    void draw(char[][] arr) {
        for(Point p : list){
            p.draw(arr);
        }
    }
}
