package kenneth;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Test for verifying App function(s)
 */
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        // Setting up variables before each unit test
        solution = new Solution();
    }

    @AfterEach
    void tearDown() {
        // Resetting variables after each unit test
    }

    @Test
    void sumOfTwoIntExample1() {
        int i = 1;
        int j = 2;

        int expectedResult = 3;
        int actualResult = solution.sumOfTwoInt(i, j);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sumOfTwoIntExample2() {
        int i = 9;
        int j = 47;

        int expectedResult = 56;
        int actualResult = solution.sumOfTwoInt(i, j);

        assertEquals(expectedResult, actualResult);
    }
}