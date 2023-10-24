class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        answer=0;
        dfs(numbers,0,target,0);
        return answer;
    }
    
    private static void dfs(int[] numbers, int depth, int target, int sum) {
        //System.out.println("depth = "+depth+", target = "+target+", sum = "+sum+", answer = "+answer);
        if(depth==numbers.length){
            if(target==sum) answer++;
        }else{
            dfs(numbers,depth+1,target,sum+numbers[depth]);
            dfs(numbers,depth+1,target,sum-numbers[depth]);
        }
    }
}