package soleraPairProgrammingPractice.Bugs.Ejercicio7;

public class Ejercicio7 {
	@Override
	public void putToCache(PutRecordsRequest putRecordsRequest) 
	{
		....
		if(!dataTmpfile.exists()){//it doesnt make sense for a file to be null
			try{
				dataTmpfile.createNewFile();
			}catch(IOException e){
				LOGGER.error("....",e);
				return;
			}
		}
	}
	

}
