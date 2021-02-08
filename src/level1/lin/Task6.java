package level1.lin;

    public class Task6 {
        public static void main(String[] args) {
            int x=1;
            int y=2;
            boolean z = task(x,y);
            System.out.println(z);
        }

        public static boolean task(int x , int y ) {
            if (x < 2 && x > (-2) && y < 4 && y>0) {
                return true;
            }
            if (x < 4 && x > (-4) && y > (-3)&& y <0) {
                return true;
            } else return false;
        }
    }
    //как считается принадлежность к фигуре? считаеться ли что точка ей принаджелит на линии границы?

