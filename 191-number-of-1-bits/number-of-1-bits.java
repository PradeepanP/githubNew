class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        long x = n;
        while(x > 0){
            if((x & 1) == 1){
                count++;
            }
            x = x >> 1;
        }
        return count;
    }
}