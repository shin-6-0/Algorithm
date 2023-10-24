class Solution {
    public int solution(int n, int k) {
        String transNum="";
        int zinsu=k;
        while(n!=0){
            transNum=(n%k)+transNum;
            n/=k;
        }
        int primeNumber = 0;
        String[] array=transNum.split("0");
        for(String s:array){
            if(s.length()>=1&&chkPrimeNum(s)){
                //System.out.print(s+" ");
                primeNumber++;
            }
        }
        return primeNumber;
    }
    
    public static boolean chkPrimeNum(String s){
        if(s.equals("1")){
            return false;
        } else if (s.equals("2")) {
            return true;
        }
        for(int i=2;i<=(int)Math.sqrt(Double.parseDouble(s));i++){
            if(Double.parseDouble(s)%i==0){
                return false;
            }
        }
        return true;
    }
}

