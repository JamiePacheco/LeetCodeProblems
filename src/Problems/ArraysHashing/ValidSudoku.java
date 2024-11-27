package Problems.ArraysHashing;

import java.util.HashSet;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        int size = 9;

        HashSet<Character> columns = new HashSet<>();
        HashSet<Character> rows = new HashSet<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; i++) {
                char rowCell = board[i][j];
                char columnCell = board[j][i];

                if (rowCell != '.') {
                    if (!rows.contains(rowCell)) {
                        rows.add(rowCell);
                    } else {
                        return false;
                    }
                }

                if (columnCell != '.') {
                    if (!columns.contains(columnCell)) {
                        columns.add(columnCell);
                    } else {
                        return false;
                    }
                }
            }
        }

        int[][] offsets = {{1, 1}, {1, -1}, {1, 0}, {-1, 1}, {-1, 0}, {-1, -1}, {0, 1}, {0, -1}};
        int[] cords = {1, 4, 7};

        for(int i = 0; i < cords.length; i++) {
            for (int j = 0; j < cords.length; j++) {
                HashSet<Character> sections = new HashSet<>();
                for (int[] offset : offsets) {
                    char cell = board[offset[0]][offset[1]];
                    if (cell != '.') {
                        if (!sections.contains(cell)) {
                            sections.add(cell);
                        } else {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }


}
