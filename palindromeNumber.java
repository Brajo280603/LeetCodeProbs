class Solution {
    public boolean isPalindrome(int x) {
       int num = x;
        int subj = x;
        int count=0;
        boolean ans;
        while(subj != 0){
            subj = subj/10;
            count++;
        }
        int[] arr = new int[count];
        
        
        for (int i =0;i<count;i++) {
            arr[i] = num % 10;
            num = num/10;
        }
        for(int i = 0;i<count;i++){
            num = num*10+arr[i];
        }
        if(x <  0){
            return false;
        }
        else if(x == num){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}
