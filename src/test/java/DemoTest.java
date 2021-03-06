import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoTest {

    @Test
    public void test_sum(){
        assertEquals(new Demo().sum(2, 8), 10);
    }

    @Test
    public void test_sub(){
        assertEquals(new Demo().sub(8, 3), 5);
    }

    @Test
    public void test_multiple(){
        assertEquals(new Demo().multiple(8, 3), 24);
    }

    @Test
    public void test_max(){
        assertEquals(new Demo().max(1, 3, 5), 5);
        assertEquals(new Demo().max(10, 44, 5), 44);
        assertEquals(new Demo().max(1, 44, 2225), 2225);
        assertEquals(new Demo().max(50, 44, 2225), 2225);
        assertEquals(new Demo().max(11111111, 44, 2225), 11111111);
    }
}
