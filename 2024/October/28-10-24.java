class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        LinkedHashSet<Integer> h = new LinkedHashSet<>();
        for(int i = 0; i < arr.length; i++) {
            h.add(arr[i]);
        }
        return new ArrayList<>(h);
    }
}
