class Solution {
    public int romanToInt(String s) {
       
		int sum = 0;
		int num = 0;

		for(int i= 0; i<s.length(); i++){
            if(i+1 < s.length()){

               
                if (s.charAt(i)=='I' && s.charAt(i+1) != 'V' && s.charAt(i+1) != 'X'){
					num=1;
				}
                else if (s.charAt(i)=='I' && s.charAt(i+1) == 'V' ){
					num=4;
                    i++;
				}
                else if (s.charAt(i)=='I' && s.charAt(i+1) == 'X' ){
					num=9;
                    i++;
				}
				else if(s.charAt(i)=='V'){
					num=5;
				}
				else if(s.charAt(i)=='X' && s.charAt(i+1) != 'L' && s.charAt(i+1) != 'C'){
					num=10;
				}
                else if(s.charAt(i)=='X' && s.charAt(i+1) == 'L'){
                    num=40;
                    i++;
                }
				else if(s.charAt(i)=='L'  ){
					num=50;
				}
                else if(s.charAt(i)=='X' && s.charAt(i+1) == 'C'){
                    num=90;
                    i++;
                }
				else if(s.charAt(i)=='C' && s.charAt(i+1) != 'D' && s.charAt(i+1) != 'M'){
					num=100;
				}
                else if(s.charAt(i)=='C' && s.charAt(i+1) == 'D' ){
					num=400;
                    i++;
				}
                 else if(s.charAt(i)=='C' && s.charAt(i+1) == 'M' ){
					num=900;
                    i++;
				}
				else if(s.charAt(i)=='D'){
					num=500;
				}
				else if(s.charAt(i)=='M'){
					num=1000;
				}
               
            }
            else {
                switch(s.charAt(i)) {
                 case 'I': num = 1; break;
                 case 'V': num = 5; break;
                 case 'X': num = 10; break;
                 case 'L': num = 50; break;
                 case 'C': num = 100; break;
                 case 'D': num = 500; break;
                 case 'M': num = 1000; break;
            }
            }

		    sum+=num;
        }
        return sum;
	}

    }		

