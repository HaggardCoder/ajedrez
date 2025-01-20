package chess;

public class peon extends pieza{
	boolean ennpasant;
	boolean coronation;

	public peon(boolean color) {
		super(color);
		ennpasant=false;
		coronation=false;
		
		
	}
	public void setennpasant(boolean a)
	{
		ennpasant=a;
	}
	public boolean getennpasant()
	{
		return ennpasant;
	}
	public void setcoronation(boolean a)
	{
		coronation=a;
	}
	public boolean getcoronation()
	{
		return coronation;
	}
	public boolean movimiento(int a,int b,int c,int d,tablero tablero)
	{
		if(pcolor)
		{
			if(b==d&&a-2==c&&a==6)
			{
				if(tablero.getpieza(a-1, b)==null||tablero.getpieza(a-2, b)==null)
				{
					return false;
				}
				else
				{
					
					ennpasant=true;
					tablero.setpieza(tablero.getpieza(a, b), c, d);
					tablero.removepieza(a, b);
					return true;
				}
			}
			if((b-1==d||b+1==d)&&a-1==c)
			{
				if(tablero.getpieza(c, d)==null||tablero.getpieza(a, b-1).getennpasant()==false||tablero.getpieza(a, b+1).getennpasant()==false)
				{
					return false;
				}
				else
				{
					if(c==0)
					{
						coronation=true;
					}
					tablero.setpieza(tablero.getpieza(a, b), c, d);
					tablero.removepieza(a, b);
					return true;
				}
			}
			if(b==d&&a-1==c)
			{
				if(tablero.getpieza(a+1, b)==null)
				{
					return false;
				}
				else
				{					
					if(c==0)
					{
						coronation=true;
					}
					tablero.setpieza(tablero.getpieza(a, b), c, d);
					tablero.removepieza(a, b);
					return true;
				}
			}
			
		}
		else
		{
			if(b==d&&a+2==c)
			{
				if(tablero.getpieza(a+1, b)==null||tablero.getpieza(a+2, b)==null)
				{
					return false;
				}
				else
				{
					
					ennpasant=true;
					tablero.setpieza(tablero.getpieza(a, b), c, d);
					tablero.removepieza(a, b);
					return true;
				}
			}
			if((b-1==d||b+1==d)&&a+1==c)
			{
				if(tablero.getpieza(c, d)==null||tablero.getpieza(a, b-1).getennpasant()==false||tablero.getpieza(a, b+1).getennpasant()==false)
				{
					return false;
				}
				else
				{
					if(c==7)
					{
						coronation=true;
					}
					tablero.setpieza(tablero.getpieza(a, b), c, d);
					tablero.removepieza(a, b);
					return true;
				}
			}
			if(b==d&&a+1==c)
			{
				if(tablero.getpieza(a+1, b)==null)
				{
					return false;
				}
				else
				{					
					if(c==7)
					{
						coronation=true;
					}
					tablero.removepieza(a, b);
					return true;
				}
			}
		}
			
		return false;
		
	}
	
	public boolean movimientos(tablero tablero,int a,int b,boolean turn)
	{
		if(tablero.getpieza(a, b).getcolor())
		{
			if(tablero.getpieza(a-1, b)==null)
			{
				tablero.setpieza(tablero.getpieza(a, b), a-1, b);
				tablero.setpieza(null, a, b);
				if(tablero.encuetrarey(turn).amenaza(turn))
				{
					tablero.setpieza(tablero.getpieza(a-1, b), a, b);
					tablero.setpieza(null, a-1, b);
					
				}
				else
				{
					tablero.setpieza(tablero.getpieza(a-1, b), a, b);
					tablero.setpieza(null, a-1, b);
					return true;
				}
			}
			
	
		
		}
	
		
		if(tablero.getpieza(a-1, b)==null&&tablero.getpieza(a-2, b)==null&&a==6)
		{
			tablero.setpieza(tablero.getpieza(a, b), a-2, b);
			tablero.setpieza(null, a, b);
			if(tablero.encuetrarey(turn).amenaza(turn))
			{
				tablero.setpieza(tablero.getpieza(a-1, b), a, b);
				tablero.setpieza(null, a-2, b);
				
			}
			else
			{
				tablero.setpieza(tablero.getpieza(a-1, b), a, b);
				tablero.setpieza(null, a-2, b);
				return true;
			}
		}
		if(tablero)
		return false;
	}
}

	

