package com.welsungo.math.linearRegression;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import java.awt.Label;
import java.awt.TextField;
/*
 * Created on 11-mar-2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

/**
 * @author felipe
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class LinearRegressionApplet extends Applet {
	private boolean mHayComaX;
	private boolean mHayComaY;
	private boolean mNegativoX;
	private boolean mNegativoY;
	
	private LinearRegressionData mData;
	
	private Label labNumPuntos = null;
	private TextField txtNumPuntos = null;
	private Label labCoordX = null;
	private TextField txtCoordX = null;
	private Label labCoordY = null;
	private TextField txtCoordY = null;
	private Button btnNext = null;
	private Button btnCalcular = null;
	private Label labFuncion = null;
	private Label labCoefCorr = null;
	private TextField txtFuncion = null;
	private TextField txtCoefCorr = null;
	
	/**
	 * This is the default constructor
	 */
	public LinearRegressionApplet() {
		super();
		init();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	public void init() {
		this.setLayout(null);
		this.add(getLabNumPuntos(), null);
		this.add(getTxtNumPuntos(), null);
		this.add(getLabCoordX(), null);
		this.add(getTxtCoordX(), null);
		this.add(getLabCoordY(), null);
		this.add(getTxtCoordY(), null);
		this.add(getBtnNext(), null);
		this.add(getBtnCalcular(), null);
		this.add(getLabFuncion(), null);
		this.add(getLabCoefCorr(), null);
		this.add(getTxtFuncion(), null);
		this.add(getTxtCoefCorr(), null);
		this.setBackground(new java.awt.Color(154,169,194));
		this.setSize(280,160);
		mData = new LinearRegressionData();
	}
	
	/**
	 * This method initializes labEc
	 * 
	 * @return Label
	 */
	private Label getLabNumPuntos() {
		if(labNumPuntos == null) {
			labNumPuntos = new Label();
			labNumPuntos.setBounds(15, 15, 110, 20);
			labNumPuntos.setText("Número de datos:");
		}
		return labNumPuntos;
	}
	
	/**
	 * This method initializes labCoordX
	 * 
	 * @return Label
	 */
	private Label getLabCoordX() {
		if(labCoordX == null) {
			labCoordX = new Label();
			labCoordX.setBounds(15, 40, 50, 20);
			labCoordX.setText("x(1) =");
			labCoordX.setEnabled(false);
		}
		return labCoordX;
	}
	
	/**
	 * This method initializes labCoordY
	 * 
	 * @return Label
	 */
	private Label getLabCoordY() {
		if(labCoordY == null) {
			labCoordY = new Label();
			labCoordY.setBounds(15, 65, 50, 20);
			labCoordY.setText("y(1) =");
			labCoordY.setEnabled(false);
		}
		return labCoordY;
	}
	
	/**
	 * This method initializes labFuncion
	 * 
	 * @return Label
	 */
	private Label getLabFuncion() {
		if(labFuncion == null) {
			labFuncion = new Label();
			labFuncion.setBounds(15, 100, 120, 20);
			labFuncion.setText("f(x) =");
			labFuncion.setAlignment(java.awt.Label.LEFT);
			labFuncion.setEnabled(false);
		}
		return labFuncion;
	}
	
	/**
	 * This method initializes labCoefCorr
	 * 
	 * @return Label
	 */
	private Label getLabCoefCorr() {
		if(labCoefCorr == null) {
			labCoefCorr = new Label();
			labCoefCorr.setBounds(15, 125, 120, 20);
			labCoefCorr.setText("Coef. de correlación:");
			labCoefCorr.setAlignment(java.awt.Label.LEFT);
			labCoefCorr.setEnabled(false);
		}
		return labCoefCorr;
	}
	
	/**
	 * This method initializes textField	
	 * 	
	 * @return java.awt.TextField	
	 */    
	private TextField getTxtNumPuntos() {
		if (txtNumPuntos == null) {
			txtNumPuntos = new TextField();
			txtNumPuntos.setBounds(140, 15, 50, 20);

			txtNumPuntos.addFocusListener(new FocusListener() {
				// Si pierde el foco es que se han activado 
				// los campos para la entrada de datos x e y
				public void focusLost(FocusEvent e) {
					txtCoordX.requestFocus();
				}
				public void focusGained(java.awt.event.FocusEvent e) {} 
			});

			txtNumPuntos.addTextListener(new java.awt.event.TextListener() { 
				public void textValueChanged(java.awt.event.TextEvent e) {
					checkTxtNumPuntosInput();
				}
			});
			
			txtNumPuntos.addKeyListener(new KeyListener() { 
				public void keyTyped(KeyEvent e) {
					//System.out.println("digitosAntes="+txtNumPuntos.getText().length());
					char key = e.getKeyChar();
					System.out.println("key="+key);
					if((key >= '0' && key <= '9'))
						System.out.println("NUMERIC");
					else if (key == '\b') {
						System.out.println("BACKSPACE");
					} else {
						System.out.println("NO NUMERIC");
						e.setKeyChar((char)3);
					}
					//System.out.println("digitosDespues="+txtNumPuntos.getText().length());
				}
				public void keyPressed(KeyEvent e) {} 
				public void keyReleased(KeyEvent e) {} 
			});
		}
		return txtNumPuntos;
	}

	/**
	 * This method initializes textField1	
	 * 	
	 * @return java.awt.TextField	
	 */    
	private TextField getTxtCoordX() {
		if (txtCoordX == null) {
			txtCoordX = new TextField();
			txtCoordX.setBounds(70, 40, 50, 20);
			txtCoordX.setEnabled(false);
			txtCoordX.addTextListener(new TextListener() { 
				public void textValueChanged(TextEvent e) {
					checkTxtCoordInput();
				}
			});
		}
		return txtCoordX;
	}

	/**
	 * This method initializes button	
	 * 	
	 * @return java.awt.Button	
	 */    
	private Button getBtnNext() {
		if (btnNext == null) {
			btnNext = new Button();
			btnNext.setBounds(140, 50, 40, 20);
			btnNext.setLabel(">>>");
			btnNext.setEnabled(false);
			
			btnNext.addActionListener(new ActionListener() {
				int iCount = 0;
				int iLabel = 0;

				public void actionPerformed(ActionEvent e) {
					int numPuntos = mData.getNumPuntos();
					if(iCount == numPuntos-1) {
						System.out.println("Ultimo Click");
					} else {
						iLabel = iCount+2;
						labCoordX.setText("x("+iLabel+")=");
						labCoordY.setText("y("+iLabel+")=");
						txtCoordX.requestFocus();
						txtCoordX.selectAll();
						
						double coordX = 0D;
						double coordY = 0D;
						try {
							String strX = txtCoordX.getText();
							String strY = txtCoordY.getText();
							coordX = Double.parseDouble(strX.trim());
							coordY = Double.parseDouble(strY.trim());
						} catch (NumberFormatException ex){ex.printStackTrace();}
						mData.getPointX()[iCount] = coordX;
						mData.getPointY()[iCount] = coordY;
					}
						
					if(iCount == numPuntos-1) {
						txtCoordX.setEnabled(false);
						txtCoordY.setEnabled(false);
						btnNext.setEnabled(false);
						btnCalcular.setEnabled(true);
					}
						
					iCount++;
				}
			});
		}
		return btnNext;
	}

	/**
	 * This method initializes button	
	 * 	
	 * @return java.awt.Button	
	 */    
	private Button getBtnCalcular() {
		if (btnCalcular == null) {
			btnCalcular = new Button();
			btnCalcular.setBounds(190, 50, 55, 20);
			btnCalcular.setLabel("Calcular");
			btnCalcular.setEnabled(false);
			btnCalcular.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent ev) {
					LinearRegression lr = new LinearRegression();
					lr.setNumPuntos(mData.getNumPuntos());
					lr.setPointX(mData.getPointX());
					lr.setPointY(mData.getPointY());
					lr.calculate();
					double vPend = lr.getPendiente();
					double vCte  = lr.getConstante();
					double vCor  = lr.getCorrelacion();
					
					java.text.DecimalFormat df1 = new java.text.DecimalFormat("###,##0.0000");
					java.text.DecimalFormat df2 = new java.text.DecimalFormat("###,##0.0000");
					java.text.DecimalFormat df3 = new java.text.DecimalFormat("###,##0.0000");
					
					String sPend = df1.format(vPend);
					String sCte  = df2.format(vCte);
					String sCor  = df3.format(vCor);
					
					String funcion = sCte + " + " + sPend +"x";
					txtFuncion.setText(funcion);
					txtCoefCorr.setText(sCor);
				}
			});
		}
		return btnCalcular;
	}

	/**
	 * This method initializes textField	
	 * 	
	 * @return java.awt.TextField	
	 */    
	private TextField getTxtFuncion() {
		if (txtFuncion == null) {
			txtFuncion = new TextField();
			txtFuncion.setBounds(140, 100, 120, 20);
			txtFuncion.setEnabled(false);
		}
		return txtFuncion;
	}

	/**
	 * This method initializes textField1	
	 * 	
	 * @return java.awt.TextField	
	 */    
	private TextField getTxtCoefCorr() {
		if (txtCoefCorr == null) {
			txtCoefCorr = new TextField();
			txtCoefCorr.setBounds(140, 125, 50, 20);
			txtCoefCorr.setEnabled(false);
		}
		return txtCoefCorr;
	}
	/**
	 * This method initializes textField	
	 * 	
	 * @return java.awt.TextField	
	 */    
	private TextField getTxtCoordY() {
		if (txtCoordY == null) {
			txtCoordY = new TextField();
			txtCoordY.setBounds(70, 65, 50, 20);
			txtCoordY.setEnabled(false);
			txtCoordY.addTextListener(new TextListener() { 
				public void textValueChanged(TextEvent e) {
					checkTxtCoordInput();
				}
			});
		}
		return txtCoordY;
	}
	
	private void checkTxtNumPuntosInput() {
		System.out.println("checkTxtNumPuntosInput");
		if (txtNumPuntos.getText().length()>=1) {
			labCoordX.setEnabled(true);
			txtCoordX.setEnabled(true);
			labCoordY.setEnabled(true);
			txtCoordY.setEnabled(true);
			txtNumPuntos.setEnabled(false);
			int vNumPuntos = 0;
			try {
				vNumPuntos = Integer.parseInt(txtNumPuntos.getText().trim());
			} catch (NumberFormatException e){}
			mData.setNumPuntos(vNumPuntos);
			
			double[] pointX = new double[vNumPuntos];
			double[] pointY = new double[vNumPuntos];
			
			mData.setPointX(pointX);
			mData.setPointY(pointY);
			

		} else {
			labCoordX.setEnabled(false);
			txtCoordX.setEnabled(false);
			labCoordY.setEnabled(false);
			txtCoordY.setEnabled(false);
		}
	}
	
	private void checkTxtCoordInput() {
		System.out.println("checkTxtCoordInput");
		if ((txtCoordX.getText().length()>=1) && (txtCoordY.getText().length()>=1)) {
			btnNext.setEnabled(true);
		} else {
			btnNext.setEnabled(false);
		}
	}
 }