
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ángel
 */
public class Archivos implements Serializable {
        File archivo;
	String nombre;



	public void Cargar(String nombre){
		ArrayList<Ferrari> list_upload = new ArrayList<>();
		File bin_list;
		FileInputStream rd;
		ObjectInputStream obj = null;
		bin_list = new File(nombre);
		if (bin_list.exists()){
			try{
				rd = new FileInputStream(bin_list);
				obj = new ObjectInputStream(rd);
				list_upload = (ArrayList<Ferrari>) obj.readObject();
				System.out.println("\t*** Datos ***");
				for (Ferrari x : list_upload){
                                        System.out.println(x.numSerieMotor);
					System.out.println(x.marca);
					System.out.println(x.year);
                                        System.out.println(x.precio);
                                        System.out.println(x.pasajeros);
					System.out.println("-------------------------------------------------");
				}
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}
			finally{
				try{
					obj.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}	
		}else{
			System.out.println("El archivo no existe");
		}
	}
}
