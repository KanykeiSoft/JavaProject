package Arrays.binary;

public class SqrtCalculator {
    public static int mySqrt(int x){
        if (x < 2) return x;
         int left = 1, right  = x/2;
         int ans = 1;

         while (left < right){
             int mid = left + (right - left)/2;
             if(mid<= x / mid){
                 ans = mid;
                 left = mid +1;
             }else {
                 right = mid -1;
             }
         }
         return ans;
    }

    public static void main(String[] args) {
        int x = 26; // можешь менять число
        int result = mySqrt(x);
        System.out.println("√" + x + " = " + result);
    }
}
