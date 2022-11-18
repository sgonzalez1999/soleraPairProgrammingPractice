package soleraPairProgrammingPractice.Bugs.Ejercicio7;

public class Ejercicio7 {
	@Override
	public void putToCache(PutRecordsRequest putRecordsRequest) 
	{
		....
		if(dataTmpFile!=null && !dataTmpFile.exists())//type at the first condition, the == throws nullPointerException before creating the file
		{
			try{
				dataTmpfile.createNewFile();
			}catch(IOException e){
				LOGGER.error("....",e);
				return;
			}
		}
	}
	

}
