/*
 * TCSS 305 - Assignment 5: PowerPaint
 */


package model;

import java.awt.Color;

/**
 * 
 * Abstract Shape object which implements PowerPaintShape interface.
 * 
 * @author Ray Kim
 * @version Autumn 2014
 *
 */
public abstract class AbstractPowerPaintShape implements PowerPaintShape {

    //variables
    /**
     * Starting x-coordinate of object.
     */
    private final int myStartX;
    
    /**
     * Starting y-coordinate of object.
     */
    private final int myStartY;
    
    /**
     * Stores stroke width.
     */
    private final int myStrokeWidth;
    
    /**
     * Stores the color of this object.
     */
    private final Color myColor;
    
    /**
     * Stores object fields that are passed in through the parameters.
     * @param theStartX int containing starting x coord
     * @param theStartY int containing starting y coord
     * @param theStrokeWidth stroke length of the object
     * @param theColor color of the object
     */
    protected AbstractPowerPaintShape(final int theStartX, final int theStartY, 
                                    final int theStrokeWidth, final Color theColor) {
        myStartX = theStartX;
        myStartY = theStartY;
        myStrokeWidth = theStrokeWidth;
        myColor = theColor;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public int getStartX() {
        
        return myStartX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getStartY() {
        
        return myStartY;
    }
    
    
    /**
     * {@inheritDoc}
     */
    @Override
    public int getStroke() {
        
        return myStrokeWidth;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Color getColor() {
        
        return myColor;
    }

}
