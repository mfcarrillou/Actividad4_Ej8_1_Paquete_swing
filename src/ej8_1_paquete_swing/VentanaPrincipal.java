package ej8_1_paquete_swing;

import javax.swing.*;

public class VentanaPrincipal extends javax.swing.JFrame {
    private ListaPersonas lista = new ListaPersonas();
    private DefaultListModel modelo = new DefaultListModel();

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalframePersonas = new javax.swing.JInternalFrame();
        panelPersonas = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoApellidos = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();
        añadir = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        borrarLista = new javax.swing.JButton();
        scrollLista = new javax.swing.JScrollPane();
        listaPersonas = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        internalframePersonas.setClosable(true);
        internalframePersonas.setIconifiable(true);
        internalframePersonas.setTitle("Personas");
        internalframePersonas.setVisible(true);

        nombre.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        nombre.setText("Nombre:");

        apellidos.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        apellidos.setText("Apellidos:");

        telefono.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        telefono.setText("Teléfono:");

        direccion.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        direccion.setText("Dirección:");

        añadir.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        añadir.setForeground(new java.awt.Color(0, 102, 0));
        añadir.setText("Añadir");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        eliminar.setForeground(new java.awt.Color(0, 0, 153));
        eliminar.setText("Eliminar");
        eliminar.setToolTipText("");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        borrarLista.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        borrarLista.setForeground(new java.awt.Color(153, 0, 0));
        borrarLista.setText("Borrar lista");
        borrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarListaActionPerformed(evt);
            }
        });

        scrollLista.setViewportView(listaPersonas);

        listaPersonas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollLista.setViewportView(listaPersonas);

        javax.swing.GroupLayout panelPersonasLayout = new javax.swing.GroupLayout(panelPersonas);
        panelPersonas.setLayout(panelPersonasLayout);
        panelPersonasLayout.setHorizontalGroup(
            panelPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonasLayout.createSequentialGroup()
                .addGroup(panelPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPersonasLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(añadir))
                    .addGroup(panelPersonasLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borrarLista))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPersonasLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(scrollLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPersonasLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(panelPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        panelPersonasLayout.setVerticalGroup(
            panelPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(nombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(apellidos)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(telefono)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(direccion)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(añadir)
                .addGap(6, 6, 6)
                .addComponent(scrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(panelPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar)
                    .addComponent(borrarLista))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout internalframePersonasLayout = new javax.swing.GroupLayout(internalframePersonas.getContentPane());
        internalframePersonas.getContentPane().setLayout(internalframePersonasLayout);
        internalframePersonasLayout.setHorizontalGroup(
            internalframePersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        internalframePersonasLayout.setVerticalGroup(
            internalframePersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalframePersonas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalframePersonas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        String nom = campoNombre.getText();
        String apllds = campoApellidos.getText();
        String tlfn = campoTelefono.getText();
        String drccn = campoDireccion.getText();
        Persona persona = new Persona(nom,apllds,tlfn,drccn);
        lista.añadirPersona(persona);
        String elemento = campoNombre.getText() + " - " + campoApellidos.getText() + " - " + campoTelefono.getText() + " - " + campoDireccion. getText();
        modelo.addElement(elemento);
        listaPersonas.setModel(modelo);
        campoNombre.setText("");
        campoApellidos.setText("");
        campoTelefono.setText("");
        campoDireccion.setText("");
    }//GEN-LAST:event_añadirActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int indice = listaPersonas.getSelectedIndex();
        if (indice >= 0) {
            modelo.removeElementAt(indice);
            lista.eliminarPersona(indice);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void borrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarListaActionPerformed
        lista.borrarLista();
        modelo.clear();
    }//GEN-LAST:event_borrarListaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos;
    private javax.swing.JButton añadir;
    private javax.swing.JButton borrarLista;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel direccion;
    private javax.swing.JButton eliminar;
    private javax.swing.JInternalFrame internalframePersonas;
    private javax.swing.JList listaPersonas;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelPersonas;
    private javax.swing.JScrollPane scrollLista;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
