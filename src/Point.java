class Point {
    private int x;
    private int y;
    private char z;

    Point(int x, int y, char z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void draw(char arr[][]){
        arr[x][y] = z;
    }
}
