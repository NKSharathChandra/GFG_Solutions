class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {

    HashMap<Character, Integer> map = new HashMap<>();
        map.put('!', 1);
        map.put('#', 2);
        map.put('$', 3);
        map.put('%', 4);
        map.put('&', 5);
        map.put('*', 6);
        map.put('?', 7);
        map.put('@', 8);
        map.put('^', 9);

        
        Character[] nutsArr = new Character[n];
        Character[] boltsArr = new Character[n];
        for (int i = 0; i < n; i++) {
            nutsArr[i] = nuts[i];
            boltsArr[i] = bolts[i];
        }

        
        Arrays.sort(nutsArr, (a, b) -> map.get(a) - map.get(b));
        Arrays.sort(boltsArr, (a, b) -> map.get(a) - map.get(b));

        for (int i = 0; i < n; i++) {
            nuts[i] = nutsArr[i];
            bolts[i] = boltsArr[i];
        }
}

