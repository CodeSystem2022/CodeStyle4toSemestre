package utn.tienda_libros.vista;

import org.jdesktop.swingx.JXFrame;
import org.jdesktop.swingx.JXPanel;
import org.springframework.beans.factory.annotation.Autowired;
import utn.tienda_libros.servicio.LibroServicio;

public class LibroFrom extends JXFrame {
    LibroServicio libroServicio;
    private JPanel panel;


    @Autowired
    public LibroFrom(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        iniciarForma();

    }

    private void iniciarForma(){
        setContentPane(panel);
        setDefaulCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(900,700);

    }


}
