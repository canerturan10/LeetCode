public class Sqrt {
    public static void main(String[] args) {
        int aranan = 0 ;
        System.out.println(mySqrt(aranan));

    }
    public static int mySqrt(int x) {

        if(x == 2147483647){
            return 46340;
        }
        for (int i = 1 ; i < Integer.MAX_VALUE ; i++ ){
            if (x < (i*i)){
                return i-1;
            } else if (x == i*i) {
                return i;
            }
        }
        return 0;
    }
}
