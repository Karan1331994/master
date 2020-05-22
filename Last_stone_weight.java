/*
We have a collection of stones, each stone has a positive integer weight.

Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)

Example 1:

Input: [2,7,4,1,8,1]
Output: 1
Explanation: 
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.
*/



class Solution {
    public int lastStoneWeight(int[] stones) {
        //int n=stones.length;
        while(stones.length!=1)
        {
            
           int n=stones.length; 
        int i,index=0;
        int max=stones[0];
        for(i=0;i<n;i++)
        {
            if(max<stones[i])
            {
                max=stones[i];
                // index=i;
                
            }
        }
        System.out.println("max is: "+max);
        
            
            List<Integer> arrayList = IntStream.of(stones) 
                                      .boxed() 
                                      .collect(Collectors.toList());
        
        arrayList.remove(new Integer(max));
        //arrayList.remove(new Integer(sMax)); 
        //arrayList.add(new Integer(diff));

        stones=arrayList.stream() 
            .mapToInt(Integer::intValue) 
            .toArray();
            
            arrayList.clear();
        
            n=stones.length;
        int max2=stones[0];
        for(i=0;i<n;i++)
        {
            if(max2<=stones[i])
            {
                max2=stones[i];     
            }
        }
            
             System.out.println("max2 is: "+max2);

            
            arrayList = IntStream.of(stones) 
                                      .boxed() 
                                      .collect(Collectors.toList());
        
        arrayList.remove(new Integer(max2));
        

        int diff=max-max2;
            
                    arrayList.add(new Integer(diff));

             stones=arrayList.stream() 
            .mapToInt(Integer::intValue) 
            .toArray();
            
        arrayList.clear();
            
            
        
        


        
        
        

        // for(int a:stones)
        // System.out.println(a);

        //n--;
        }
        
        
        
        
        
                return stones[0];

        
        
    }
}