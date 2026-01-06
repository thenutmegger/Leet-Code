import java.util.ArrayList;
import java.util.List;

public class Leetcode_51 {

    public String isValid(List<List<String>> board, int row, int col, int n){
        for (int i = 0; i<n; i++){
            if (board.get(row).get(i) == "Q"){
                return ".";
            }
            if (board.get(i).get(col) == "Q"){
                return ".";
            }
        }

        int tr = row + 1;
        int tc = col + 1;

        while(tr <n && tc < n){
            if (board.get(tr).get(tc) == "Q"){
                return ".";
            }
            tr++;
            tc++;
        }

        tr = row - 1;
        tc = col - 1;

        while(tr >= 0 && tc >= 0){
            if (board.get(tr).get(tc) == "Q"){
                return ".";
            }
            tr--;
            tc--;
        }

        tr = row + 1;
        tc = col - 1;

        while(tr < n && tc >= 0){
            if (board.get(tr).get(tc) == "Q"){
                return ".";
            }
            tr++;
            tc--;
        }

        tr = row - 1;
        tc = col + 1;

        while(tr >= 0 && tc < n){
            if (board.get(tr).get(tc) == "Q"){
                return ".";
            }
            tr--;
            tc++;
        }

        return "Q";


    }

    void Func(List<List<String>> board, List<String> path, int row, int n){
        if (row == n){
            board.add(new ArrayList<>(path));
            return;
        }

        for (int col = 0; col<n; col++){
            path.add("Q");

            if (isValid(board, row, col, n) == "Q"){
                Func(board, path, row+1, n);
            }
            path.set(path.size()-1, ".");
        }

        return;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> board = new ArrayList<>();
        List<String> path = new ArrayList<>();

        Func(board, path, 0, n);

        return board;
    }
}
