package DemoPackageGroup2;

import org.testng.annotations.Test;

public class ClassC {
	
	@Test(groups = "smoke")
	public void MethodA() {
		System.out.println("DemoPackageGroup2 Class-C Method-A");
	}
	
	@Test
	public void MethodB() {
		System.out.println("DemoPackageGroup2 Class-C Method-B");
	}
	
	@Test
	public void MethodC() {
		System.out.println("DemoPackageGroup2 Class-C Method-C");
	}

}
