class GFG {
    static void reverse(int[] arr){
        int s = 0, e = arr.length-1;
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    static void rotate(int mat[][]) {
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(i != j){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            reverse(mat[i]);
        }
    }
}
