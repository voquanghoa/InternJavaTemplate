import org.junit.Assert;
import org.junit.Test;

public class StringDecoderTest {

    @Test
    public void test_decode(){
        Assert.assertEquals(new StringDecoder().decode("abc4e6fd"), "abcccceeeeeefd");
        Assert.assertEquals(new StringDecoder().decode("ab13c"), "abbbbbbbbbbbbbc");
    }
}
