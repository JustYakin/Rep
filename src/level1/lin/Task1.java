package level1.lin;

public class Task1 {
    public static void main(String[] args) {
        int a= 1;
        int b= 2;
        int c= 3;
        int z= task(a,b,c);
    }
    public static int task (int a, int b , int c) {
        int z = ((a-3)*b/2)+c;
        return z;
    }
}
