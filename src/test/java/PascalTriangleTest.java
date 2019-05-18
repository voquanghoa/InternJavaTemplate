import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;


public class PascalTriangleTest {
    @Test
    public void test_generateTriangle(){
        assertArrayEquals(new PascalTriangle().generate(0), new int[]{1});
        assertArrayEquals(new PascalTriangle().generate(1), new int[]{1, 1});
        assertArrayEquals(new PascalTriangle().generate(2), new int[]{1, 2, 1});
        assertArrayEquals(new PascalTriangle().generate(5), new int[]{1, 5, 10, 10, 5, 1});
        assertArrayEquals(new PascalTriangle().generate(7), new int[]{1, 7, 21, 35, 35, 21, 7, 1});
        assertArrayEquals(new PascalTriangle().generate(10), new int[]{1 , 10 , 45 , 120 , 210 , 252 , 210 , 120 , 45 , 10 , 1});
        assertArrayEquals(new PascalTriangle().generate(11), new int[]{1 , 11 , 55 , 165 , 330 , 462 , 462 , 330 , 165 , 55 , 11 , 1});
    }
}
