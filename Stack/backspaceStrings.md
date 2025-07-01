### Question
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.

#### Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

#### Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

#### Example 3:
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

### Code
```java
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> a=new Stack<>();
        Stack <Character> b=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#' )
            {
                if (!a.isEmpty())
                    a.pop();
            }
            else
                a.push(s.charAt(i));
        }
        for(int j=0;j<t.length();j++)
        {
            if(t.charAt(j)=='#')
            {
                if(!b.isEmpty())
                    b.pop();
            }
            else
                b.push(t.charAt(j));
        }
        System.out.println(a+" "+b);
        return a.equals(b);
    }
}
```

#### Note
1. Time Complexity: O(s.length() + t.length())
2. Space Complexity: O(1)
3. To compaare two stacks, use .equals() and not ==. 
