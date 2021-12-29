public int[] decoded(int[] encode) {
        int[] decode = new int[encode.length + 1];
        for (int i = 1; i < encode.length; i = i + 2) {
             decode[0] =  decode[0] ^ encode[i];
             decode[0] =  decode[0] ^ i;
             decode[0] =  decode[0] ^ i + 1;
        }
         decode[0] =  decode[0] ^ decode.length;
        for (int i = 1; i < decode.length; i++) {
            decode[i] = decode[i-1] ^ encode[i-1];
        }
        return decode;
}