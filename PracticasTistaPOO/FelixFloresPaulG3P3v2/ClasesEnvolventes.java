
public class ClasesEnvolventes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Integer entero1 = new Integer(43);
        System.out.println("1.- "+entero1);
        Float flotante1 = new Float(24.32);
        System.out.println("2.- "+flotante1);
        Integer entero2 = new Integer("1234");
        System.out.println("3.- "+entero2);
        Float flotante2 = new Float("12.664");
        System.out.println("4.- "+flotante2);
        
        Integer envolvente = new Integer(83);
        System.out.println("5.- "+envolvente);
        byte b = envolvente.byteValue();
        System.out.println("6.- "+b);
        short s = envolvente.shortValue();
        System.out.println("7.- "+s);
        double d =envolvente.doubleValue();
        System.out.println("8.- "+d);
        Float envolvente2 = new Float("10.32");
        System.out.println("9.- "+envolvente2);
        short v= envolvente2.shortValue();
        System.out.println("10.- y 11.- "+v);
        
        int otro = Integer.parseInt("10");
        System.out.println("12.- "+otro);
        double d3=Double.parseDouble("50.25"); // este tenia error debe ser un string pero en duble y no separado por (,)
        System.out.println("13.- "+d3);
        Integer wrap = Integer.valueOf("1100");
        System.out.println("14.- "+wrap);
        Double wrap2 = Double.valueOf("3.1416");
        System.out.println("15.- "+wrap2);
    }
    
}
