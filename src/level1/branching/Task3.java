package level1.branching;

public class Task3 {
    public static void main(String[] args) {
        int x1 =1;
        int x2 =2;
        int x3 =3;
        int y1 =1;
        int y2=2;
        int y3=3;
        System.out.println(task(x1,y1,x2,y2,x3,y3));
    }
    public static boolean task(int x1,int y1,int x2, int y2, int x3, int y3) {
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){
            return true;
        }
        else return false;
    }
}
//вроде правильно
