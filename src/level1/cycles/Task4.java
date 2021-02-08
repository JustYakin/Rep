package level1.cycles;

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        BigInteger s = BigInteger.valueOf(1);
        for(int i = 1; i < 201; i++) {
            s = s.multiply(BigInteger.valueOf( i * i));
        }
        System.out.println(s);
    }
}

