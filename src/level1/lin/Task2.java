package level1.lin;

public class Task2 {
    public static void main(String[] args) {
        double a= 1;
        double b= 2;
        double c= 3;
        double z= task(a,b,c);
        System.out.print(z);
    }
    public static double task (double a, double b , double c) {
        return ( ((b + Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a)) - Math.pow(a,3)*c + Math.pow(b,-2));
    }
}
