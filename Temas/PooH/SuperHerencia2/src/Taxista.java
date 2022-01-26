
public class Taxista extends Persona{
    
    private String numTaxista;

    public Taxista(String no, String ape, int ed,String numTax) {
        super(no, ape, ed); // Invocamos al constructor de la clase persona y le pasamos el nombre de Aban
        numTaxista= numTax;
        System.out.println("Se ejecuta el constructor de Taxista");
        System.out.println("El numero de taxista es: "+numTaxista);
    }

    public String getNumTaxista() {
        return numTaxista;
    }

    public void setNumTaxista(String numTaxista) {
        this.numTaxista = numTaxista;
    }
    
    
    
    
}
