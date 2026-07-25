package POTD;

public class MaximumProductOfTwoDigitsLeetCode3536 {
    public static void main(String[] args) {
        int num = 124; //4
        int ans = maxProduct(num);
        System.out.println(ans);
    }
    public static int maxProduct(int n) {
        int max1 = 0;
        int max2 = 0;
        while (n>0){
            int digit = n%10;
            n /=10;
            if(digit>=max1){
                max2 = max1;
                max1 = digit;
            }else if(digit>max2){
                max2 = digit;
            }
        }
        return  max1 * max2;
    }
}
