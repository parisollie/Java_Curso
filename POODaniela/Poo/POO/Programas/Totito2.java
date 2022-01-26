import java.io.*;
import java.math.*;
import java.lang.*;


class Totito2
{
public static void main (String args[])throws Exception
  {
  BufferedReader tempo = new BufferedReader(new InputStreamReader (System.in));

  int cas = 0,sl,s,l,t,simb;
  char c1,c2,c3,c4,c5,c6,c7,c8,c9;
  int p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0;
  byte nt=0;

  System.out.println("\n\t Selecione modo de juego:\n");
  System.out.println("\t 1. Jugador vrs Jugador ");
  System.out.println("\t 2. Jugador vrs Pc ");
  System.out.print  ("\n\t Seleccion:");
  sl=Integer.parseInt(tempo.readLine());

  switch (sl)
   {
    case 1:


   // Dibujar Tablero 1.1
   System.out.println("\n\n\n\n\n\n\n\n\n");
   System.out.print  ("\n\t+----+----+----+");        System.out.print("\t Seleccione signo:\n");
   System.out.println("\t|  "+"  |"+"    |"+"    |");
   System.out.println("\t|"+"    |"+"    |"+"    |");
   System.out.print  ("\t|"+"    |"+"    |"+"    |"); System.out.print("\t Signo No.1 =  X \n");
   System.out.print  ("\t+----+----+----+");          System.out.print("\t Signo No.2 =  0 \n");
   System.out.println("\t|"+"    |"+"    |"+"    |");
   System.out.println("\t|"+"    |"+"    |"+"    |");
   System.out.println("\t|"+"    |"+"    |"+"    |");
   System.out.println("\t+----+----+----+");
   System.out.println("\t|"+"    |"+"    |"+"    |");
   System.out.println("\t|"+"    |"+"    |"+"    |");
   System.out.println("\t|"+"    |"+"    |"+"    |");
   System.out.println("\t+----+----+----+");
   System.out.print("\t\t\t\t Seleccion:");

   // Condicion del Simbolo

   simb=Integer.parseInt(tempo.readLine());
   // Rebijuga Tablero con el signo
  t=0;
  while (t == 0)
   {
      if (simb>0 & simb < 2)
      {
      c1='X';
      c2='0';
      t=1;
      System.out.println("\n\n\n\n\n\n\n\n\n");
      System.out.println("\n\t+----+----+----+");
      System.out.println("\t|  "+"  |"+"    |"+"    |");
      System.out.println("\t|"+"    |"+"    |"+"    |");
      System.out.print  ("\t|"+"    |"+"    |"+"    |"); System.out.print("\t Jugador No.1 = "+c1+" \n");
      System.out.print  ("\t+----+----+----+");          System.out.print("\t Jugador No.2 = "+c2+" \n");
      System.out.println("\t|"+"    |"+"    |"+"    |");
      System.out.println("\t|"+"    |"+"    |"+"    |");
      System.out.println("\t|"+"    |"+"    |"+"    |");
      System.out.println("\t+----+----+----+");
      System.out.println("\t|"+"    |"+"    |"+"    |");
      System.out.println("\t|"+"    |"+"    |"+"    |");
      System.out.println("\t|"+"    |"+"    |"+"    |");
      System.out.println("\t+----+----+----+");


      }

   else
         {
      if (simb >1 & simb < 3)
         {
          c1='0';
          c2='X';
          t=2;
          System.out.println("\n\n\n\n\n\n\n\n\n");
          System.out.println("\n\t+----+----+----+");
          System.out.println("\t|  "+"  |"+"    |"+"    |");
          System.out.println("\t|"+"    |"+"    |"+"    |");
          System.out.print  ("\t|"+"    |"+"    |"+"    |");System.out.print("\t Jugador No.1 = "+c1+"\n");
          System.out.print  ("\t+----+----+----+");         System.out.print("\t Jugador No.2 = "+c2+"\n");
          System.out.println("\t|"+"    |"+"    |"+"    |");
          System.out.println("\t|"+"    |"+"    |"+"    |");
          System.out.println("\t|"+"    |"+"    |"+"    |");
          System.out.println("\t+----+----+----+");
          System.out.println("\t|"+"    |"+"    |"+"    |");
          System.out.println("\t|"+"    |"+"    |"+"    |");
          System.out.println("\t|"+"    |"+"    |"+"    |");
          System.out.println("\t+----+----+----+");

          }
       else
          {
          System.out.println("\t Selecione un numero entre 1 & 2 ");
          System.out.print("\t Seleccion:");
          simb=Integer.parseInt(tempo.readLine());
          }

      }
    } // Fin while



    c1=' ';c2=' ';c3=' ';c4=' ';c5=' ';c6=' ';c7=' ';c8=' ';c9=' ';

 // Dibujar tablero
  do
     {
      t=1;
      if (nt>0)
     {
     // Saber Jugador de Turno
         if (nt%2==1)
            {
	    t=2;
            }
         else
            {
            t=1;
            }
     }
     System.out.println("\n\n\n\n\n\n\n\n\n");
     System.out.println("\n\t+----+----+----+");
     System.out.println("\t|"+"    |"+"    |"+"    |");
     System.out.println("\t|  "+c1+" |  "+c2+" |  "+c3+" |");
     System.out.println("\t|"+"    |"+"    |"+"    |");
     System.out.println("\t+----+----+----+");
     System.out.println("\t|"+"    |"+"    |"+"    |");
     System.out.println("\t|  "+c4+" |  "+c5+" |  "+c6+" |");
     System.out.println("\t|"+"    |"+"    |"+"    |");
     System.out.println("\t+----+----+----+");
     System.out.println("\t|"+"    |"+"    |"+"    |");
     System.out.println("\t|  "+c7+" |  "+c8+" |  "+c9+" |");
     System.out.println("\t|"+"    |"+"    |"+"    |");
     System.out.println("\t+----+----+----+");
     nt++;

// Reviciones Jugador Simbolo X

     //Diag No.1
     if (p1==1&p2==1&p3==1)
       {
         System.out.println("\tGano Jugador Signo X");
         nt=12;
         //break;
       }
     //Diag No.2
     if (p4==1&p5==1&p6==1)
       {
         System.out.println("\tGano Jugador Signo X");
         nt=12;
         //break;
       }
     //Diag No.3
     if (p7==1&p8==1&p9==1)
       {
         System.out.println("\tGano Jugador Signo X");
         nt=12;
         //break;
       }
     //Diag No.4
     if (p1==1&p5==1&p9==1)
       {
         System.out.println("\tGano Jugador Signo X");
         nt=12;
         //break;
       }
     //Diag No.5
     if (p3==1&p5==1&p7==1)
       {
         System.out.println("\tGano Jugador Signo X");
         nt=12;
         //break;
       }
     //Diag No.6
     if (p1==1&p4==1&p7==1)
       {
         System.out.println("\tGano Jugador Signo X");
         nt=12;
         //break;
       }
    //Diag No.7
     if (p2==1&p5==1&p8==1)
       {
         System.out.println("\tGano Jugador Signo X");
         nt=12;
         //break;
       }
    //Diag No.8
     if (p3==1&p6==1&p9==1)
       {
         System.out.println("\tGano Jugador Signo X");
         nt=12;
         //break;
       }
//Diagonales Jugador Signo O
          //Diag No.1
     if (p1==2&p2==2&p3==2)
       {
         System.out.println("\tGano Jugador Signo O");
         nt=12;
         //break;
       }
     //Diag No.2
     if (p4==2&p5==2&p6==2)
       {
         System.out.println("\tGano Jugador Signo O");
         nt=12;
         //break;
       }
     //Diag No.3
     if (p7==2&p8==2&p9==2)
       {
         System.out.println("\tGano Jugador Signo O");
         nt=12;
         //break;
       }
     //Diag No.4
     if (p1==2&p5==2&p9==2)
       {
         System.out.println("\tGano Jugador Signo O");
         nt=12;
         //break;
       }
     //Diag No.5
     if (p3==2&p5==2&p7==2)
       {
         System.out.println("\tGano Jugador Signo O");
         nt=12;
         //break;
       }
     //Diag No.6
     if (p1==2&p4==2&p7==2)
       {
         System.out.println("\tGano Jugador Signo O");
         nt=12;
         //break;
       }
    //Diag No.7
     if (p2==2&p5==2&p8==2)
       {
         System.out.println("\tGano Jugador Signo O");
         nt=12;
         //break;
       }
    //Diag No.8
     if (p3==2&p6==2&p9==2)
       {
         System.out.println("\tGano Jugador Signo O");
         nt=12;
         //break;
       }
    // Empate
     if ((p1+p2+p3+p4+p5+p6+p7+p8+p9)==13||(p1+p2+p3+p4+p5+p6+p7+p8+p9)==14)
       {
         System.out.println("\n\n\n\n\tEmpate Fin del Juego");
         nt=12;
         //break;
       }
    //Fin de Reviciones

     if (nt<10)
        {
          System.out.print("\tSelecionar Casilla"+ "\n\tJugador No."+t+":");
          cas=Integer.parseInt(tempo.readLine());
     if (simb==1)
     {
     simb=2;
     // Inicio switch
     switch (cas)
     {
       //CASE 2
       case 1:
       if (p1==0)
       {
       c1='X';
       p1=1;
       simb=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       Thread.sleep(500);
       nt--;
       simb=1;
       }
       break;

       //CASE 2
       case 2:
       if (p2==0)
       {
       c2='X';
       p2=1;
       simb=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //CASE 3
       case 3:
       if (p3==0)
       {
       c3='X';
       p3=1;
       simb=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //CASE 4
       case 4:
       if (p4==0)
       {
       c4='X';
       p4=1;
       simb=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //CASE 5
       case 5:
       if (p5==0)
       {
       c5='X';
       p5=1;
       simb=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //CASE 6
       case 6:
       if (p6==0)
       {
       c6='X';
       p6=1;
       simb=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //CASE 7
       case 7:
       if (p7==0)
       {
       c7='X';
       p7=1;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //CASE 8
       case 8:
       if (p8==0)
       {
       c8='X';
       p8=1;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //CASE 9
       case 9:
       if (p9==0)
       {
       c9='X';
       p9=1;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //Default
       default:
       System.out.println("\n\tTiro invalido"+"\n\tSeleccione una casilla entre 1 & 9\n");
       Thread.sleep(500);
       nt--;
       simb=1;
       break;
     //Switch
     }
     ///******

        }
     //Fin if


    else
    {
     simb=1;
         switch (cas)
     {
       //CASE 2
       case 1:
       if (p1==0)
       {
       c1='0';
       p1=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 2
       case 2:
       if (p2==0)
       {
       c2='0';
       p2=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 3
       case 3:
       if (p3==0)
       {
       c3='0';
       p3=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 4
       case 4:
       if (p4==0)
       {
       c4='0';
       p4=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 5
       case 5:
       if (p5==0)
       {
       c5='0';
       p5=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 6
       case 6:
       if (p6==0)
       {
       c6='0';
       p6=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 7
       case 7:
       if (p7==0)
       {
       c7='0';
       p7=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 8
       case 8:
       if (p8==0)
       {
       c8='0';
       p8=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 9
       case 9:
       if (p9==0)
       {
       c9='0';
       p9=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       Thread.sleep(500);
       simb=2;
       }
       break;

       //Default
       default:
       System.out.println("\n\tTiro invalido"+"\n\tSeleccione una casilla entre 1 & 9\n");
       Thread.sleep(500);
       nt--;
       simb=2;
       break;
     //Switch
     }
     ///******
     simb=1;
        }
     //Fin if


    }
   //Fin else


  //Fin dibujar tablero


  }
  while (nt<10);
  break;

  case 2:

  System.out.println("\n\n\n\n\n\n\n\n\n");
  System.out.println("\n\t+----+----+----+");
  System.out.println("\t|  "+"  |"+"    |"+"    |");
  System.out.println("\t|"+"    |"+"    |"+"    |");
  System.out.print  ("\t|"+"    |"+"    |"+"    |");System.out.print("\t Turno No.1 Jugador  \n");
  System.out.print  ("\t+----+----+----+");         System.out.print("\t Turno No.2 Pc  \n");
  System.out.println("\t|"+"    |"+"    |"+"    |");
  System.out.println("\t|"+"    |"+"    |"+"    |");
  System.out.print  ("\t|"+"    |"+"    |"+"    |");System.out.print("\t Jugador = X \n");
  System.out.print  ("\t+----+----+----+");         System.out.print("\t Pc = 0 \n");
  System.out.println("\t|"+"    |"+"    |"+"    |");
  System.out.println("\t|"+"    |"+"    |"+"    |");
  System.out.println("\t|"+"    |"+"    |"+"    |");
  System.out.println("\t+----+----+----+");
  Thread.sleep(2000);
  c1=' ';c2=' ';c3=' ';c4=' ';c5=' ';c6=' ';c7=' ';c8=' ';c9=' ';
  do
  {
     System.out.println("\n\n\n\n\n\n\n\n\n");
     System.out.println("\n\t+----+----+----+");
     System.out.println("\t|"+"    |"+"    |"+"    |");
     System.out.println("\t|  "+c1+" |  "+c2+" |  "+c3+" |");
     System.out.println("\t|"+"    |"+"    |"+"    |");
     System.out.println("\t+----+----+----+");
     System.out.println("\t|"+"    |"+"    |"+"    |");
     System.out.println("\t|  "+c4+" |  "+c5+" |  "+c6+" |");
     System.out.println("\t|"+"    |"+"    |"+"    |");
     System.out.println("\t+----+----+----+");
     System.out.println("\t|"+"    |"+"    |"+"    |");
     System.out.println("\t|  "+c7+" |  "+c8+" |  "+c9+" |");
     System.out.println("\t|"+"    |"+"    |"+"    |");
     System.out.println("\t+----+----+----+");
     nt++;
   // Reviciones Jugador Simbolo X

     //Diag No.1
     if (p1==1&p2==1&p3==1)
       {
         System.out.println("\tGano Jugador ");
         nt=12;

       }
     //Diag No.2
     if (p4==1&p5==1&p6==1)
       {
         System.out.println("\tGano Jugador ");
         nt=12;

       }
     //Diag No.3
     if (p7==1&p8==1&p9==1)
       {
         System.out.println("\tGano Jugador ");
         nt=12;

       }
     //Diag No.4
     if (p1==1&p5==1&p9==1)
       {
         System.out.println("\tGano Jugador ");
         nt=12;

       }
     //Diag No.5
     if (p3==1&p5==1&p7==1)
       {
         System.out.println("\tGano Jugador ");
         nt=12;

       }
     //Diag No.6
     if (p1==1&p4==1&p7==1)
       {
         System.out.println("\tGano Jugador ");
         nt=12;

       }
    //Diag No.7
     if (p2==1&p5==1&p8==1)
       {
         System.out.println("\tGano Jugador ");
         nt=12;

       }
    //Diag No.8
     if (p3==1&p6==1&p9==1)
       {
         System.out.println("\tGano Jugador ");
         nt=12;

       }

    //Diagonales Jugador Signo O
          //Diag No.1
     if (p1==2&p2==2&p3==2)
       {
         System.out.println("\tGano Pc");
         nt=12;

       }
     //Diag No.2
     if (p4==2&p5==2&p6==2)
       {
         System.out.println("\tGano Pc");
         nt=12;

       }
     //Diag No.3
     if (p7==2&p8==2&p9==2)
       {
         System.out.println("\tGano Pc");
         nt=12;

       }
     //Diag No.4
     if (p1==2&p5==2&p9==2)
       {
         System.out.println("\tGano Pc");
         nt=12;

       }
     //Diag No.5
     if (p3==2&p5==2&p7==2)
       {
         System.out.println("\tGano Pc");
         nt=12;

       }
     //Diag No.6
     if (p1==2&p4==2&p7==2)
       {
         System.out.println("\tGano Pc");
         nt=12;

       }
    //Diag No.7
     if (p2==2&p5==2&p8==2)
       {
         System.out.println("\tGano Pc");
         nt=12;

       }
    //Diag No.8
     if (p3==2&p6==2&p9==2)
       {
         System.out.println("\tGano Pc");
         nt=12;

       }
    // Empate
     if ((p1+p2+p3+p4+p5+p6+p7+p8+p9)==13||(p1+p2+p3+p4+p5+p6+p7+p8+p9)==14)
       {
         System.out.println("\n\n\n\n\tEmpate Fin del Juego");
         nt=12;

       }

     //Numero aleatorio
     int rnd;
     double rd;
     rd=Math.round(Math.random()*9);
     rnd=(int)rd;
     if (nt<10)
     {
     if (nt%2==1)
            {
        System.out.print("\tSelecionar Casilla"+ "\n\tJugador :");
   	cas=Integer.parseInt(tempo.readLine());
       switch (cas)
     {
       //CASE 2
       case 1:
       if (p1==0)
       {
       c1='X';
       p1=1;
       simb=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       Thread.sleep(500);
       nt--;
       simb=1;
       }
       break;

       //CASE 2
       case 2:
       if (p2==0)
       {
       c2='X';
       p2=1;
       simb=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //CASE 3
       case 3:
       if (p3==0)
       {
       c3='X';
       p3=1;
       simb=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //CASE 4
       case 4:
       if (p4==0)
       {
       c4='X';
       p4=1;
       simb=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //CASE 5
       case 5:
       if (p5==0)
       {
       c5='X';
       p5=1;
       simb=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //CASE 6
       case 6:
       if (p6==0)
       {
       c6='X';
       p6=1;
       simb=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //CASE 7
       case 7:
       if (p7==0)
       {
       c7='X';
       p7=1;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //CASE 8
       case 8:
       if (p8==0)
       {
       c8='X';
       p8=1;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //CASE 9
       case 9:
       if (p9==0)
       {
       c9='X';
       p9=1;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=1;
       Thread.sleep(500);
       }
       break;

       //Default
       default:
       System.out.println("\n\tTiro invalido"+"\n\tSeleccione una casilla entre 1 & 9\n");
       Thread.sleep(500);
       nt--;
       simb=1;
       break;
     //Switch
     }


            }
     else
            {
    //Mejor Jugada Posible
            /*rnd=cas +4;
            if (cas<4)
            {
            rnd = cas+1;
            }
            if ((cas>4)&&(cas<8))
            {
            rnd = cas--;
            }  */
            System.out.print("\tComputadora seleciona casilla No."+rnd+"\n");
            System.out.println("\tEspere un Momento Por Favor\n");
            Thread.sleep(2000);

         switch (rnd)
     {
       //CASE 2
       case 1:
       if (p1==0)
       {
       c1='0';
       p1=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 2
       case 2:
       if (p2==0)
       {
       c2='0';
       p2=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 3
       case 3:
       if (p3==0)
       {
       c3='0';
       p3=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 4
       case 4:
       if (p4==0)
       {
       c4='0';
       p4=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 5
       case 5:
       if (p5==0)
       {
       c5='0';
       p5=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 6
       case 6:
       if (p6==0)
       {
       c6='0';
       p6=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 7
       case 7:
       if (p7==0)
       {
       c7='0';
       p7=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 8
       case 8:
       if (p8==0)
       {
       c8='0';
       p8=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       simb=2;
       Thread.sleep(500);
       }
       break;

       //CASE 9
       case 9:
       if (p9==0)
       {
       c9='0';
       p9=2;
       }
       else
       {
       System.out.println("\n\tTiro invalido seleccione una casilla vacia\n");
       nt--;
       Thread.sleep(500);
       simb=2;
       }
       break;

       //Default
       default:
       System.out.println("\n\tTiro invalido"+"\n\tSeleccione una casilla entre 1 & 9\n");
       Thread.sleep(500);
       nt--;
       simb=2;
       break;
     //Switch
     }
            }
    }

  }
  while (nt<10);
  break;

  default:
  System.out.println("\t Por favor selecione una opcion valida");
  ;
  }
  System.in.read();
  }

}



