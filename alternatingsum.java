class Solution {
    public int alternatingSum(int[] nums) {
        int k=1;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=nums[i]*k;
            k*=-1;
        }
        return ans;
    }
}
