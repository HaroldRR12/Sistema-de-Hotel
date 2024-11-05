/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sistema.de.hotel.pantallas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import sistema.de.hotel.controllers.TipoDeHabitacionesController;
import javax.swing.table.DefaultTableModel;
import sistema.de.hotel.TipoDeHabitaciones;

/**
 *
 * @author harold
 */
public class RegistrarTipoDeHabitacion extends javax.swing.JPanel {

    DefaultTableModel tm = new DefaultTableModel();
    TipoDeHabitacionesController tHabitacionController = new TipoDeHabitacionesController();
    
    
    public RegistrarTipoDeHabitacion() {
        initComponents();
        jTableTipos.setModel(new javax.swing.table.DefaultTableModel(tHabitacionController.refrescarTabla()
,
    new String [] {
       "ID", "Nombre", "Precio"
    }
));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrecioTipoHabitacion = new javax.swing.JTextField();
        txtNombreTipoDeHabitacion = new javax.swing.JTextField();
        btnCrearTipo = new javax.swing.JButton();
        btnEliminarTipo = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableTipos = new javax.swing.JTable();
        lblError = new javax.swing.JLabel();
        btnActualizarTipo = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE TIPOS DE HABITACION");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Nombre del tipo de habitacion:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Precio del tipo de habitacion");

        btnCrearTipo.setText("Crear");
        btnCrearTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearTipoMouseClicked(evt);
            }
        });

        btnEliminarTipo.setText("Eliminar");
        btnEliminarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTipoActionPerformed(evt);
            }
        });

        jTableTipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableTipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTiposMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableTipos);

        lblError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnActualizarTipo.setText("Actualizar");
        btnActualizarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(btnCrearTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(txtPrecioTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(txtNombreTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEliminarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnActualizarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreTipoDeHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecioTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearTipoMouseClicked
       try {
            // Convertir el precio a int
            int precioTipoHabitacion = Integer.parseInt(txtPrecioTipoHabitacion.getText());
            // Crear el objeto Tipo De Habitaciones con el id único
            String tipoDeHabitacion = txtNombreTipoDeHabitacion.getText();
            //Generar el id
            int id = tHabitacionController.generarNuevoId();
            
            TipoDeHabitaciones tHabitacion = new TipoDeHabitaciones(precioTipoHabitacion, tipoDeHabitacion, id);
            
            // Añadir el objeto al archivo
            tHabitacionController.agregarTipoDeHabitacion(tHabitacion);

            //Añadir objeto a la tablas
            jTableTipos.setModel(new javax.swing.table.DefaultTableModel(tHabitacionController.refrescarTabla()
,

    new String [] {
       "ID", "Nombre", "Precio"
    }
));
            // Limpiar las casillas de texto
            txtNombreTipoDeHabitacion.setText("");
            txtPrecioTipoHabitacion.setText("");

            // Confirmar la acción al usuario
            lblError.setText("Tipo de habitación agregado exitosamente");

        } catch (NumberFormatException e) {
            lblError.setText("El precio debe ser un número válido");//Posible error
        }
    }//GEN-LAST:event_btnCrearTipoMouseClicked

    private void btnEliminarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTipoActionPerformed
        
        int filaSeleccionada = jTableTipos.getSelectedRow();

        if (filaSeleccionada != -1) { //Asegurar la seleccion
            
            DefaultTableModel modelo = (DefaultTableModel) jTableTipos.getModel();
            
            Object cellValue = modelo.getValueAt(jTableTipos.getSelectedRow(), 0);//Obtener el id de la celda
            
            modelo.removeRow(filaSeleccionada); // Eliminar la fila del modelo
            
            if (cellValue instanceof Integer) {
                //Elimina el tipo de habitacion de la tabla y del archivo
                int intValor = (Integer) cellValue;
                tHabitacionController.borrarTipoDeHabitacion(intValor);
                tHabitacionController.refrescarTabla();
                lblError.setText("Tipo de habitacion removido exitosamente");//Mensaje de exito
            }else {
                lblError.setText("Debes seleccionar una fila para eliminar");//Mensaje de error
            }
    }//GEN-LAST:event_btnEliminarTipoActionPerformed

}
    private void btnActualizarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTipoActionPerformed
       int filaSeleccionada = jTableTipos.getSelectedRow();

    //Verificar que la fila si exista
    if (filaSeleccionada != -1) {
        
        if (txtNombreTipoDeHabitacion.getText().length() == 0) {
            lblError.setText("Debes ingresar un nombre");
                                                                            //Error al no haber nada en los espacios
        } else if (txtPrecioTipoHabitacion.getText().length() == 0) {
            lblError.setText("Debes ingresar un precio");
        } else {
            
            int id = (int) jTableTipos.getValueAt(filaSeleccionada, 0);  //Obtener la id del objeto para modificarlo
            
            
            String nuevoNombreTipoDeHabitacion = txtNombreTipoDeHabitacion.getText();
            int nuevoPrecioTipoHabitacion = Integer.parseInt(txtPrecioTipoHabitacion.getText()); //Guardar los nuvos datos
            
            //Nuevo objeto par remplazar
            TipoDeHabitaciones nuevoTipoHabitacion = new TipoDeHabitaciones(id, nuevoNombreTipoDeHabitacion, nuevoPrecioTipoHabitacion);
            
            
            tHabitacionController.actualizarTipoDeHabitacion(id, nuevoTipoHabitacion);//Funcion para actualizar

            //Cambiar los datos en la tabla
            ((DefaultTableModel) jTableTipos.getModel()).setValueAt(nuevoNombreTipoDeHabitacion, filaSeleccionada, 1); 
            ((DefaultTableModel) jTableTipos.getModel()).setValueAt(nuevoPrecioTipoHabitacion, filaSeleccionada, 2); 
            
            lblError.setText("Tipo de habitación actualizado exitosamente");//Mensaje de exito
        }
        }else{
            lblError.setText("Debes seleccionar una fila para actualizar"); //Mensaje de error
    }
    }//GEN-LAST:event_btnActualizarTipoActionPerformed

    private void jTableTiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTiposMouseClicked
        //Facilitar la seleccion en el jTable
        int filaSeleccionada = jTableTipos.getSelectedRow();
        //Verificar que la fila si exista
        if (filaSeleccionada != -1) {
        
            //Convertir los objetos al tipo de dato deseado
            String nombre = (String) jTableTipos.getValueAt(filaSeleccionada, 1); 
            int precio = (Integer) jTableTipos.getValueAt(filaSeleccionada, 2); 
        
        
            txtNombreTipoDeHabitacion.setText(nombre);
            txtPrecioTipoHabitacion.setText(String.valueOf(precio)); //Convertir int a String para el TextField
    }
    }//GEN-LAST:event_jTableTiposMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTipo;
    private javax.swing.JButton btnCrearTipo;
    private javax.swing.JButton btnEliminarTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableTipos;
    private javax.swing.JLabel lblError;
    private javax.swing.JTextField txtNombreTipoDeHabitacion;
    private javax.swing.JTextField txtPrecioTipoHabitacion;
    // End of variables declaration//GEN-END:variables
}
