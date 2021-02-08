package level1.lin;

public class Task4 {
    public static void main(String[] args) {
        double R = 123.456;
        double z=task(R);
        System.out.println(z);
    }
    public static double task(double R) {
        double n = (int)R;
        return n/1000.0 + (R - n)*1000;
    }
}
//ответ такой , потому что дабл содержит столько цифр в себе энивэй, не знаю как сделать всего 3 ! 456.12300000000306
