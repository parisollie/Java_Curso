
import javax.swing.JOptionPane;


public class Practica7 {

    
    public static void main(String[] args) {
        
        Television tv1 = new Television  ("Samsung","0001",10000);
        System.out.println(tv1.toString());
        
        Laptop l1 = new Laptop  ("Mac","00017",40000);
        System.out.println(l1.toString());
        
        
        PC pc1 = new PC  ("Toshiba","00013",7000);
        System.out.println(pc1.toString());
       
        SmartPhone sm = new SmartPhone  (30000,"Iphone","00011");
        System.out.println(sm.toString());
     
        Tablet ta = new Tablet("Ipad","00091",15000);
        System.out.println(ta.toString());
    
    }
    
}
