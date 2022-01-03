class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int[] ans = new int[nums.length];
        int p=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            ans[p++]=nums[i];
        }
        return ans[k-1];
    }
}
