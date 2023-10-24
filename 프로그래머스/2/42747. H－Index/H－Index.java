class Solution {
    public int solution(int[] citations) {
                //h번 이상 인용된 논문이 h개 > 이때 h의 최댓값
        int size=citations.length;
        int h=0;
        int chkH=0;
        while(h!=size){
            h++;
            int count=0;
            for(int i=0;i<size;i++){
                if(citations[i]>=h){
                    count++;
                }
            }
            if(count>=h){
                chkH=h;
            };
        }

        return chkH;
    }
}