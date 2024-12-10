public class alfil extends pieza
{
	public alfil(int color,boolean activo)
	{
		super(color,activo);
		if(color==0)
		{
			String figura="a";
		}
		else
		{
			String figura="A";
		}
	}
	public static boolean movimiento(pieza[][] tablero, int a,int b,int c,int d,int turn)
	{
		int e=0,x=0;
		boolean si=false;
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
				while(e>=0 && e<=7&& x>=0&&x<=0)
				{
					e++;
					x++;
					if(e==c&&x==b)
					{
						return true;
						
					}
					if(tablero[e][x].getactivo())
					{
						break;
					}
				}
				e=a;
				x=b;
				while(e>=0 && e<=7&& x>=0&&x<=0)
				{
					e++;
					x--;
					if(e==c&&x==b)
					{
						return true;
						
					}
					if(tablero[e][x].getactivo())
					{
						break;
					}
				}
				e=a;
				x=b;
				while(e>=0 && e<=7&& x>=0&&x<=0)
				{
					e--;
					x++;
					if(e==c&&x==b)
					{
						return true;
						
					}
					if(tablero[e][x].getactivo())
					{
						break;
					}
				}
				e=a;
				x=b;
				while(e>=0 && e<=7&& x>=0&&x<=0)
				{
					e--;
					x--;
					if(e==c&&x==b)
					{
						return true;
						
					}
					if(tablero[e][x].getactivo())
					{
						break;
					}
				}
				return false;
					
					
				}
				
							
			}
		else
		{
			return false;
		}
			
			
		
		
	}
	
}
