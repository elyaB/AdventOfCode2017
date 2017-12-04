package com.example.AdventCalendar;

import com.example.AdventCalendar.Year2017.Day1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Day1Tests {
	
	@Test
	public void Input_1122_Output_3() {
	    Integer method = Day1.resolveCaptcha("1122");
	    Integer result = 3;
		Assert.assertEquals(result, method);
	}

	@Test
	public void Input_1111_Output_4() {
		Integer method = Day1.resolveCaptcha("1111");
		Integer result = 4;
		Assert.assertEquals(result, method);
	}

	@Test
	public void Input_1234_Output_0() {
		Integer method = Day1.resolveCaptcha("1234");
		Integer result = 0;
		Assert.assertEquals(result, method);
	}

	@Test
	public void Input_91212129_Output_9() {
		Integer method = Day1.resolveCaptcha("91212129");
		Integer result = 9;
		Assert.assertEquals(result, method);
	}
}
