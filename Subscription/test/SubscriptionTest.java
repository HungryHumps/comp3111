import static org.junit.Assert.*;

import org.junit.Test;


public class SubscriptionTest {
	@Test
	public void testReturnEuro() {
		Subscription S = new Subscription(200,2) ;
		assertTrue(S.pricePerMonth() == (double) 1) ;
	}
	
	@Test
	public void testRoundingup() {
		Subscription S3 = new Subscription(200,3) ;
		assertTrue(S3.pricePerMonth() == (double) 0.67) ;
	}
}
