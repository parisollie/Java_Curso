#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>

struct nodo{
 struct nodo *izq;
 struct nodo *der;
 char *palabra;
};

void leer(FILE *f, char *palabra);
void imprimir( struct nodo *palabras);
void insertar(struct nodo **Raiz,char palabra[]);
void ordenar(struct nodo *Raiz);
void memoria_error(void);

main()
{
  FILE *f;
  char palabra[100];
  struct nodo *Raiz=NULL;
  f=fopen("Palabras.txt","r");
  if( f== NULL)
  {
   printf("Error al abrir el archivo\n");
   exit(1);
  }
  while (leer( f, palabra));
    Raiz = insertar( Raiz, palabra);
  imprimir(Raiz);
  system("PAUSE");
}
  

void memoria_error(void)
{
  perror("error: no hay memoria suficiente.");
  exit(1);
}

void ordenar(struct nodo *Raiz)
{
 if(!Raiz) return;
  ordenar(Raiz->izq);
 if(Raiz->palabra)
  printf("%s-> ",Raiz->palabra);
 ordenar(Raiz->der);
}

void leer(FILE *f, char *palabra)
{
 char c;
 *palabra='\0';
 while((c=fgetc(f)) != EOF )
   *palabra++ = tolower(c);
 *palabra='\0';
 return;
}


void insertar(struct nodo **Raiz,char palabra)
{
  int t;
  if(*Raiz==NULL)
  {
	 *Raiz=(struct nodo *)malloc(sizeof(struct nodo));
   if(*Raiz!=NULL)
   {
      (*Raiz)->palabra=palabra;
      (*Raiz)->izq=NULL;
      (*Raiz)->der=NULL;
   }
  }
  t= strncmp( palabra, Raiz-> palabra,7);
  if (t < 0)
     Raiz->izq = insertar(Raiz->izq, palabra);
  else
     Raiz->der = insertar(Raiz->der, palabra);
}

void imprimir(struct nodo *palabras)
{
  if(palabras != NULL)
  {
    imprimir(palabras->izq);
    printf("%s", palabras-> palabra);
    imprimir(palabras->der);
  }
}  
