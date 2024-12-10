public class reina extends pieza
{
public reina(int color,boolean activo)
	{
		super(color,activo);
		if(color==0)
		{
			String figura="q";
		}
		else
		{
			String figura="Q";
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
				
				 if(b==d && a!=c)
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
			
			
		
		
	}}
