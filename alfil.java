package chess;

public class alfil extends pieza{

	public alfil(boolean color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	public boolean movimiento( int a,int b,int c,int d,tablero tablero)
	{
		int e,f=d;
		if(a>c&&b>d)
		for(e=a+1;e<=7;e++)
		{
			f++;
			if(f>=7)
				return false;
			if(c==e&&f==d)
			{
				tablero.setpieza(tablero.getpieza(a, b), c, d);
				tablero.removepieza(a, b);
				return true;
			}
			else if(tablero.getpieza(e, f)!=null)
			{
				return false;							
			}
		}
		
		if(a>c&&b<d)
		for(e=a+1;e<=7;e++)
		{
			f--;
			if(f<=0)
				return false;
			if(c==e&&f==d)
			{
				tablero.setpieza(tablero.getpieza(a, b), c, d);
				tablero.removepieza(a, b);
				return true;
			}
			else if(tablero.getpieza(e, f)!=null)
			{
				return false;							
			}
		}
		if(a<c&&b<d)
		for(e=a+1;e<=0;e--)
		{
			f--;
			if(f<=0)
				return false;
			if(c==e&&f==d)
			{
				tablero.setpieza(tablero.getpieza(a, b), c, d);
				tablero.removepieza(a, b);
				return true;
			}
			else if(tablero.getpieza(e, f)!=null)
			{
				return false;
												
			}
		}
		if(a<c&&b>d)
		for(e=a+1;e<=0;e--)
		{
			f++;
			if(f>=7)
				break;
			if(c==e&&f==d)
			{
				tablero.setpieza(tablero.getpieza(a, b), c, d);
				tablero.removepieza(a, b);
				return true;
			}
			else if(tablero.getpieza(e, f)!=null)
			{
				return false;
				
				
			}
		}
		return false;			
	}
			
			
		
		

}

