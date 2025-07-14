class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        
       while(i >=0 ){
        if(digits[i] < 9){
            digits[i]++;
            return digits;
        }
        else {
            digits[i]=0;
            i--;
        }
       }
    
        //all digits are 9
        int [] new_digits = new int[digits.length+1];
            new_digits[0]=1;
            return new_digits;
        }
    }
