import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear un objeto JFrame (ventana)
        JFrame ventana = new JFrame("Ejemplo de Interfaz Gráfica en Java");

        // Establecer operación predeterminada al cerrar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un objeto JPanel (panel)
        JPanel panel = new JPanel();

        // Crear un botón
        JButton boton = new JButton("Haz clic");

        // Agregar un ActionListener al botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código que se ejecuta al hacer clic en el botón
                System.out.println("¡Se ha hecho clic en el botón!");
            }
        });

        // Agregar el botón al panel
        panel.add(boton);

        // Agregar el panel a la ventana
        ventana.getContentPane().add(panel);

        // Establecer el tamaño de la ventana
        ventana.setSize(300, 200);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
