/*
 * TCSS 305 - Assignment 5: PowerPaint
 */

package view;

/**
 * An enumeration class holding the different types of tools selectable.
 * 
 * @author Ray Kim
 * @version Autumn 2014
 */
public enum Tools {

    /**
     * Pencil tool selection.
     */
    PENCIL,
   
    /**
     * Line tool selection.
     */
    LINE,
    
    /**
     * Rectangle tool selection.
     */
    RECTANGLE,
    
    /**
     * Ellipse tool selection.
     */
    ELLIPSE;
    
    
    //constants
    /**
     * Total number of enums in this Enum.
     * Must be updated as new elements are added.
     */
    public static final int SIZE = 4;
    
    
    /**
     * Returns the name of the Enum.
     * 
     * @return String containing name of enum.
     */
    public String getName() {
        String name;
        switch (this) {
            case PENCIL:
                name = "Pencil";
                break;
            case LINE:
                name = "Line";
                break;
            case RECTANGLE:
                name = "Rectangle";
                break;
            default:
                name = "Ellipse";
                break;
                
        }
            
        return name;
    }
    
   
}
