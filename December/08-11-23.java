class Solution
{
    public int minNumber(int arr[], int N)
    {
        int sum = 0;
        for(int num : arr) sum = sum + num;
        for(int i = 0; i < 100; i++) if(isPrime(sum + i)) return i;
        return -1;

    }
    boolean isPrime(int num) {
        if(num == 1) return false;
        for(int i = 2; i * i <= num; i++) if(num % i == 0) return false;
        return true;
    }
}
