package level1.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int m = Integer.parseInt(a);
        String b = reader.readLine();
        int n = Integer.parseInt(b);
        if (n<m) {
            System.out.println("неверный код");
        }
        else
            for (int i=m;i<=n;i++){
                System.out.println(i);
            }
    }
    public static void task (int a) {

        for (int i = 2; i <a; i++)

            if (a % i == 0)

                System.out.println(i + " ");

        System.out.println("");
    }
}
//не получается...
