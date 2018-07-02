package edu.iis.powp.decorator;

import edu.iis.client.plottermagic.IPlotter;

public class TransformPlotterDecorator extends PlotterDecorator {
    /**
     * For inverting points horizontal.
     */
    
    private Transformation transform;

    /**
     * Default constructor.
     * @param originalPlotter instance of decorator.
     */
    public TransformPlotterDecorator(IPlotter originalPlotter, String transformation, Transformation transform) {
        super(originalPlotter, transformation);
        this.transform = transform;
    }

    /**
     * This method invert value of x-axis and draw line.
     * @param i value of x-axis.
     * @param i1 value of y-axis.
     */
    @Override
    public void drawTo(int i, int i1) {
    	transform.doTransform(i, i1);
        originalPlotter.drawTo(transform.getX(), transform.getY());
    }

    /**
     * This method invert value of x-axis and set position.
     * @param i value of x-axis.
     * @param i1 value of y-axis.
     */
    @Override
    public void setPosition(int i, int i1) {
    	transform.doTransform(i, i1);
        originalPlotter.setPosition(transform.getX(), transform.getY());
    }


}
