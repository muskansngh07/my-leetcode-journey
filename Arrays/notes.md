## Number 1: 
For questions where you need to shift or something, just use  second variable to store the elements that don't meet that criteria. 

### For example:
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;
        int count=0;
        for(int num:nums)
        {
            if(num!=val)
            {
                count++;
                nums[index++]=num;
            }
        }
        return count;
    }
}
