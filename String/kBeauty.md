The k-beauty of an integer num is defined as the number of substrings of num when it is read as a string that meet the following conditions:
It has a length of k.
It is a divisor of num.
Given integers num and k, return the k-beauty of num.

# Note:
- Leading zeros are allowed.
- 0 is not a divisor of any value.
- A substring is a contiguous sequence of characters in a string.

 
# Example 1:

Input: num = 240, k = 2
Output: 2
Explanation: The following are the substrings of num of length k:
- "24" from "240": 24 is a divisor of 240.
- "40" from "240": 40 is a divisor of 240.
Therefore, the k-beauty is 2.


# Code
  ```java
        class Solution {
        public int divisorSubstrings(int num, int k) {
        int count=0;
        String s=String.valueOf(num);
        for(int i=0;i<s.length();i++)
        {
            if(i+k-1<s.length())
            {
                String s1=s.substring(i,i+k);
                int num1=Integer.parseInt(s1);
                if(num1!=0 && num%num1==0)
                    count++;
            }
        }
        return count;
    }
}
