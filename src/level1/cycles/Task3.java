package level1.cycles;

public class Task3 {
    public static void main(String[] args) {
        double result = 0;
        for (int i = 1; i <101 ; i++) {
            result = result + Math.pow(i,2);
        }
        System.out.println(result);
    }

}

