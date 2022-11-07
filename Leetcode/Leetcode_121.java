/* Q 121.  You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example:

Input: prices = [7,1,5,3,6,4]
Output: 5
*/


class Solution {
    public int maxProfit(int[] prices) {
        int i,j,op=0,profit=0,min=Integer.MAX_VALUE;
        
        int len = prices.length;
        
        if(len <= 1)
            return 0;
        
        for(i=0,j=i+1;i<len;i++,j++)
        {
            if(prices[i] < min)
            {
                min = prices[i];
            }
            
            profit = prices[i] - min;
            
            if(op < profit)
            {
                op = profit;
            }
        }
        if(profit < 0)
            return 0;
        else
            return op;
    }
}