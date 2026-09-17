class Solution {
    static List<String>l;
    static int k;
    static void fp(String s,int a,int b)
    {
        if(s.length()==2*k)
        {
            l.add(s);
            return;
        }
        if(a>0)
        {
            fp(s+"(",a-1,b);
        }
        if(a<b)
        {
            fp(s+")",a,b-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        l=new ArrayList<>();
        k=n;
        fp("",n,n);
        return l;
    }
}