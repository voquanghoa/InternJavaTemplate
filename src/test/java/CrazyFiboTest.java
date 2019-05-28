import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrazyFiboTest {


    @Test
    public void test_next(){
        assertEquals(CrazyFibo.next(12345), 23455);
        assertEquals(CrazyFibo.next(76528), 65288);
    }
}


