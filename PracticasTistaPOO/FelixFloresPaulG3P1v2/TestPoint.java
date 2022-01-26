class TestPoint {
    
    void crearPunto(){
        System.out.println("Creando un punto...");
        Point p = new Point();
        p.x=4;
        p.y=10;
        imprimirPunto(p);
    }

    void inicializarPunto(int a, int b){
    	Point p = new Point();
    	p.x=a;
    	p.y=b;
    	imprimirPunto(p);
    }

    void imprimirPunto(Point p){
    	System.out.println("Punto p("+ p.x + "," + p.y + ")");
    }
    
}
