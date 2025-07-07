class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++)
        {
            String s=String.valueOf(i);
            if(s.length()%2!=1)
            {
                int sum1=0,sum2=0;
                int num=s.length()/2;
                String s1=s.substring(0,num);
                String s2=s.substring(num);
                for(char ch:s1.toCharArray())
                {
                    sum1+=(ch-'0');
                }
                for(char c:s2.toCharArray())
                {
                    sum2+=(c-'0');
                }
                if(sum1==sum2)
                    count++;
            }
        }
        return count;
    }
}
