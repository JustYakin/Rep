package level1.cycles;

public class Task8 {
    public static void main(String[] args) {
    int x= 12354;
    int y= 534122;
    }

    public static int[] task(int x,int y){
        String numX = String.valueOf(x);
        String numY = String.valueOf(y);
        int resultX[] = new int[numX.length()]; //Требуемый массив X
        for (int i = 0; i < numX.length(); i++)
            resultX[i] = numX.charAt(i);
        int resultY[] = new int[numY.length()]; //Требуемый массив Y
        for (int i = 0; i < numY.length(); i++)
            resultY[i] = numY.charAt(i);
        return resultX;
}
}
//можно сделать через массивы но я не момню как
//нужно сделать каждое число массивом строк каждая будет являтся цифрой числа и нужно их сравнить
