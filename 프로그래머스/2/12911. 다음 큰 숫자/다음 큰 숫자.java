class Solution {
    public int solution(int n) {
        int answer = 0;
        String binaryN=Integer.toBinaryString(n);
        int count1Input=0;
        for(int i=0;i<binaryN.length();i++){
            String index=binaryN.substring(i,i+1);
            if(index.equals("1")){
                count1Input++;
            }
        }
        String binaryFindN="";
        int findN=n;
        while(true){
            findN++;
            binaryFindN=Integer.toBinaryString(findN);
            int count1FindNum=0;
            for(int i=0;i<binaryFindN.length();i++){
                String index=binaryFindN.substring(i,i+1);
                if(index.equals("1")){
                    count1FindNum++;
                }
            }
            if(count1FindNum==count1Input){
                break;
            }
        }
        return findN;
    }
}