package DemoPackageGroup1;

import org.testng.annotations.Test;

public class ClassA {
	@Test(groups = {"smoke","sanity"})
	public void MethodA() {
		System.out.println("DemoPackageGroup1 Class-A Method-A");
	}
	
	@Test(groups = {"sanity"})
	public void MethodB() {
		System.out.println("DemoPackageGroup1 Class-A Method-B");
	}
	
	@Test
	public void MethodC() {
		System.out.println("DemoPackageGroup1 Class-A Method-C");
	}

}
