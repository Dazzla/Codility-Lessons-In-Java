package test.java.com.CodilityLessons;

import main.java.com.CodilityLessons.CodilityLessonOne;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

class CodilityLessonOneTest {

	private CodilityLessonOne lesson = new CodilityLessonOne();

	@Test
	void zeroGap() {
		Assert.assertEquals(0, lesson.binaryGap(1));

	}

	@Test
	void hasGap() {
		Assert.assertEquals(2, lesson.binaryGap(9));
	}

	@Test
	void largeInput() {
		Assert.assertEquals(4, lesson.binaryGap(999999999));
	}

	@Test
	void boundaries() {
		Assert.assertEquals(0, lesson.binaryGap(1));
		Assert.assertEquals(0, lesson.binaryGap(0));
		Assert.assertEquals(0, lesson.binaryGap(-1));
	}
}
