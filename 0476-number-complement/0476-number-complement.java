class Solution {
    public int findComplement(int num) {
        int t=num;
        int m=0;
        while(t>0)
        {
            m=(m<<1)|1;
            t=t>>1;
        }
        return m^num;
    }
}