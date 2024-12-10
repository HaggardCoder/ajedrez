import java.util.Scanner;

public class peon extends pieza

{
	public peon(int color,boolean activo)
	{
		super(color,activo);
		if(color==0)
		{
			String figura="p";
		}
		else
		{
			String figura="P";
		}
	}
	public static boolean movimiento(pieza[][] tablero,int a,int b,int c,int d,int turn)
	{Scanner scan=new Scanner(System.in);
		int e=0,x=0,color;
		if(tablero[a][b].getcolor()==turn)
		{
			if(tablero[a][b].getcolor()==tablero[c][d].getcolor())
			{
				return false;					
			}
			else
			{
				color=tablero[a][b].getcolor();
				if(color==0)
				{
					if(a+1==c&&b==d)
					{
						if(tablero[c][d].getactivo())
						{
							return false;
							
						}
						else
						{
							if(c==7)
							{
								
								int nuevapieza=scan.nextInt();
								switch(nuevapieza)
								{
								case 1:
									tablero[c][d]=new caballo(color,true);
								    return true;
								case 2:
									tablero[c][d]=new alfil(color,true);
									return true;
									
								case 3:
									tablero[c][d]=new torre(color,true);
									return true;
									
								case 4:
									tablero[c][d]=new reina(color,true);
									return true;
									
									
								}
							}
							tablero[c][d]=tablero[a][b];
							return true;
						}
						
					}
					if(a+1==c&&(b-1==d||b+1==d))
					{
						if(c==7)
						{
							
							int nuevapieza=scan.nextInt();
							switch(nuevapieza)
							{
							case 1:
								tablero[c][d]=new caballo(color,true);
							    return true;
							case 2:
								tablero[c][d]=new alfil(color,true);
								return true;
								
							case 3:
								tablero[c][d]=new torre(color,true);
								return true;
								
							case 4:
								tablero[c][d]=new reina(color,true);
								return true;
								
								
							}
						}
						tablero[c][d]=tablero[a][b];
						return true;
					}
					if(a==1&&c==a+2)
					{
						if(tablero[c][d].getactivo()==false&&tablero[c-1][d].getactivo()==false)
						{
							
							tablero[c][d]=tablero[a][b];
							return true;
						}
						
					}
				}
				
			}
			
		}
		else
		{
			return false;				
		}
		return false;
		
		
		
	}
	
}
	

