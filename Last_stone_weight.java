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