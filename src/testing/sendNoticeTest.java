package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import try1.delete_user;
import try1.new_notice;

class sendNoticeTest {
	new_notice obj=new new_notice();
	@Test
	void test() {
		int test = obj.sendNotice("Lecture at 2pm", "Teacher", "Student");
		assertEquals(test,1);
	}
	@Test
	void test1() {
		int test = obj.sendNotice("Webinar on __ on  4 th sep", "HOD", "Student");
		assertEquals(test,1);
	}
	@Test
	void test2() {
		int test = obj.sendNotice("Cogratulation tnp & students for placement", "Principal", "123456789");
		assertEquals(test,1);
	}
	@Test
	void test3() {
		int test = obj.sendNotice(" ", "Student", "");
		assertEquals(test,1);
	}
	@Test
	void test4() {
		int test = obj.sendNotice("", "", "123456789");
		assertEquals(test,1);
	}

}
