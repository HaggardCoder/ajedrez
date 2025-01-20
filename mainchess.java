import java.util.Scanner;

public class mainchess {
	public static void main(String[]args)
	{
		pieza retorno;
		Scanner scan=new Scanner(System.in);
		int turns=0,posicion1,posicion2,destinacion1,destinacion2;
		String letra1;
		boolean turn;
		tablero tablero=new tablero();
		while(true)
		{
			turns++;
			if(turns%2==0)
			{
				turn=true;
			}
			else
			{
				turn=false;
			}
			System.out.println("escoge la pieza que vayas a mover");
			System.out.println("introduce el numero de la pieza");
			posicion1=scan.nextInt();
			posicion1-=1;
			System.out.println("introduce la letra de la pieza");
			letra1=scan.nextLine();
			posicion2=mainchess.cambio(letra1);
			System.out.println("introduce el numero de el lugar a mover");
			destinacion1=scan.nextInt();
			destinacion1-=1;
			System.out.println("introduce la letra de el lugar a mover");
			letra1=scan.nextLine();
			destinacion2=mainchess.cambio(letra1);
			if(posicion1>=0&&posicion1<=7&&posicion2>=0&&posicion2<=7&&destinacion1<=7&&destinacion1>=0&&destinacion1<=7&&destinacion1>=0)
			{
				if(tablero.getpieza(posicion1, posicion2).getcolor()==turn&&tablero.getpieza(posicion1, posicion2).getcolor()==tablero.getpieza(destinacion1, destinacion1).getcolor())
				{
					retorno=tablero.getpieza(destinacion1, destinacion2);
					if(tablero.getpieza(posicion1, posicion2).movimiento(posicion1, posicion2, destinacion1, destinacion2, tablero))
					{
						if(tablero.encuetrarey(turn).amenaza(turn))
						{
							tablero.setpieza(tablero.getpieza(destinacion1, destinacion2), posicion1, posicion2);
							tablero.setpieza(retorno, destinacion1, destinacion2);
							System.out.println("el rey esta amenazado");
							
							
						}
					}
					
					
					
				}
			}
			else
			{
				
			}

			
			
			
			
			
		}
		
		
	}
	public static int cambio(String a)
	{
		switch(a)
		{
		
		case"a":
			return 0;
		case"b":
			return 1;
		case"c":
			return 2;
		case"d":
			return 3;
		case"e":
			return 4;
		case"f":
			return 5;
		case"g":
			return 6;
		case"h":
			return 7;
		default:
			return -1;
			
		
		}
	}

}
