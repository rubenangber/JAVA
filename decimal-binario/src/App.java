import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame ventana = new JFrame("Conversión Binaria");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);

            // Fila 1: Texto y TextBox
            JLabel etiqueta = new JLabel("Ingrese un número x.x.x.x:");
            JTextField textField = new JTextField(15);

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridwidth = 1;
            panel.add(etiqueta, gbc);

            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.gridwidth = 1;
            panel.add(textField, gbc);

            // Fila 2: Resultado
            JTextArea resultadoTextArea = new JTextArea(5, 20);
            resultadoTextArea.setEditable(false);

            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.gridwidth = 2;
            panel.add(new JScrollPane(resultadoTextArea), gbc);

            // Fila 3: Botón
            JButton boton = new JButton("Convertir");

            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.gridwidth = 2;
            panel.add(boton, gbc);

            // Acción del botón
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String entrada = textField.getText();
                    // Resto del código para la conversión binaria...
                }
            });

            ventana.getContentPane().add(panel);
            ventana.setSize(480, 300);
            ventana.setVisible(true);
        });
    }
}
