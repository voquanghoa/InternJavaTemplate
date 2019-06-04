import org.junit.Assert;
import org.junit.Test;

public class StringDecoderTest {

    @Test
    public void test_decode(){
        Assert.assertEquals(new StringDecoder().decode("abc4e6fd"), "abcccceeeeeefd");
        Assert.assertEquals(new StringDecoder().decode("ab13c"), "abbbbbbbbbbbbbc");
    }

    @Test
    public void test_decode2(){
        Assert.assertEquals(new StringDecoder().decode2("abc4e6fd"), "abcccceeeeeefd");
        Assert.assertEquals(new StringDecoder().decode2("ab13c"), "abbbbbbbbbbbbbc");
    }
}
