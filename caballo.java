package chess;

public class caballo extends pieza {

	public caballo(boolean color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	public boolean movimiento(int a,int b,int c,int d,tablero tablero)
	{
	 if((a==c-1||a==c+1)&&b==d+2)
	 {
		 tablero.setpieza(tablero.getpieza(a, b), c, d);
			tablero.removepieza(a, b);
			return true;
	 }
	 if((a==c-1||a==c+1)&&b==d-2)
	 {
		 tablero.setpieza(tablero.getpieza(a, b), c, d);
			tablero.removepieza(a, b);
			return true;
	 }
	 if((b==d+1||b==d-1)&&a==c+2)
	 {
		 tablero.setpieza(tablero.getpieza(a, b), c, d);
			tablero.removepieza(a, b);
			return true;
	 }
	 if((b==d+1||b==d-1)&&a==c-2)
	 {
		 tablero.setpieza(tablero.getpieza(a, b), c, d);
			tablero.removepieza(a, b);
			return true;
	 }
	  return false;
	}

}
