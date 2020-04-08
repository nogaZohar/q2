import java.util.ArrayList;
import java.util.List;

public class Diagram {

    private Column[] columns;
    private int[] colPlaces; // column's place on the X axis depends on the width of the diagram
    Rect boundsRect; // bounds rectangle of diagram
    private int numOfCol;
    private final int GAP = 2; // gap between columns
    private int maxValue;


    private int minValue;


    public Diagram(Column[] columns, int upperX, int upperY, int lowerX, int lowerY) {
        columns = columns;
        int numOfCol = columns.length;
        colPlaces = new int[numOfCol];
        this.boundsRect = new Rect(upperX, upperY, lowerX, lowerY);
        setColumnsInPlace();
    }

    public Diagram(int numOfCol) {
        this.numOfCol = numOfCol;
        this.columns = new Column[numOfCol];
        for (int col = 0; col < numOfCol; col++)
            columns[col] = new Column();

        this.colPlaces = new int[numOfCol];
        this.boundsRect = new Rect(0,500,500,0);
        setColumnsInPlace();
    }

    // methods

    /**
     * sets column width
     * @return column width
     */
    private int columnsWidth(){
        int colWidth = boundsRect.getWidth() / numOfCol - (GAP * (numOfCol - 1));
        for(int col = 0; col < columns.length - 1; col++)
            columns[col].setColWidth(colWidth);
        return colWidth;
    }

    /**
     * sets places of columns on the X axis of diagram (the middle of column's width)
     */
    private void setColumnsInPlace(){
        int placementWidth = boundsRect.getWidth() - columnsWidth(); //diagram width without width of columns in edges
        int space = placementWidth / (numOfCol - 1); // space between two columns
        colPlaces[0] = 0;
        for (int column = 1; column <= numOfCol - 1; column++)
            colPlaces[column] = colPlaces[column - 1] + space;
    }


    //getters and setters
    public int getNumOfCol() {
        return numOfCol;
    }

    public void setNumOfCol(int numOfCol) {
        this.numOfCol = numOfCol;
    }

    public Column[] getColumns() {
        return columns;
    }

    public void setColumns(Column[] columns) {
        this.columns = columns;
    }

    public int[] getColPlaces() {
        return colPlaces;
    }

    public void setColPlaces(int[] colPlaces) {
        this.colPlaces = colPlaces;
    }

    public Rect getBoundsRect() {
        return boundsRect;
    }

    public void setBoundsRect(int upperX, int upperY, int lowerX, int lowerY) {
        this.boundsRect = new Rect(upperX, upperY, lowerX, lowerY);
    }

    public int getGAP() {
        return GAP;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }
}
