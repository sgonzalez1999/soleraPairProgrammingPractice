package soleraPairProgrammingPractice.Bugs.Ejercicio10;

public class Ejercicio10 {
	
	public void testSignSHA256CompleteEvenHeight2() {
        ....
        int height = 10;
        ....
        for (int i = 0; i < (1 << height); i++) {
            byte[] signature = xmss.sign(new byte[1024]);
            switch (i) { 
                case 0x005b:
                    assertEquals(signatures[0], Hex.toHexString(signature));
                    break;
                case 0x0822:// the switch will never happen
                    assertEquals(signatures[1], Hex.toHexString(signature));
                    break;
                ....
            }
        }
    }

}
