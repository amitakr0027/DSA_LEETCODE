class Solution {
    public void sortColors(int[] nums) {
    //    for(int i=0;i<nums.length;i++) {
    //    for(int j= 0;j<nums.length;j++) {
    //     if(nums[i]<nums[j]) {
    //         int temp = nums[i];
    //         nums[i]=nums[j];
    //         nums[j]=temp;

    //     }
    //    }
    //    }
      
        // dutch national flag ,TIme O(n),space=O(n);

        int left =0;
        int mid =0;
        int right = nums.length-1;

        while(mid<=right){
            if(nums[mid]==0){
                int temp = nums[left];
                nums[left]=nums[mid];
                nums[mid]=temp;
                left++;
                mid++;
            } else if(nums[mid]==1){
                mid++;
            } else {
                int temp=nums[mid];
                nums[mid]=nums[right];
                nums[right]=temp;
                right--;
            }
        }

    }
}