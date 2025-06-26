```java
  class Solution {
    public int distinctAverages(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int minIdx=i;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]<nums[minIdx])
                {
                    minIdx=j;
                }
            }
            int temp=nums[minIdx];
            nums[minIdx]=nums[i];
            nums[i]=temp;
        }
        Set<Double> sd=new HashSet<>();
        int x=0,y=nums.length-1;
        while(x<y)
        {
            double avg=(nums[x]+nums[y])/2.0;
            sd.add(avg);
            x++;
            y--;
        }
        return sd.size();
    }
}
