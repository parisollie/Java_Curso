#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#include<string.h>


typedef struct nodo
{
  char *palabra;
  struct nodo *izq;
  struct nodo *der;
}n;

n *crear( char *palabra);
int leer (FILE  *f, char *palabra);
n *insertar(n *palabras, char *palabra);
void imprimir( n *palabras);

main()
{
char p[100];
FILE *f;
n *palabras = NULL;
f = fopen("Palabras.txt","r");
if (f== NULL)
 {
  printf("Error al abrir el archivo");
  exit(1);
 }
while (leer( f, p))
  palabras = insertar(palabras, p);
imprimir(palabras);
system("PAUSE");
}

n *crear( char *palabra)
{
  n *nd;
  nd=(n *)malloc(sizeof(n));
  if ((nd=(n *)malloc(sizeof(n)))==NULL)
  {
    perror("crear");
    exit(1);
  }
  strcpy(nd->palabra, palabra);
  nd->izq = nd->der = NULL;
  return nd;
}

int leer(FILE *f, char *palabra)
{
 int c;
 *palabra='\0';
 while((c=fgetc(f)) != EOF )
   *palabra++ = tolower(c);
 *palabra='\0';
 return 1;
}

n *insertar( n *palabras, char *palabra)
{
  int t;
  if (palabras==NULL)
    return( crear (palabra));
  t= strncmp( palabra, palabras-> palabra,7);
  if (t < 0)
     palabras->izq= insertar(palabras->izq, palabra);
  else
     palabras->der= insertar(palabras->der, palabra);
  return palabras;
}

void imprimir(n *palabras)
{
  if(palabras != NULL)
  {
    imprimir(palabras->izq);
    printf("%s", palabras-> palabra);
    imprimir(palabras->der);
  }
}  

    
                   
   
                      
    
    
  
