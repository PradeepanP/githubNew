class Solution {
    public int splitArray(int[] nums, int k) {
        int s = Arrays.stream(nums).max().getAsInt();
        int e = Arrays.stream(nums).sum(); 
        while(s <= e){
            int mid = (s + (e -s)/2);
            int parts = isPossible(nums,mid);
            if(parts <= k){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
    return s;
    }
    
    int isPossible(int[] nums, int mid){
        int parts = 1;
        int curSum = 0;
        for(int num : nums){
            curSum += num;
            if(curSum > mid){
                parts += 1;
                curSum = num;
            }
        }
    return parts; 
    }   
}