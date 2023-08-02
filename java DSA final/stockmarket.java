import java.util.*;
public class stockmarket {
    public static int buyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit =0;
     
        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice; // today profit
                maxProfit=Math.max(maxProfit,profit);   
            }
            else{
                buyPrice= prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String []a)
{


    int prices[]={7,1,5,2,6,4};
    System.out.println(buyAndSellStock(prices));
}   
}
