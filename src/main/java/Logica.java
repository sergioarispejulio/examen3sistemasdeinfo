
public class Logica {

	public boolean verificacionBisiesto(int anio)
	{
		if(anio%100 == 0)
		{
			if(anio%400 == 0)
			{
				return true;
			}
		}
		else
		{
			if(anio%4 == 0)
			{
				return true;
			}
		}
		return false;
	}
	
}
