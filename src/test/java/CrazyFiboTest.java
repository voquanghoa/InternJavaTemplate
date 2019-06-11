import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrazyFiboTest {


    @Test
    public void test_next(){
        assertEquals(CrazyFibo.next(12345), 23455);
        assertEquals(CrazyFibo.next(76528), 65288);
    }

    @Test
    public void test_calculate(){
        assertEquals(CrazyFibo.calculate(12345, 1, 2, 3, 4, 5), 0);
        assertEquals(CrazyFibo.calculate(2222, 2, 4, 3, 4, 5), 5);
        assertEquals(CrazyFibo.calculate(3, 2, 4, 3, 4, 5), 4);
    }
}


