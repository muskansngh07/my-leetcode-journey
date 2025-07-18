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
