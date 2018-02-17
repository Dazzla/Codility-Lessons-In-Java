package test.java.com.CodilityLessons;
import main.java.com.CodilityLessons.CodilityLessonTwo;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;

import org.junit.Assert;

class CodilityLessonTwoTest extends TestCase {
	
	private CodilityLessonTwo lesson = new CodilityLessonTwo();

	@Test
	void basicArrayTest() {
		int[] simpleArray = new int[] {1,1,2,3,3};
		Assert.assertEquals(2, lesson.findUnpairedElement(simpleArray));
	}
	@Test
	void singleAtStart() {
		int[] singleAtStart = new int[] {6,1,2,2,3,3,4,4,1};
		Assert.assertEquals(6, lesson.findUnpairedElement(singleAtStart));
	}
	
	@Test
	void singleAtEnd() {
		int[] singleAtEnd = new int[] {1,2,2,3,3,4,4,1,6};
		Assert.assertEquals(6, lesson.findUnpairedElement(singleAtEnd));
	}

}
