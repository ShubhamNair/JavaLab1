package edu.neu.mgen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColourSelector extends JFrame {
    private JComboBox<String> colourDropdown;
    private JLabel colourLabel;
    private JPanel circlePanel;

    public ColourSelector() {
        setTitle("Colour Selector App");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        colourDropdown = new JComboBox<>(new String[]{"Red", "Blue", "Green"});
        colourLabel = new JLabel("Selected Colour: ");
        circlePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(getSelectedColour());
                g.fillOval(100, 100, 200, 200);
            }
        };

        add(colourDropdown,BorderLayout.NORTH);
        add(circlePanel,BorderLayout.CENTER);
        add(colourLabel,BorderLayout.SOUTH);

        colourDropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circlePanel.repaint();
                colourLabel.setText("Selected Colour: " + getSelectedColourName());
            }
        });
    }

    private Color getSelectedColour() {
        String selectedColour = (String) colourDropdown.getSelectedItem();
        switch (selectedColour) {
            case "Red":
                return Color.RED;
            case "Blue":
                return Color.BLUE;
            case "Green":
                return Color.GREEN;
            default:
                return Color.BLACK;
        }
    }

    private String getSelectedColourName() {
        return (String) colourDropdown.getSelectedItem();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ColourSelector().setVisible(true);
            }
        });
    }
}
