class Point {
    private int x;
    private int y;
    private char z;

    Point(int x, int y, char z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(char z) {
        this.z = z;
    }

    void draw(char arr[][]){
        arr[x][y] = z;
    }

    void move(Direction direction){
        switch(direction){
            case LEFT: y -= 1;
                break;
            case RIGHT: y += 1;
                break;
            case UP: x -= 1;
                break;
            case DOWN: x += 1;
                break;
        }
    }
}
