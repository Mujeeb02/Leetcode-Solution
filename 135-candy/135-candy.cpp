class Solution {
public:
    int candy(vector<int>& ratings) {
        
         vector<int>A=ratings;
    int n=A.size();
    vector<int>candies(n,1);
    //candies[i] stores the number of candies given to ith children
    // initially all the children store 1 candie
    // 1st pass from left to right
    for(int i=1;i<n;i++) if(A[i]>A[i-1]) candies[i]=candies[i-1]+1;
    // second pass from right to left
    for(int i=n-2;i>=0;i--)  if(A[i]>A[i+1]) candies[i]=max(candies[i],1+candies[i+1]);
    int ans=0;
    for(int i=0;i<n;i++) ans+=candies[i];
    return ans;
    }
};