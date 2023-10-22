package com.sagar.leet.code;

import java.util.HashSet;
import java.util.Set;

class LeetCode36 {
    public static boolean  isValidSudoku(char[][] board) {

        Set<String> set=new HashSet<>();


        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    String row="number "+board[i][j]+" in row "+i;
                    String col="number "+board[i][j]+" in col "+j;
                    int boxCalculationIndex=(i/3)*3+(j/3);
                    String box="number "+board[i][j]+ " in box "+boxCalculationIndex;

                    if(!set.contains(row) && !set.contains(col) && !set.contains(box))
                    {
                        set.add(row);
                        set.add(col);
                        set.add(box);
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        System.out.println(set);
        return true;
    }

    public static void main(String[] args) {

        char[][] board={{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                                {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},{
            '.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}};


        boolean ans=isValidSudoku(board);
        System.out.println(ans);
    }
}

