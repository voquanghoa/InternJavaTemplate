import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayExerciseTest {

    @Test
    public void test_sum(){
        assertEquals(new ArrayExercise().calculateSum(new int[]{3,4,5}), 12);
    }

    @Test
    public void test_subArray_valid(){
        assertArrayEquals(new ArrayExercise().subArray(new int[]{1, 2, 3}, 0, 2), new int[]{1, 2});
        assertArrayEquals(new ArrayExercise().subArray(new int[]{1, 2, 3}, 1, 2), new int[]{2, 3});
        assertArrayEquals(new ArrayExercise().subArray(new int[]{1, 2, 3, 4}, 1, 5), new int[]{2, 3, 4});
    }

    @Test(expected = RuntimeException.class)
    public void test_subArray_invalid_start(){
        new ArrayExercise().subArray(new int[]{1, 2, 3}, -1, 2);
        new ArrayExercise().subArray(new int[]{1, 2, 3}, 3, 2);
        new ArrayExercise().subArray(new int[]{1, 2, 3}, 4, 2);
    }

    @Test(expected = RuntimeException.class)
    public void test_subArray_invalid_length(){
        new ArrayExercise().subArray(new int[]{1, 2, 3}, 1, -2);
    }
}
