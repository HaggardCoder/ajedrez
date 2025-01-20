package chess;

public class rey extends pieza{
	boolean importante;

	public rey(boolean color) {
		super(color);
		importante=true;
		
	}
	public boolean getimportante()
	{
		return true;
	}
	public boolean movimiento(int a,int b,int c,int d,tablero tablero)
	{
		if(a==c-2&&(b==d-1||b==d+1)||a==c+2&&(b==d-1||b==d+1)||b==d+2&&(a==c-1||a==c+1)||b==d-2&&(a==c-1||a==c+1))
		{
			tablero.setpieza(tablero.getpieza(a, b), c, d);
			tablero.removepieza(a, b);
			return true;
		}
		
		return false;
	}
	public boolean amenaza(int a,int b,tablero tablero)
	{
		int c,d;
		if(pcolor)
		{
		 if(tablero.getpieza(a+2, b-1)==new caballo(false)||tablero.getpieza(a+2, b+1)==new caballo(false)||tablero.getpieza(a-2, b-1)==new caballo(false)||tablero.getpieza(a-2, b+1)==new caballo(false)||tablero.getpieza(a+1, b-2)==new caballo(false)||tablero.getpieza(a-1, b-2)==new caballo(false)||tablero.getpieza(a+1, b+2)==new caballo(false)||tablero.getpieza(a-1, b+2)==new caballo(false))
		 {
			
				return true;
		 }
		 for(c=a+1;c<=7;c++)
		 {
			 if(c==a+1)
			 {
				 if(tablero.getpieza(c, b)==new rey(false))
				 	{
					 	return true;			 
					}
			 }
			 if(tablero.getpieza(c, b)==new reina(false))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(c, b)==new torre(false))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(c, b)!=null) 
			 {
				 break;				 
			 }
		 }
		 for(c=a-1;c>=0;c--)
		 {
			 if(c==a-1)
			 {
				 if(tablero.getpieza(c, b)==new rey(false))
				 	{
					 	return true;			 
					}
			 }
			 if(tablero.getpieza(c, b)==new reina(false))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(c, b)==new torre(false))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(c, b)!=null) 
			 {
				 break;				 
			 }
		 }
		
		 for(c=b+1;c<=7;c++)
		 {
			 if(c==b+1)
			 {
				 if(tablero.getpieza(c, b)==new rey(false))
				 	{
					 	return true;			 
					}
			 }
			 if(tablero.getpieza(a, c)==new reina(false))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(a, c)==new torre(false))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(a, c)!=null) 
			 {
				 break;				 
			 }
		 }
	
	
	 for(c=b-1;c>=0;c--)
	 {
		 if(c==b-1)
		 {
			 if(tablero.getpieza(c, b)==new peon(false))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(c, b)==new rey(false))
			 	{
				 	return true;			 
				}
		 }
		 if(tablero.getpieza(a, c)==new reina(false))
		 	{
			 	return true;			 
			}
		 if(tablero.getpieza(a, c)==new torre(false))
		 	{
			 	return true;			 
			}
		 if(tablero.getpieza(a, c)!=null) 
		 {
			 break;				 
		 }
	 }
	 for(c=a+1;c<=7;c++)
	 {
		 d=b;
		 d++;
		 if(d>7)
		 {
			 break;
		 }
		 if(c==a+1)
		 {
			
			 if(tablero.getpieza(c, d)==new rey(false))
			 	{
				 	return true;			 
				}
		 }
		 if(tablero.getpieza(c, d)==new reina(false))
		 	{
			 	return true;			 
			}
		 if(tablero.getpieza(c, d)==new alfil(false))
		 	{
			 	return true;			 
			}
		 if(tablero.getpieza(c, d)!=null) 
		 {
			 break;				 
		 }
		 
	 }
	 for(c=a+1;c<=7;c++)
	 {
		 d=b;
		 d--;
		 if(d<0)
		 {
			 break;
		 }
		 if(c==a+1)
		 {
			 
			 if(tablero.getpieza(c, d)==new rey(false))
			 	{
				 	return true;			 
				}
			 
		 }
		 if(tablero.getpieza(c, d)==new reina(false))
		 	{
			 	return true;			 
			}
		 if(tablero.getpieza(c, d)==new alfil(false))
		 	{
			 	return true;			 
			}
		 if(tablero.getpieza(c, d)!=null) 
		 {
			 break;				 
		 }
		 
	 }
	 for(c=a-1;c>=0;c--)
	 {
		 d=b;
		 d--;
		 if(d<0)
		 {
			 break;
		 }
		 if(c==a-1)
		 {
			 if(tablero.getpieza(c, d)==new peon(false))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(c, d)==new rey(false))
			 	{
				 	return true;			 
				}
			 
		 }
		 if(tablero.getpieza(c, d)==new reina(false))
		 	{
			 	return true;			 
			}
		 if(tablero.getpieza(c, d)==new alfil(false))
		 	{
			 	return true;			 
			}
		 if(tablero.getpieza(c, d)!=null) 
		 {
			 break;				 
		 }
		 
	 }
	 for(c=a-1;c>=0;c--)
	 {
		 d=b;
		 d++;
		 if(d>7)
		 {
			 break;
		 }
		 if(c==a-1)
		 {
			 
			 if(tablero.getpieza(c, d)==new rey(false))
			 	{
				 	return true;			 
				}
			 
		 }
		 if(tablero.getpieza(c, d)==new reina(false))
		 	{
			 	return true;			 
			}
		 if(tablero.getpieza(c, d)==new alfil(false))
		 	{
			 	return true;			 
			}
		 if(tablero.getpieza(c, d)!=null) 
		 {
			 break;				 
		 }
		 
	 }
		
		  return false;
		
	}
		else
		{
			 if(tablero.getpieza(a+2, b-1)==new caballo(true)||tablero.getpieza(a+2, b+1)==new caballo(true)||tablero.getpieza(a-2, b-1)==new caballo(true)||tablero.getpieza(a-2, b+1)==new caballo(true)||tablero.getpieza(a+1, b-2)==new caballo(true)||tablero.getpieza(a-1, b-2)==new caballo(true)||tablero.getpieza(a+1, b+2)==new caballo(true)||tablero.getpieza(a-1, b+2)==new caballo(true))
			 {
				
					return true;
			 }
			 for(c=a+1;c<=7;c++)
			 {
				 if(c==a+1)
				 {
					 if(tablero.getpieza(c, b)==new rey(true))
					 	{
						 	return true;			 
						}
				 }
				 if(tablero.getpieza(c, b)==new reina(true))
				 	{
					 	return true;			 
					}
				 if(tablero.getpieza(c, b)==new torre(true))
				 	{
					 	return true;			 
					}
				 if(tablero.getpieza(c, b)!=null) 
				 {
					 break;				 
				 }
			 }
			 for(c=a-1;c>=0;c--)
			 {
				 if(c==a-1)
				 {
					 if(tablero.getpieza(c, b)==new rey(true))
					 	{
						 	return true;			 
						}
				 }
				 if(tablero.getpieza(c, b)==new reina(true))
				 	{
					 	return true;			 
					}
				 if(tablero.getpieza(c, b)==new torre(true))
				 	{
					 	return true;			 
					}
				 if(tablero.getpieza(c, b)!=null) 
				 {
					 break;				 
				 }
			 }
			
			 for(c=b+1;c<=7;c++)
			 {
				 if(c==b+1)
				 {
					 if(tablero.getpieza(c, b)==new rey(true))
					 	{
						 	return true;			 
						}
				 }
				 if(tablero.getpieza(a, c)==new reina(true))
				 	{
					 	return true;			 
					}
				 if(tablero.getpieza(a, c)==new torre(true))
				 	{
					 	return true;			 
					}
				 if(tablero.getpieza(a, c)!=null) 
				 {
					 break;				 
				 }
			 }
			 
		
		
		 for(c=b-1;c>=0;c--)
		 {
			 if(c==b-1)
			 {
				 if(tablero.getpieza(c, b)==new rey(true))
				 	{
					 	return true;			 
					}
			 }
			 if(tablero.getpieza(a, c)==new reina(true))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(a, c)==new torre(true))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(a, c)!=null) 
			 {
				 break;				 
			 }
		 }
		 for(c=a+1;c<=7;c++)
		 {
			 d=b;
			 d++;
			 if(d>7)
			 {
				 break;
			 }
			 if(c==a+1)
			 {
				 if(tablero.getpieza(c, d)==new peon(true))
				 	{
					 	return true;			 
					}
				 if(tablero.getpieza(c, d)==new rey(true))
				 	{
					 	return true;			 
					}
			 }
			 if(tablero.getpieza(c, d)==new reina(true))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(c, d)==new alfil(true))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(c, d)!=null) 
			 {
				 break;				 
			 }
			 
		 }
		 for(c=a+1;c<=7;c++)
		 {
			 d=b;
			 d--;
			 if(d<0)
			 {
				 break;
			 }
			 if(c==a+1)
			 {
				 if(tablero.getpieza(c, d)==new peon(true))
				 	{
					 	return true;			 
					}
				 if(tablero.getpieza(c, d)==new rey(true))
				 	{
					 	return true;			 
					}
				 
			 }
			 if(tablero.getpieza(c, d)==new reina(true))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(c, d)==new alfil(true))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(c, d)!=null) 
			 {
				 break;				 
			 }
			 
		 }
		 for(c=a-1;c>=0;c--)
		 {
			 d=b;
			 d--;
			 if(d<0)
			 {
				 break;
			 }
			 if(c==a-1)
			 {
				 
				 if(tablero.getpieza(c, d)==new rey(true))
				 	{
					 	return true;			 
					}
				 
			 }
			 if(tablero.getpieza(c, d)==new reina(true))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(c, d)==new alfil(true))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(c, d)!=null) 
			 {
				  break;				 
			 }
			 
		 }
		 for(c=a;c>=0;c--)
		 {
			 d=b;
			 d++;
			 if(d>7)
			 {
				 break;
			 }
			 if(c==a-1)
			 {
				 
				 if(tablero.getpieza(c, d)==new rey(true))
				 	{
					 	return true;			 
					}
				 
			 }
			 if(tablero.getpieza(c, d)==new reina(true))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(c, d)==new alfil(true))
			 	{
				 	return true;			 
				}
			 if(tablero.getpieza(c, d)!=null) 
			 {
				break;				 
			 }
			 
		 }
			
			  return false;
		}
		

}}
