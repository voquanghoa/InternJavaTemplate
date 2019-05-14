import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class BarcodeTest {

    @Test
    public void test_verify(){
        assertTrue(Barcode.verify("8938505974194"));
        assertTrue(Barcode.verify("8934588063053"));
    }
}
