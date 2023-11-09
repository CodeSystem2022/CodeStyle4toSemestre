package utn.tienda_libros.vista;

import org.jdesktop.swingx.JXFrame;
import org.jdesktop.swingx.JXPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utn.tienda_libros.servicio.LibroServicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class LibroFrom extends JXFrame {
    LibroServicio libroServicio;
    private JPanel panel;
    private JTextField libroTexto;
    private JTextField autorTexto;
    private JTextField precioTexto;
    private JTextField existenciasTexto;
    private JButton agregarButton;
    private JTable tablaLibros;
    private JTextField idTexto;
    private DefaultTablemodel tablaModeloLibros;


    @Autowired
    public LibroFrom(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        iniciarForma();

        agregarButton.addActionListener(e -> agregarLibro());

        tablaLibros.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseCliked(e);
                cargarLibrosseleccionados)();
            }
        });
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

    private void agregarLibro(){
        //Leer los valores del formulario
        if(libroTexto.getText().equals("")){
            mostrarMensaje("Ingresqa el nombre del libro");
            libroTexto.requestFocusInWindow();
            return;
        }
    private void cargarLibroSeleccionado(){
        // Los indices de las columnas inician en 0.
        var renglon = tablaLibros.getSelectedRow();
        if(renglon != -1){
            String idLibro = tablaLibros.getModel().getValuetAt(renglon, 0).toString();
            idTexto.setText(idLibro);
            String nombreLibro =
                    tablaLibros.getModel().getValuetAt(renglon, 1).toString();
            libroTexto.setText(nombreLibro);
            String autor =
                    tablaLibros.getModel().getValuetAt(renglon, 2).toString();
            autorTexto.setText(autor);
            String precio =
                    tablaLibros.getModel().getValuetAt(renglon, 3).toString();
            precioTexto.setText(precio);
            String existencias =
                    tablaLibros.getModel().getValuetAt(renglon, 4).toString();
            existenciasTexto.setText(existencias);

        }
    }


        var nombreLibro = libroTexto.getText();
        var autor = autorTexto.getText();
        var precio = Double.parseDouble(precioTexto.getText());
        var existencias = Integer.parseInt(existenciasTexto.getText());
        // Creamos el obejto del libro
        var libro = new Libro(null, nombreLibro, autor, precio, existencias);
        //libro.setNombreLibro(nombreLibro);
        //libro.setAutor(autor);
        //libro.stPrecio(precio);
        //libro.setExistencias(existencias);
        this.libroServicio.guardarLibro(libro);
        mostrarMensaje(("Se agrego el libro..."));
        limpiarFormulario();
        listarLibros();
    }

    private void limpiarFormulario(){
        libroTexto.setText("");
        autorTexto.setText("");
        precioTexto.setText("");
        existenciasTexto.setText("");
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMesssageDialog(this, mensaje);
    }

    private void createUIComponents(){
       idTexto = new JTextField("");
       idTexto.setVisible(false);
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
