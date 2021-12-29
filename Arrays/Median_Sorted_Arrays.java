public double MedianofSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int len = nums1.length + nums2.length;
        int[] added = new int[len];
        int c = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                added[c]= nums1[i];
                i++;
            }
            else{
                added[c] = nums2[j];
                j++;
            }
            c++;
        }
        if(i < nums1.length){
            while(i < nums1.length){
                added[c] = nums1[i];
                c++;
                i++;
            }
        }
        if(j < nums2.length){
            while(j < nums2.length){
                added[c] = nums2[j];
                c++;
                j++;
            }
        }
        double med = 0.0;
        if(len % 2 == 0){
            double total = added[len/2] + added[(len/2) - 1];
            med = total/2;
        }
        else{
            med = added[(len - 1)/2];
        }
        return med;
    }