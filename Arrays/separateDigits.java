class Solution {
    public int[] separateDigits(int[] nums) {
        int index=0;
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            String str=String.valueOf(nums[i]);
            int j=0;
            while(j<str.length())
            {
                a.add(str.charAt(j)-'0');
                j++;
            }
        }
        int arr[]=new int[a.size()];
        for(int i=0;i<a.size();i++)
        {
            arr[i]=a.get(i);
        }
        return arr;
    }
}
