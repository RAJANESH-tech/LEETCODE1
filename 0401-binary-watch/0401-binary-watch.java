class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> a = new ArrayList<>();
        for (int hr=0;hr<12;hr++){
            for (int mn=0;mn<60;mn++){
                int c=0;
                int h=hr;
                int m=mn;
                while(h>0){
                    c+=h&1;
                    h>>=1;
                }
                while(m>0){
                    c+=m&1;
                    m>>=1;
                }
                if(c==turnedOn) {
                    a.add(hr+":"+(mn<10?"0":"")+mn);
                }
            }
        }
        return a;
    }
}