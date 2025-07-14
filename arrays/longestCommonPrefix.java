class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String shortest = strs[0] ;
        
       String commonPre ="";
        for(int i=0; i<shortest.length(); i++){
            if(strs[strs.length-1].charAt(i) != shortest.charAt(i)){
                     return commonPre;
                }    
            
            commonPre += shortest.charAt(i);
        }
            return commonPre;
    }
}
