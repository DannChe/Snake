import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        field.fill();
        Snake snake = new Snake(9, 9, '@');
        snake.createHead();

        while(true){
            snake.draw(field.getArr());
            field.draw();
            snake.tail();

            System.out.println();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
