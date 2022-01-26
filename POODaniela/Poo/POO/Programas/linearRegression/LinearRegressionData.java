/*
 * Created on 12-mar-2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.welsungo.math.linearRegression;

/**
 * @author felipe
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class LinearRegressionData {
	private int mNumPuntos;
	private double mPointX[];
	private double mPointY[];

	/**
	 * 
	 */
	public LinearRegressionData() {
		super();
	}
	/**
	 * @return Returns the numPuntos.
	 */
	public int getNumPuntos() {
		return mNumPuntos;
	}
	/**
	 * @param pNumPuntos The numPuntos to set.
	 */
	public void setNumPuntos(int pNumPuntos) {
		mNumPuntos = pNumPuntos;
	}
	/**
	 * @return Returns the pointX.
	 */
	public double[] getPointX() {
		return mPointX;
	}
	/**
	 * @return Returns the pointX[i].
	 */
	public double getPointX(int pPosition) {
		return mPointX[pPosition];
	}
	/**
	 * @param pPointX The pointX to set.
	 */
	public void setPointX(double[] pPointX) {
		mPointX = pPointX;
	}
	/**
	 * @return Returns the pointY.
	 */
	public double[] getPointY() {
		return mPointY;
	}
	/**
	 * @return Returns the pointY[i].
	 */
	public double getPointY(int pPosition) {
		return mPointY[pPosition];
	}
	/**
	 * @param pPointY The pointY to set.
	 */
	public void setPointY(double[] pPointY) {
		mPointY = pPointY;
	}
}
