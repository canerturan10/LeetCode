import java.util.Arrays;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int [] ary1 = {9,9,9,9,9,9,9} ;
        int [] ary2 = {9,9,9,9} ;

        System.out.println(Arrays.toString(addTwoNumbers(ary1, ary2)));

    }
    public static int[] addTwoNumbers ( int [] ary1 , int [] ary2){
        int toplam1 = 0;
        int toplam2 = 0;
        int uznlk1 = ary1.length;
        int uznlk2 = ary2.length;

        for (int i = ary1.length-1 ; i >= 0 ; i--){
            toplam1 = (int) Math.pow(10, uznlk1 - 1) * ary1[i]   + toplam1;
            uznlk1--;
        }
        for (int i = ary2.length-1; i >= 0 ; i--){
            toplam2 = (int) Math.pow(10, uznlk2 - 1) * ary2[i]   + toplam2;
            uznlk2--;
        }
        int toplam3 = toplam1 + toplam2 ;
        int basamakSayisi = (int) Math.log10(toplam3) + 1;
        int[] dizi = new int[basamakSayisi];
        int i = 0;

        while (toplam3 > 0 ){
            dizi[i] = toplam3 % 10 ;
            toplam3 /= 10 ;
            i++;

        }
        return dizi ;
    }
}
