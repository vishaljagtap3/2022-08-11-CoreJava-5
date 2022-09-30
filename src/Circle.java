public class Circle extends Shape {
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("x = " + getX()  + " y = " + getY());
        System.out.println("r = " + r);
     }
}
