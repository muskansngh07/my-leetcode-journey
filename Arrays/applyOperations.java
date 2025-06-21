class Solution {
    public int[] applyOperations(int[] nums) {
        int []arr=new int[nums.length];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1] && nums[i]!=0)
            {
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int zeroIndex=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                arr[zeroIndex++]=nums[i];
            }
        }
        while(zeroIndex<nums.length)
        {
            arr[zeroIndex++]=0;
        }
        return arr;
    }
}
