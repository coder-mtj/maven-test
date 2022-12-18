import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testSay(){
        Demo demo = new Demo();
        int res = demo.print();
        Assert.assertEquals(6, res);
    }
}
