class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    static void mergeSort(int[] arr,int s,int e){
        if(s >= e ){
            return;
        }
        int mid = (s + e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);

        merge(arr,s,mid,e);
    }    
    static void merge(int[] arr,int s,int mid,int e){
        int[] mix = new int[e - s + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= e){
            if(arr[i] <= arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
         while(j <= e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l < mix.length; l++){
            arr[s+l] = mix[l];
        }
    }
}