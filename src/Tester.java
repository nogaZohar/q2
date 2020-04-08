import javax.swing.*;

public class Tester {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Testing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        Data data= new Data();

        // create a new Diagram object and initialize it with values from Data
        Diagram yearTempDiagram = new Diagram(YearTemp.MONTHS_IN_YEAR);
        Column[] yearCols = yearTempDiagram.getColumns();
        for (int col = 0; col < YearTemp.MONTHS_IN_YEAR; col++) {
            yearCols[col].setName(data.getYearT()[0].getMonthT()[col].getMonth());
            yearCols[col].setValue(data.getYearT()[0].getMonthT()[col].getTemperature());
        }

        // set min and max temperatures from Data to diagram
        yearTempDiagram.setMaxValue(data.getYearT()[0].getMaxTemp());
        yearTempDiagram.setMinValue(data.getYearT()[0].getMinTemp());


        DrawDiagram p = new DrawDiagram(yearTempDiagram);
        p.setBounds(frame.getBounds());
        frame.add(p);







        frame.setVisible(true);

//        JOptionPane pane = new JOptionPane();
//        JOptionPane.CLOSED_OPTION


    }

}
