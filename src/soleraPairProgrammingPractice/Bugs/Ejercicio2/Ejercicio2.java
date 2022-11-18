package soleraPairProgrammingPractice.Bugs.Ejercicio2;

public class Ejercicio2 {
    @Override
    public double [] computeMean() {
        return points.size()== 1? points.get(0): null;
//      points.get(1) Throws exception Array out of bounds
    }
}
