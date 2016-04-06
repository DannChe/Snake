import java.awt.event.KeyEvent;
import java.util.ArrayList;

class Snake extends Point {
    private ArrayList<Point> list;
    private int x;
    private int y;
    private char z;
    private Direction direction = Direction.RIGHT;
    private KeyboardObserver keyboardObserver = new KeyboardObserver();

    Snake(int x, int y, char z) {
        super(x, y, z);
        this.x = x;
        this.y = y;
        this.z = z;
        list = new ArrayList<>();
        keyboardObserver.start();
    }

    void createHead() {
        Point head = new Point(x, y, z);
        list.add(head);
    }

    public ArrayList<Point> getList() {
        return list;
    }

    @Override
    void draw(char[][] arr) {
        for (Point p : list) {
            p.draw(arr);
        }
    }

    void move() {
        if (keyboardObserver.hasKeyEvents()) {
            KeyEvent event = keyboardObserver.getEventFromTop();
            if (event.getKeyCode() == KeyEvent.VK_LEFT) {
                direction = Direction.LEFT;
            } else if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
                direction = Direction.RIGHT;
            } else if (event.getKeyCode() == KeyEvent.VK_UP) {
                direction = Direction.UP;
            } else if (event.getKeyCode() == KeyEvent.VK_DOWN) {
                direction = Direction.DOWN;
            }
        }

        for (Point p : list) {
            p.move(direction);
        }
    }
}
