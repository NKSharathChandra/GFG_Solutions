class Solution {
public static ArrayList<Integer> getPrimes(int n) {

        ArrayList<Integer> primePair = new ArrayList<>();
        int i = 2;
        int j = n-i;
        while( i <= j && i < n ){
            if(prime(j)){
                if(prime(i)){
                    primePair.add(i);
                    primePair.add(j);
                    break;
                }
            }
            i++;
            j--;
        }
        if(primePair.isEmpty()){
            primePair.add(-1);
            primePair.add(-1);
        }
        return primePair;
    }

    public static boolean prime(int N){

        boolean isPrime = true;

        for (int y = 2; y * y <= N; y++) {
            if (N % y == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
