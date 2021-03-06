/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sony
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdAutomatico, cmdOperaciones};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

        txtFilas.setEditable(true);
        txtColumnas.setEditable(true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFilas = new javax.swing.JTextField();
        txtColumnas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        cmdOperaciones = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        cmbOperaciones = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 11))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel2.setText("No. de Filas: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel3.setText("No. de Columnas:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFilasKeyTyped(evt);
            }
        });
        jPanel2.add(txtFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 50, 30));

        txtColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColumnasKeyTyped(evt);
            }
        });
        jPanel2.add(txtColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 50, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, 110));

        jLabel1.setFont(new java.awt.Font("Vani", 3, 24)); // NOI18N
        jLabel1.setText("Operaciones De Matrices");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 320, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 11))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, -1));

        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 100, -1));

        cmdAutomatico.setText("Automatico");
        cmdAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 100, -1));

        cmdOperaciones.setText("Operaciones");
        cmdOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionesActionPerformed(evt);
            }
        });
        jPanel3.add(cmdOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 100, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 100, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 630, 80));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 370, 290));

        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Letra B", "Letra K", "Letra M", "Letra W", "Letra Q", "Letra J", "Letra G", "Letra R", "Figura 1", "Figura 2", "Figura 3", "Figura 4" }));
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 140, -1));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 370, 290));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 940, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilasKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtFilasKeyTyped

    private void txtColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColumnasKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtColumnasKeyTyped

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        if (txtFilas.getText().isEmpty()) {
            getToolkit().beep();
            Helper.mensaje(this, "Digite Numero de Filas", 3);
            txtFilas.requestFocusInWindow();
        } else if (txtColumnas.getText().isEmpty()) {
            getToolkit().beep();
            Helper.mensaje(this, "Digite Numero de Columnas", 3);
            txtColumnas.requestFocusInWindow();
        } else {
            int filas, columnas;
            DefaultTableModel t1, t2;

            filas = Integer.parseInt((txtFilas).getText());
            columnas = Integer.parseInt((txtColumnas).getText());

            if (filas == 0) {
                getToolkit().beep();
                Helper.mensaje(this, "El Numero de Filas No puede ser cero(0)", 3);
                txtFilas.requestFocusInWindow();
                txtFilas.selectAll();
            } else if (columnas == 0) {
                getToolkit().beep();
                Helper.mensaje(this, "El Numero de Columnas No puede ser cero(0)", 3);
                txtColumnas.requestFocusInWindow();
                txtColumnas.selectAll();
            } else if (filas == 1) {
                getToolkit().beep();
                Helper.mensaje(this, "El Numero de Filas No puede ser uno(1)", 3);
                txtFilas.requestFocusInWindow();
                txtFilas.selectAll();
            } else if (columnas == 1) {
                getToolkit().beep();
                Helper.mensaje(this, "El Numero de Columnas No puede ser uno(1)", 3);
                txtColumnas.requestFocusInWindow();
                txtColumnas.selectAll();
            } else if (filas > 15) {
                getToolkit().beep();
                Helper.mensaje(this, "El Numero de Filas No puede ser mayor a 15", 3);
                txtFilas.requestFocusInWindow();
                txtFilas.selectAll();
            } else if (columnas > 15) {
                getToolkit().beep();
                Helper.mensaje(this, "El Numero de Columnas No puede ser mayor a 15", 3);
                txtColumnas.requestFocusInWindow();
                txtColumnas.selectAll();
            } else {
                t1 = (DefaultTableModel) tblTablaInicial.getModel();
                t2 = (DefaultTableModel) tblTablaResultado.getModel();

                t1.setRowCount(filas);
                t1.setColumnCount(columnas);

                t2.setRowCount(filas);
                t2.setColumnCount(columnas);

                JButton botonesH[] = {cmdManual, cmdAutomatico, cmdLimpiar};
                JButton botonesD[] = {cmdCrear, cmdOperaciones};

                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);
                txtFilas.setEditable(false);
                txtColumnas.setEditable(false);

            }
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
        int filas, columnas, n;

        int sw, res;

        columnas = tblTablaInicial.getColumnCount();
        filas = tblTablaResultado.getRowCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elemento el la posicion [" + i + "]" + "[" + j + "]").trim());
                        tblTablaInicial.setValueAt(n, i, j);

                    } catch (NumberFormatException e) {
                        getToolkit().beep();
                        Helper.mensaje(this, "Digite un Numero Valido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "Seguro que deseas salir", "Salir", JOptionPane.YES_OPTION);
                        if (res == 0) {
                            sw = 1;
                            i = filas;
                            j = columnas;

                            Helper.porDefectoTabla(tblTablaInicial);
                            Helper.porDefectoTabla(tblTablaResultado);
                        } else {
                            sw = 0;
                        }

                    }
                } while (sw == 0);

            }

        }

        JButton botonesH[] = {cmdOperaciones, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdManual, cmdAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        txtFilas.setEditable(false);
        txtColumnas.setEditable(false);
    }//GEN-LAST:event_cmdManualActionPerformed

    private void cmdAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticoActionPerformed
        int filas, columnas, n;

        columnas = tblTablaInicial.getColumnCount();
        filas = tblTablaResultado.getRowCount();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }

        }
        JButton botonesH[] = {cmdOperaciones, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdManual, cmdAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        txtFilas.setEditable(false);
        txtColumnas.setEditable(false);
    }//GEN-LAST:event_cmdAutomaticoActionPerformed

    private void cmdOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionesActionPerformed
        int op, nf, nc;
        op = cmbOperaciones.getSelectedIndex();
        Helper.limpiadoTabla(tblTablaResultado);
        nf = Integer.parseInt((txtFilas).getText());
        nc = Integer.parseInt((txtColumnas).getText());
        switch (op) {

            case 0:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc % 2 == 0) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de columnas debe ser impar", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc < 5 || nf < 5) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser de 5 o mas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else {
                    Helper.letraB(tblTablaInicial, tblTablaResultado);
                }
                break;

            case 1:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc % 2 == 0) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de columnas debe ser impar", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc < 5 || nf < 5) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser de 5 o mas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else {
                    Helper.letraK(tblTablaInicial, tblTablaResultado);
                }
                break;

            case 2:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc % 2 == 0) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser impar", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc < 5 || nf < 5) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser de 5 o mas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else {
                    Helper.letraM(tblTablaInicial, tblTablaResultado);
                }
                break;

            case 3:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc % 2 == 0) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser impar", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc < 5 || nf < 5) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser de 5 o mas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else {
                    Helper.letraW(tblTablaInicial, tblTablaResultado);
                }
                break;

            case 4:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc < 5 || nf < 5) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser de 5 o mas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else {
                    Helper.letraQ(tblTablaInicial, tblTablaResultado);
                }
                break;

            case 5:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc % 2 == 0) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser impar", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else {
                    Helper.letraJ(tblTablaInicial, tblTablaResultado);
                }
                break;

            case 6:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc < 6 || nf < 6) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser de 6 o mas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else {
                    Helper.letraG(tblTablaInicial, tblTablaResultado);
                }
                break;

            case 7:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc < 5 || nf < 5) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser de 5 o mas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else {
                    Helper.letraR(tblTablaInicial, tblTablaResultado);
                }
                break;

            case 8:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc % 2 == 0) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de columnas debe ser impar", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc < 5 || nf < 5) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser de 5 o mas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else {
                    Helper.figura1(tblTablaInicial, tblTablaResultado);
                }
                break;

            case 9:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc % 2 == 0) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de columnas debe ser impar", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc < 5 || nf < 5) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser de 5 o mas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else {
                    Helper.figura2(tblTablaInicial, tblTablaResultado);
                }
                break;

            case 10:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc % 2 != 0 || nf % 2 != 0) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser par", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc < 4 || nf < 4) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser de 4 o mas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else {
                    Helper.figura3(tblTablaInicial, tblTablaResultado);
                }
                break;

            case 11:
                if (nf != nc) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas debe ser igual a No. de columnas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc % 2 == 0) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de columnas debe ser impar", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else if (nc < 5 || nf < 5) {
                    getToolkit().beep();
                    Helper.mensaje(this, "Para realizar esta operacion el No. de filas y columnas debe ser de 5 o mas", 3);
                    Helper.porDefectoTabla(tblTablaInicial);
                    Helper.porDefectoTabla(tblTablaResultado);
                } else {
                    Helper.figura4(tblTablaInicial, tblTablaResultado);
                }
                break;
        }

        JButton botonesH[] = {cmdOperaciones, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdAutomatico, cmdCrear};

        Helper.habilitarBotones(botonesH);

        Helper.deshabilitarBotones(botonesD);

        txtFilas.setEditable(
                false);
        txtColumnas.setEditable(
                false);
    }//GEN-LAST:event_cmdOperacionesActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtFilas.setText("");
        txtColumnas.setText("");
        txtFilas.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);

        Helper.porDefectoTabla(tblTablaInicial);
        Helper.porDefectoTabla(tblTablaResultado);

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdAutomatico, cmdOperaciones};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

        txtFilas.setEditable(true);
        txtColumnas.setEditable(true);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperaciones;
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    // End of variables declaration//GEN-END:variables
}
