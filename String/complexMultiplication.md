### Approach 1:
```java
class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        int a=0,b=0,c=0,d=0;
        for(int i=0;i<num1.length();i++)
        {
            char ch=num1.charAt(i);
            if(ch=='+')
            {
                a=Integer.valueOf(sb1.toString());
                sb1=new StringBuilder();
            }
            else if(ch=='i')
            {
                b=Integer.valueOf(sb1.toString());
                sb1=new StringBuilder();
            }
            else
                sb1.append(ch);
        }
        for(int j=0;j<num2.length();j++)
        {
            char ch=num2.charAt(j);
            if(ch=='+')
            {
                c=Integer.valueOf(sb.toString());
                sb=new StringBuilder();
            }
            else if(ch=='i')
            {
                d=Integer.valueOf(sb.toString());
                sb=new StringBuilder();
            }
            else
                sb.append(ch);
        }
        int x=a * c - b * d;
        int y=b * c + a * d;
        String ans=x+"+"+y+"i";
        return ans;
    }
}
```

### Approach 2:
```java
class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int []first=parse(num1);
        int []second=parse(num2);
        int a=first[0],b=first[1];
        int c=second[0],d=second[1];
        int x=a*c-b*d;
        int y=a*d+b*c;
        return x+"+"+y+"i";
        
    }
    public int[] parse(String a)
    {
        String []parts=a.split("\\+");
        int real=Integer.parseInt(parts[0]);
        int imag=Integer.parseInt(parts[1].substring(0,parts[1].length()-1));
        return new int[]{real,imag};
    }
}
