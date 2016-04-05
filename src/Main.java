public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        field.fill();
        Point point = new Point(9, 9, 'S');
        point.draw(field.getArr());
        field.draw();
    }
}
