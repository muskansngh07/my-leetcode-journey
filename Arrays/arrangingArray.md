### Question:
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].


#### Code:
```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x=0;
        int y=n;
        int index=0;
        int[]res=new int[nums.length];
        while(x<n)
        {
            res[index++]=nums[x++];
            res[index++]=nums[y++];
        }
        return res;
    }
}
