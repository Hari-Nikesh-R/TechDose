public int[] twoSum(int[] nums, int target) {
	int[] arr = new int[2];
	int p=0;
        for(int i = 0; i < nums.length-1; i++){
           for(int j = i+1; j < nums.length; j++){
               if(nums[i] + nums[j] == target){
                     arr[p++]=i;
		     arr[p++]j;
		     return arr;
                 }
             }
         }
         return null;
}