package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasMonoHorizontal2() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isFalse();
    }

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
    public void whenDiagonalFullOne() {
        char[][] input = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenDiagonalMix() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'Y', 'Z'};
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
