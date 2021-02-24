package sample;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class MultiHighlight implements ActionListener {

    private JTextComponent comp;

    private String charsToHighlight;

    public MultiHighlight(JTextComponent c, String chars) {
        comp = c;
        charsToHighlight = chars;
    }

    public void actionPerformed(ActionEvent e) {
        Highlighter h = comp.getHighlighter();
        h.removeAllHighlights();
        String text = comp.getText().toUpperCase();

        for (int j = 0; j < text.length(); j += 1) {
            char ch = text.charAt(j);
            if (charsToHighlight.indexOf(ch) >= 0)
                try {
                    h.addHighlight(j, j + 1, DefaultHighlighter.DefaultPainter);
                } catch (BadLocationException ble) {
                }
        }
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame("MultiHighlight");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea area = new JTextArea(5, 20);
        area.setText("ww\nw.java2s.c\nom");
        frame.getContentPane().add(new JScrollPane(area), BorderLayout.CENTER);

        JButton b = new JButton("Highlight All Vowels");
        b.addActionListener(new MultiHighlight(area, "aeiouAEIOU"));
        frame.getContentPane().add(b, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
}