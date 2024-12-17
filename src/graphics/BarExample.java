package graphics;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;

public class BarExample {

    public static void main(String[] args) {
        // Create dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "Series1", "Category1");
        dataset.addValue(20, "Series1", "Category2");
        dataset.addValue(30, "Series1", "Category3");
        dataset.addValue(95, "Series1", "Category4");

        // Create bar chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Bar Chart Example",    // Chart title
                "Category",             // X-axis Label
                "Value",                // Y-axis Label
                dataset                 // Dataset
        );

        // Display the chart in a panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
