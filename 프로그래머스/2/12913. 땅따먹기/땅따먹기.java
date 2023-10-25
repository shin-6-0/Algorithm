class Solution {
    public static int solution(int[][] land) {
        int answer = 0;
        int len = land.length;
        for(int i=0;i<len-1;i++){
            int nowIndex=0;
            int max = Math.max(land[i][1],land[i][2]);
            land[i+1][nowIndex] += Math.max(max,land[i][3]);
            max=Math.max(land[i][0],land[i][2]);
            land[i+1][1] += Math.max(max,land[i][3]);
            max=Math.max(land[i][0],land[i][1]);
            land[i+1][2] += Math.max(max,land[i][3]);
            land[i+1][3] += Math.max(max,land[i][2]);
        }
        int final1=Math.max(land[len-1][0],land[len-1][1]);
        int final2=Math.max(land[len-1][2],land[len-1][3]);
        answer=Math.max(final1,final2);
        return answer;
    }
}