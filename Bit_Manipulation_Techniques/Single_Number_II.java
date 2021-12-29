public int SNII(int[] nums) {
    int o=0;
    int t=0;
    for(int i=0;i<nums.length;i++)
    {
        o= (o^nums[i])&(~t);
        t= (t^nums[i])&(~o);
    }
    return o;
    }