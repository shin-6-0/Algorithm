import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
                int answer = 0;
        String[] want2=want;
        Map<String,Integer> map=new HashMap<>();
        //해시맵으로 갯수와 정보 저장
        for(int i=0;i<want.length;i++){
            map.put(want[i],number[i]);
        }
        //discount 배열을 탐색하면서 시작일부터의 정보 저장, map과 일치하면 answer++;
        int days=0;
        for(int j=0;j<discount.length-10+1;j++) {
            Map<String,Integer> checkMap=new HashMap<>();
            for (int i = j; i < 10 + j; i++) {
                if (checkMap.containsKey(discount[i])) {
                    int input = checkMap.get(discount[i]) + 1;
                    checkMap.put(discount[i], input);
                } else {
                    checkMap.put(discount[i], 1);
                }
            }
            Boolean chkSame = true;
            for (String key : map.keySet()) {
                if (map.get(key) != checkMap.get(key)) {
                    chkSame = false;
                    break;
                }
            }
            answer += chkSame ? 1 : 0;
        }
        return answer;
    }
}