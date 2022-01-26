/*LOPEZ ESTRADA ANGEL*/
//universidad del pedregal 
//musica
#include <stdio.h>
#include <dos.h>
#include <conio.h>
#include <process.h>

int Menu (void);

void  main (void)
{  /*bAtZ mArU*/
  int i,sw=0,x;
    clrscr ();
     x=Menu();
      for (;;)
	 {
	    if (x==4)
	      break;
		switch (x)
		   {
		      case 1:
			 for (i=0;i<2;i++)
				{
				   sound (440);
				     delay (1000);
				     nosound ();
				   sound (466.16);
				     delay (500);
				     nosound ();
				   sound (523.25);
				     delay (500);
				     nosound ();
				   sound (0);
				     delay (10);
				     nosound ();
				   sound (523.25);
				     delay (500);
				     nosound ();
				   sound (466.16);
				     delay (500);
				     nosound ();
				   sound (440);
				     delay (500);
				     nosound ();
				   sound (392.00);
				     delay (500);
				     nosound ();
				   sound (349.23);
				     delay (500);
				     nosound ();
				   sound (0);
				     delay (10);
				     nosound ();
				   sound (349.23);
				     delay (500);
				     nosound ();
				   sound (392.00);
				     delay (500);
				     nosound ();
				   sound (440);
				     delay (500);
				     nosound ();
					if (sw==1)
					     {
						sound (392.00);
						  delay (750);
						  nosound ();
						sound (349.23);
						  delay (250);
						  nosound ();
						sound (0);
						  delay (10);
						  nosound ();
						sound (349.23);
						  delay (1000);
						  nosound ();
						sound (392.00);
						  delay (1000);
						  nosound ();
						sound (440);
						  delay (500);
						  nosound ();
						sound (349.23);
						  delay (500);
						  nosound ();
						sound (392.00);
						  delay (500);
						  nosound ();
						sound (440);
						  delay (250);
						  nosound ();
						sound (466.16);
						  delay (250);
						  nosound ();
						sound (440);
						  delay (500);
						  nosound ();
						sound (349.23);
						  delay (500);
						  nosound ();
						sound (392.00);
						  delay (500);
						  nosound ();
						sound (440);
						  delay (250);
						  nosound ();
						sound (466.16);
						  delay (250);
						  nosound ();
						sound (440);
						  delay (500);
						  nosound ();
						sound (392.00);
						  delay (500);
						  nosound ();
						sound (349.23);
						  delay (500);
						  nosound ();
						sound (392.00);
						  delay (500);
						  nosound ();
						sound (261.63);
						  delay (2000);
						  nosound ();
						break;
					     }
				   sound (0);
				     delay (10);
				     nosound ();
				   sound (440);
				     delay (750);
				     nosound ();
				   sound (392.00);
				     delay (250);
				     nosound ();
				   sound (0);
				     delay (10);
				     nosound ();
				   sound (392.00);
				     delay (1000);
				     nosound ();
				      sw=1;
			       }
		       break;

		      case 2:
			  for (i=0;i<2;i++)
			     {
				sound (261.63);
				  delay (500);
				  nosound ();
				sound (293.65);
				  delay (500);
				  nosound ();
				sound (329.63);
				  delay (500);
				  nosound ();
				sound (261.63);
				  delay (500);
				  nosound ();
			     }
			  for (i=0;i<2;i++)
			     {
				sound (329.63);
				  delay (500);
				  nosound ();
				sound (349.23);
				  delay (500);
				  nosound ();
				sound (392.00);
				  delay (1000);
				  nosound ();
			     }
			sound (0);
			  delay (10);
			  nosound();
			   for (i=0;i<2;i++)
			     {
				sound (392.00);
				  delay (250);
				  nosound ();
				sound (440);
				  delay (250);
				  nosound ();
				sound (392.00);
				  delay (250);
				  nosound ();
				sound (349.23);
				  delay (250);
				  nosound ();
				sound (329.63);
				  delay (500);
				  nosound ();
				sound (261.63);
				  delay (500);
				  nosound ();

			     }
			   for (i=0;i<2;i++)
			     {
				sound (293.65);
				  delay (500);
				  nosound ();
				sound (196.00);
				  delay (500);
				  nosound ();
				sound (261.63);
				  delay (1000);
				  nosound ();
			     }

		       break;
		      case 3:
			 for (i=0;i<2;i++)
			     {
			       sound (261.63);
				 delay (750);
				 nosound ();
			       sound (293.65);
				 delay (250);
				 nosound ();
			       sound (261.63);
				 delay (500);
				 nosound ();
			       sound (220.00);
				  delay (1000);
				  nosound ();
			     }
			sound (392.00);
			  delay (1000);
			  nosound ();
			sound (0);
			  delay (10);
			  nosound();
			sound (392.00);
			  delay (500);
			  nosound ();
			sound (329.63);
			  delay (1000);
			  nosound ();
			sound (0);
			  delay (10);
			  nosound();
			sound (329.63);
			  delay (500);
			  nosound ();
			sound (349.23);
			  delay (1000);
			  nosound ();
			sound (0);
			  delay (10);
			  nosound();
			sound (349.23);
			  delay (500);
			  nosound ();
			sound (261.63);
			  delay (2000);
			  nosound ();
			sound (293.65);
			  delay (750);
			  nosound ();
			sound (293.65);
			  delay (250);
			  nosound ();
			sound (293.65);
			  delay (500);
			  nosound ();

		       break;
		   }
	    x=Menu();
	 }
}
 int Menu (void)
    {  /*bAtZ mArU*/
      int x;
      clrscr();
     printf ("\t\tUNIVERSIDAD DEL PEDREGAL\n");
     printf ("\t\t **LOPEZ ESTRADA ANGEL**\n");
     printf ("\t\t   Tercer Semestre\n\n");
      do
	{
	  printf ("\tMENU\n\n\n");
	  printf ("1)Himno a la alegria...\n\n");
	  printf ("2)Martinillo...\n\n");
	  printf ("3)Noche de paz...\n\n");
	  printf ("4)Salir del programa\n\n\n");
	  printf ("\t\tEscribe el numero de la opcion que desees:\n");
	  scanf ("%i",&x);

	} while (x<1||x>4);
      return x;
    }



