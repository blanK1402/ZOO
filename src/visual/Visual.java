package visual;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Visual extends JFrame {
    public Visual() {
        setTitle("Gestión del Zoológico");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Pestañas con tablas y botones
        String[] p1 = {"Nombre", "Cargo", "Salario"};
        String[] p2 = {"Especie", "Edad", "Hábitat"};
        String[] p3 = {"Nombre", "Visitas", "Miembro VIP"};
        tabbedPane.addTab("Empleados", crearPanel(p1, "Añadir Empleado"));
        tabbedPane.addTab("Animales", crearPanel(p2, "Añadir Animal"));
        tabbedPane.addTab("Clientes", crearPanel(p3, "Añadir Cliente"));

        add(tabbedPane);
    }

    private JPanel crearPanel(String[] columnas, String botonTexto) {
        JPanel panel = new JPanel(new BorderLayout());

        // Tabla con columnas
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        JTable tabla = new JTable(modelo);
        panel.add(new JScrollPane(tabla), BorderLayout.CENTER);

        // Panel de botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnAgregar = new JButton(botonTexto);
        JButton btnEditar = new JButton("Editar");
        JButton btnEliminar = new JButton("Eliminar");

        panelBotones.add(btnAgregar);
        panelBotones.add(btnEditar);
        panelBotones.add(btnEliminar);

        panel.add(panelBotones, BorderLayout.SOUTH);

        return panel;
    }
}
