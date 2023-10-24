class Solution {
    public int solution(int k, int[][] dungeons) {
                int[] visit=new int[dungeons.length];
        //던전탐색함수는 던전정보(dungeons), 방문수(visit), 현재피로도(k), 방문한던전수(count)를 가지고 계산한다.
        dungeonExplore(dungeons,visit,k,0);

        return max;
    }
    
    private static int max=0;
    private static void dungeonExplore(int[][] dungeons, int[] visit, int k, int count) {
        for(int i=0;i<dungeons.length;i++){
            if(visit[i]==0&&dungeons[i][0]<=k){
                visit[i]=1;
                dungeonExplore(dungeons,visit,k-dungeons[i][1],count+1);
                visit[i]=0; //이전 방문여부가 다음 회차에 영향을 주지 않기 위함
            }
        }
        if(max<count){
            max=count;
        }
    }
}