package edu.iis.powp.decorator;

public class ScaleTransform implements Transformation {
	
	
	private float scaleX;
	private float scaleY;
	private int x, y;

	public ScaleTransform(float scaleX, float scaleY) {
		this.scaleX = scaleX;
		this.scaleY = scaleY;
	}

	/* (non-Javadoc)
	 * @see edu.iis.powp.decorator.Transformation#doTransform(int, int)
	 */
	@Override
	public void doTransform(int x, int y) {
		this.x = (int) (x * scaleX);
        this.y = (int) (y * scaleY);		
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
