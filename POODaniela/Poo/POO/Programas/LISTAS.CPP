//universidad del pedregal
//angel lopez estrada
#include <stdio.h>
#include <conio.h>
#include <alloc.h>


struct NODO
 {
   int dato;
   struct NODO* siguiente;

 } ;

struct NODO * inicio;

void  main ()
  {


  }


//-----------------------Mis Funciones Listas Ligadas------------------------

struct NODO* CrearNodo(void)
  {
    struct NODO*nuevo;
      nuevo=(struct NODO*) malloc (sizeof (struct NODO));//SIZE OF: TAMA¥O DE..
	 if (nuevo!=NULL)
	  nuevo->siguiente=NULL;
	 return nuevo;
  }
//---------------------------------------------------------------------------
int ListaVacia (struct NODO*inicio)
  {
     int bandera=0;
       if (inicio==NULL)
	  bandera=1;
       return bandera;

  }
//-------------------angel lopez--------------------------------------------------------
void InsertarNodoInicio (struct NODO*(*inicio),struct NODO*nuevo)
  {
	if (ListaVacia(*inicio)==0)
	 *inicio=nuevo;
      else
	 nuevo->siguiente=*inicio;
	 *inicio=nuevo;
  }
//---------------------------------------------------------------------------
void InsertarNodoFinal (struct NODO*(*inicio),struct NODO*nuevo)
 {  if (ListaVacia(*inicio)==0)
       *inicio=nuevo;
    else
       InsertarNodoFinal (&(*inicio)->siguiente,nuevo);
 }
//---------------------------------------------------------------------------
struct NODO* EliminarNodoInicio (struct NODO*(*inicio))
 {
   struct NODO*aux;
     if (ListaVacia(*inicio)==0)

	 aux=NULL;
     else
       {
	aux=*inicio;
	*inicio=(*inicio)->siguiente;
	aux->siguiente=NULL;
       }
    return aux;
 }
//--------------------angel lopez-------------------------------------------------------
struct NODO* EliminarUltimoNodo (struct NODO*(*inicio))
 {
   struct NODO*aux;
     if (ListaVacia(*inicio)==0)
	   return NULL;
      else
	   if  ((*inicio)->siguiente==NULL)
	       {
		 aux=*inicio;
		 *inicio=NULL;
		 return aux;
	       }
	    else
		 return EliminarUltimoNodo (&(*inicio)->siguiente);
 }
//---------------------------------------------------------------------------
void InsertarNodoAscendente (struct NODO*(*inicio),struct NODO*nuevo)
 {
    if (ListaVacia(*inicio)==0)
      *inicio=nuevo;
    else
       if  (nuevo->dato<(*inicio)->dato)
	  {
	    nuevo->siguiente=*inicio;
	    *inicio=nuevo;
	  }
	else
	   InsertarNodoAscendente(&(*inicio)->siguiente,nuevo);
 }
//---------------------------------------------------------------------------
void EliminarNodoEspecifico (struct NODO*(*inicio), int dato)
 {
    struct NODO*actual;
    struct NODO*anterior;
     actual=*inicio;
     anterior=NULL;
	 while (dato!=actual->dato && actual!=NULL)
	   {
	     anterior=actual;
	     actual=actual->siguiente;
	   }
		if (actual!=NULL)
		 anterior->siguiente=actual->siguiente;
		 actual->siguiente=NULL;
 }
//---------------------------------------------------------------------------