package level1.cycles;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;


public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int x = Integer.parseInt(str);

        System.out.println(task(x));
    }
    public static int task(int x) {
    int result = 0;
        for (int i = 0; i < x ; i++) {
         result = result+i;
     }
        return result;
    }
}
//все верно должно быть, еле вспомнил как это работает уже...
