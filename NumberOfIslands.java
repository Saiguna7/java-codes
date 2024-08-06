import java.util.*;
public class NumberOfIslands {
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        
        return count;
    }
    private static void dfs(char[][] grid, int row, int col) {
        int m = grid.length;
        int n = grid[0].length;
        
        if (row < 0 || col < 0 || row >= m || col >= n || grid[row][col] != '1') {
            return;
        }
        grid[row][col] = '0'; 
        dfs(grid, row - 1, col); 
        dfs(grid, row + 1, col); 
        dfs(grid, row, col - 1); 
        dfs(grid, row, col + 1); 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        char[][] grid = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.next().charAt(0);
            }
        }
        int numberOfIslands = numIslands(grid);
        System.out.println(numberOfIslands);
    }
}
