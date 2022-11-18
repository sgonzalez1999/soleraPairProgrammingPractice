package soleraPairProgrammingPractice.Bugs.Ejercicio4;

public class Ejercicio4 {
    public String getStrippedSubstring (){
    int sstart= start, ssend=end;
        while (sstart < ssend) {
            char c =input.charAt (sstart);
            if(c !=' '|| c != '\n' || c!= '\r' || c!='\t') {
            break;
            }
            Sstart++;//  the increment goes after not before
        }
    }
}
