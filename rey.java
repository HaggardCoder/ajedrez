public class rey extends pieza

{
	public rey(int color,boolean activo)
	{
		super(color,activo);
		if(color==0)
		{
			String figura="r";
		}
		else
		{
			String figura="R";
		}
	}
	public static boolean movimiento(pieza[][] tablero, int a,int b,int c,int d,int turn)
	{
		int e=0,x=0;
		if(tablero[a][b].getcolor()==turn)
		{
			if(tablero[a][b].getcolor()==tablero[c][d].getcolor())
			{
				return false;					
			}
			else
			{
				e=a;
				x=b;
				e++;
				if(e==c&&x==d)
				{tablero[e][x]=tablero[a][b];
					return true;
				}
				x--;
				if(e==c&&x==d)
				{tablero[e][x]=tablero[a][b];
					return true;
				}
				x=x+2;
				if(e==c&&x==d)
				{tablero[e][x]=tablero[a][b];
					return true;
				}
				e--;
				if(e==c&&x==d)
				{tablero[e][x]=tablero[a][b];
					return true;
				}
				e--;
				if(e==c&&x==d)
				{tablero[e][x]=tablero[a][b];
					return true;
				}
				x--;
				if(e==c&&x==d)
				{tablero[e][x]=tablero[a][b];
					return true;
				}
				x--;
				if(e==c&&x==d)
				{tablero[e][x]=tablero[a][b];
					return true;
				}
				e++;
				if(e==c&&x==d)
				{
					tablero[e][x]=tablero[a][b];
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
		
		
		
	}}
