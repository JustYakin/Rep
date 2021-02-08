package level1.lin;

public class Task3 {
    public static void main(String[] args) {
    double x=1;
    double y=2;
    double z=task(x,y);
        System.out.println(z);
    }
    public static double task(double x,double y) {
        return ((Math.sin(x) + Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
    }
}
