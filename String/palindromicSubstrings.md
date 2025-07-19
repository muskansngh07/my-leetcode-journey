### Code:
```java
class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            int j=0;
            while(i+j<s.length())
            {
                String str=s.substring(i,i+j+1);
                String rev=new StringBuilder(str).reverse().toString();
                if(str.equals(rev))
                    count++;
                j++;
            }
        }
        return count;
    }
}
```

#### work on its optimization. 
