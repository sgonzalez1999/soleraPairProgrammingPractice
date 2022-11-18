package soleraPairProgrammingPractice.Bugs.Ejercicio3;

public class Exercise3 {
    protected PreDeConModel computeLocalModel (DoubleDBIDList neighbors, ...){
        final int referenceSetSize neighbors.size ();
//      Shouldn 't happen:
        if(referenceSetSize <= 0) { //it has to be less or equal to 0 in order  to not divide by 0 inside the for sentence
        LOG.warning ("Empty reference set should at least include the query point! ");
            return new PreDeConModel (Integer.MAX_VALUE, DBIDUtil.EMPTYDBIDS);
        }
        for (int d= 0; d < dim; d++) {
            s[d] /= referenceSetSize;
            mvVar.put (s [d]);
        }
    }
}