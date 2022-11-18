package soleraPairProgrammingPractice.Bugs.Ejercicio1;

public class Ejercicio1 {
	
	private boolean checkDimensions(CLIQUEUnit other , int e) {
        for(int i=0, j=0; i<e; i++, j+=2) {
            if(dims[i]!=other.dims[i] || bounds[j]!= other.bounds[j] || bounds[j-1] != other.bounds[j-1] ) {
                return false;
//              bounds[j-1] != bounds[j-1] change last condition
            }
        }
        return true;
    }

}
