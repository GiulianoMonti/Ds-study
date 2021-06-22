package numberofrookcaptures;

public class main {
    public static void main(String[] args) {
        char[][] board = {{'.', '.', '.', '.', '.', '.', 'p', '.'},
                {'p', '.', '.', '.', '.', '.', 'R', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', 'p', '.'}
        };

        System.out.println(numRookCaptures(board));
    }

    public static int numRookCaptures(char[][] board) {
        int res = 0;
        int r = 0;
        int c = 0;
        label:
        for (r = 0; r < board.length; r++) {
            for (c = 0; c < board[r].length; c++) {
                if (board[r][c] == 'R') {
                    break label;
                }
            }
        }

        for (int i = c - 1; i >= 0; i--) {   // left
            if (board[r][i] == 'p') {   // board 3 2 || 3 1 ||3 0
                res++;
                break;
            } else if (board[r][i] == 'B') {
                break;
            }

        }
        for (int i = c + 1; i < board.length; i++) {   // right
            if (board[r][i] == 'p') {
                res++;
                break;
            } else if (board[r][i] == 'B') {
                break;
            }

        }
        for (int i = r - 1; i >= 0; i--) {   // up
            if (board[i][c] == 'p') {
                res++;
                break;
            } else if (board[i][c] == 'B') {
                break;
            }
        }

        for (int i = r + 1; i < board[0].length; i++) {   // up
            if (board[i][c] == 'p') {
                res++;
                break;
            } else if (board[i][c] == 'B') {
                break;
            }
        }

        return res;

    }
}

