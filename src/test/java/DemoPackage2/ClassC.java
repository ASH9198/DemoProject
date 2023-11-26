package DemoPackage2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class ClassC {
	
	@Test
	public void MethodA() {
		System.out.println("Package-2 Class C Method A");
	}
	
	@Test
	public void MethodB() {
		System.out.println("Package-2 Class C Method B");
	}
	
	@Test
	public void MethodC() {
		System.out.println("Package-2 Class C Method C");
	}

}
