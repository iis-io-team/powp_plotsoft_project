package edu.iis.powp.decorator;

public class MoveTransform implements Transformation {
	
	
	private float renameX;
	private float renameY;
	private int x, y;

	public MoveTransform(float moveX, float moveY) {
		this.renameX = moveX;
		this.renameY = moveY;
	}

	/* (non-Javadoc)
	 * @see edu.iis.powp.decorator.Transformation#doTransform(int, int)
	 */
	@Override
	public void doTransform(int x, int y) {
		this.x = (int) (x + renameX);
        this.y = (int) (y + renameY);	
        
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
