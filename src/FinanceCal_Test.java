import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FinanceCal_Test {

	static FinanceCal student;
	static double tuition;
	static double term;
	static double apr;
	static double percentageIncrease;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		tuition = 10000;
		term = 5;
		apr = 7;
		percentageIncrease = 8;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_yearlyTuition(){
		student.yearlyTuition(tuition, percentageIncrease, apr);
	}

	@Test
	public void test_monthlyPayment(){
		
	}
}
