package chess;

public abstract class pieza {
	 boolean pcolor;
	public pieza(boolean color)
	{
		pcolor=color;
	}
	public boolean getcolor()
	{
		return pcolor;
	}
	public boolean movimiento(int a,int b,int c,int d,tablero tablero)
	{
		return false;
	}
	public boolean getimportante()
	{
		return false;
	}	
	public boolean getennpasant()
	{
		return false;
	}
	public boolean getcoronation()
	{
		return false;
	}
	public void setennpasant(boolean a)
	{
		
	}
	public boolean amenaza(boolean a)
	{
		return false;
	}

}
