public class LengthOfLastWord {
    public static void main(String[] args) {
    String s = "Today is a nice day asdfsg" ;

    System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s) {

        String[] kelimeler = s.split(" ");
//        int length = 0 ;
//        for (int i = 0 ; i < kelimeler.length ; i++){
//            length = kelimeler[kelimeler.length-1].length();
//        }
//      return length ;
        return kelimeler[kelimeler.length-1].length() ;

    }
}
