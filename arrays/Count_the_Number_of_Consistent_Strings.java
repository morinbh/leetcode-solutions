class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count =0;
        boolean consistent= true;

        for (String word : words){
            for(int i=0; i<word.length(); i++){
                String currentChar = String.valueOf(word.charAt(i)) ;
                if(!(allowed.contains(currentChar))){
                    consistent=false;
                    break;
                }  
            }
            if(consistent)
                count++;
            consistent=true;
        }
        return count;
    }
}
