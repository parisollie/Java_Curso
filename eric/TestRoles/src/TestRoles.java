import learning.roles.Estado;
import learning.roles.Rol;
import learning.roles.Persona;
import learning.roles.Acta;
import learning.basicGUI.FastTester;
	
public class TestRoles extends FastTester{

	public void testAction(){

		Estado objEstado;
		objEstado = new Estado();
		objEstado.setNumero(10);
		objEstado.setNombre("Veracruz");

		Persona objPersona = new Persona();

		objPersona.setNumero(1);
		objPersona.setNombre("Eva");
		objPersona.setEdad(18);

		objPersona.setEstado(objEstado);

		objPersona.setActa( new Acta() );
		objPersona.getActa().setNumero(333);
		objPersona.getActa().setLibro(555);
		objPersona.getActa().setFolio(777);

		objPersona.setRoles(new Rol[3]);
		
		for (int i = 0; i < 3; i++){
			objPersona.setRol(new Rol(), i);
			objPersona.getRol(i).setNumero(i + 1);
			if(i == 0){
				objPersona.getRol(i).setNombre("Profesionista");
			}else if(i == 1){
				objPersona.getRol(i).setNombre("Estudiante");
			}else if(i == 2){
				objPersona.getRol(i).setNombre("Conyuge");
			}
		}

		String reporte = "----------------------------------------" + "\n";
		reporte = reporte + "<<< Reporte de la Prueba con Objetos >>>" + "\n";

		reporte = reporte + "Me llamo "  + objPersona.getNombre() 
				  +  ", tengo "  + objPersona.getEdad()   
				  +  " años de edad" + "\n";
                //Modificacion
		reporte = reporte + "Naci en el estado# "  + objPersona.getEstado().getNumero() 
				  +  " ,Llamado: "  + objPersona.getEstado().getNombre()   
				  +   "\n";
                
                reporte = reporte + "Los datos de mi Acta de Nacimiento son:" + "\n" 
				  + "\t#Libro: " + objPersona.getActa().getLibro() + "\n" 
				  + "\t#Folio: " + objPersona.getActa().getFolio() + "\n";

		reporte = reporte + "Las actividades que desempeño son:" + "\n";
		for (int i = 0; i <= 2; ++i){
			reporte = reporte + "\t" + objPersona.getRol(i).getNombre() + "\n";
		}
		reporte = reporte + "----------------------------------------" + "\n";

		textAreaGUI.append(reporte);
		System.out.print(reporte);

	}

	public static void main(String [] args){
		TestRoles tester = new TestRoles();
		tester.startApplication();
   	}
}