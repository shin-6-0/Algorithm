class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
                //넓이가 brown+yellow인 점을 활용
        int area = brown+yellow;
        int root = (int) Math.ceil(Math.sqrt(area));
        //가로길이와 세로길이의 합은 root*2 보다작음
        for(int row=1;row<=brown/2;row++){
            for(int column=(root-1)*2-row;column<=root*2;column++){
                if(row*column==area&&(row-2)*(column-2)==yellow&&(row*2+(column-2)*2)==brown){
                   // System.out.println("brown : "+brown+", yellow : "+yellow);
                    answer[0]=row;
                    answer[1]=column;
                    break;
                }
            }
        }
        //System.out.println(answer[0]+", "+answer[1]);
        return answer;
    }
}