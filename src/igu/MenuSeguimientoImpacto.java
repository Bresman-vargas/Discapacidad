package igu;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import logica.Asignacion;
import logica.Servicio;
import logica.Controladora;

public class MenuSeguimientoImpacto extends javax.swing.JFrame {

    Asignacion asignacion;
    Controladora control = new Controladora();
    /**
     * Creates new form MenuSeguimientoImpacto
     */
    public MenuSeguimientoImpacto() {
        initComponents();
        cargarRelacionesEnTabla();
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
        btnEliminar = new javax.swing.JButton();
        BuscarTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtBeneficiario = new javax.swing.JTextField();
        TxtServicio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        BARRA = new javax.swing.JSlider();
        txtProgreso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 10));

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
        tablaImpacto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaImpacto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaImpacto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 980, -1));

        btnEliminar.setText("Borrar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 130, 40));

        BuscarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarTxtActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 260, 30));

        jLabel3.setText("Buscar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 60, 30));

        TxtBeneficiario.setEnabled(false);
        TxtBeneficiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBeneficiarioActionPerformed(evt);
            }
        });
        jPanel1.add(TxtBeneficiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 220, 40));

        TxtServicio.setEnabled(false);
        TxtServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtServicioActionPerformed(evt);
            }
        });
        jPanel1.add(TxtServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 220, 40));

        jLabel4.setText("Beneficiario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel5.setText("Progreso:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 150, 40));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 220, 40));

        BARRA.setMajorTickSpacing(10);
        BARRA.setPaintLabels(true);
        BARRA.setSnapToTicks(true);
        BARRA.setValue(0);
        jPanel1.add(BARRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 360, 50));

        txtProgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProgresoActionPerformed(evt);
            }
        });
        jPanel1.add(txtProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 150, 40));

        jLabel6.setText("Servicio:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    
    
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            // Obtener el índice de la fila seleccionada
        int filaSeleccionadaAsignacion = tablaImpacto.getSelectedRow();
        // Obtener el índice de la fila seleccionada

        if (filaSeleccionadaAsignacion != -1) {
            int filaSeleccionadaModelo = tablaImpacto.convertRowIndexToModel(filaSeleccionadaAsignacion);
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar esta asignación?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    long num_Asignacion = Long.parseLong(String.valueOf(tablaImpacto.getValueAt(filaSeleccionadaModelo, 0)));
                    control.borrarAsig(num_Asignacion);
                    //cargarRelacionesEnTabla(); 
                    mostrarMensaje("Asignación eliminada exitosamente.", "Info", "Éxito");
                } catch (Exception e) {
                    mostrarMensaje("Ocurrió un error al eliminar la asignación: " + e.getMessage(), "Error", "Error");
                }
            } else {
                mostrarMensaje("Eliminación cancelada.", "Info", "Cancelación");
            }
            tablaImpacto.clearSelection();
        } else {
            mostrarMensaje("No se ha seleccionado ninguna fila.", "Error", "Error");
        }           // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void BuscarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarTxtActionPerformed
   
    


    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
    TxtBeneficiario.setText("");
    TxtServicio.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    /*
    private boolean enModoEdicion = false;
    private int filaSeleccionada = -1;  */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void TxtServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtServicioActionPerformed

    private void txtProgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProgresoActionPerformed
        // TODO add your handling code here:
        int valor = BARRA.getValue();
        txtProgreso.setText(String.valueOf(valor));
        
    }//GEN-LAST:event_txtProgresoActionPerformed

    private void TxtBeneficiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBeneficiarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBeneficiarioActionPerformed

    private boolean enModoEdicion = false;
    private int filaSeleccionada = -1;
    
    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        if (!enModoEdicion) {
            // Obtener el índice de la fila seleccionada
            filaSeleccionada = tablaImpacto.getSelectedRow();

            // Verificar si hay una fila seleccionada
            if (filaSeleccionada != -1) {
                long num_Asig = Long.parseLong(String.valueOf(tablaImpacto.getValueAt(filaSeleccionada, 0)));

                this.asignacion = control.traerAsing(num_Asig);

                TxtBeneficiario.setText(asignacion.getBeneficiario().getNombre());
                txtProgreso.setText(Long.toString(asignacion.getProgreso()));
               

                // Cambiar el texto del botón a "Guardar Cambios"
                btnEditar.setText("Guardar Cambios");


                // Deshabilitar los botones "Eliminar" y "Agregar"
                btnEliminar.setEnabled(false);
                btnGuardar.setEnabled(false);

                // Entrar en modo edición
                enModoEdicion = true;
            } else {
                // Mostrar un mensaje si no hay ninguna fila seleccionada
                JOptionPane.showMessageDialog(this, "No row selected. Please select a row to edit.", "Error", JOptionPane.ERROR_MESSAGE);
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
                    JOptionPane.showMessageDialog(this, "Invalid age. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return; // Salir del método para evitar acciones posteriores
                }

                
                if (NumeroProgreso < 0 || NumeroProgreso > 100 ) {
                    JOptionPane.showMessageDialog(this, "Age must be greater than 0.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return; // Salir del método para evitar acciones posteriores
                }

                // Verificar si los campos obligatorios están vacíos
                if (txtProgreso.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "All fields must be filled out.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return; // Salir del método para evitar acciones posteriores
                }
                
                
                try {
                    control.modificarAsig(asignacion, NumeroProgreso);
                } catch (Exception ex) {
                    Logger.getLogger(MenuSeguimientoImpacto.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                cargarRelacionesEnTabla();
                
                // Mostrar un mensaje de éxito
                JOptionPane.showMessageDialog(this, "Record updated successfully.");

                // Limpiar los campos de texto después de guardar los cambios
                TxtBeneficiario.setText("");
                txtProgreso.setText("");
               
                // Cambiar el texto del botón de nuevo a "Editar"
                btnEditar.setText("Editar");

                // Salir del modo edición
                enModoEdicion = false;

                // Reactivar los botones "Eliminar" y "Agregar"
                btnEliminar.setEnabled(true);
                btnGuardar.setEnabled(true);

                // Limpiar la selección de la tabla
                tablaImpacto.clearSelection();
            }
        }
        
    }//GEN-LAST:event_btnEditarMouseClicked

    
    
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
            String beneficiarioNombre = asig.getBeneficiario() != null ? asig.getBeneficiario().getNombre() : "N/A";
            String edadBeneficiario = asig.getBeneficiario() != null ? String.valueOf(asig.getBeneficiario().getEdad()) : "N/A";
            List<String> discapacidades = asig.getBeneficiario() != null ? asig.getBeneficiario().getDiscapacidades() : new ArrayList<>();
            String beneficiarioDiscapacidades = discapacidades.isEmpty() ? "N/A" : String.join(", ", discapacidades);

            String servicioNombre = "N/A";
            if (asig.getServicios() != null && !asig.getServicios().isEmpty()) {
                servicioNombre = asig.getServicios().get(0).getNombre(); // Mostrar solo el primer servicio
            }

            String ProgresoAsignacion = String.valueOf(asig.getProgreso());

            Object[] objeto = {asig.getId(), beneficiarioNombre, beneficiarioDiscapacidades, edadBeneficiario, servicioNombre, ProgresoAsignacion};
            modeloTabla.addRow(objeto);
        }
    }

    tablaImpacto.setModel(modeloTabla);
    tablaImpacto.getTableHeader().setReorderingAllowed(false);
    tablaImpacto.getTableHeader().setResizingAllowed(false);

    ajustarAnchoColumnas(tablaImpacto);
    centrarColumnas(tablaImpacto, new int[]{0, 3, 5});

    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    tablaImpacto.setRowSorter(sorter);

    // Filtrado de texto
    BuscarTxt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyReleased(KeyEvent e) {
            String text = BuscarTxt.getText();
            if (text.trim().length() == 0) {
                sorter.setRowFilter(null);
                btnEliminar.setEnabled(true);
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                btnEliminar.setEnabled(false);
            }
        }
    });

    // Opción de limpiar el campo manualmente
    BuscarTxt.addFocusListener(new FocusAdapter() {
        @Override
        public void focusLost(FocusEvent e) {
            // Comportamiento opcional para limpiar solo si tiene sentido hacerlo
            if (!BuscarTxt.getText().isEmpty()) {
                BuscarTxt.setText(""); // Limpiar el campo de texto
                sorter.setRowFilter(null); // Quitar el filtro
                btnEliminar.setEnabled(true);
            }
        }
    });

    modeloTabla.fireTableDataChanged(); // Forzar el refresco de la tabla
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
    private javax.swing.JSlider BARRA;
    private javax.swing.JTextField BuscarTxt;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField TxtBeneficiario;
    private javax.swing.JTextField TxtServicio;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel irAtrasBen;
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
