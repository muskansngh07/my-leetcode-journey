### Code
```java
class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<sentence.length();i++)
        {
            char c=sentence.charAt(i);
            if(c>='a' && c<='z')
                set.add(c);
        }
        return set.size()==26;
    }
}
```

#### Note
It is to check whether a sentence contains all the english alphabets atleast once. As set only counts the unique elements, it's easier for me to use this data structure.
