class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length){
            int num = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[num]){
                swap(nums,i ,num);
            }else{
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index +1){
                return index +1;
            }
        }
        return nums.length+1;
    }
    public void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}