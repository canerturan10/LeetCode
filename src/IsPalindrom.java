public class IsPalindrom {
    public static void main(String[] args) {
        System.out.println(pali(1211));
    }
    public static boolean pali (int x){
        String number = Integer.toString(x) ;
        int uznlk = number.length();

        int soldan = 0 ;
        int sagdan =number.length()-1 ;
        int sayac = 0;

        while (soldan <= (uznlk/2)-1 && sagdan >= uznlk/2 && number.charAt(soldan) == number.charAt(sagdan) ){
            soldan++ ;
            sagdan-- ;
            sayac++;
        }
        if ((uznlk % 2 == 0) && sayac == (uznlk/2) ){
            return true;
        } else if ((uznlk % 2 !=0) && sayac == (uznlk/2)) {
            return  true ;
        }
        else {
            return false ;
        }
    }
}
