package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenDiagonalFullX() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'X', 'X'};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenDiagonalHasSpaces() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', ' ', 'X'};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenDiagonalAllSpaces() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {' ', ' ', ' '};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSingleElementMatrixX() {
        char[][] input = {
                {'X'}
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X'};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSingleElementMatrixSpace() {
        char[][] input = {
                {' '}
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {' '};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenDiagonalInLargeMatrix() {
        char[][] input = {
                {'X', ' ', ' ', ' '},
                {' ', 'X', ' ', ' '},
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'X', ' ', 'X'};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenDiagonalMixedXAndSpaces() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', ' ', 'X'};
        assertThat(result).containsExactly(expected);
    }
}