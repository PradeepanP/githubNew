class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int num = nums[i]-1;
            if(nums[i] != nums[num]){
                swap(nums,i,num);
            }else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                list.add(j + 1);
            }
        }
        return list;
    }
    void swap(int[] arr, int i, int num){
        int temp = arr[i];
        arr[i] = arr[num];
        arr[num] = temp;
    }
}