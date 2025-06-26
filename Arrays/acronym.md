There are two approaches: first one took 7 ms and the second one took 1 ms. So yup. Lesss go.

#### Number 1:
```java
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length())
            return false;
        String s1="";
        for(int i=0;i<words.size();i++)
        {
            s1=s1+words.get(i).charAt(0);
        }
        if(s.equals(s1))
            return true;
        return false;
    }
}
```

#### Number 2:
```java
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length())
            return false;
        int j=0;
        for(int i=0;i<words.size();i++)
        {
            String t=words.get(i);
            if(s.charAt(i)==t.charAt(0))
                j++;
        }
        if(j==s.length())
            return true;
        return false;
    }
}

