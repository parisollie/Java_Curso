
import java.util.List;
import java.util.Scanner;

public class Army {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String datos,dato;
        int valor,vl,vl2;
        int id,id2;
        
        System.out.println("\n\t.:Creando la division:.\n\t");
        System.out.print("Ingresa el nombre de la divicion: ");
        datos=leer.next();
        System.out.println("------------------------------------------------------");
        System.out.print("Ingresa la zona(Estado):");
        dato=leer.next();
        
        Division div=new Division(datos,dato);
        
        System.out.println("\n\t.:Vas a crear 3 batallones:.\n\t");
        
        System.out.println("Bartallon No.1");
        System.out.print("Introduce su clave correspondiente: ");
        vl=leer.nextInt();
        
        System.out.print("Ingresa la categoria: ");
        datos=leer.next();
        System.out.print("Ingresa la ubicacion: ");
        dato=leer.next();
        Batallon bat1=new Batallon(vl,datos,dato);
        div.Batallones.add(bat1);
        
        System.out.println("\nBartallon No.2");
        System.out.print("Introduce su clave correspondiente: ");
        vl=leer.nextInt();
        
        System.out.print("Ingresa la categoria: ");
        datos=leer.next();
        System.out.print("Ingresa la ubicacion: ");
        dato=leer.next();
        Batallon bat2=new Batallon(vl,datos,dato);
        div.Batallones.add(bat2);
        
        System.out.println("\nBartallon No.3");
        System.out.print("Introduce su clave correspondiente: ");
        vl=leer.nextInt();
        
        System.out.print("Ingresa la categoria: ");
        datos=leer.next();
        System.out.print("Ingresa la ubicacion: ");
        dato=leer.next();
        Batallon bat3=new Batallon(vl,datos,dato);
        div.Batallones.add(bat3);
        
        System.out.println("-------------------------------------------------------");
        
        System.out.println("\n\t.:Vas a crear 3 militares por cada batallon:.\n\t ");
        
        System.out.println("*******************************************************");
        System.out.println("\nPara el batallon No.1");
        System.out.print("Introduce la matricula para el militar 1°: ");
        vl = leer.nextInt();
        System.out.print("Introduce el rango: ");
        dato = leer.next();
        System.out.print("Introduce su nombre: ");
        datos = leer.next();
        Militar mil01 = new Militar(vl, dato, datos);
        bat1.militares.add(mil01);
        System.out.println("-------------------------------------------------------");
        
        System.out.print("Introduce la matricula para el militar 2°: ");
        vl = leer.nextInt();
        System.out.print("Introduce el rango: ");
        dato = leer.next();
        System.out.print("Introduce su nombre: ");
        datos = leer.next();
        Militar mil02 = new Militar(vl, dato, datos);
        bat1.militares.add(mil02);
        System.out.println("-------------------------------------------------------");
        System.out.print("Introduce la matricula para el militar 3: ");
        vl = leer.nextInt();
        System.out.print("Introduce el rango: ");
        dato = leer.next();
        System.out.print("Introduce su nombre: ");
        datos = leer.next();
        Militar mil03 = new Militar(vl, dato, datos);
        bat1.militares.add(mil03);
        System.out.println("*******************************************************");
        
        System.out.println("\nPara el batallon No.2");
        System.out.print("Introduce la matricula para el militar 1°: ");
        vl=leer.nextInt();
        System.out.print("Introduce el rango: ");
        dato=leer.next();
        System.out.print("Introduce su nombre: ");
        datos=leer.next();
        Militar mil21=new Militar(vl,dato,datos);
        bat1.militares.add(mil21);
        System.out.println("-------------------------------------------------------");
        
        System.out.print("Introduce la matricula para el militar 2°: ");
        vl=leer.nextInt();
        System.out.print("Introduce el rango: ");
        dato=leer.next();
        System.out.print("Introduce su nombre: ");
        datos=leer.next();
        Militar mil22=new Militar(vl,dato,datos);
        bat1.militares.add(mil22);
        System.out.println("-------------------------------------------------------");
        
        System.out.print("Introduce la matricula para el militar 3°: ");
        vl=leer.nextInt();
        System.out.print("Introduce el rango: ");
        dato=leer.next();
        System.out.print("Introduce su nombre: ");
        datos=leer.next();
        Militar mil23=new Militar(vl,dato,datos);
        bat1.militares.add(mil23);
        
        System.out.println("*******************************************************");
        System.out.println("\nPara el batallon No.3");
        System.out.print("Introduce la matricula para el militar 1° : ");
        vl=leer.nextInt();
        System.out.print("Introduce el rango: ");
        dato=leer.next();
        System.out.print("Introduce su nombre: ");
        datos=leer.next();
        Militar mil31=new Militar(vl,dato,datos);
        bat1.militares.add(mil31);
        System.out.println("-------------------------------------------------------");
        
        
        System.out.print("Introduce la matricula para el militar 2°: ");
        vl = leer.nextInt();
        System.out.print("Introduce el rango: ");
        dato = leer.next();
        System.out.print("Introduce su nombre: ");
        datos = leer.next();
        Militar mil32 = new Militar(vl, dato, datos);
        bat1.militares.add(mil32);
        System.out.println("-------------------------------------------------------");
        System.out.print("Introduce la matricula para el militar 3°: ");
        vl=leer.nextInt();
        System.out.print("Introduce el rango: ");
        dato=leer.next();
        System.out.print("Introduce su nombre: ");
        datos=leer.next();
        Militar mil33=new Militar(vl,dato,datos);
        bat1.militares.add(mil33);
        System.out.println("*******************************************************");
    }

    public static void imprimirMilitar( List<Militar> listPrint){
        for(Militar var: listPrint){
            System.out.print(var.GradoMil);
            System.out.print(var.Matricula);
            System.out.print(var.Nombre);
        }
    }
    
    public static void imprimirBatallon(List<Batallon> listPrint){
        for(Batallon var : listPrint){
            System.out.println(var.categ);
            System.out.println(var.location);
            System.out.println(var.num);    
        }
    }

    }
    

