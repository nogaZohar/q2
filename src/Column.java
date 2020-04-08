import java.awt.*;

public class Column {

    private String name;
    private int value;
    private Color color;
    private int colWidth; // width of one column

    //constructor
    public Column(String name, int value) {
        this.name = name;
        this.value = value;
        this.color = Color.GRAY;
        this.colWidth = 0;
    }

    public Column() {
        this.name = null;
        this.value = 0;
        this.color = Color.GRAY;
        this.colWidth = 0;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getColWidth() {
        return colWidth;
    }

    public void setColWidth(int colWidth) {
        this.colWidth = colWidth;
    }
}
