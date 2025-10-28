
class SearchInMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == target)
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        SearchInMatrix obj = new SearchInMatrix();
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;
        boolean result = obj.searchMatrix(matrix, target);
        System.out.println(result); // Output: true
    }
}

                         

