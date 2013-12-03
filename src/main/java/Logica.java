
public class Logica {

	public boolean verificacionBisiesto(int anio)
	{
		if(anio%100 != 0 && anio%4 == 0)
		{
			return true;
		}
		return false;
	}
	
}
