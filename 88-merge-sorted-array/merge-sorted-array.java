class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        int size = nums1.length-1;
        while(m > 0 && n > 0){
            if(nums1[m-1] >= nums2[n-1]){
                nums1[size] = nums1[m-1];
                m--;
            }else{
                nums1[size] = nums2[n-1];
                n--;
            }
            size--;
        }
        while(n > 0){
            nums1[size] = nums2[n-1];
            n--;
            size--;
        }
    }
}