package level1.branching;

public class Task5 {
    public static void main(String[] args) {
        double x=2.5;
        System.out.println(task(x));
    }
    public static double task(double x) {
        double z;
        if (x<=3) {
            z=Math.pow(x,2)-3*x+9;
        }
        else z=1/(Math.pow(x,3)+6);

        return z;
    }
}
//вроде так
