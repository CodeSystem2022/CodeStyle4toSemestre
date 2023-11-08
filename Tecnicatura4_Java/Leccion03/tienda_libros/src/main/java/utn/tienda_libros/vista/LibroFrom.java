package utn.tienda_libros.vista;

import org.jdesktop.swingx.JXFrame;
import org.jdesktop.swingx.JXPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utn.tienda_libros.servicio.LibroServicio;

import java.awt.*;

@Component
public class LibroFrom extends JXFrame {
    LibroServicio libroServicio;
    private JPanel panel;
    private JTable tablaLibros;
    private DefaultTablemodel tablaModeloLibros;


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
        //Para obtener las dimensiones de la ventana
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = toolkit.getScreenSize();
        int x = (tamanioPantalla.width - getWidth()/2);
        int y = (tamanioPantalla.height - getHeight()/2);
        setLocation(x,y);
    }

    private void createUIComponents(){
       this.tablaModeloLibros = new DefaultTablemodel(0, 5);
       String[] cabecera ={"id", "Libro", "Autor", "Precio", "Existencias"};
       this.tablaModeloLibros.setColumnIdentifiers(cabecera);
       //Instanciar el objeto de Jtable
        this.tablaLibros = new Jtable(tablaModeloLibros);
        listarLibros();
    }

    private void listarLibros(){
        // Limpiar la tabla
        tablaModeloLibros.setRowCount(0);
        //Obtener los libros de la BD
        var libros = libroServicio.listarLibros();
        // Iterar cada libro
        libros.forEach((libro) { //Función Lambda
                //Creamos cada registro par agregarlos a la tabla
                Object [] renglonLibro = {
                libro.getIDLibro(),
                libro.getNombreLibro(),
                libro.getAutor(),
                libro.getPrecio(),
                libro.getExistencia,
            };
            this.tablaModeloLibros.addRow(renglonLibro);
        });
    }
}
