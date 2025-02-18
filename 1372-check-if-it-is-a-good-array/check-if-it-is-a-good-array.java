class Solution {
    public boolean isGoodArray(int[] nums) {
        int result = nums[0];

        for(int element : nums){
            result = GCD(result,element);
        }
        if(result == 1){
            return true;
        }else{
            return false;
        }
    }
    public int GCD(int a, int b){
        if(a == 0){
            return b;
        }
        return GCD(b%a,a);
    }
}