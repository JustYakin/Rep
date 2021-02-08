package level1.branching;

public class Task4 {
    public static void main(String[] args) {
        int A=3;
        int B=4;
        int x=1;
        int y=2;
        int z=2;
        System.out.println(task(A,B,x,y,z));
    }
    public static boolean task(int A,int B,int x, int y, int z) {
        if ((x<=A&&y<=B)||(y<=A&&x<=B)||(x<=A&&z<=B)||(z<=A&&x<=B)||(z<=A&&y<=B)||(y<=A&&z<=B)){
            return true;
        }
        else return false;
    }
}
//вроде правильно
