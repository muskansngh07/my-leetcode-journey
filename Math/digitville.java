class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[]x=new int[2];
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    x[index++]=nums[i];
            }
        }
        return x;
    }
}
