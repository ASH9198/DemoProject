package DemoPackageGroup1;

import org.testng.annotations.Test;

public class ClassC {
	
	@Test(groups = "smoke")
	public void MethodA() {
		System.out.println("DemoPackageGroup1 Class-C Method-A");
	}
	
	@Test(groups = {"sanity"})
	public void MethodB() {
		System.out.println("DemoPackageGroup1 Class-C Method-B");
	}
	
	@Test
	public void MethodC() {
		System.out.println("DemoPackageGroup1 Class-C Method-C");
	}

}
