class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Stack<Integer> st=new Stack<>();
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums1[i]==nums2[j]){
        //             if(j==nums2.length-1){
        //                 st.add(-1);
        //                 break;
        //             }
        //             for(int k=j+1;k<nums2.length;k++){
        //                 if(nums2[k]>nums2[j]){
        //                     st.add(nums2[k]);
        //                     break;
        //                 }
        //                 else{
        //                     st.add(-1);
        //                 }
        //             }
        //         }
        //     }
        // }
        // int[] ans=new int[nums1.length];
        // for(int i=ans.length-1;i>=0;i--){
        //     ans[i]=st.pop();
        // }
        // return ans;
        int[] arr=new int[nums1.length];
        Arrays.fill(arr,-1);
        for(int i=0;i<nums1.length;i++){
            int index=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    index=j;
                }
            }
            for(int j=index;j<nums2.length;j++){
                if(nums1[i]<nums2[j]){
                    arr[i]=nums2[j];
                    break;
                }
            }
        }
        return arr;
    }
}