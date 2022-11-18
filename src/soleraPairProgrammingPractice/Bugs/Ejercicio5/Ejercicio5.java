package soleraPairProgrammingPractice.Bugs.Ejercicio5;

public class Ejercicio5 {
    public static final ByteSequence prefixEndof (ByteSequence prefix) {
        byte[] endKey =prefix.getBytes().clone ();
            for (int i = endKey.length- 1; i >= 0; i--) {
//              never enters the if  if (endKey [il < 0xff) {
                if (endKey [il > 0xff) {
                    endKey[il = (byte) (endKey[i] +1);
                    return ByteSequence.from (Arrays.copyof (endKey, i + 1));
                }
            }
            return ByteSequence.from (NO_PREFIX_END);
    }
}
