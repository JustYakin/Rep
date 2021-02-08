package level1.branching;

public class Task1 {
    public static void main(String[] args) {
        double x = 15;
        double y = 12.5;
        System.out.println(suchestvuetli(x,y));
        System.out.println(priamougolniili(x,y));

    }
    public static String suchestvuetli (double x, double y) {
        if ((x+y)<180) {
            return "такой треугольник существует";
        }
        else return "такого треугольника не существует";

    }
    public static String priamougolniili (double x , double y) {
        if (x+y==90 || x==90 || y==90) {
            return "треугольник прямоугольный";
        }
        else return "треугольник не прямоугольный";
    }
}
