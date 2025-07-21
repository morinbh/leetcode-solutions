class Solution {
    public int titleToNumber(String columnTitle) {
        int num =0; //number of the title
        char ch [] = columnTitle.toCharArray();
        int j=0;
        
        for(int i=columnTitle.length()-1; i>0; i--){
            num += (ch[j] - 'A' + 1) * Math.pow(26, i); //Using ASCII to map 'A' to 1, ..., and 'Z' to 26
            j++;
        }

        num += ch[columnTitle.length()-1] - 'A' + 1; //adding the numerical value of the last letter
        return num;
    }
}
