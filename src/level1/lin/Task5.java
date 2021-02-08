package level1.lin;

public class Task5 {
    public static void main(String[] args) {
        int T = 12;
        String z = task(T);
        System.out.println(z);
    }

    public static String task(int T) {
        if (T<60) {
            int SS = T;
            int MM = 0;
            int HH = 0;
        }
        if (T>=60&&T<3600){
            int SS = T%60;
            int MM = (T - SS) /60;
            int HH = 0;
        }
        if (T>=3600) {
            int SS = T%60;
            int MM = (T%3600) /60;
            int HH = (T%3600)%60;
        }

    return "yes";
    }
}
//не могу понять как сделать это через функцию и мейн.
