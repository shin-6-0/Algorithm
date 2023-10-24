import java.util.*;

class Solution {
    public int solution(int[] elements) {
                int[] newElements = new int[elements.length * 2];


        // {4,7,9,1,1} -> {4,7,9,1,1,4,7,9,1} 원순열은 두배로 길이를 늘려서 계산
        for(int i = 0; i < elements.length; i++) {
            newElements[i] = newElements[i + elements.length] = elements[i];
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            // 원소의 길이만큼 더하되, 자기 자신부터 up
            for (int k = i; k < i + elements.length; k++) {
                sum += newElements[k];
                set.add(sum);
            }
        }
        return set.size();
    }
}