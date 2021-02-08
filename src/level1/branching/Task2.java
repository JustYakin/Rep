package level1.branching;

public class Task2 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        int d=-2;
        System.out.println(task(a,b,c,d));
    }
    public static int task(int a,int b,int c, int d) {
        return Math.max(Math.min(a,b), Math.min(c,d));
    }
}
//правильно ли?
