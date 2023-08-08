class Solution {
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        
        return gcd(b, a % b);
    }
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        int ans = 0;
        HashMap<String, Integer> map = new HashMap<>();
        // Reducing the numerator or denominator
        for(int i = 0; i < n; i++){
            int g = gcd(numerator[i], denominator[i]);
            numerator[i] /= g;
            denominator[i] /= g;
        }
        
        // Now iterate again int the array tp find the answer;
        for(int i = 0; i < n; i++){
            String fraction = numerator[i] + "/" + denominator[i];
            String requiredFraction = (denominator[i] - numerator[i]) + "/" + denominator[i];

            if (map.containsKey(requiredFraction)) {
                ans += map.get(requiredFraction);
            }

            map.put(fraction, map.getOrDefault(fraction, 0) + 1);
        }
        
        return ans;
    }
}
