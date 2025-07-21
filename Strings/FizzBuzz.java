class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> strArr = new ArrayList<>();

        for(int i=0; i< n; i++){
            if(((i+1) % 3 ==0) && ((i+1)%5==0)){
                strArr.add("FizzBuzz") ;
            } else if((i+1) % 3 ==0){
                strArr.add("Fizz");
            } else if((i+1)%5==0){
                strArr.add("Buzz");
            }
            else {strArr.add(String.valueOf(i+1));}
        }
        return strArr;
    }
}
