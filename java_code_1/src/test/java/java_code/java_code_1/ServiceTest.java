package java_code.java_code_1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ServiceTest {
	
	@BeforeClass
	public static void beforeEach() {
		System.out.println("before all test case");
		System.out.println("test started");
	}
	@Test (timeout=1000)//
	//junit testing 
	public void doCalculationTest() {
		int r = Service.doCalculation(12, 12);
		int expect_result=24;
		Assert.assertEquals(expect_result, r);
		
		
	}
	@Test
	@Ignore //now this test is not tested
	
	
	
	public void productTest() {
		int pro_result= Service.product(12, 12);
		int ex_result =140;
		Assert.assertEquals(pro_result, ex_result);
	}
	@Test
	
	public void addAnyNumberTest() {
		int Sum= Service.addAnyNum(1,2,3,4);
		int ex= 10;
		Assert.assertEquals(Sum, ex);
	}
	@AfterClass
	public static void AfterEach() {
		System.out.println("after test case");
	}
	@Before
	public  void before() {
		System.out.println("before every test case");
	}

	@After
	public  void after() {
		System.out.println("after every test case");
	}

}
