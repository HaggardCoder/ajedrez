package chess;

public class tablero {
	pieza [][] tablero=new pieza[8][8];
	public tablero()
	{
		tablero[0][0]=new torre(false);
		tablero[0][7]=new torre(false);
		tablero[0][1]=new caballo(false);
		tablero[0][6]=new torre(false);
		tablero[0][5]=new alfil(false);
		tablero[0][2]=new alfil(false);
		tablero[0][5]=new alfil(false);
		tablero[0][3]=new reina(false);
		tablero[0][4]=new rey(false);
		tablero[7][0]=new torre(true);
		tablero[7][7]=new torre(true);
		tablero[7][1]=new caballo(true);
		tablero[7][6]=new torre(true);
		tablero[7][5]=new alfil(true);
		tablero[7][2]=new alfil(true);
		tablero[7][5]=new alfil(true);
		tablero[7][3]=new reina(true);
		tablero[7][4]=new rey(true);
		for(int x=0;x<=7;x++)
		{
			tablero[1][x]=new peon(false);
			tablero[7][x]=new peon(true);
		}
		
		
		
	}
	public void setpieza(pieza pieza,int a,int b)
	{
		tablero[a][b]=pieza;
	}
	public pieza getpieza(int a,int b)
	{
		
		return tablero[a][b];
	}
	public void removepieza(int a,int b)
	{
		tablero[a][b]=null;
	}
	public pieza encuetrarey(boolean color)
	{
		for(int x=0;x<=7;x++)
		{
			
			for(int y=0;y<=7;y++)
			{
				if(tablero[x][y].getimportante()&&tablero[x][y].getcolor()==color)
				{
					
						return tablero[x][y];
					
				}
			}
		}
		return null;
	}
	public void quitarennpasant(boolean turno)
	{
		for(int x=0;x<=7;x++)
		{
			
			for(int y=0;y<=7;y++)
			{
				if(tablero[x][y].getennpasant()&&tablero[x][y].getcolor()==turno)
				{
					tablero[x][y].setennpasant(false);
				}
			}
		}
		
	}

}
