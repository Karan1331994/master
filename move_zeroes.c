/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

*/

void moveZeroes(int* nums, int numsSize){

    int newArr[numsSize];
    int i,c=0;
    for(i=0;i<numsSize;i++)
    {
        if(nums[i]!=0)
        {
            newArr[c]=nums[i];
            c++;
        }
    }
   
        if(c<numsSize)
        {
            while(c!=numsSize)
            {
                newArr[c]=0;
                c++;
            }
        }
    
    for(i=0;i<numsSize;i++)
    {
        nums[i]=newArr[i];
    }
     
            
    
}