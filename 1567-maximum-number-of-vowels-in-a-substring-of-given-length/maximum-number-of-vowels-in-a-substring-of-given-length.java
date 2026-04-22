class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0; i<k; i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        int max=count;
        for(int i=k; i<s.length(); i++){
            char newchar=s.charAt(i);
            if(newchar=='a' || newchar=='e' || newchar=='i' || newchar=='o' || newchar=='u'){
                count++;
            }
            char oldchar=s.charAt(i-k);
            if(oldchar=='a' || oldchar=='e' || oldchar=='i' || oldchar=='o' || oldchar=='u'){
                count--;
        }
        max=Math.max(count,max);
        
    }
   return max;
}
}