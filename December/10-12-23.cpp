class Solution{
public:
    //Complete this function
    //Function to check whether there is a subarray present with 0-sum or not.
bool subArrayExists(int arr[], int n)
    {
        map<int,int> mp;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0)
            {
                return true;
            }
            sum += arr[i];
            if(mp.find(sum) != mp.end() || sum == 0)
            {
                return true;
            }
            else 
            {
                mp[sum]++;
            }
        }
        return false;
    }
};
