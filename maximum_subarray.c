/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

*/

int maxSubArray(int* a, int n){
    
   int sum=0,i,j=0;  //sum is used to find sum of every subarray in each round
    int max_1=a[0],c=0,max_2=0;  //max_1 is used to find maximum in each round
    int t[n];				// array 't' consists of maximums of each round and max_2 is the maximum among them.
    for(i=0;i<n;i++)
    {
       
        sum+=a[i];
        if(max_1<sum)
            max_1=sum;
       
        if(i==n-1&&c!=n)
        {
            i=c;
            c++;  // c is used to continue looping
            t[j]=max_1; //max of each round is stored in array 't'
            j++;
            sum=0;
            continue;
        }
    }
    max_2=t[0];
    for(i=0;i<n;i++)
    {
        if(max_2<t[i])
        max_2=t[i];
    }

return max_2;

}