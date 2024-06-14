class Solution {
static String armstrongNumber(int n) {
         int originalNumber = n;
        int sum = 0;
        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int units = n % 10;
        
        sum = (int) (Math.pow(hundreds, 3) + Math.pow(tens, 3) + Math.pow(units, 3));
        if (sum == originalNumber) {
            return "true";
        } else {
            return "false";
        }
    }
}
