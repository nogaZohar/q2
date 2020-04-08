import javax.swing.*;
import java.awt.*;

public class DrawDiagram extends JPanel {
    private Rect diagramBound;
    private Diagram diagram;
    private final int HEIGHT_UNIT = 5;

    public DrawDiagram(Diagram diagram){
        this.diagram = diagram;

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        diagram.setBoundsRect(0, 0, panelWidth, panelHeight);

        int width = diagram.getColumns()[0].getColWidth();
        for (int col = 0; col < diagram.getNumOfCol(); col++) {
            diagram.getColumns()[col].setColor(Color.gray);
            if (diagram.getColumns()[col].getValue() == diagram.getMaxValue()) { diagram.getColumns()[col].setColor(Color.red); }
            if (diagram.getColumns()[col].getValue() == diagram.getMinValue()) { diagram.getColumns()[col].setColor(Color.blue); }

            g.setColor(diagram.getColumns()[col].getColor());
            g.fillRect(diagram.getColPlaces()[col], panelHeight - 2 * (diagram.getColumns()[col].getValue() * HEIGHT_UNIT),
                    width, (panelHeight - (diagram.getColumns()[col].getValue())) * HEIGHT_UNIT);
        }


        //  draw axis
        g.setColor(Color.BLACK);




    }

}


