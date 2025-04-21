public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {
        int [] ary = {7,1,5,3,6,4};
        System.out.println(maxProfit(ary));

    }

    public static int maxProfit(int[] prices) {

        int maxKar = 0 ;

        for (int i = 0 ; i < prices.length ; i++){
           for (int j = i ; j < prices.length ; j++){
               if ((prices[j]-prices[i]) > maxKar){
                   maxKar = (prices[j]-prices[i]) ;
               }
           }
        }

        return maxKar ;
    }
}
