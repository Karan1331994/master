/*Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4


Approach 4: Bit Manipulation
Concept

If we take XOR of zero and some bit, it will return that bit
a xor 0 =a^0=a
If we take XOR of two same bits, it will return 0
a ^ a =0
a ^ b ^ a = (a ^ a) ^ b = 0 ^ b =b
So we can XOR all bits together to find the unique number.*/



int singleNumber(int* nums, int numsSize){

    int i,a=0;
    for(i=0;i<numsSize;i++)
    {
        a=a^nums[i];
    }
    return a;
}

/*
Complexity Analysis

Time complexity : O(n). We only iterate through "nums", so the time complexity is the number of elements in nums.

Space complexity : O(1)
*/