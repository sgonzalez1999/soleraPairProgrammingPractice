package soleraPairProgrammingPractice.Bugs.Ejercicio6;

public class Ejercicio6 {
    private static byte char64( char x) {
    	private static byte char64( char x) {
//          (int)x < 0 || the value of (int)x will always be positive first bug
//          changing the ‘>’ operator to ‘>=’: (int)x >= index_64.length. second bug
            if ( (int)x >= index_64.length)
                return -1;
            return index_64[(int) x] ;
        }
}
