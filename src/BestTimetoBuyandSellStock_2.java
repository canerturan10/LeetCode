public class BestTimetoBuyandSellStock_2 {
    public static void main(String[] args) {

            int [] ary = {7,1,5,3,6,4};
            System.out.println(maxProfit(ary));


    }

    public static int maxProfit(int[] prices) {
        int min = prices[0] ;
        int maxKar = 0 ;

        for (int i = 0 ; i < prices.length ; i++ ){
            if (prices[i] < min){
                min = prices[i];
            }else if (prices[i] - min  > maxKar){
                maxKar = prices[i] - min ;
            }

        }
        return maxKar ;
    }
}
