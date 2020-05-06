/*
Say you have an array prices for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

Example 1:

Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Example 2:

Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.
Example 3:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
*/

int maxProfit(int* prices, int pricesSize){

    int min=prices[0],cd=0;
    int i=0;
    for(i=1;i<pricesSize;i++)
    {
        if(min>prices[i])
        {
            cd=1;
            break;
        }
        min=prices[i];
    }
    if(cd==0)
    {
        return prices[pricesSize-1]-prices[0];
    }
    cd=0;
    int max=prices[0];
    for(i=1;i<pricesSize;i++)
    {
        if(max<prices[i])
        {
            cd=1;
            break;
        }
        max=prices[i];
    }
    if(cd==0)
    {
        return 0;
    }
    int arr[pricesSize-1];
    for(i=1;i<pricesSize;i++)
    {
        arr[i-1]=prices[i]-prices[i-1];
    }
    int sum=0;
    for(i=0;i<pricesSize-1;i++)
    {
        if(arr[i]>0)
        {
            sum+=arr[i];
        }
    }
    return sum;
    
}