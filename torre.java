public class torre extends pieza
{
	public torre(int color,boolean activo)
	{
		super(color,activo);
		if(color==0)
		{
			String figura="t";
		}
		else
		{
			String figura="T";
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
				if(a==c && b!=d)
				{
					e=b;
					while(e!=d-1)
					{
						if(e<d)
						{
							e++;
						}
						else
						{
							e--;
						}
						if(tablero[c][e].getactivo())
						{
							return false;
						}
					}
					tablero[c][d]=tablero[a][b];
					
					return true;
				}
				else if(b==d && a!=c)
				{
					while(a!=c-1)
					{
						if(a<c)
						{
							b++;
						}
						else
						{
							b--;
						}
						if(tablero[a][d].getactivo())
						{
							return false;
						}
					}
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
