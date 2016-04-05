import java.util.Arrays;

class Field {
    private char[][] arr = new char[20][20];

    void fill(){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (i == 0 || i == 19) {
                    arr[i][j] = '#';
                }else{
                    if (j == 0 || j == 19){
                        arr[i][j] = '#';
                    }else{
                        arr[i][j] = ' ';
                    }
                }
            }
        }
    }

    void draw() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

/*        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }*/
    }
}
