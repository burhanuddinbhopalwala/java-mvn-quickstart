package org.example.testing.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorParametrizeImplTest {

    private final int num1;
    private final int num2;
    private final int expectedResult;

    public CalculatorParametrizeImplTest(int num1, int num2, int result) {

        this.num1 = num1;
        this.num2 = num2;
        this.expectedResult = result;

    }

    @Parameters
    public static Collection<Integer[]> data() {
        return Arrays.asList(new Integer[][]{{-1, 2, 1}, {1, 2, 3}, {6, 7, 13}});
    }

    @Test
    public void addShouldReturnAResult() {
        CalculatorParametrized c = new CalculatorParametrizedImpl();
        int result = c.add(num1, num2);
        assertEquals(expectedResult, result);
    }

}
