class Solution {
    public int[] twoSum(int[] nums, int target) {
      int a, b, ans;
        int[] okans = new int[2];
        


        for (int k = 0; k < nums.length; k++) {
            a = nums[k];
            for (int j = k+1; j < nums.length; j++) {
                b = nums[j];
                ans = a + b;
                if (ans == target) {
                    okans = new int[]{k,j};
                   
                }
            }
        }
       return okans;  }
       
    }
