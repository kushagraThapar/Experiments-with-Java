package com.krutarth;

/**
 * Created by kushagrathapar on 3/10/16.
 */
public class WordSearch {
    public static void main(String[] args) {
        char[][] board = new char[3][4];
        String s = "ABCESFCSADEE";
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = s.charAt(counter);
                counter++;
            }
        }
        System.out.println(exist(board, "SEED"));
    }

    public static boolean exist(char[][] board, String word) {
        char[] w = word.toCharArray();
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                if (exist(board, y, x, w, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean exist(char[][] board, int y, int x, char[] word, int i) {
        if (i == word.length) {
            return true;
        }
        if (y < 0 || x < 0 || y == board.length || x == board[y].length) {
            return false;
        }
        if (board[y][x] != word[i]) {
            return false;
        }
        //board[y][x] = '*';
        board[y][x] ^= 256;
        boolean exist =    exist(board, y, x + 1, word, i + 1)
                || exist(board, y, x - 1, word, i + 1)
                || exist(board, y + 1, x, word, i + 1)
                || exist(board, y - 1, x, word, i + 1);
        //board[y][x] = word[i];
        board[y][x] ^= 256;
        return exist;
    }
}