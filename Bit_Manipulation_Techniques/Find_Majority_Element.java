public int majorityElement(int[] nums){
        int mid=nums.length/2;
        int majority =0;
        for(int i=0;i<32;i++){
            int ones=0;
            for(int num:nums){
                ones+=(num>>i)&1;
            }
            if(ones>mid){
                majority+=1<<i;
            }
        }
        return majority;
    }