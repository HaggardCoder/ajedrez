public class ajedrez {
	public static void main(String[]args)
	{ 
		Scanner scan=new Scanner(System.in);
	
		int turno,turnos=0,posicion1,posicion2,posicion3,posicion4;
		String lugar,lugar2;
		pieza [][] tablero=new pieza[8][8];
		tablero[0][0]=new torre(0,true);
		tablero[0][1]=new caballo(0,true);
		tablero[0][2]=new alfil(0,true);
		tablero[0][3]=new reina(0,true);
		tablero[0][4]=new rey(0,true);
		tablero[0][5]=new alfil(0,true);
		tablero[0][6]=new caballo(0,true);
		tablero[0][7]=new torre(0,true);
		tablero[1][0]=new peon(0,true);
		tablero[1][1]=new peon(0,true);
		tablero[1][2]=new peon(0,true);
		tablero[1][3]=new peon(0,true);
		tablero[1][4]=new peon(0,true);
		tablero[1][5]=new peon(0,true);
		tablero[1][6]=new peon(0,true);
		tablero[1][7]=new peon(0,true);
		tablero[2][0]=new pieza(0,true);
		while(true)
		{turnos++;
			if(turnos%2==0)
			{
				turno=1;
			}
			else 
			{
				turno=0;
			}
			posicion1=scan.nextInt();
       		posicion1=posicion1-1;
			lugar=scan.next();
       		switch(lugar) {
       		case "a":
       			posicion2=0;
       			break;
       		case "b":
       			posicion2=1;
       			break;
       		case "c":
       			posicion2=2;
       			break;
       		case "d":
       			posicion2=3;
       			break;
       		case "e":
       			posicion2=4;
       			break;
       		case "f":
       			posicion2=5;
       			break;
       		case "g":
       			posicion2=6;
       			break;
       		case "h":
       			posicion2=7;
       			break;
       			default:
       				posicion2=-1;
       				break;
       		
       		}
       			posicion3=scan.nextInt();
           		posicion3=posicion3-1;
    			lugar2=scan.next();
           		switch(lugar2) {
           		case "a":
           			posicion4=0;
           			break;
           		case "b":
           			posicion4=1;
           			break;
           		case "c":
           			posicion4=2;
           			break;
           		case "d":
           			posicion4=3;
           			break;
           		case "e":
           			posicion4=4;
           			break;
           		case "f":
           			posicion4=5;
           			break;
           		case "g":
           			posicion4=6;
           			break;
           		case "h":
           			posicion4=7;
           			break;
           			default:
           				posicion4=-1;
           				break;
           		
           		}
           		if(posicion1>=0&&posicion1<=7&&posicion2>=0&&posicion2<=7&&posicion3>=0&&posicion3<=7&&posicion4>=0&&posicion4<=7)
           		{
           			if(pieza.movimiento(posicion1,posicion2,posicion3,posicion4))
           			{
           				tablero[posicion1][posicion2]=new pieza(2,false);
           			}
           		}
           		else
           		{
           			turnos--;
           			
           		}
           		
		}
		
	}
	
}
	
	
	
	





