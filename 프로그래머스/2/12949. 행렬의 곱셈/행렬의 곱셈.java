class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
                //3*2 2*2 = 3*2 -> a*b X c*d = a*d 사이즈. b와 c는 숫자가 같아야함. =k
        int ansRow=arr1.length;
        int ansCol=arr2[0].length;
        System.out.println("ansRow = "+ansRow+", ansCol = "+ansCol);
        int[][] ans=new int[ansRow][ansCol];
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[0].length; j++){
                int sum = 0;
                for(int k = 0; k < arr2.length; k++){
                    sum += arr1[i][k] * arr2[k][j];
                }
                ans[i][j] = sum;
            }
        }
        return ans;
    }
}