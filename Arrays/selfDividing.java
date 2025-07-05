class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> a=new ArrayList<>();
        for(int i=left;i<=right;i++){
            String s=String.valueOf(i);
            char[] ch=s.toCharArray();
            int k=0,count=0;
            while(k<ch.length)
            {
                int num=ch[k]-'0';
                if(num!=0)
                {
                    if(i%num==0)
                        count++;
                }
                k++;
            }
            if(count==ch.length)
                a.add(i);
        }
        return a;
    }
}
