package edu.iis.powp.decorator;

import edu.iis.client.plottermagic.IPlotter;

public class MoveUpPlotterDecorator extends PlotterDecorator {

    public MoveUpPlotterDecorator(IPlotter originalPlotter) {
        super(originalPlotter);
    }

    @Override
    public void drawTo(int i, int i1) {
        i1 -= 50;
        originalPlotter.drawTo(i, i1);
    }

    @Override
    public void setPosition(int i, int i1) {
        i1 -= 50;
        originalPlotter.setPosition(i, i1);
    }
}
