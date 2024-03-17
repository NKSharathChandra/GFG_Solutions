class Solution{
  public:
    // your task is to complete this function
    int countPairs(struct Node* head1, struct Node* head2, int x) {
        unordered_map<int, int> mp;
        Node* curr1 = head1;
        while(curr1 != NULL)
        {
            mp[curr1->data]++;
            curr1 = curr1->next;
        }
        Node* curr2 = head2;
        int cnt = 0;
        while(curr2 != NULL)
        {
            if(mp.find(x - curr2->data) != mp.end())
            {
                cnt++;
            }
            curr2 = curr2->next;
        }
        return cnt;
    }
};
