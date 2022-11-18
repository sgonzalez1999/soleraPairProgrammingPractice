package soleraPairProgrammingPractice.Katas.Bingo;

import java.util.Collections;
import java.util.Stack;

public class NumberCaller {
	
	private Stack<Integer> numbers;

    public NumberCaller() {
        numbers = new Stack<>();
        for (int i = 1; i <= 75; i++)
            numbers.add(i);
        Collections.shuffle(numbers);
    }

    public int call() {
        return numbers.pop();
    }

}
