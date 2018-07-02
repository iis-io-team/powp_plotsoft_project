package edu.iis.powp.decorator;

public class RotateTransform implements Transformation {
	
	
	private float rotateX;
	private float rotateY;
	private int x, y;

	/***
	 * 
	 * @param rotateX - kat obrotu
	 * do obrotu wystarczy podac tylko kat, dlatego funkcja przyjmuje tylko JEDEN parametr zeby nie mylic uzytkownika. 
	 */
	public RotateTransform(float rotateX) {
		this.rotateX = rotateX;

	}

	/* (non-Javadoc)
	 * @see edu.iis.powp.decorator.Transformation#doTransform(int, int)
	 * metoda doTransform tak jak wskazuje interfejs, przyjmuje 2 parametry (choc realnie wykorzystany jest tylko 1 z nich) 
	 */
	@Override
	public void doTransform(int x, int y) {
        this.x = (int) (x * Math.cos(Math.toRadians(rotateX)) - y * Math.sin(Math.toRadians(rotateX)));
        this.y = (int) (y * Math.cos(Math.toRadians(rotateX)) + x * Math.sin(Math.toRadians(rotateX)));
	}

 
	/* (non-Javadoc)
	 * @see edu.iis.powp.decorator.Transformation#getX()
	 */
	@Override
	public int getX() {
		return x;
	}
	
	/* (non-Javadoc)
	 * @see edu.iis.powp.decorator.Transformation#getY()
	 */
	@Override
	public int getY() {
		return y;
	}
	
}
