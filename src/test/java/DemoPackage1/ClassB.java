package DemoPackage1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ClassB {
	@Test(enabled = false)
	public void MethodA() {
		System.out.println("Package-1 Class B Method A");
	}
	
	@Ignore
	@Test
	public void MethodB() {
		System.out.println("Package-1 Class B Method B");
	}
	
	@Test
	public void MethodC() {
		System.out.println("Package-1 Class B Method C");
	}
	
}
