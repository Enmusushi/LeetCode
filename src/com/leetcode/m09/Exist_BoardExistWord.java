package com.leetcode.m09;
/**
 * 79. 单词搜索
 */
public class Exist_BoardExistWord {
	public boolean exist(char[][] board, String word) {
    	int[][] direction = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    	
    	int row = board.length;
    	int col = board[0].length;
    	boolean[][] visited = new boolean[row+1][col+1];
    	for(int i=0;i<row;i++) {
    		for(int j=0;j<col;j++) {
    			if(backTrace(board,word,i,j,0,direction,visited))
    			{
    				return true;
    			}
    		}
    	}
    	return false;
    }
	public boolean backTrace(char[][] board,String word,int x,int y,int start,int[][] direction,boolean[][] visited) {
    	if(start == word.length()-1 && board[x][y] == word.charAt(start)) {
    		return true;
    	}
    	if( board[x][y] == word.charAt(start)) {
    		visited[x][y] = true;  
    		for(int k=0;k<direction.length;k++) {
    			int newX = x + direction[k][0];
   	            int newY = y + direction[k][1];
   	            if(inArea(newX,newY,board)&&!visited[newX][newY]) {
   	            	if(backTrace(board,word,newX,newY,start+1,direction,visited)==true) return true;
   	            }
    		}
    		visited[x][y]=false;
    	}
    	return false;
    }
    
	public boolean inArea(int x,int y ,char[][] board ) {
    	if(x>=0&&y>=0&&x<board.length&&y<board[0].length) {
    		return true;
    	}
		return false;
    }
    public static void main(String[] args) {
    	char[][] board =
			{
			  {'A','B','C','E'},
			  {'S','F','C','S'},
			  {'A','D','E','E'}
			};
    	Exist_BoardExistWord test = new Exist_BoardExistWord();
		System.out.println(test.exist(board, "ABCCED"));
	}
	
}
