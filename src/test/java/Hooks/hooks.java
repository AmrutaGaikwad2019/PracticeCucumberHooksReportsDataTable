package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class hooks {
	
	
	@BeforeStep(order=1)
	public void beforestep1() {
		System.out.println("@BeforeStep->1");
	}
	@AfterStep(order=1)
	public void afterstep1() {
		System.out.println("@AfterStep->1");
	}
	@BeforeStep(order=2)
	public void beforestep2() {
		System.out.println("@BeforeStep->2");
	}
	@AfterStep(order=2)
	public void afterstep2() {
		System.out.println("@AfterStep->2");
	}


		@Before(order=1)
		public void setup1() {
			System.out.println("@Before->Driver setup1");
		}
	
		@After(order=1)
		public void tearDown1() {
			System.out.println("@After->Driver teardown1");
		}
		
		@Before(order=2)
		public void setup2() {
			System.out.println("@Before->Driver setup2");
		}
	
		@After(order=2)
		public void tearDown2() {
			System.out.println("@After->Driver teardown2");
		}

		@BeforeAll(order=1)
		public static void dbSetup1() {
			System.out.println("@BeforeAll->DB setup1");
		}
	
		@AfterAll(order=1)//1 is having highest priority than 2
		public static void dbTearDown1() {
			System.out.println("@AfterAll->DB teardown1");
		}
		@BeforeAll(order=2)
		public static void dbSetup2() {
			System.out.println("@BeforeAll->DB setup2");
		}
	
		@AfterAll(order=2)
		public static void dbTearDown2() {
			System.out.println("@AfterAll->DB teardown2");
		}

}
