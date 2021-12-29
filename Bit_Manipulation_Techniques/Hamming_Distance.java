public int HammingDistance(int a, int b) {
        int ans =0; 
        int result = a^b;   
        while(result>0){  
            if((result&1)==1){
		ans++;
		}
	   
            result = result>>1;     
        }
        return ans;
    }