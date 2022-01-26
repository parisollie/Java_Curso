/*LOPEZ ESTRADA ANGEL HUMBERTO*/
//NUMEROS PRIMOS
//UNIVERSIDAD DEL PEDREGAL
#include <stdio.h>
#include <conio.h>

void main ()
{
  int i,j,fl=0;
  clrscr();
  printf ("**NUMEROS PRIMOS HASTA EL 100** \n\n\n");

  printf("1 - 2 - 3 ");

  for (i=4;i<101;i++)
   {
	for (j=2;j<i;j++)
	  {

	     if (i%j==0)
		 fl=1;
	  }

     if (fl==0)
       printf("- %i",i);
     else
       fl=0;

   }

getche ();
}