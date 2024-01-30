import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Field Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JTextArea textArea = new JTextArea(5, 20); // 5 Zeilen und 20 Spalten
        JScrollPane scrollPane = new JScrollPane(textArea); // Fügt Scrollbalken hinzu, falls benötigt
        panel.add(scrollPane);

        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                createTextFile(text);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void createTextFile(String text) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(text);
            writer.close();
            System.out.println("Text file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}