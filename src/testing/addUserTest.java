package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import try1.add_new_user;
import try1.new_notice;

class addUserTest {
	add_new_user obj=new add_new_user();
	@Test
	void test() {
		int test = obj.addUser("nikhil","HOD","nikhil123","712345689","khartodenikhil@gmail.com");
		assertEquals(test,1);
	}
	@Test
	void test1() {
		int test = obj.addUser("nikhil","","nikhil123","","khartodenikhil@gmail.com");
		assertEquals(test,1);
	}
	@Test
	void test2() {
		int test = obj.addUser("","HOD","nikhil123","712345689","khartodenikhil@gmail.com");
		assertEquals(test,1);
	}
	@Test
	void test3() {
		int test = obj.addUser("nikhil","HOD","nikhil123","123456789","khartodenikhil@gmail.com");
		assertEquals(test,1);
	}
	@Test
	void test4() {
		int test = obj.addUser("nikhil","HOD","nikhil123","712345689","khartodenikhil");
		assertEquals(test,1);
	}
}
