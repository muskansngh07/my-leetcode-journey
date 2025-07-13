class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> sck=new Stack<>();
        for(int i=0;i<asteroids.length;i++)
        {
            if(asteroids[i]>0)
                sck.push(asteroids[i]);
            else
            {
                while(!sck.isEmpty() && sck.peek()>0 && sck.peek()<Math.abs(asteroids[i]))
                {
                    sck.pop();
                }
                if(!sck.isEmpty() && sck.peek()==Math.abs(asteroids[i]))
                {
                    sck.pop();
                }
                else if(sck.isEmpty() || sck.peek()<0)
                {
                    sck.push(asteroids[i]);
                }
            }
            
        }
        int []arr=new int[sck.size()];
        for(int j=0;j<sck.size();j++)
        {
            arr[j]=sck.get(j);
        }
        return arr;
    }
}
