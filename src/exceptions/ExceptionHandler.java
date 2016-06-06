package exceptions;

public class ExceptionHandler 
{
	public static void checkName(String nameS) throws WrongInputException
	{
		try 
		{
			if(nameS.length() < 1)
			{
				throw new WrongInputException("Es wurde kein Name eingegeben!");
			}
			if(nameS.length() >= 20)
			{
				throw new WrongInputException("Name darf nicht mehr als 20 Stellen haben");
			}
		}
		catch(NullPointerException ex) 
		{
			throw new WrongInputException("Es wurde kein Name eingegeben!");
		}
	}
}
