class Solution{
    int row = 0, col = 0, d1 = 0, d2 = 0;
    
    void solve(int r, int n, vector<vector<int>> &ans, vector<int> &temp) {
        if(r == n) {
            ans.push_back(temp);
            return;
        }
        
        for(int c = 0; c < n; c++) {
            if((row & (1 << r)) > 0  || (col & (1 << c)) > 0 || (d1 & (1 << (r + c))) > 0 || (d2 & (1 << (r - c + n - 1))) > 0) {
                continue;
            }
            row |= 1 << r, col |= 1 << c, d1 |= 1 << (r + c), d2 |= 1 << (r - c + n - 1);
            temp.push_back(c + 1);
            solve(r + 1, n, ans, temp);
            temp.pop_back();
            row &= ~(1 << r), col &= ~(1 << c), d1 &= ~(1 << (r + c)), d2 &= ~(1 << (r - c + n - 1));
        }
    }
    
public:
    vector<vector<int>> nQueen(int n) {
        // code here
        vector<vector<int>> ans;
        vector<int> temp;
        solve(0, n, ans, temp);
        return ans;
    }
};
