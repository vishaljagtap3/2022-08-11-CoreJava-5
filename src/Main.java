public class Main {
    public static void main(String[] args) {

        Printable p = new Printable() {
            @Override
            public void print(String filePath) {
                System.out.println(filePath + " printed...");
            }

            @Override
            public void info() {
                System.out.println("This is laser printer");
            }
        };
        p.print("/Users/vishal/java.pdf");
        p.info();

        Shape s = new Shape() {
            @Override
            public void draw() {
                System.out.println("x = " + getX() + " y = " + getY());
            }
        };
        s.draw();

        /*class CircleNew extends Shape {
            private  int r;

            @Override
            public void draw() {
                super.draw();
                System.out.println("r = " + r);
            }

            public int getR() {
                return r;
            }

            public void setR(int r) {
                this.r = r;
            }
        }

        CircleNew cn = new CircleNew();
        cn.setX(100);
        cn.setY(100);
        cn.setR(50);
        cn.draw();*/

        /*Circle c1 = new Circle();
        c1.setX(100);
        c1.setY(200);
        c1.setR(50);
        c1.draw();*/

        /*Employee e1 = new Employee(101, "AA", 1200);
        e1.display();
        e1.increment();*/

    }
}
