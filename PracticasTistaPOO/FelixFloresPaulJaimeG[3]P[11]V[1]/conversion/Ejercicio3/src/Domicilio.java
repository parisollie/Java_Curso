
public class Domicilio {

    private int numero;
    private String Colonia;
    private String calle;

    Domicilio(String calle, int numero, String Colonia) {
        this.calle = calle;
        this.numero = numero;
        this.Colonia = Colonia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "numero=" + numero + ", Colonia=" + Colonia + ", calle=" + calle + '}';
    }

}
