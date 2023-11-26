package DemoPackageGroup1;

import org.testng.annotations.Test;

public class ClassB {
	
	@Test(groups = {"smoke","sanity"})
	public void MethodA() {
		System.out.println("DemoPackageGroup1 Class-B Method-A");
	}
	
	@Test(groups = {"sanity"})
	public void MethodB() {
		System.out.println("DemoPackageGroup1 Class-B Method-B");
	}
	
	@Test(groups = {"sanity"})
	public void MethodC() {
		System.out.println("DemoPackageGroup1 Class-B Method-C");
	}

}
