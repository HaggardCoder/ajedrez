public class caballo extends pieza

{
	public caballo(int color,boolean activo)
	{
		super(color,activo);
		if(color==0)
		{
			String figura="c";
		}
		else
		{
			String figura="C";
		}
	}
	public static boolean movimiento(pieza[][] tablero, int a,int b,int c,int d,int turn)
	{
		int e=0;
		if(tablero[a][b].getcolor()==turn)
		{
			if(tablero[a][b].getcolor()==tablero[c][d].getcolor())
			{
				return false;					
			}
			else
			{
				if(tablero[c][d]==tablero[a+2][b-1]||tablero[c][d]==tablero[a+2][b+1]||tablero[c][d]==tablero[a-2][b+1]||tablero[c][d]==tablero[a+2][b-1]||tablero[c][d]==tablero[a+1][b+2]||tablero[c][d]==tablero[a-1][b+2]||tablero[c][d]==tablero[a+1][b-2]||tablero[c][d]==tablero[a-1][b-2])
				{
					tablero[c][d]=tablero[a][b];
					return true;
				}
				else
				{
					return false;
				}
			}
			
		}
		else
		{
			return false;				
		}
		
		
	}
	
}
