class Solution {
    public String makeGood(String s) {
        Stack<Character> sck=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!sck.isEmpty() && Math.abs(ch-sck.peek())==32)
                sck.pop();
            else
                sck.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for(char c:sck)
        {
            sb.append(c);
        }
        return sb.toString();
    }
}
