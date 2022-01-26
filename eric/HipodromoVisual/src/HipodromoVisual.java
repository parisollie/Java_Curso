///////////////////////////////////////////////////
//    Java Class by Luis Ernesto Rubio Torres    //
///////////////////////////////////////////////////

//Hipodromo Visual
/*
Eric Felix Flores
*/

import java.awt.Graphics;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;


public class HipodromoVisual extends BaseAppGUI{
	
	private class Horse implements Runnable{
	        //Aqui tenemos los atributos
  		private Racecourse 	theRacecourse;
		private Image  		winnerImage;
  		private Image		horseImageOne;
  		private Image		horseImageTwo;
                private Image		horseImageFor;
  		private String 		name;
  		private int 		progress;
  		private int 		track;
  		private int 		thePrize;
                
                //Creamos el método constructor
  		public Horse(String name, Racecourse theRacecourse, int track, 
                        Image horseImageOne, Image horseImageTwo, Image 
                                winnerImage,Image horseImageFor ){
  			//Inicializamos los atributos
                        this.name 	        = name;
  			this.theRacecourse 	= theRacecourse;
  			this.track 	        = track;
  			this.thePrize 		= 0;
  			this.horseImageOne 	= horseImageOne;
  			this.horseImageTwo 	= horseImageTwo;
                        this.horseImageFor 	= horseImageFor;
  			this.winnerImage	= winnerImage;
  		}

       

                
                
        
                public void runTheRace() {
                    
			boolean flagImage = true;
			Image horseImage;
                //Cuando inicia la carrera y vemos que debe cumplir para ser el ganador.        
    		while (true) {
    			if(flagImage){
    				horseImage = horseImageOne;
     			}else{
    				horseImage = horseImageTwo;
    			}if(flagImage){
    				horseImage = horseImageFor;
     			}
    			
    			flagImage = !flagImage;
                        //Mostramos  en consola los datos de nuestros lugares.
    			theRacecourse.setXY(progress,track, name + " -> " + progress, horseImage);    			
      			System.out.println("Horse " + name + " progress -> " + progress);
      			
      			try{Thread.sleep( Math.round(Math.random()*100) );
				}catch(InterruptedException e){
				}
			/*Aqui nos dice que para ganar la carrera ,este debe tener 
                        el numero 725 ,para que cupoe en alguno de los tres primeros
                        lugares, del mismo modo nos enseña a los ganadores en pantalla.
                        
                        */	      			
      			if ( progress++ == 725) {
      				thePrize = theRacecourse.getPrize();
      				theRacecourse.setXY(progress,track, name + ""
                                        + "  -> " + thePrize + " place ", winnerImage);
      				System.out.println("Horse " + name + "  -> " 
                                        + thePrize + " place ");
					break;
      			}
      	            }
  		}
 		//El método run que trabaja para nuestra carrera 
 		public void run(){
 			this.runTheRace();
 		}
	}
	
	private class Prize{
		private int prize = 0;
		public synchronized int getPrize(){
			return ++prize;
		}
	}
	
	private class Track extends FlowPanel{
		private int 	xProgress;
		private int 	yTrack;	
		private String 	horseName;	
		private Image  horseImage;

		public void paint(Graphics painter){
			painter.setColor(Color.blue);
			// painter.fillOval(xProgress, yTrack, 10, 10);
			this.drawText(painter, horseName);
			painter.drawImage(horseImage,
					xProgress, 
					yTrack, 
					50,
					50,
					this
			);					

		}
		
		public void setXY(int progress, int track, String name, Image horseImage){
			this.xProgress 	 = progress;
			this.yTrack 	 = track/track*30;
			this.horseName	 = name;
			this.horseImage  = horseImage;
		}
		//Aqui esta el nombre del texto que tendra en nuestra imagen
		public void drawText(Graphics painter, String text){
			Font font = new Font("Serif", Font.ITALIC, 20);    		
   			painter.setFont(font);
    		painter.drawString(text, 5, 20);
    	}

	}

	private class Racecourse extends GridPanel{
		
		private Track[] tracks;
		private Prize 	aPrize = new Prize();
		
		public Racecourse(int numTracks){
			super(numTracks,0);	
			tracks = new Track[numTracks];
			for(int k = 0; k < numTracks; k++){
				this.add(tracks[k] = new Track());
			}
					
		}
		
		public void setXY(int progress, int track, String horseName, Image horseImage){
			tracks[track-1].setXY(progress, track, horseName, horseImage);
   			tracks[track-1].repaint();
		}
		public int getPrize(){
			return this.aPrize.getPrize();			
		}
	}

	Racecourse 	theRacecourse;
	Horse 		horse1;
	Horse 		horse2;
	Horse 		horse3;
	Horse 		horse4;
	
    public void createComponents(){
		super.createComponents();
		
		class MyComponent extends Component{}
		
		Image 		horseImageOne;
		Image 		horseImageTwo;
		Image 		horseImageFor;
                Image 		winnerImage;
		MyComponent myComponent;
		
		myComponent = new MyComponent();
                
                //Agregamos las imagenes de nuestros gatos de nuestra carpeta
		horseImageOne 	= myComponent.getToolkit().getImage("C:/Use"
                        + "rs/Henry/Desktop/er/HipodromoVisual/build/classes/cat1.gif");
		horseImageTwo 	= myComponent.getToolkit().getImage("C:/Use"
                        + "rs/Henry/Desktop/er/HipodromoVisual/build/classes/cat2.gif");
		winnerImage 	= myComponent.getToolkit().getImage("C:/Use"
                        + "rs/Henry/Desktop/er/HipodromoVisual/build/classes/cat3.gif");
                
                horseImageFor 	= myComponent.getToolkit().getImage("C:/Use+"
                        + "rs/Henry/Desktop/er/HipodromoVisual/build/classes/cat4.gif");
		
                theRacecourse 	= new Racecourse(4);  //the tracks in the racecourse
                //El nombre de nuestros corredores
		horse1 			= new Horse("Rayo", 	theRacecourse, 
                        1, horseImageOne, horseImageTwo, winnerImage,horseImageFor);
		horse2 			= new Horse("Fifi", 	theRacecourse, 
                        2, horseImageOne, horseImageTwo, winnerImage,horseImageFor);
		horse3 			= new Horse("Arabela", 	theRacecourse,
                        3, horseImageOne, horseImageTwo, winnerImage,horseImageFor);
		horse4 			= new Horse("FruFru", 	theRacecourse,
                        4, horseImageOne, horseImageTwo, winnerImage,horseImageFor);
	}

	public void distributeComponents(){
		super.distributeComponents();

		frameGUI.addCenter(theRacecourse);
	}
       //La ventana que aparece al ejecutarse el programa.
	public void startApplication(){
		super.startApplication();

		frameGUI.setTitle("The Race !!!");
		frameGUI.setSize(800,300); //GUI size
		frameGUI.setResizable(false);
		frameGUI.setVisible(true);

		(new Thread(horse1)).start();
		(new Thread(horse2)).start();
		(new Thread(horse3)).start();
		(new Thread(horse4)).start();
	}
        //Nuestro menu que llamará a nuestra ventana.
	public static void main(String [] args){ 
		HipodromoVisual theAppObject = new HipodromoVisual();
		theAppObject.startApplication();			
	}
	
	 
}


class BaseAppGUI{
        //Configuramos nuestra interfaz
	protected FrameGUI frameGUI;
	
	protected void createComponents(){
		frameGUI = new FrameGUI("Basic Application Graphic User Interface");
		frameGUI.addWindowListener(new WindowAdapter() {
       			public void windowClosing(WindowEvent e) {              
        	  		System.exit(0);
       			}
		}); 
	}
	protected void distributeComponents(){
		frameGUI.setSize(500,250);    
    		frameGUI.setResizable(true);
	}
	protected void startApplication(){
		frameGUI.setVisible(true);
	}
	public BaseAppGUI(){						
		createComponents();
		distributeComponents();
	}

}

class GridPanel extends Panel{
	
	public GridPanel(int rows, int columns){						
		super();
		this.setLayout(new GridLayout(rows, columns));
	}	

}

class FlowPanel extends Panel{
  
	public FlowPanel(){						
		super();	
	}

}

class ImagePanel extends Panel {
  public  Image image;
  public int   imageX;
  public int   imageY;
  public int   imageLenght;
  public int   imageWidth;
  public String imageFile;

  public ImagePanel() {
       	imageX = 0;
       	imageY = 0;
  }

  public void setImage(String imageFile, int imageWidth, int imageLenght){
       image = this.getToolkit().getImage(imageFile); 
       this.imageLenght = imageLenght;
       this.imageWidth = imageWidth;
       this.imageFile = imageFile;	
  }

  public void paint (Graphics g){
      g.drawImage(image, imageX, imageY, imageWidth, imageLenght, this);  
  }

}

class FrameGUI extends Frame{
  
	public FrameGUI(){						
		super();	
	}
	public FrameGUI(String title){						
		super(title);
	}
	public void addNorth(Component component){
		this.add(component, BorderLayout.NORTH);
	}
	public void addSouth(Component component){
		this.add(component, BorderLayout.SOUTH);
	}
	public void addEast(Component component){
		this.add(component, BorderLayout.EAST);
	}
	public void addWest(Component component){
		this.add(component, BorderLayout.WEST);
	}
	public void addCenter(Component component){
		this.add(component, BorderLayout.CENTER);
	}

}
