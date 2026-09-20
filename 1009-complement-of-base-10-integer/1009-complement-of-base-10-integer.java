class Solution {
    public int bitwiseComplement(int n) {
        int m=0;
        int t=n;
        if(n==0) return 1;
        while(t>0)
        {
            m=(m<<1)|1;
            t=t>>1;
        }
        return m^n;
    }
}