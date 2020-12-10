public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveNums =0;
        int tenNums = 0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                fiveNums++;
            }else if(bills[i]==10){
                fiveNums--;
                tenNums++;
            }else if(bills[i]==20){
                fiveNums--;
                if(tenNums>0) {
                    tenNums--;
                }
                else{
                    fiveNums-=2;
                }
            }
            if(fiveNums<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] bills = {5,5,10,20};
        Solution solution = new Solution();
        System.out.println(solution.lemonadeChange(bills));
    }
}