package main.java.com.CodilityLessons;

import java.util.Hashtable;
import java.util.Set;

public class CodilityLessonTwo {

	public int findUnpairedElement(int[] input) {
		int result = 0;
		int count = 0;
		Hashtable<Integer, Integer> counts = new Hashtable<Integer, Integer>();
		for (int number : input) {
			count = 0;
			result = 0;
			for (int numberToCount : input) {
				if (number == numberToCount) {
					count++;
					counts.put(number, count);
				}

			}
		}
		Set<Integer> values = counts.keySet();
		for (Integer value : values) {
			int frequency = counts.get(value);
			if (frequency == 1) {
				result = value;
			}
		}

		return result;
	}
}
