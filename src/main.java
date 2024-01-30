import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        // Erstellt ein neues JFrame mit dem Titel "HELLOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO"
        JFrame frame = new JFrame("HELLOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        // Setzt die Operation, die ausgeführt wird, wenn der Benutzer das Fenster schließt
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Setzt die Größe des Fensters auf 300x200 Pixel
        frame.setSize(300, 200);

        // Erstellt ein neues JPanel mit FlowLayout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Erstellt ein neues JTextArea für die Texteingabe
        JTextArea textArea = new JTextArea(5, 20); // 5 Zeilen und 20 Spalten
        // Erstellt einen JScrollPane, der das JTextArea umschließt, um Scrollbalken hinzuzufügen, falls benötigt
        JScrollPane scrollPane = new JScrollPane(textArea);
        // Fügt den JScrollPane zum JPanel hinzu
        panel.add(scrollPane);

        // Erstellt einen neuen JButton mit dem Text "Submit"
        JButton submitButton = new JButton("Submit");
        // Fügt den JButton zum JPanel hinzu
        panel.add(submitButton);

        // Fügt einen ActionListener zum JButton hinzu, der aufgerufen wird, wenn der Benutzer auf den Button klickt
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Holt den Text aus dem JTextArea
                String text = textArea.getText();
                // Ruft die Methode createTextFile auf, um den Text in eine Datei zu schreiben
                createTextFile(text);
            }
        });

        // Fügt das JPanel zum JFrame hinzu
        frame.add(panel);
        // Macht das JFrame sichtbar
        frame.setVisible(true);
    }

    // Methode zum Schreiben des Textes in eine Datei
    private static void createTextFile(String text) {
        try {
            // Erstellt einen FileWriter für die Datei "output.txt"
            FileWriter writer = new FileWriter("output.txt");
            // Schreibt den Text in die Datei
            writer.write(text);
            // Schließt den FileWriter
            writer.close();
            // Gibt eine Nachricht auf der Konsole aus
            System.out.println("Text wurde erfolgreich in output.txt geschrieben.");
        } catch (IOException e) {
            // Gibt den Stack Trace der Ausnahme auf der Konsole aus
            e.printStackTrace();
        }
    }
}