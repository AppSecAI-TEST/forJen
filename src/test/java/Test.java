import org.junit.Assert;

import wps.Cal;

public class Test {

	@org.junit.Test
	public void test() {
        Cal cal = new Cal(1, 3);
        System.out.println(""+cal.additive());
        Assert.assertTrue(true);
	}

}
