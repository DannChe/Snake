
public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        field.fill();
        Snake snake = new Snake(9, 9, '@');
        snake.createHead();

        while(true){
            snake.draw(field.getArr());
            field.draw();
            snake.move();

            System.out.println();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
