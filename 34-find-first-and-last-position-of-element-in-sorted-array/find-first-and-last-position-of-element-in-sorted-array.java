class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int[] ans = {-1,-1};
        int left = binarySearch(nums,target,false);
        int right = binarySearch(nums,target,true);
        ans[0] = left;
        ans[1] = right;
        return ans;
    }
    int binarySearch(int[] arr, int target, boolean isRightSearch){
        int start = 0;
        int end = arr.length -1;
        int index = -1;
        while(start <= end){
            int mid = start + (end - start) / 2; 
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid -1;
            }else{
                index = mid;
                if(isRightSearch){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return index;
    }
}