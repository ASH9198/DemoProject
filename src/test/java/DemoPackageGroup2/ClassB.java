package DemoPackageGroup2;

import org.testng.annotations.Test;

public class ClassB {
	
	@Test(groups = "smoke")
	public void MethodA() {
		System.out.println("DemoPackageGroup2 Class-B Method-A");
	}
	
	@Test
	public void MethodB() {
		System.out.println("DemoPackageGroup2 Class-B Method-B");
	}
	
	@Test
	public void MethodC() {
		System.out.println("DemoPackageGroup2 Class-B Method-C");
	}

}
