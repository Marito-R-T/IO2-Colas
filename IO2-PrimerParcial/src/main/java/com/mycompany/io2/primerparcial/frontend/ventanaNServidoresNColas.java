/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.io2.primerparcial.frontend;

import com.mycompany.io2.primerparcial.backend.NServidoresNColas;

/**
 *
 * @author marito
 */
public class ventanaNServidoresNColas extends javax.swing.JDialog {

    /**
     * Creates new form prueba
     */
    public ventanaNServidoresNColas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        lblLamda = new javax.swing.JLabel();
        lblServicio = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblServidores = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblLamda2 = new javax.swing.JLabel();
        lblServicio1 = new javax.swing.JLabel();
        lblColas = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lblTiempoServicio = new javax.swing.JLabel();
        txtTiempoServicio = new javax.swing.JTextField();
        lblUPromedio = new javax.swing.JLabel();
        txtUPromedio = new javax.swing.JTextField();
        lblFactorU = new javax.swing.JLabel();
        txtFactorU = new javax.swing.JTextField();
        lblP0 = new javax.swing.JLabel();
        txtP0 = new javax.swing.JTextField();
        lblP = new javax.swing.JLabel();
        txtP = new javax.swing.JTextField();
        lblLQ = new javax.swing.JLabel();
        txtLq = new javax.swing.JTextField();
        lblLS = new javax.swing.JLabel();
        txtLS = new javax.swing.JTextField();
        lblWq = new javax.swing.JLabel();
        lblWs = new javax.swing.JLabel();
        txtWq = new javax.swing.JTextField();
        txtWs = new javax.swing.JTextField();
        txtLamda = new javax.swing.JFormattedTextField();
        txtMiu = new javax.swing.JFormattedTextField();
        txtColas = new javax.swing.JFormattedTextField();
        lblNumeroClientes = new javax.swing.JLabel();
        txtNumeroClientes = new javax.swing.JFormattedTextField();
        lblPn = new javax.swing.JLabel();
        txtPn = new javax.swing.JTextField();
        lblNumeroMax = new javax.swing.JLabel();
        txtNumeroMaximo = new javax.swing.JFormattedTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblOcupado = new javax.swing.JLabel();
        txtOcupados = new javax.swing.JTextField();
        lblOcupado1 = new javax.swing.JLabel();
        txtOciosos = new javax.swing.JTextField();
        lblProbabilidad = new javax.swing.JLabel();
        lblSOcupados = new javax.swing.JLabel();
        txtSOcupados = new javax.swing.JTextField();
        lblXservidores = new javax.swing.JLabel();
        txtXServidores = new javax.swing.JFormattedTextField();
        lblP0ocupado = new javax.swing.JLabel();
        txtP0ocupado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(965, 184));
        setResizable(false);
        setSize(new java.awt.Dimension(965, 184));

        pnlFondo.setMaximumSize(new java.awt.Dimension(953, 172));
        pnlFondo.setMinimumSize(new java.awt.Dimension(953, 172));

        lblLamda.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblLamda.setText("λ = (tasa de llegadas)");

        lblServicio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblServicio.setText("μ = (tasa de servicio)");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblServidores.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblServidores.setText("s = (Servidor)");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblLamda2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblLamda2.setText("λ = (tasa de llegadas)");

        lblServicio1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblServicio1.setText("μ = (tasa de servicio)");

        lblColas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblColas.setText("N = (Colas)");

        btnCalcular.setText("calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblTiempoServicio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblTiempoServicio.setText("Tiempo de Servicio");

        txtTiempoServicio.setEditable(false);

        lblUPromedio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblUPromedio.setText("Utilización promedio");

        txtUPromedio.setEditable(false);

        lblFactorU.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblFactorU.setText("Factor Utilización");

        txtFactorU.setEditable(false);

        lblP0.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblP0.setText("P0");

        txtP0.setEditable(false);

        lblP.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblP.setText("P");

        txtP.setEditable(false);

        lblLQ.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblLQ.setText("Lq");

        txtLq.setEditable(false);

        lblLS.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblLS.setText("Ls");

        txtLS.setEditable(false);

        lblWq.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblWq.setText("Wq");

        lblWs.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblWs.setText("Ws");

        txtWq.setEditable(false);

        txtWs.setEditable(false);

        txtLamda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##0.00000"))));

        txtMiu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##0.000000000000"))));

        txtColas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));

        lblNumeroClientes.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNumeroClientes.setText("n = (numero Clientes)*");

        txtNumeroClientes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));

        lblPn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPn.setText("Pn");

        txtPn.setEditable(false);

        lblNumeroMax.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNumeroMax.setText("Maxima Capacidad*");

        txtNumeroMaximo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblOcupado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblOcupado.setText("Ocupado:");

        txtOcupados.setEditable(false);

        lblOcupado1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblOcupado1.setText("Ociosos:");

        txtOciosos.setEditable(false);

        lblProbabilidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblProbabilidad.setText("Probabilidad de x ");

        lblSOcupados.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblSOcupados.setText("servidores esten ociosos:");

        txtSOcupados.setEditable(false);

        lblXservidores.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblXservidores.setText("X servidores ocupados*");

        txtXServidores.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));

        lblP0ocupado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblP0ocupado.setText("P0(ocupados)");

        txtP0ocupado.setEditable(false);

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblXservidores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtXServidores))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlFondoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFondoLayout.createSequentialGroup()
                                        .addComponent(lblLamda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblServicio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblServidores))
                                    .addGroup(pnlFondoLayout.createSequentialGroup()
                                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblLamda2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                            .addComponent(lblServicio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblColas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLamda, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMiu, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtColas, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlFondoLayout.createSequentialGroup()
                                        .addComponent(lblNumeroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNumeroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlFondoLayout.createSequentialGroup()
                                        .addComponent(lblNumeroMax, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNumeroMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator4))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(lblWs, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtWs, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(lblWq, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtWq))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(lblLS, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtLS))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(lblLQ, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLq))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                        .addComponent(lblPn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtPn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                        .addComponent(lblP, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtP))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUPromedio)
                            .addComponent(lblTiempoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFactorU, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblP0, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFactorU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(txtUPromedio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTiempoServicio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtP0))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOcupados)
                    .addComponent(txtOciosos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOcupado1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProbabilidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSOcupados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtSOcupados)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblP0ocupado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtP0ocupado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFondoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblServidores)
                                    .addComponent(lblLamda)
                                    .addComponent(lblServicio)
                                    .addComponent(jSeparator2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLamda2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLamda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblServicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMiu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroMax, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblXservidores, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtXServidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator3)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFondoLayout.createSequentialGroup()
                                .addComponent(lblOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOcupados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblOcupado1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOciosos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblProbabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSOcupados, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSOcupados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblP0ocupado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtP0ocupado)
                                .addGap(40, 40, 40))
                            .addGroup(pnlFondoLayout.createSequentialGroup()
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTiempoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTiempoServicio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFactorU, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFactorU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblP0, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtP0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLQ, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLS, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblWq, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblWs, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator5))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        NServidoresNColas servidor = new NServidoresNColas(Double.parseDouble(this.txtMiu.getText()), 
                Double.parseDouble(this.txtLamda.getText()), Integer.parseInt(this.txtColas.getText()));
        this.txtTiempoServicio.setText(String.valueOf(servidor.obtenerTiempoServicio()));
        this.txtUPromedio.setText(String.valueOf(servidor.obtenerUtilizacionPromedio()));
        this.txtFactorU.setText(String.valueOf(servidor.obtenerFactorUtilizacion()));
        this.txtP0.setText(String.valueOf(servidor.obtenerP0()));
        this.txtP.setText(String.valueOf(servidor.obtenerP()));
        this.txtLq.setText(String.valueOf(servidor.obtenerLq()));
        this.txtLS.setText(String.valueOf(servidor.obtenerLs()));
        this.txtWq.setText(String.valueOf(servidor.obtenerWq()));
        this.txtWs.setText(String.valueOf(servidor.obtenerWs()));
        if(this.txtNumeroClientes.getText() != null && !this.txtNumeroClientes.getText().equals("")){
            this.txtPn.setText(String.valueOf(servidor.obtenerPn(Integer.parseInt(this.txtNumeroClientes.getText()))));
        }
        if(this.txtNumeroMaximo.getText() != null && !this.txtNumeroMaximo.getText().equals("")) {
            int max = Integer.parseInt(this.txtNumeroMaximo.getText());
            this.txtOcupados.setText(String.valueOf(servidor.obtenerOcupados(max)));
            this.txtOciosos.setText(String.valueOf(servidor.obtenerOciosos(max)));
            this.txtP0ocupado.setText(String.valueOf(servidor.obtenerP0ocupados(max)));
            if(this.txtXServidores.getText()!=null && !this.txtXServidores.getText().equals("")) {
                int x = Integer.parseInt(this.txtXServidores.getText());
                this.txtSOcupados.setText(String.valueOf(servidor.obtenerPXosiosos(max, x)));
            }
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblColas;
    private javax.swing.JLabel lblFactorU;
    private javax.swing.JLabel lblLQ;
    private javax.swing.JLabel lblLS;
    private javax.swing.JLabel lblLamda;
    private javax.swing.JLabel lblLamda2;
    private javax.swing.JLabel lblNumeroClientes;
    private javax.swing.JLabel lblNumeroMax;
    private javax.swing.JLabel lblOcupado;
    private javax.swing.JLabel lblOcupado1;
    private javax.swing.JLabel lblP;
    private javax.swing.JLabel lblP0;
    private javax.swing.JLabel lblP0ocupado;
    private javax.swing.JLabel lblPn;
    private javax.swing.JLabel lblProbabilidad;
    private javax.swing.JLabel lblSOcupados;
    private javax.swing.JLabel lblServicio;
    private javax.swing.JLabel lblServicio1;
    private javax.swing.JLabel lblServidores;
    private javax.swing.JLabel lblTiempoServicio;
    private javax.swing.JLabel lblUPromedio;
    private javax.swing.JLabel lblWq;
    private javax.swing.JLabel lblWs;
    private javax.swing.JLabel lblXservidores;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JFormattedTextField txtColas;
    private javax.swing.JTextField txtFactorU;
    private javax.swing.JTextField txtLS;
    private javax.swing.JFormattedTextField txtLamda;
    private javax.swing.JTextField txtLq;
    private javax.swing.JFormattedTextField txtMiu;
    private javax.swing.JFormattedTextField txtNumeroClientes;
    private javax.swing.JFormattedTextField txtNumeroMaximo;
    private javax.swing.JTextField txtOciosos;
    private javax.swing.JTextField txtOcupados;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextField txtP0;
    private javax.swing.JTextField txtP0ocupado;
    private javax.swing.JTextField txtPn;
    private javax.swing.JTextField txtSOcupados;
    private javax.swing.JTextField txtTiempoServicio;
    private javax.swing.JTextField txtUPromedio;
    private javax.swing.JTextField txtWq;
    private javax.swing.JTextField txtWs;
    private javax.swing.JFormattedTextField txtXServidores;
    // End of variables declaration//GEN-END:variables
}
