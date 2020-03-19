package com.soundai.ltcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: liujialei
 * @create: 2020-02-29 10:57
 **/
public class Array30 {

    public static void main(String[] args) {
        Array30 array30 = new Array30();
        char[][] board = new char[9][9];
        char[] board0 = new char[]{'.','8','7','6','5','4','3','2','1'};
        char[] board1 = new char[]{'2','.','.','.','.','.','.','.','.'};
        char[] board2 = new char[]{'3','.','.','.','.','.','.','.','.'};
        char[] board3 = new char[]{'4','.','.','.','.','.','.','.','.'};
        char[] board4 = new char[]{'5','.','.','.','.','.','.','.','.'};
        char[] board5 = new char[]{'6','.','.','.','.','.','.','.','.'};
        char[] board6 = new char[]{'7','.','.','.','.','.','.','.','.'};
        char[] board7 = new char[]{'8','.','.','.','.','.','.','.','.'};
        char[] board8 = new char[]{'9','.','.','.','.','.','.','.','.'};

        /**
         * [[".","8","7","6","5","4","3","2","1"],["2",".",".",".",".",".",".",".","."],["3",".",".",".",".",".",".",".","."],["4",".",".",".",".",".",".",".","."],["5",".",".",".",".",".",".",".","."],["6",".",".",".",".",".",".",".","."],["7",".",".",".",".",".",".",".","."],["8",".",".",".",".",".",".",".","."],["9",".",".",".",".",".",".",".","."]]
         */
        board[0] = board0;
        board[1] = board1;
        board[2] = board2;
        board[3] = board3;
        board[4] = board4;
        board[5] = board5;
        board[6] = board6;
        board[7] = board7;
        board[8] = board8;

        boolean validSudoku = array30.isValidSudoku(board);
        System.out.println(validSudoku);
    }

    /**
     * 数字 1-9 在每一行只能出现一次。
     * 数字 1-9 在每一列只能出现一次。
     * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {

        Set<Character> setRow = new HashSet<>();
        Set<Character> setArr = new HashSet<>();
        //rule 1、2
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (setRow.contains(board[i][j])) {
                        return false;
                    } else {
                        setRow.add(board[i][j]);
                    }
                }
                if (board[j][i] != '.') {
                    if (setArr.contains(board[j][i])) {
                        return false;
                    } else {
                        setArr.add(board[j][i]);
                    }
                }
            }
            System.out.println(Arrays.toString(setRow.toArray()));
            System.out.println(Arrays.toString(setArr.toArray()));
            setRow.clear();
            setArr.clear();
        }

        Set<Character> angle = new HashSet<>();
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                for (int ki = 0; ki < 3; ki++) {
                    for (int kj = 0; kj < 3; kj++) {
                        if (board[i + ki][j + kj] != '.') {
                            if (angle.contains(board[i + ki][j + kj])) {
                                return false;
                            } else {
                                angle.add(board[i + ki][j + kj]);
                            }
                        }
                    }
                }
                System.out.println(Arrays.toString(angle.toArray()));
                angle.clear();
            }
        }

        return true;
    }




}
