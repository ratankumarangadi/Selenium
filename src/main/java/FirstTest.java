import org.testng.annotations.Test;

import com.automation.applications.Application;
import com.automation.basetest.BaseTest;
import com.automation.pageFactory.PageFactory;

public class FirstTest extends BaseTest{

	@Application(application="Ap1")
	@Test
	public void runTest1(){
		PageFactory<PageClass> p = PageFactory.get(PageClass.class);
		System.out.println("Done");
	}
	
	@Application(application="Ap2")
	@Test
	public void runTest2(){
		PageFactory<PageClass> p = PageFactory.get(PageClass.class);
		System.out.println("Done");
	}
	
	@Application(application="Ap3")
	@Test
	public void runTest3(){
		PageFactory<PageClass> p = PageFactory.get(PageClass.class);
		System.out.println("Done");
	}
	
}
