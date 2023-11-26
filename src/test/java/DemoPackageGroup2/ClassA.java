package DemoPackageGroup2;

import org.testng.annotations.Test;

public class ClassA {
	
	@Test(groups = "smoke")
	public void MethodA() {
		System.out.println("DemoPackageGroup2 Class-A Method-A");
	}
	
	@Test
	public void MethodB() {
		System.out.println("DemoPackageGroup2 Class-A Method-B");
	}
	
	@Test
	public void MethodC() {
		System.out.println("DemoPackageGroup2 Class-A Method-C");
	}

}
