import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choice) {
        String answer = "";
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("R", 0);map.put("C", 0);map.put("A",0);map.put("N", 0);
        map.put("F", 0);map.put("M", 0);map.put("J", 0);map.put("T", 0);
        for(int i=0;i<survey.length;i++){
        	String Front=Character.toString(survey[i].charAt(0));
        	String Back=Character.toString(survey[i].charAt(1));
            switch(choice[i]){
                case 1:map.put(Front,map.getOrDefault(Front, 0)+3);break;
                case 2:map.put(Front,map.getOrDefault(Front, 0)+2);break;
                case 3:map.put(Front,map.getOrDefault(Front, 0)+1);break;
                case 5:map.put(Back,map.getOrDefault(Back, 0)+1);break;
                case 6:map.put(Back,map.getOrDefault(Back, 0)+2);break;
                case 7:map.put(Back,map.getOrDefault(Back, 0)+3);break;
            }
        }

        if(map.get("R")>=map.get("T")) {
        	answer+="R";
        }else{
        	answer+="T";
        }
        if(map.get("C")>=map.get("F")) {
        	answer+="C";
        }else{
        	answer+="F";
        }
        if(map.get("J")>=map.get("M")) {
        	answer+="J";
        }else{
        	answer+="M";
        }
        if(map.get("A")>=map.get("N")) {
        	answer+="A";
        }else{
        	answer+="N";
        }
        System.out.println(answer);
        return answer;
    }
}