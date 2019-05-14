import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayExerciseTest {

    @Test
    public void test_sum(){
        assertEquals(new ArrayExercise().sum(new int[]{3,4,5}), 12);
    }
}
