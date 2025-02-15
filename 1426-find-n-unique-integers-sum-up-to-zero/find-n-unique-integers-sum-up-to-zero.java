class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        for(int i = 1; i < n; i++){
            arr[0] -= i;
            arr[i] = i;
        }
        return arr;
    }
}