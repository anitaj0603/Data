public class Main {
    public static void main(String[] args) {
        System.out.println("MAX value: " + Data.MAX);
        
        Data d1 = new Data(3, 4);
        d1.repopulate();
        System.out.println("Repopulated grid:");
        System.out.println(d1);
        
        int[][] grid1 = {
            {10, 50, 40},
            {20, 40, 20},
            {30, 50, 30}
        };
        Data d2 = new Data(grid1);
        System.out.println("Grid 1:");
        System.out.println(d2);
        System.out.println("Increasing columns: " + d2.countIncreasingCols()); 
        
        int[][] grid2 = {
            {10, 540, 440, 440},
            {220, 450, 440, 190}
        };
        Data d3 = new Data(grid2);
        System.out.println("Grid 2:");
        System.out.println(d3);
        System.out.println("Increasing columns: " + d3.countIncreasingCols()); 
    }
}
