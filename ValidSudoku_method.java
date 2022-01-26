class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++) {
			HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    		for(int col=0;col<9;col++) {
    			if(board[row][col] == '.') continue;
    			int num = (int) board[row][col] - '0';
    			if(map.containsKey(num)) return false;
    			map.put(num, true);
    		}
    	}

    	for(int row=0;row<9;row++) {
			HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    		for(int col=0;col<9;col++) {
    			if(board[col][row] == '.') continue;
    			int num = (int) board[col][row] - '0';
    			if(map.containsKey(num)) return false;
    			map.put(num, true);
    		}
    	}

    	for(int x=0;x<9;x+=3) {
    		for(int y=0;y<9;y+=3) {
				HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
				for(int i=x;i<x+3;i++) {
					for(int j=y;j<y+3;j++) {
						if(board[i][j] == '.') continue;
    					int num = (int) board[i][j] - '0';
    					if(map.containsKey(num)) return false;
    					map.put(num, true);
					}
				}
    		}
    	} 

    	return true;
    }

    
}
