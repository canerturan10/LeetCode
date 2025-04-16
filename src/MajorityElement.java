public class MajorityElement {
    public static void main(String[] args) {
        int [] ary = {2,3,3,3,2,1};
        int x = majority(ary);
        System.out.println(x);

    }
    public static int majority(int [] ary){

        int sayac = 0;
        int max = 0;
        int sonuc = 0 ;

        for (int i = 0 ; i < ary.length ; i++){
           sayac = 0 ;
            for (int j = i  ; j < ary.length ; j++){
                if (ary[i] == ary[j]){
                    sayac++;

                }
            }
            if (sayac > max){
                max = sayac ;
                sonuc = ary[i];
            }
        }
        return sonuc ;
    }
}
