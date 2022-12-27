class Solution {
    public int romanToInt (String s) {
        int outp=0;
        int len= s.length();
        int slen= s.length()-1;

        for(int i=0;i<len;i++){
            switch(s.charAt(i)){
                case 'I': 
                            if(i != slen && (s.charAt(i+1)=='V'||s.charAt(i+1)=='X')){
                                outp-=1;
                            }
                            else{
                                outp+=1;
                            } 
                            break;

                case 'V':
                            outp+=5;
                            break;

                case 'X':
                        if(i != slen && (s.charAt(i+1)=='L'||s.charAt(i+1)=='C')){
                            outp-=10;
                        }
                        else{
                            outp+=10;
                        } 
                            break;
                case 'L':  
                            outp+=50;
                            break;
                case 'C':   
                            if(i != slen && (s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
                                outp-=100;
                            }
                            else{
                                outp+=100;
                            }
                            break;
                case 'D':   
                            outp+=500;
                            break;
                case 'M':   
                            outp+=1000;
                            break;
            }
        }
        return outp;
    }
}
