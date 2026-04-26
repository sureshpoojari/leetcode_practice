class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0;
         long   max=0;
        Map<Integer,Integer> map=new HashMap<>();
        int duplicates=0;
        for(int i=0; i<k; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
            map.put(nums[i],map.get(nums[i])+1);
            sum=sum+nums[i];
            if(map.get(nums[i])>1){
                duplicates+=1;
            }
        }
        if(duplicates==0){
            max=Math.max(max,sum);
        }
        for(int i=k; i<nums.length; i++){
            int numToadd=nums[i];
            int   numToRemove=nums[i-k];
                 if(!map.containsKey(numToadd)){
                map.put(numToadd,0);
        }
          map.put(numToadd,map.get(numToadd)+1);
          if(map.get(numToadd)>1){
                duplicates+=1;
 }
 sum=sum+numToadd;
 if(map.get(numToRemove)>1){
                duplicates-=1;
 }
 map.put(numToRemove,map.get(numToRemove)-1);
 sum=sum-numToRemove;
 if(duplicates==0){
    max=Math.max(max,sum);
 }
}
return max;
    }
}
