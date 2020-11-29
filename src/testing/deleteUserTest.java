package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import try1.delete_user;

class deleteUserTest {
	delete_user obj=new delete_user();
	@Test
	void test() {
		int test = obj.delete("amol", "Student", "123456789");
		assertEquals(test,1);
	}
	@Test
	void test1() {
		int test = obj.delete("", "Student", "123456789");
		assertEquals(test,1);
	}
	@Test
	void test2() {
		int test = obj.delete("amol", "", "123456789");
		assertEquals(test,1);
	}
	@Test
	void test3() {
		int test = obj.delete("amol", "Student", "");
		assertEquals(test,1);
	}
	@Test
	void test4() {
		int test = obj.delete("nikhil", "Student", "123456789");
		assertEquals(test,1);
	}
	@Test
	void test5() {
		int test = obj.delete("abcdeftatafafaffafafafafafa", "Student", "123456789");
		assertEquals(test,1);
	}

}
