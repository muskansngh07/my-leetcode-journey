class Solution {
    public int heightChecker(int[] heights) {
        int[]expected=new int[heights.length];
        for(int num=0;num<heights.length;num++)
        {
            expected[num]=heights[num];
        }
        for(int i=0;i<heights.length;i++)
        {
            int min=i;
            for(int j=i+1;j<heights.length;j++)
            {
                if(heights[j]<heights[min])
                    min=j;
            }
            int temp=heights[min];
            heights[min]=heights[i];
            heights[i]=temp;
        }
        int count=0;
        for(int x=0;x<heights.length;x++)
        {
            if(heights[x]!=expected[x])
                count++;

        }
        return count;
    }
}
