 /*
//Reverse right angled triangle
class pattern
{
	
	public static void main(String...args)
	{
	   for(int i=1; i<=5; i++)//this loop is related to rows
           {
	      for(int j=5; j>=i; j--)//this loop is related to columns
             {
	       System.out.print("*");
	     }
		System.out.println();
            }
	}
}*/

/*
Topic:rectangle and square 
class pattern
{
	
	public static void main(String...args)
	{
	   for(int i=1; i<=5; i++)
           {
	      for(int j=1; j<=5; j++)
             {
	       System.out.print("* ");//("* ")
	     }
		System.out.println();
            }
	}
}*/

/*
topic: spacing of pattern
class pattern
{
	
	public static void main(String...args)
	{
	   for(int i=1; i<=5; i++)
           {
	     for(int k=1; k<=5; k++)
             {
	       System.out.print("  ");
	     }
	     for(int j=1; j<=5; j++)
             {
	       System.out.print("*");
	     }
	     
		System.out.println();
            }
	}
}*/

//topic: spacing a right angled triangle
/*class pattern
{
	
	public static void main(String...args)
	{
	   for(int i=1; i<=5; i++)
           {
	     for(int k=5; k>=i; k--)
             {
	       System.out.print(" ");
	     }
	     for(int j=1; j<=i; j++)
             {
	       System.out.print("*");
	     }
	     
		System.out.println();
            }
	}
}*/
//Topic: traingle spaced rectangle/square
//parallelogram
/*class pattern
{
	
	public static void main(String...args)
	{
	     for(int i=1; i<=5; i++)
             { 

	     for(int k=1; k<=i; k++)
             {System.out.print(" "); 
	     
             }
	     for(int j=1; j<=5; j++)
             {
	       System.out.print("* ");//("* ")
	     }
		System.out.println();
            }
	}
}*/
//Topic: flipped parallelogram wrt above code
/*class pattern
{
	
	public static void main(String...args)
	{
	     for(int i=1; i<=5; i++)
             { 

	     for(int k=5; k>=i; k--)
             {System.out.print(" "); 
	     
             }
	     for(int j=1; j<=5; j++)
             {
	       System.out.print("*");
	     }
		System.out.println();
            }
	}
}*/

//Topic: isosceles triangle
/*class pattern
{
	
	public static void main(String...args)
	{
	     for(int i=1; i<=5; i++)
             { 

	     for(int k=5; k>=i; k--)
             {
	      System.out.print(" "); 
	     
             }
	     
		for(int j=1; j<2*i; j++)
             {
	       System.out.print("*");
	       
	     }
		System.out.println();
             }
	}
}*/

//Topic: reversed isosceles triangle
/*class pattern
{
	
	public static void main(String...args)
	{
	     for(int i=1; i<=5; i++)
             { 

	     for(int k=1; k<=i; k++)
             {
	      System.out.print(" "); 
	     
             }
	     
		for(int j=9; j>=(2*i-1); j--)
             {
	       System.out.print("*");
	       
	     }
		System.out.println();
             }
	}
}*/

//Brain twister pattern problems

//Topic: hollow spaced rectangle/square.
/*class pattern
{
	
	public static void main(String...args)
	{
	     for(int i=1; i<=5; i++)
             { 

	     for(int k=1; k<=1; k++)
             {
	      System.out.print("   "); 
	     
             }
	     
		for(int j=1; j<=5; j++)
             {
		if((j==(2||3||4)) && (i==2||i==3||i==4))
		{
	          System.out.print("  ");
		}
		else 
		{
		  System.out.print("* ");
		}
	     }
		System.out.println();
            }
	}
}*/
//Note: computer is machine and it do not understand human tendancy.

//Topic: Hollow isosceles triangle
/*class pattern
{
	
	public static void main(String...args)
	{
	     for(int i=1; i<=5; i++)
             { 

	     for(int k=5; k>=i; k--)
             {
	      System.out.print(" "); 
	     
             }
	     
		for(int j=1; j<=(2*i-1); j++)
             {
		if((j==1 || j==2*i-1) || (i==1||i==5))
		{
	          System.out.print("*");
		}
		else 
		{
		  System.out.print(" ");
		}
	     }
		System.out.println();
            }
	}
}*/

//Topic: reversed hollow isosceles triangle
/*class pattern
{
	
	public static void main(String...args)
	{
	     for(int i=1; i<=5; i++)
             { 

	     for(int k=1; k<=i; k++)
             {
	      System.out.print(" "); 
	     
             }
	     
		for(int j=9; j>=(2*i-1); j--)
             {
		if((j!=9 && j!=2*i-1) && (i!=1 && i!=5))
		{
	          System.out.print(" ");
		}
		else 
		{
		  System.out.print("*");
		}
	     }
		System.out.println();
            }
	}
}*/

//Topic : Hut
/*class pattern
{
	
	public static void main(String...args)
	{
	     for(int i=1; i<=5; i++)
             { 

	     for(int k=5; k>=i; k--)
             {
	      System.out.print(" "); 
	     
             }
	     
		for(int j=1; j<2*i; j++)
             {
	       System.out.print("*");
	       
              }    
	
		System.out.println(); 
	
             }
	   for(int i=1; i<=5; i++)
           {
                      System.out.print(" ");
	     
	     for(int j=1; j<=9; j++)
             {
	       System.out.print("*");
	     }
	     
		System.out.println();
            }
     }
}*/

//Topic : Rhombus
/*class pattern{
	
	public static void main(String...args)
	{
	     for(int i=1; i<=5; i++)
             { 

	     for(int k=5; k>=i; k--)
             {
	      System.out.print(" "); 
	     
             }
	     
		for(int j=1; j<2*i; j++)
             {
	       System.out.print("*");
	       
              }    
	
		System.out.println(); 
              }
	
             
	
	for(int i=1; i<=4; i++)
             { 
	     System.out.print(" ");
	     for(int k=1; k<=i; k++)
             {
	      System.out.print(" "); 
	     
             }
	     
		for(int j=7; j>=(2*i-1); j--)
             {
	       System.out.print("*");
	       
	     }
		System.out.println();
             }
	
     }
}*/
//note : it is interesting code very much interesting
//Topic: Hollow rhombus.
/*class pattern{
	
	public static void main(String...args)
	{
	     for(int i=1; i<=5; i++)
             { 

	     for(int k=5; k>=i; k--)
             {
	      System.out.print(" "); 
	     
             }
	     
		for(int j=1; j<=(2*i-1); j++)
             {
		if((j==1 || j==2*i-1) && (i==1||i==5||i==2||i==3||i==4))
		{
	          System.out.print("*");
		}
		else 
		{
		  System.out.print(" ");
		}
	     }
		System.out.println();
            }    
	
		
              
	
             	      for(int i=1; i<=4; i++)
             { 

	     for(int k=1; k<=i; k++)
             {
	      System.out.print(" "); 
	     
             }
	     System.out.print(" "); 

		for(int j=7; j>=(2*i-1); j--)
             {
		if((j!=7 && j!=2*i-1) )
		{
	                    System.out.print(" ");
		}
		else 
		{
		  System.out.print("*");
		}
	     }
		System.out.println();
            }
	
     }
}*/
//Note: try to also problems by 1.)different logic 
//                                                 2.)by or , and , not equal to ,equal to tcas 
//it matters alot and their different combination.
//Topic: House
class pattern{
	
	public static void main(String...args)
	{
	     for(int i=1; i<=5; i++)
             { 

	     for(int k=5; k>=i; k--)
             {
	      System.out.print(" "); 
	     
             }
	     
		for(int j=1; j<2*i; j++)
             {
	       System.out.print("*");
	       
              }    
	
		System.out.println(); 
	}
            
	   for(int i=1; i<=5; i++)
           {
                      System.out.print(" ");
	     
	     for(int j=1; j<=9; j++)
             {
	     if(j==4||j==5||j==6)
                      {
	       System.out.print(" ");
	     }
	     else
	     {
	       System.out.print("*");
	     }
	}
	     
		System.out.println();
            }
     }
}
//NOTE:NO. OF LOOPS ARE RELATED TO DIMENSION OF FIGURES.........
//           COLUMNS ,ROWS,ETCS.