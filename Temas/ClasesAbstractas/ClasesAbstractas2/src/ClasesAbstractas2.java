/* 75-chica-Una empresa de ropa a mayoreo ,ofrece ciertos descuentos a sus
clientes.Los clasifica en tres grupos.Cada grupo fue clasificado dependendiendo
la antiguedad que llevan comprando a la empresa.Mayor antiguedad,mayores beneficios

Grupo A: 10 % por cada $ 10,000 en compras
Grupo B: 5 % por cada $ 10,000 en compras
Grupo C: 2% por cada $ 10,000 en compras

*/


public class ClasesAbstractas2 {

    public static void main(String[] args) {
    
        ClienteA ca = new ClienteA ("Ivan Moreno","0001",10000);
        System.out.println(ca.toString());
        ClienteB cb = new ClienteB ("Oliver Wickenden","0002",9000);
        System.out.println(cb.toString());
        ClienteC cc = new ClienteC ("Andew Riordan","0003",12000);
        System.out.println(cc.toString());
    }
    
}
