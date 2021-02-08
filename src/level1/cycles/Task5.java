package level1.cycles;

import java.io.Console;

public class Task5 {
    public static void main(String[] args) {
        double eps = 2;
        int n = 50;
        double sum = 0;

        double[] a = new double[n];

        for (int i = 0; i < a.length; i++)
        {
            a[i] = (-1) ^ i / (i + 1) ^ (i + 1);// т.к.начинаем с 0, то i увеличиваем на 1

            if (Math.abs(a[i]) >= eps)
                sum = sum + a[i];
        }
        System.out.println(sum);
    }

}
//не шарю и не уверен тчо правильно

