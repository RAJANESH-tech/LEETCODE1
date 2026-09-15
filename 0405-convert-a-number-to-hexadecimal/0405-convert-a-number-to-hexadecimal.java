class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        char a[]="0123456789abcdef".toCharArray();
        StringBuilder s=new StringBuilder();
        while(num!=0)
        {
            int t=num&15;
            s.append(a[t]);
            num=num>>>4;
        }
        return s.reverse().toString();
    }
}