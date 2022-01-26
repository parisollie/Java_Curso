package micalendario;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Invitado
 */
public class MiLabelCalendario extends JLabel {

    public LineBorder lb = null;

    public MiLabelCalendario( String nombre ) {

            super( nombre );
            setHorizontalAlignment( JLabel.CENTER);
    }

    public void seleccionar(){

        seleccionar( new LineBorder( java.awt.Color.BLUE) );
        
    }

    public void seleccionar( LineBorder l ){

        lb=l;
        setBorder( lb );
    }


}
