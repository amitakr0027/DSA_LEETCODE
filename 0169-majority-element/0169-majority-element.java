class Solution {
    public int majorityElement(int[] nums) {
        int maxCount=0;
        Arrays.sort(nums);
        if(nums.length==1) return nums[0];
        for(int i =0;i<nums.length;i++) {
            int count=1;
            for(int j =i+1;j<nums.length;j++) {
                if(nums[i]==nums[j]) {
                    count++;
                }
            }
            if(count>maxCount) {
                maxCount=count;
            }
        }
        if(maxCount>nums.length/2) {
            return nums[maxCount];
        }
        return 0;
        
    }
}