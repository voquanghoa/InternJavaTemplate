import org.junit.Assert;
import org.junit.Test;

public class StringSumTest {

    @Test
    public void test_sum(){
        Assert.assertEquals(new StringSum().sum("1224","2337"),"3561");
        Assert.assertEquals(new StringSum().sum("12","2"),"14");
        Assert.assertEquals(new StringSum().sum("14","5"),"19");
        Assert.assertEquals(new StringSum().sum("14","7"),"21");
        Assert.assertEquals(new StringSum().sum("14","87"),"101");
        Assert.assertEquals(new StringSum().sum("14927382913633","22278981625342112"),"22293909008255745");
    }
}
