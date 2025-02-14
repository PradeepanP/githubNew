class Solution {
    public int splitArray(int[] nums, int k) {
        int s = Arrays.stream(nums).max().getAsInt();
        int e = Arrays.stream(nums).sum(); 
        while(s <= e){
            int mid = (s + (e -s)/2);
            boolean isValid = isPossible(nums,mid, k);
            if(isValid){
                e = mid -1;
            }else{
                s = mid + 1;
            }
        }
    return s;
    }
    
    boolean isPossible(int[] nums, int mid, int k){
        int parts = 1;
        int curSum = 0;
        for(int num : nums){
            curSum += num;
            if(curSum > mid){
                parts += 1;
                curSum = num;
                if(parts > k){
                    return false;
                }
            }
        }
    return true; 
    }   
}