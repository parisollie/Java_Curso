#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct elemento
{
  char palabra[100];
  struct elemento *ant;
  struct elemento *sig;
};

struct lista
{
  struct elemento *inicio;
  struct elemento *fin;
};

struct elemento  *crear_elemento(char *linea)
{
  struct elemento *q;
  if((q= (struct elemento *) malloc(sizeof(struct elemento))) == NULL)
  {
    printf("Error: no hay suficiente memoria\n");
    exit(-1);
  }
  q->sig = q->ant = NULL;
  strcpy(q->palabra, *linea);
  return(q);
}

void ordenar(struct lista l)
{
  char *temp;
  struct elemento *actual, *fin= l.fin;
  for(actual= l.inicio; actual != fin; actual=actual->sig)
    {
      if ( strcmp(actual->palabra, actual->sig->palabra)> 0)
      {
        temp = actual-> palabra;
        actual->palabra = actual->sig->palabra;
        actual-> sig->palabra=temp;
      }
    }
    fin=fin->ant;
}


void imprimir( struct lista l)
{
  struct elemento *q= l.inicio;
  while( q != NULL)
  {
    puts(q-> palabra);
    q = q->sig;
  }
}

main()
{
  FILE *f
  struct lista l;
  char linea[100];
  if ((f= fopen("Palbras.txt","r"))==NULL)
  {
    printf("No se puede abrir el archivo\n");
    exit(1);
  }
  l.inicio = l.fin = NULL;
  if (fgets(linea, 100, f) != NULL)
    l.inicio = l.fin = crear_elemento(linea);
  while (fgets(linea,100,f) !=NULL)
  {
    l.fin->sig = crear_elemento(linea);
    l.fin->sig->ant = l.fin;
    l.fin = l.fin->sig;
  }
  ordenar(lista);
  imprimir(lista);
  fclose(f);
}
  
    
    

