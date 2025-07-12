### Question:
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].


#### Code:
```java
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
