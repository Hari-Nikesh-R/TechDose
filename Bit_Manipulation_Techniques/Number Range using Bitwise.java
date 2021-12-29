public int msbP(int n){ 
    int msb=-1;
    while(n>0){
            n= n>>1;
             msb++;
    }
    return msb;
}
public int rangeBitwiseAnd(int left, int right) {
     int ans=0;
    while (left > 0 && right > 0) {
            int m_left= msbP(left);
            int m_right= msbP(right);
            if(m_left != m_right)
            break;  
            int val= (1<<m_left);
            ans += val ;
            left-=val;
            right-=val;
    }
     return ans;
}