You are given an integer n that consists of exactly 3 digits. We call the number n fascinating if, after the following modification, the resulting number contains all the digits from 1 to 9 exactly once and does not contain any 0's: Concatenate n with the numbers 2 * n and 3 * n.
Return true if n is fascinating, or false otherwise.

### Code:
```java
class Solution {
    public boolean isFascinating(int n) {
        String s=n+""+2*n+""+3*n;
        if(s.indexOf('0')!=-1)
            return false;
        Map<Integer,Integer> a=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            int num=ch-'0';
            a.put(num,a.getOrDefault(num,0)+1);
        }
        for(int i=1;i<=9;i++)
        {
            if(a.getOrDefault(i,0)!=1)
                return false;
        }
        return true;
    }
}

