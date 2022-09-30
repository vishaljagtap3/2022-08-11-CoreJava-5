public class Employee {
    private int id;
    private String name;
    private int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public void display() {
        System.out.println("id = " + id + " name = " + name + " sal = " + sal);
    }

    //old increment
    public void increment() {
        //100 lines of code
        int perc1 = (sal * 2) / 100;
        //200 lines of code
        int perc2 = (sal * 5) / 100;
        //100 lines of code
        int perc3 = (sal * 3) / 100;

        int finalSal = sal + perc1 + perc2 + perc3;
        System.out.println("final sal = " + finalSal);
    }

    public void incrementNew() {

        class Percentage {
            public int calculate(int amt, int perc) {
                return (amt * perc) / 100;
            }
        }

        //100 lines of code
        Percentage p = new Percentage();

        int perc1 = p.calculate(sal, 2);
        //200 lines of code
        int perc2 = p.calculate(sal, 5);
        //100 lines of code
        int perc3 = p.calculate(sal, 3);

        int finalSal = sal + perc1 + perc2 + perc3;
        System.out.println("final sal = " + finalSal);
    }


}


