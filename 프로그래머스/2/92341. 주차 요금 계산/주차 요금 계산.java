import java.util.*;
class Solution {
        public static List<Integer> solution(int[] fees, String[] records) {
        List<Integer> answer=new ArrayList<>();
        int defaultTime = fees[0];
        int defaultFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> ans = new HashMap<>();
        for (String record : records) {
            String inout = record.substring(11);
            int time = Integer.parseInt(record.substring(0, 2))*60 + Integer.parseInt(record.substring(3,5));
            String carNum = record.substring(6, 10);
            //System.out.println(">>상태 = " + inout + ", 시간 = " + time + ", carNum = " + carNum);
            if(inout.equals("IN")){
                map.put(carNum,time);
            }else if(inout.equals("OUT")&&map.containsKey(carNum)){
                int chkTime =(time - map.get(carNum));
                //System.out.print("                     시간 차이 "+chkTime);
                if(ans.containsKey(carNum)){
                    int beforeTime=ans.get(carNum);
                    ans.remove(carNum);
                    ans.put(carNum,beforeTime+chkTime);
                    //System.out.println(" >> 정답에 입력 "+carNum+", "+(beforeTime+chkTime));
                }else{
                    ans.put(carNum,chkTime);
                    //System.out.println(" >> 정답에 입력 "+carNum+", "+chkTime);
                }
                map.remove(carNum);
            }
        }
        if(!map.isEmpty()){
            for(String key:map.keySet()){
                int beforeTime=0;
                if(ans.containsKey(key)){
                    beforeTime=ans.get(key);
                }
                int chkInTime=map.get(key);
                int chkTime=23*60+59-chkInTime;
                ans.remove(key);
                ans.put(key,beforeTime+chkTime);
            }
        }
        List<String> list = new ArrayList<>(ans.keySet());

        Collections.sort(list);

        for(String key : list){
            int totalFee=0;
            int chkTime=ans.get(key);
            if(chkTime<=defaultTime){
                totalFee=defaultFee;
            }else{
                double plusFee=((double)chkTime - (double)defaultTime) / (double)unitTime; //딱 떨어지지 않을 경우 반올림을 위한 변수선언
                totalFee = (int) (defaultFee + (Math.ceil(plusFee) * unitFee));
            }
            answer.add(totalFee);
        }
        return answer;
    }
}