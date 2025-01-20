package chess;

public class torre extends pieza {

	public torre(boolean color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	public boolean movimiento(int a,int b,int c,int d,tablero tablero)
	{
		int e;
		if(a==c&&b<d)
		{
			for(e=b+1;e<=d;e++)
			{
				if(e==d)
				{
					tablero.setpieza(tablero.getpieza(a, b), c, d);
					tablero.removepieza(a, b);
					return true;
				}
				else if(tablero.getpieza(a, e)!=null)
				{
					return false;
				}
				else
				{
					continue;
				}
			}
			
		}

		if(a==c&&b>d)
		{
			for(e=b-1;e>=d;e--)
			{
				if(e==d)
				{
					tablero.setpieza(tablero.getpieza(a, b), c, d);
					tablero.removepieza(a, b);
					return true;
				}
				else if(tablero.getpieza(a, e)!=null)
				{
					return false;
				}
				else
				{
					continue;
				}
			}
		}

		if(a<c&&b==d)
		{
			for(e=a+1;e<=c;e++)
			{
				if(e==c)
				{
					tablero.setpieza(tablero.getpieza(a, b), c, d);
					tablero.removepieza(a, b);
					return true;
				}
				else if(tablero.getpieza(e, b)!=null)
				{
					return false;
				}
				else
				{
					continue;
				}
			}
		}

		if(a>c&&b==d)
		{
			for(e=a-1;e>=c;e--)
			{
				if(e==c)
				{
					tablero.setpieza(tablero.getpieza(a, b), c, d);
					tablero.removepieza(a, b);
					return true;
				}
				else if(tablero.getpieza(e, b)!=null)
				{
					return false;
				}
				else
				{
					continue;
				}
				
			}
		}
		return false;
	}

}

