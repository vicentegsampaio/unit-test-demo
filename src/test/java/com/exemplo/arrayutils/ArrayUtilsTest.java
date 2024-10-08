package com.exemplo.arrayutils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArrayUtilsTest {

    private ArrayUtils utils = new ArrayUtils();

    @Test
    void positiveNumbersSum() {
        int[] array = {1, 2, 3, 4, 5};
        int result = utils.sum(array);
        assertEquals(15, result);
    }

}
