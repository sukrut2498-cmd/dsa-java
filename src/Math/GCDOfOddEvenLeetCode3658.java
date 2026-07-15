package Math;

public class GCDOfOddEvenLeetCode3658 {
    public static void main(String[] args) {
      int n = 5;
      int ans = gcdOfOddEvenSums(n);
        System.out.println(ans);
    }

    public static int gcdOfOddEvenSums(int n){
        int limit = n*2;
        int sumEven = 0;
        int sumOdd = 0;
        int ans = 1;
        for (int i=1; i<=limit; i++){
            //System.out.println(i);
            if(i%2==0){
                sumEven += i;
            }else {
                //System.out.println(i);
                sumOdd +=i;
            }
        }
        ans = gdcOfNum(sumEven,sumOdd);
        return ans;
    }
    public static int gdcOfNum(int num1, int num2){
        if(num2==0){
            return num1;
        }
        return gdcOfNum(num2,num1%num2);
    }
    //this is easy solution
    public int gcdOfOddEvenSums1(int n) {
        return n;
    }
}
