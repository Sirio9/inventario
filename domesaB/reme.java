
package domesab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author USUARIO
 */
public class reme extends javax.swing.JFrame {

     DefaultTableModel mo;
    DefaultTableModel dt;
    
    public reme() throws SQLException, ParseException {
        initComponents();
        
        ComTipoP.addItem("Mezanina");
        ComTipoP.addItem("Pequeño");
        ComTipoP.addItem("Cesta 1");
        ComTipoP.addItem("Cesta 2");
        ComTipoP.addItem("Cesta 3");
        ComTipoP.addItem("Cesta 4");
        
        comPaqueB.addItem("Mezanina");
        comPaqueB.addItem("Pequeño");
        comPaqueB.addItem("Cesta 1");
        comPaqueB.addItem("Cesta 2");
        comPaqueB.addItem("Cesta 3");
        comPaqueB.addItem("Cesta 4");
        
          fecha();
        
         dt  = new DefaultTableModel();
         
         dt.addColumn("Fecha");
         dt.addColumn("Tipo_Paquete");
         dt.addColumn("NoGuia");
        this.tabla.setModel(dt);
         inhabilitar();
           CTab(""); 
    }
    
  
    
    
    void fecha(){
        
        SimpleDateFormat ef = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat df = DateFormat.getDateInstance();
        Date NewFormat = new Date();
        fechacho.setDate(NewFormat);
     
       txtfeB.setText(ef.format(NewFormat));
        
       
}
    
     
      String id_actualizar ="";
     void BuscarRemesasEditar(String id) throws SQLException
         {
        
         
           String sSQL="";
          String fecha ="",TipoPaquete="",NoGuia="";
          
          Conexion d = new Conexion();
          Connection cn = d.conec();
          
          
           sSQL="SELECT id_remesas,Fecha,Tipo_De_Paquete,No_Guia FROM ngb WHERE id_remesas="+id;      
             
            try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while (rs.next()){
               
                fecha=rs.getString("Fecha");
                TipoPaquete=rs.getString("Tipo_De_Paquete");
                NoGuia=rs.getString("No_Guia");
               
              
             
              
            }
             txtFechag.setText(fecha);
             ComTipoP.setSelectedItem(TipoPaquete);
             txtNoGuia.setText(NoGuia);
             id_actualizar=id;
              
              
              
            TBmos.setModel(mo);
        } catch (SQLException e) {
           
        }
     }
  
    
    void habilitar(){
        txtFechag.setEnabled(true);
        ComTipoP.setEnabled(true);
        txtNoGuia.setEnabled(true);
       
        
    }  void inhabilitar(){
     txtFechag.setEnabled(false);
     ComTipoP.setEnabled(false);
     txtNoGuia.setEnabled(false);
        
        
    }
    
    
    void CTab(String valor) throws SQLException{
         Conexion d = new Conexion();
         Connection cn = d.conec();

          String[] titulos= {"id_remesas","Fecha","Tipo_De_Paquete","No_Guia"};
          String []datos = new String [4];
          mo = new DefaultTableModel(null,titulos);
          String sSQL="";
          
   
          
            sSQL= "SELECT * FROM ngb WHERE CONCAT(Fecha,' ',Tipo_De_Paquete,' ',No_Guia,' ') LIKE '%"+valor+"%'";      
             
            try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()){
                datos[0]=rs.getString("id_remesas");
                datos[1]=rs.getString("Fecha");
                datos[2]=rs.getString("Tipo_De_Paquete");
                datos[3]=rs.getString("No_Guia");
                
              
                mo.addRow(datos);
            }
            TBmos.setModel(mo);
        } catch (SQLException e) {
           
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtfeB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comPaqueB = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        NoGuiaB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btInsertar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btelitodo = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        FechaD = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtFechag = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ComTipoP = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtNoGuia = new javax.swing.JTextField();
        btnuevo = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBmos = new javax.swing.JTable();
        txtbusca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BTguardar = new javax.swing.JButton();
        btmoA = new javax.swing.JButton();
        btReporte = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        fechacho = new com.toedter.calendar.JDateChooser();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(java.awt.Color.green);

        jLabel2.setText("Fecha");

        txtfeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfeBActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo de Paquete");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla);

        jLabel6.setText("NoGuia");

        btInsertar.setText("Insertar");
        btInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertarActionPerformed(evt);
            }
        });

        bteliminar.setText("Eliminar");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });

        btelitodo.setText("Eliminar todo");
        btelitodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btelitodoActionPerformed(evt);
            }
        });

        btmodificar.setText("Modificar");
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoGuiaB, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comPaqueB, 0, 96, Short.MAX_VALUE)
                                    .addComponent(txtfeB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FechaD, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btInsertar)
                            .addComponent(btmodificar))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(bteliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btelitodo))
                            .addComponent(btGuardar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FechaD, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtfeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(comPaqueB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoGuiaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btInsertar)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bteliminar)
                                .addComponent(btelitodo))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btmodificar)
                    .addComponent(btGuardar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Insertar Remesas", jPanel3);

        jLabel7.setText("Fecha");

        txtFechag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechagActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo de Paquete");

        ComTipoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComTipoPActionPerformed(evt);
            }
        });

        jLabel9.setText("Noguia");

        txtNoGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoGuiaActionPerformed(evt);
            }
        });

        btnuevo.setText("Nuevo");
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });

        btcancelar.setText("Cancelar");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        TBmos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TBmos.setToolTipText("");
        jScrollPane1.setViewportView(TBmos);

        txtbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscaActionPerformed(evt);
            }
        });
        txtbusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscaKeyReleased(evt);
            }
        });

        jLabel1.setText("Ingrese su dato a buscar:");

        BTguardar.setText("Guardar");
        BTguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTguardarActionPerformed(evt);
            }
        });

        btmoA.setText("Editar");
        btmoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmoAActionPerformed(evt);
            }
        });

        btReporte.setText("Reporte");
        btReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechag, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComTipoP, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btcancelar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btReporte)
                            .addComponent(BTguardar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btmoA)
                        .addGap(18, 18, 18))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFechag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btmoA))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ComTipoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNoGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnuevo)
                            .addComponent(btcancelar)
                            .addComponent(BTguardar))
                        .addGap(18, 18, 18)
                        .addComponent(btReporte)
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(24, 24, 24))))
        );

        jTabbedPane5.addTab("Buscar y Editar", jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Configuracion de Fecha")));

        fechacho.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fechacho, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fechacho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(472, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Configuracion", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertarActionPerformed
        
        SimpleDateFormat ef = new SimpleDateFormat("yyyy-MM-dd");
       
        Date NewFormat = new Date();
        fechacho.setDate(NewFormat);
     
      
        
        
        String[]Datos = new String[3];
      
        Datos[0] = txtfeB.getText();
        txtfeB.setText(null);
         txtfeB.setText(ef.format(NewFormat));
 
        
        
        Datos[1] =  comPaqueB.getSelectedItem().toString();
        comPaqueB.setToolTipText(null);

        Datos[2] =  NoGuiaB.getText();
        NoGuiaB.setText(null);
        dt.addRow(Datos);
      
        
    }//GEN-LAST:event_btInsertarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
      
      
        
        int filaseleccionada = tabla.getSelectedRow();
        
        
        if(filaseleccionada>=0){
            dt.removeRow(filaseleccionada);

        }
        else{
            JOptionPane.showMessageDialog(null,"tabla vacia o no se selecciono ningun dato");

        }

    }//GEN-LAST:event_bteliminarActionPerformed

    private void btelitodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btelitodoActionPerformed

        int todalatabla = tabla.getRowCount();
        for(int i=todalatabla-1; 1>=0 ;i--){

            dt.removeRow(i);
        }

    }//GEN-LAST:event_btelitodoActionPerformed
      String accion = "Insertar";
    private void txtNoGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoGuiaActionPerformed
        txtNoGuia.transferFocus();
       
    }//GEN-LAST:event_txtNoGuiaActionPerformed
     
    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        habilitar();
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        inhabilitar();
    }//GEN-LAST:event_btcancelarActionPerformed

    private void txtbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscaActionPerformed

    }//GEN-LAST:event_txtbuscaActionPerformed

    private void txtbuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscaKeyReleased
        String valor = txtbusca.getText();
        try {
            CTab(valor);

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_txtbuscaKeyReleased

    private void txtFechagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechagActionPerformed
        txtFechag.transferFocus();
    }//GEN-LAST:event_txtFechagActionPerformed

    private void BTguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTguardarActionPerformed
        String Fecha,TipoDePaquete,NoGuia;
        String sSQL= "";
        String mensaje="";

        Fecha=txtFechag.getText();
        TipoDePaquete=ComTipoP.getSelectedItem().toString();
        NoGuia=txtNoGuia.getText();

        if(accion.equals("Insertar")){
            sSQL="INSERT INTO ngb(Fecha,Tipo_De_Paquete,No_Guia) VALUES(?,?,?)";

            mensaje="los datos se han insertado con exito";

        }else if(accion.equals("Editar")){
            sSQL="UPDATE ngb SET Fecha = ?,Tipo_De_Paquete= ?,No_Guia= ? WHERE id_remesas="+id_actualizar;

            mensaje="los datos se han Editado de forma satisfactoria";
        }
        try {
            Conexion d = new Conexion();
            Connection cn = d.conec();
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1,Fecha);
            pst.setString(2,TipoDePaquete);
            pst.setString(3,NoGuia);

            int n = pst.executeUpdate();

            if (n>0){
                JOptionPane.showMessageDialog(null,mensaje);
            }

        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_BTguardarActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        
        int filasel;
   
       try{
            filasel = tabla.getSelectedRow();
           
       if(filasel == -1){
          JOptionPane.showMessageDialog(null,"No se selecciono ninguna fila");
      }else{
          accion ="Editar";
          dt= ( DefaultTableModel)tabla.getModel();
        
     
        }
       }catch(Exception e){
                
                }
       
    
    }//GEN-LAST:event_btmodificarActionPerformed

    private void txtfeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfeBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfeBActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
  
       
       
        try{
            
            for(int i=0; i<tabla.getRowCount();i++){   
                
                PreparedStatement pst = cn.prepareStatement("INSERT INTO ngb(Fecha,Tipo_De_Paquete,No_Guia) VALUES(?,?,?)");
                pst.setString(1,tabla.getValueAt(i,0).toString());
                pst.setString(2,tabla.getValueAt(i,1).toString());
                pst.setString(3,tabla.getValueAt(i,2).toString());
                pst.executeUpdate();
              
                
            }
            
        }
        catch(SQLException ex){
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btmoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmoAActionPerformed
       int filasel;
       String id;
          habilitar();
          
       try{
           filasel =TBmos.getSelectedRow();
           
           
           if(filasel==-1){
               JOptionPane.showMessageDialog(null,"No se ha selecciono ninguna fila");
           }else{
               accion="Editar";
               mo = (DefaultTableModel)TBmos.getModel();
               id = (String)mo.getValueAt(filasel, 0);
               BuscarRemesasEditar(id);
               
               
           }
           
       }catch(Exception ex){
           
       }
       
        
    }//GEN-LAST:event_btmoAActionPerformed

    private void ComTipoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComTipoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComTipoPActionPerformed

    private void btReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReporteActionPerformed
     
        
         try {
             JasperReport reporte = JasperCompileManager.compileReport("report1.jrxml");
             JasperPrint  print  = JasperFillManager.fillReport(reporte,null,this.cn);
             JasperViewer Viewer = new JasperViewer(print,false);
             Viewer.setVisible(true);
             
             
         } catch (JRException ex) {
             Logger.getLogger(reme.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    }//GEN-LAST:event_btReporteActionPerformed

   
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
            java.util.logging.Logger.getLogger(reme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new reme().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(reme.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(reme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTguardar;
    private javax.swing.JComboBox<String> ComTipoP;
    private javax.swing.JLabel FechaD;
    private javax.swing.JTextField NoGuiaB;
    private javax.swing.JTable TBmos;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btInsertar;
    private javax.swing.JButton btReporte;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btelitodo;
    private javax.swing.JButton btmoA;
    private javax.swing.JButton btmodificar;
    private javax.swing.JButton btnuevo;
    private javax.swing.JComboBox<String> comPaqueB;
    private com.toedter.calendar.JDateChooser fechacho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtFechag;
    private javax.swing.JTextField txtNoGuia;
    private javax.swing.JTextField txtbusca;
    private javax.swing.JTextField txtfeB;
    // End of variables declaration//GEN-END:variables
 Conexion d = new Conexion();
 Connection cn = d.conec();

}
