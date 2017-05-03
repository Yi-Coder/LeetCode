package Solution51_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import javax.print.attribute.standard.RequestingUserName;

public class Solution51 {

	public List<List<String>> solveNQueens(int n) {
		List<List<String>> result = new ArrayList<List<String>>();
		List<StringBuilder> matrix = new ArrayList<StringBuilder>();
		boolean [][] visited = new boolean[n][n];
		
		char[] array = new char[n];
		Arrays.fill(array, '.');

		for (int i = 0; i < n; i++) {
			matrix.add(new StringBuilder());
		}
		NQueuen(n, 0, matrix, result,visited);

		return result;

	}
	
public void  NQueuen(int n, int row, List<StringBuilder> matrix, List<List<String>> result, boolean [][] visited){
	
	if(row == n -1) {
		result.add(matrix.);
		
	}
	
	for(int i =0; i<n;i++){
		if(isConflict(row,i, matrix, n, row) && !visited[row][i]){
			visited[row][i] = true;
			NQueuen(n, row+1, matrix, result,visited);
		}
		visited[row][i] = false;
	}
	
	
}

	public boolean isConflict(int i, int j, List<StringBuilder> matrix, int n,int row) {
		
		// the same col
		for (int k = 0; k < n; k++) {
			if (matrix.get(k).charAt(j) == 'Q')
				return true;
		}

		// the same row
		for (int k = 0; k < n; k++) {
			if (matrix.get(i).charAt(k) == 'Q')
				return true;
		}

		// the up-right
		for (int k = i, p = j; k >= 0 && p < n; k--, p++) {
			if (matrix.get(k).charAt(p) == 'Q')
				return true;
		}

		// left-down
		for (int k = i, p = j; k < n && p >= 0; k++, p--) {
			if (matrix.get(k).charAt(p) == 'Q')
				return true;
		}

		// right-down
		for (int k = i, p = j; k < n && p < n; k++, p++) {
			if (matrix.get(k).charAt(p) == 'Q')
				return true;
		}

		// left-up
		for (int k = i, p = j; k >= 0 && p >= 0; k--, p--) {
			if (matrix.get(k).charAt(p) == 'Q')
				return true;
		}

		return false;

	}

}
