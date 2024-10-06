package igu;

import ExportarTxt.ExportarTxt;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicProgressBarUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import logica.Asignacion;
import logica.Controladora;
import logica.Servicio;

public class MenuSeguimientoImpacto extends javax.swing.JFrame {

    Asignacion asignacion;
    Controladora control;
    
    
    private static final Color ACCENT_COLOR_LIGHT = new Color(50, 35, 62);
    private static final Color ACCENT_COLOR_BLACK = new Color(255,216,102);
    private static final Color FOREGROUND_COLOR_LIGHT = Color.WHITE;
    private static final Color FOREGROUND_COLOR_BLACK = new Color(34,31,34);
    /**
     * Creates new form MenuSeguimientoImpacto
     */
    public MenuSeguimientoImpacto() {
        initComponents();
        setResizable(false);
        
        try {
            control = new Controladora(); // Inicializar Controladora
            cargarRelacionesEnTabla(); // Cargar tabla solo si Controladora se inicializa correctamente
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                "Error al inicializar la controladora: " + e.getMessage(),
                "Error de Inicialización",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        irAtrasBen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaImpacto = new javax.swing.JTable();
        BuscarTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtBeneficiario = new javax.swing.JTextField();
        TxtServicio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SliderProg = new javax.swing.JSlider();
        txtProgreso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnTheme = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnBorrarAsig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seguimiento de Impacto");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        irAtrasBen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        irAtrasBen.setText("<< Atrás");
        irAtrasBen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        irAtrasBen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                irAtrasBenMouseClicked(evt);
            }
        });
        jPanel1.add(irAtrasBen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, 30));

        jPanel2.setBackground(UIManager.getColor("Component.accentColor"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 10));

        jLabel2.setFont(new java.awt.Font("Bungee", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACTIVA");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 90, 20));

        jLabel1.setBackground(UIManager.getColor("Component.accentColor"));
        jLabel1.setFont(new java.awt.Font("Bungee", 0, 15)); // NOI18N
        jLabel1.setForeground(UIManager.getColor("Component.foreground"));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INCLUSIÓN");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 40, 160, 20));

        tablaImpacto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaImpacto.setRowHeight(25);
        tablaImpacto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaImpacto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaImpacto.setShowHorizontalLines(true);
        tablaImpacto.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tablaImpacto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 242, 980, 400));
        jPanel1.add(BuscarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 280, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Buscar:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 50, 30));

        TxtBeneficiario.setEditable(false);
        jPanel1.add(TxtBeneficiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 220, 40));

        TxtServicio.setEditable(false);
        jPanel1.add(TxtServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 220, 40));

        jLabel4.setText("Beneficiario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel5.setText("Progreso:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        SliderProg.setMajorTickSpacing(10);
        SliderProg.setMinorTickSpacing(10);
        SliderProg.setPaintLabels(true);
        SliderProg.setSnapToTicks(true);
        SliderProg.setValue(0);
        SliderProg.setEnabled(false);
        SliderProg.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderProgStateChanged(evt);
            }
        });
        SliderProg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SliderProgKeyPressed(evt);
            }
        });
        jPanel1.add(SliderProg, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 330, 40));

        txtProgreso.setEditable(false);
        txtProgreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 140, 40));

        jLabel6.setText("Servicio:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        btnEditar.setBackground(UIManager.getColor("Component.accentColor"));
        btnEditar.setForeground(UIManager.getColor("Component.foreground"));
        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 310, 40));

        btnTheme.setText("Theme");
        btnTheme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTheme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemeMousePressed(evt);
            }
        });
        jPanel1.add(btnTheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, -1));

        jButton2.setText("Exportar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 140, 40));

        btnBorrarAsig.setText("Borrar");
        btnBorrarAsig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAsigActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrarAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1142, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void irAtrasBenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_irAtrasBenMouseClicked

        // Crear y mostrar la nueva ventana
        Principal pantalla = new Principal();
        pantalla.setLocationRelativeTo(null);
        pantalla.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_irAtrasBenMouseClicked
    
    private boolean enModoEdicion = false;
    private boolean actualizandoSlider = false;
    private int filaSeleccionada = -1;
    
    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        if (!enModoEdicion) {
            // Obtener el índice de la fila seleccionada
            filaSeleccionada = tablaImpacto.getSelectedRow();

            // Verificar si hay una fila seleccionada
            if (filaSeleccionada != -1) {
                long num_Asig = Long.parseLong(String.valueOf(tablaImpacto.getValueAt(filaSeleccionada, 0)));

                // Traer la asignación usando el ID
                this.asignacion = control.traerAsing(num_Asig);

                // Establecer el nombre del beneficiario en el campo de texto
                TxtBeneficiario.setText(asignacion.getBeneficiario().getNombre());

                // Inicializar el nombre del servicio
                String servicioNombre = "N/A";

                // Verificar si el mapa de servicios no es nulo y no está vacío
                if (asignacion.getServicios() != null && !asignacion.getServicios().isEmpty()) {
                    // Obtener el primer servicio del mapa
                    Map.Entry<Long, Servicio> primerServicioEntry = asignacion.getServicios().entrySet().iterator().next();
                    Servicio primerServicio = primerServicioEntry.getValue();
                    servicioNombre = primerServicio.getNombre(); // Obtener el nombre del primer servicio
                }

                // Establecer el nombre del servicio en el campo de texto
                TxtServicio.setText(servicioNombre);

                // Establecer el progreso de la asignación
                txtProgreso.setText(Long.toString(asignacion.getProgreso()));

                // Actualizar el valor del slider de progreso si no se está actualizando
                if (!actualizandoSlider) {
                    SliderProg.setValue(asignacion.getProgreso());
                }

                // Cambiar el texto del botón a "Guardar Cambios"
                btnEditar.setText("Editar Progreso");

                // Deshabilitar los botones "Eliminar" y "Agregar"
                btnBorrarAsig.setEnabled(false);
                SliderProg.setEnabled(true);

                // Entrar en modo edición
                enModoEdicion = true;
            } else {
                // Mostrar un mensaje si no hay ninguna fila seleccionada
                mostrarMensaje("No se ha seleccionado ninguna fila. Por favor, seleccione una fila para editar.", "Error", "Error");

            }
        } else {
            // Si estamos en modo edición, validar y guardar los cambios
            if (filaSeleccionada != -1) {
 

                // Intentar convertir la edad
                Integer NumeroProgreso = null;
                try {
                    NumeroProgreso = Integer.valueOf(txtProgreso.getText().trim());
                } catch (NumberFormatException e) {
                    // Mostrar un mensaje de error si la conversión falla
                    mostrarMensaje("El progreso es inválido. Debe ser un número entero.", "Error de Entrada", "Error");
                    return; // Salir del método para evitar acciones posteriores
                }

                
                if (NumeroProgreso < 0 || NumeroProgreso > 100 ) {
                    mostrarMensaje("El progreso debe estar entre 0 y 100.", "Error de Entrada", "Error");
                    return; // Salir del método para evitar acciones posteriores
                }

                // Verificar si los campos obligatorios están vacíos
                if (txtProgreso.getText().trim().isEmpty()) {
                    mostrarMensaje("Todos los campos deben ser completos.", "Error de Entrada", "Error");
                    return; // Salir del método para evitar acciones posteriores
                }
                
                
                try {
                    control.modificarAsig(asignacion, NumeroProgreso);
                } catch (Exception ex) {
                    Logger.getLogger(MenuSeguimientoImpacto.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                cargarRelacionesEnTabla();
                
                // Mostrar un mensaje de éxito
                mostrarMensaje("Registro actualizado exitosamente.", "Éxito", "Información");


                // Limpiar los campos de texto después de guardar los cambios
                TxtBeneficiario.setText("");
                txtProgreso.setText("");
                TxtServicio.setText("");
               
                // Cambiar el texto del botón de nuevo a "Editar"
                btnEditar.setText("Editar");

                // Salir del modo edición
                enModoEdicion = false;

                // Reactivar los botones "Eliminar" y "Agregar"
                btnBorrarAsig.setEnabled(true);
                SliderProg.setEnabled(false);

                // Limpiar la selección de la tabla
                tablaImpacto.clearSelection();
            }
        }
        
    }//GEN-LAST:event_btnEditarMouseClicked

    private boolean actualizando = false;
    private void SliderProgStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderProgStateChanged
        if (!actualizando) { // Solo actualiza si no se está actualizando
        try {
            actualizando = true; // Evitar que el evento del texto se dispare
            
            // Obtener el valor del JSlider y actualizar el JTextField
            int progresoSlider = SliderProg.getValue();
            txtProgreso.setText(Integer.toString(progresoSlider)); // Actualizar el JTextField
        } finally {
            actualizando = false; // Permitir que otros eventos se disparen nuevamente
        }
    }
    }//GEN-LAST:event_SliderProgStateChanged

    private void btnThemeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemeMousePressed
        try {
            // Verificar el Look and Feel actual y cambiar de tema
            if (UIManager.getLookAndFeel().getClass().getName().equals("com.formdev.flatlaf.FlatLightLaf")) {
                // Cambiar al tema IntelliJ
                IntelliJTheme.setup(Principal.class.getResourceAsStream("/default.theme.json"));
                UIManager.put("Component.accentColor", ACCENT_COLOR_BLACK);
                UIManager.put("Component.foreground", FOREGROUND_COLOR_BLACK);
            } else {
                // Volver a FlatLightLaf
                FlatLightLaf.setup();
                UIManager.put("Component.accentColor", ACCENT_COLOR_LIGHT);
                UIManager.put("Component.foreground", FOREGROUND_COLOR_LIGHT);
            }

            // Actualizar la UI
            SwingUtilities.updateComponentTreeUI(this);

            // Navegar a la nueva pantalla
            MenuSeguimientoImpacto pantalla = new MenuSeguimientoImpacto();
            pantalla.setLocationRelativeTo(null);
            pantalla.setVisible(true);

            // Cerrar la pantalla actual
            this.dispose();

        } catch (Exception e) {
            e.printStackTrace();
            // Aquí podrías mostrar un mensaje al usuario si ocurre un error
        }
    }//GEN-LAST:event_btnThemeMousePressed

    private void SliderProgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SliderProgKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            evt.consume(); // Evitar el cambio de foco
            btnEditar.doClick();  // Simular clic en el botón
        }
    }//GEN-LAST:event_SliderProgKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ExportarTxt obj;

        try {
            obj = new ExportarTxt();
            obj.exportarTxt(tablaImpacto);  
        } catch (IOException ex) {
            System.out.println("Error: " + ex);  
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBorrarAsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAsigActionPerformed
        int filaSeleccionadaAsig = tablaImpacto.getSelectedRow();

        if (filaSeleccionadaAsig != -1) {
            // Convertir el índice de la vista al índice del modelo
            int filaSeleccionadaModelo = tablaImpacto.convertRowIndexToModel(filaSeleccionadaAsig);

            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar esta asignación?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    // Obtener el ID del asignacion desde el modelo de la tabla
                    long num_Assig = Long.parseLong(String.valueOf(tablaImpacto.getModel().getValueAt(filaSeleccionadaModelo, 0)));

                    // Llamar al método para eliminar la asignacion
                    control.borrarAsig(num_Assig);

                    // Recargar la tabla después de la eliminación
                    cargarRelacionesEnTabla();

                    mostrarMensaje("Asignación eliminada exitosamente.", "Info", "Éxito");
                } catch (Exception e) {
                    mostrarMensaje("Ocurrió un error al eliminar la asignación: " + e.getMessage(), "Error", "Error");
                    e.printStackTrace();
                }
            } else {
                mostrarMensaje("Eliminación cancelada.", "Info", "Cancelación");
            }

            // Limpiar la selección de la tabla
            tablaImpacto.clearSelection();
        } else {
            mostrarMensaje("No se ha seleccionado ninguna fila.", "Error", "Error");
        }
    }//GEN-LAST:event_btnBorrarAsigActionPerformed

    
    public void keyPressed(KeyEvent e) {
        // Verificar si la tecla presionada es "Tab"
        if (e.getKeyCode() == KeyEvent.VK_TAB) {
            // Evitar que la tecla Tab cambie el foco
            e.consume(); // Consumir el evento

            // Simular clic en el botón btnEditar
            btnEditar.doClick(); // Esto simula un clic en el botón
        }
    }
    
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);  
        } else if (tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setVisible(true);
        dialog.setAlwaysOnTop(true);
    }
    /**
     * @param args the command line arguments
     */
    
    private void cargarRelacionesEnTabla() {
    DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Evitar que las celdas sean editables
        }
    };

    // Establecemos los nombres de las columnas
    String[] titulos = {"Id-Asig", "Beneficiario", "Discapacidades", "Edad", "Servicio", "Progreso"};
    modeloTabla.setColumnIdentifiers(titulos);

    List<Asignacion> listarAsignaciones = control.traerAsignaciones();

    if (listarAsignaciones != null) {
        for (Asignacion asig : listarAsignaciones) {
            // Obtener el nombre del beneficiario
            String beneficiarioNombre = asig.getBeneficiario() != null ? asig.getBeneficiario().getNombre() : "N/A";

            // Obtener la edad del beneficiario
            String edadBeneficiario = asig.getBeneficiario() != null ? String.valueOf(asig.getBeneficiario().getEdad()) : "N/A";

            // Obtener las discapacidades del beneficiario como lista
            List<String> discapacidades = asig.getBeneficiario() != null ? asig.getBeneficiario().getDiscapacidades() : new ArrayList<>();
            String beneficiarioDiscapacidades = discapacidades.isEmpty() ? "N/A" : String.join(", ", discapacidades);

            // Obtener el nombre del servicio y el responsable (solo el primer servicio del mapa)
            String servicioNombre = "N/A";
            if (asig.getServicios() != null && !asig.getServicios().isEmpty()) {
                // Obtener el primer servicio del mapa
                Map.Entry<Long, Servicio> primerServicioEntry = asig.getServicios().entrySet().iterator().next();
                Servicio primerServicio = primerServicioEntry.getValue();
                servicioNombre = primerServicio.getNombre(); // Obtener el nombre del primer servicio
            }

            // En lugar de convertir el progreso a String, lo dejamos como Integer para usar la barra de progreso
            int progresoAsignacion = asig.getProgreso();

            // Agregar los datos a la tabla
            Object[] objeto = {asig.getId(), beneficiarioNombre, beneficiarioDiscapacidades, edadBeneficiario, servicioNombre, progresoAsignacion};
            modeloTabla.addRow(objeto);
        }
    }

    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    tablaImpacto.setRowSorter(sorter);

    tablaImpacto.setModel(modeloTabla);
    tablaImpacto.getTableHeader().setReorderingAllowed(false);
    tablaImpacto.getTableHeader().setResizingAllowed(false);

    ajustarAnchoColumnas(tablaImpacto);
    centrarColumnas(tablaImpacto, new int[]{0, 3, 5});
    
    tablaImpacto.getColumnModel().getColumn(3).setPreferredWidth(50);

    // Asignar el renderizador de barra de progreso a la columna de Progreso (índice 5)
    tablaImpacto.getColumnModel().getColumn(5).setCellRenderer(new ProgressBarRenderer());
    tablaImpacto.getColumnModel().getColumn(5).setPreferredWidth(150);  
    // Filtrado de texto
    BuscarTxt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyReleased(KeyEvent e) {
            String text = BuscarTxt.getText();
            if (text.trim().length() == 0) {
                sorter.setRowFilter(null);
                btnBorrarAsig.setEnabled(true);
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                btnBorrarAsig.setEnabled(false);
            }
        }
    });

    // Opción de limpiar el campo manualmente
    BuscarTxt.addFocusListener(new FocusAdapter() {
        @Override
        public void focusLost(FocusEvent e) {
            if (!BuscarTxt.getText().isEmpty()) {
                BuscarTxt.setText(""); // Limpiar el campo de texto
                sorter.setRowFilter(null); // Quitar el filtro
                btnBorrarAsig.setEnabled(true);
            }
        }
    });
   
}
    public class ProgressBarRenderer extends JProgressBar implements TableCellRenderer {

    public ProgressBarRenderer() {
        // Establecemos el rango de la barra de progreso
        setMinimum(0);
        setMaximum(100); 
        setStringPainted(true); 
        setOpaque(false);
        setBorderPainted(false); 
        
        // Borde recto (sin redondeo)
        setBorder(new LineBorder(Color.BLACK, 1));  // Borde recto de 1 píxel
        setUI(new BasicProgressBarUI());  // Utiliza una UI básica sin bordes redondeados
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof Integer) {
            int progreso = (Integer) value;
            setValue(progreso); 
        }
        // Hacer que el fondo sea transparente
        setBackground(table.getBackground());

        
        return this;
    }
}
    
    private void ajustarAnchoColumnas(JTable tabla) {
        
        for (int i = 0; i < tabla.getColumnModel().getColumnCount(); i++) {
        int width = 0; // Ancho inicial
        
        // Calcular el ancho necesario basado en las celdas
        for (int j = 0; j < tabla.getRowCount(); j++) {
            Object value = tabla.getValueAt(j, i);
            if (value != null) {
                width = Math.max(width, value.toString().length());
            }
        }
            // Ajustar el ancho de la columna
            tabla.getColumnModel().getColumn(i).setPreferredWidth(width * 10); // Ajustar el multiplicador según sea necesario
            tabla.getColumnModel().getColumn(5).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
        }
    }   
    
    private void centrarColumnas(JTable tabla, int[] columnas) {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int col : columnas) {
            tabla.getColumnModel().getColumn(col).setCellRenderer(renderer);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarTxt;
    private javax.swing.JSlider SliderProg;
    private javax.swing.JTextField TxtBeneficiario;
    private javax.swing.JTextField TxtServicio;
    private javax.swing.JButton btnBorrarAsig;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnTheme;
    private javax.swing.JLabel irAtrasBen;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaImpacto;
    private javax.swing.JTextField txtProgreso;
    // End of variables declaration//GEN-END:variables
}
