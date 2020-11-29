package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import try1.login;

public class loginTest {
	login obj=new login();
	@Test
	public void logintest() {		
		int i=obj.loginTask("nikhil","123","Teacher");
		assertEquals(1,i);
	}
	@Test
	public void logintest2(){		
		int i=obj.loginTask("omkar","123","Teacher"); 
		assertEquals(1,i);
	}
	@Test
	public void logintest3(){		
		int i=obj.loginTask("amol","123","HOD");
		assertEquals(1,i);
	}
	@Test
	public void logintest4(){		 
		int i=obj.loginTask("pavan","pavan@123","Student");
		assertEquals(1,i);
	}
	@Test
	public void logintest5(){		
		int i=obj.loginTask("omkar","123","Principal");
		assertEquals(1,i);
	}
}
