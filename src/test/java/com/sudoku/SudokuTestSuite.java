package test.java.com.sudoku;

import main.java.com.sudoku.SudokuBoard;
import main.java.com.sudoku.SudokuElement;
import main.java.com.sudoku.SudokuRow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SudokuTestSuite {

    @Test
    void addSudokuElementTest(){
        //Given
        SudokuBoard sudokuBoard=new SudokuBoard();
       sudokuBoard.getSudokuRowList().add(new SudokuRow());
       sudokuBoard.getSudokuRowList().get(0).getSudokuRowElements().add(new SudokuElement(2));

        //When
        // sudokuBoard.addNumberToSudoku(1,1, 2);
        int result = sudokuBoard.getSudokuRowList().get(0).getSudokuRowElements().get(0).getValue();

        //Then
        Assertions.assertEquals(2, result);
    }


}
