import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
                int answer = 0;
        //정렬 후 최솟값 + 최댓값이 limit 안에 들으면 같이가고 , 아니면 최댓값을 그 다음으로 큰 값으로 변경
        Arrays.sort(people);
        int maxIndex=people.length-1;
        int max=people[maxIndex];
        int minIndex=0;
        int min=people[minIndex];
        while(true){
            max=people[maxIndex];
            min=people[minIndex];
           // System.out.println("maxIndex = "+maxIndex+", minIndex = "+minIndex+", answer = "+answer);
            if(minIndex==maxIndex){
                answer++;
                break;
            } else if (minIndex>maxIndex) {
                break;
            }
            //System.out.println("min+max = "+(min+max));
            if(min+max<=limit){
                answer++;
                minIndex++;
                maxIndex--;

            }else{
                answer++;
                maxIndex--;
            }
        }
        return answer;
    }
}