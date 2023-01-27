
package domesab;






import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;



 

/**
 *

 * @author USUARIO
 */
public class Reme extends javax.swing.JFrame {
     Exportar obj;
     DefaultTableModel mo;
     DefaultTableModel dt;
     


   
    public Reme() throws SQLException, ParseException {
        initComponents();
        mostrartabla();
        
      
     TBmos.setDefaultRenderer(Object.class, new colortabla());
      
     
     comcon.addItem("Optimo");
     comcon.addItem("Dañado");
     comcon.addItem("Evaluación");
     comcon.addItem("Desincorporado");
     
    }
     
   
  

  
    
    void fecha() throws SQLException{
        
       
          SimpleDateFormat ef = new SimpleDateFormat("yyyy-MM-dd");
          Date NewFormat = new Date();       
   
     

}
    void limpiar(){
    
     txtcob.setText("");
        txtdesb.setText("");
        txtserib.setText("");
        txtubib.setText("");
        txtmob.setText("");
        txtrefb.setText("");
        txtresb.setText("");
        txtactab.setText("");
    
    }
    void mostrartabla(){
        String busqueda =txtbusca.getText();
        
         DefaultTableModel modelo = new  DefaultTableModel();
           modelo.addColumn("id");
           modelo.addColumn("codigo");
           modelo.addColumn("descripcion");
           modelo.addColumn("serial");
           modelo.addColumn("ubicacion");
           modelo.addColumn("movilizacion");
           modelo.addColumn("referencia");
           modelo.addColumn("condiciones");
           modelo.addColumn("dep_responsable");
           modelo.addColumn("acta");
        TBmos.setModel(modelo);
        
        String sql = "SELECT * FROM control";
        
        String datos[] = new String[10];
        
        
        Statement st;
         try {
             st = cn.createStatement();
             ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
               datos[0]=rs.getString(1);
               datos[1]=rs.getString(2);
               datos[2]=rs.getString(3);
               datos[3]=rs.getString(4);
               datos[4]=rs.getString(5);
               datos[5]=rs.getString(6);
               datos[6]=rs.getString(7);
               datos[7]=rs.getString(8);
               datos[8]=rs.getString(9);
               datos[9]=rs.getString(10);
               modelo.addRow(datos);
               
             }
             TBmos.setModel(modelo);
         } catch (SQLException ex) {
             Logger.getLogger(Reme.class.getName()).log(Level.SEVERE, null, ex);
         }
   
        
       
    }
     
      String id_actualizar ="";
     void BuscarEditar(String id) throws SQLException
         {
        
         
           String sSQL="";
          String codigo="" ,descripcion="",serial="",ubicacion="",movilizacion="",referencia="",condiciones="",depres="",acta="";
          
          Conexion d = new Conexion();
          Connection cn = d.conec();
          
          
           sSQL="SELECT id-in,codigo,descripcion,serial,ubicacion,movilizacion,referencia,condiciones,dep_responsable,acta FROM control WHERE id-in="+id;      
             
            try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while (rs.next()){
               
               codigo=rs.getString("codigo");
               descripcion=rs.getString("descripcion");
               serial=rs.getString("serial");
               ubicacion=rs.getString("ubicacion");
               movilizacion=rs.getString("movilizacion");
               referencia=rs.getString("referencia");
               condiciones=rs.getString("condiciones");
               depres=rs.getString("dep_responsable");
               acta=rs.getString("acta");
              
             
              
            }
            
            txtcob.setText(codigo);
            txtdesb.setText( descripcion);
            txtserib.setText( serial);
            txtubib.setText(ubicacion);
            txtmob.setText(movilizacion);
            txtrefb.setText(  referencia);
            txtresb.setText(depres);
            txtactab.setText( acta);
                         
           
             id_actualizar=id;
              
              
              
            TBmos.setModel(mo);
        } catch (SQLException e) {
           
        }
     }
  
    
  
    
    void CTab(String valor) throws SQLException{
         Conexion d = new Conexion();
         Connection cn = d.conec();

          String[] titulos= {"id","codigo","descripcion","serial","ubicacion","movilizacion","referencia","condiciones","dep_responsable","acta"};
          String []datos = new String [10];
          mo = new DefaultTableModel(null,titulos);
          String sSQL="";
          
   
          
            sSQL= "SELECT * FROM control WHERE CONCAT(codigo,' ',descripcion,' ',serial,' ',ubicacion,' ',movilizacion,' ',referencia,' ',condiciones,' ',dep_responsable,' ',acta,' ' ) LIKE '%"+valor+"%'";      
             
            try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()){
                datos[0]=rs.getString("id");
                datos[1]=rs.getString("codigo");
                datos[2]=rs.getString("descripcion");
                datos[3]=rs.getString("serial");
                datos[4]=rs.getString("ubicacion");
                datos[5]=rs.getString("movilizacion");
                datos[6]=rs.getString("referencia");
                datos[7]=rs.getString("condiciones");
                datos[8]=rs.getString("dep_responsable");
                datos[9]=rs.getString("acta");
              
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
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtdesb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBmos = new javax.swing.JTable();
        txtbusca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BTguardar = new javax.swing.JButton();
        btmoA = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtserib = new javax.swing.JTextField();
        txtubib = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtmob = new javax.swing.JTextField();
        txtrefb = new javax.swing.JTextField();
        txtresb = new javax.swing.JTextField();
        txtactab = new javax.swing.JTextField();
        txtcob = new javax.swing.JTextField();
        btlimpiar = new javax.swing.JButton();
        btactual = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();
        comcon = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(java.awt.Color.green);

        jTabbedPane5.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane5.setMinimumSize(new java.awt.Dimension(750, 750));

        jPanel4.setPreferredSize(new java.awt.Dimension(600, 800));

        jLabel7.setText("Codigo");

        jLabel8.setText("Serial");

        jLabel9.setText("Descripcion");

        txtdesb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesbActionPerformed(evt);
            }
        });
        txtdesb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdesbKeyReleased(evt);
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

        jLabel10.setText("Ubicacion");

        txtserib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtseribActionPerformed(evt);
            }
        });

        jLabel2.setText("Movilizacion");

        jLabel19.setText("Referencia");

        jLabel20.setText("Condiciones");

        jLabel21.setText("Dep.Responsable");

        jLabel22.setText("Acta");

        btlimpiar.setText("limpiar");
        btlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimpiarActionPerformed(evt);
            }
        });

        btactual.setText("Actualizar");
        btactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btactualActionPerformed(evt);
            }
        });

        jLabel23.setText("ID");

        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/teleH.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comcon, 0, 1, Short.MAX_VALUE)
                                    .addComponent(txtrefb)
                                    .addComponent(txtmob)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtubib, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtserib)
                                    .addComponent(txtdesb)
                                    .addComponent(txtcob)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btactual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTguardar))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtactab, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtresb, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(txtid)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnExportar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btlimpiar)
                            .addComponent(btmoA))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)
                        .addGap(429, 429, 429))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btactual)
                                .addComponent(BTguardar)
                                .addComponent(jLabel23))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(btmoA)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btlimpiar)
                                    .addComponent(btnExportar)
                                    .addComponent(txtcob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 3, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdesb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtserib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtubib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtrefb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(comcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtresb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtactab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Buscar y Editar", jPanel4);
        jPanel4.getAccessibleContext().setAccessibleName("");

        jLabel4.setText("Desarrollado por: Enmanuel Hernández CI 20.374.390");

        jLabel5.setText("Contacto: wasabieahs@gmail.com");

        jLabel6.setText("Telf: 0412-1848020");

        jLabel11.setText("0414-7450531");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11)))
                .addContainerGap(756, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Contacto", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btactualActionPerformed

        try {
            PreparedStatement pps = cn.prepareStatement("UPDATE control SET codigo='"+txtcob.getText()+"',descripcion='"+txtdesb.getText()+"',serial='"+txtserib.getText()+"',ubicacion='"+txtubib.getText()+"',movilizacion='"+txtmob.getText()+"',referencia='"+txtrefb.getText()+"',condiciones='"+comcon.getSelectedItem()+ "',dep_responsable='"+txtresb.getText()+"',acta='"+ txtactab.getText()+"' WHERE id= '"+txtid.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
            limpiar();
            mostrartabla();
        } catch (SQLException ex) {
            Logger.getLogger(Reme.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btactualActionPerformed

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed
        limpiar();

    }//GEN-LAST:event_btlimpiarActionPerformed

    private void txtseribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtseribActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtseribActionPerformed

    private void btmoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmoAActionPerformed
        int filasel = TBmos.getSelectedRow();

        if(filasel>=0){
            txtid.setText(TBmos.getValueAt(filasel, 0).toString());
            txtcob.setText(TBmos.getValueAt(filasel,1).toString());
            txtdesb.setText(TBmos.getValueAt(filasel,2).toString());
            txtserib.setText(TBmos.getValueAt(filasel,3).toString());
            txtubib.setText(TBmos.getValueAt(filasel,4).toString());
            txtmob.setText(TBmos.getValueAt(filasel,5).toString());
            txtrefb.setText(TBmos.getValueAt(filasel,6).toString());
            txtresb.setText(TBmos.getValueAt(filasel,8).toString());
            txtactab.setText(TBmos.getValueAt(filasel,9).toString());
        }else{

            JOptionPane.showMessageDialog(null,"No se ha selecciono ninguna fila");
        }

    }//GEN-LAST:event_btmoAActionPerformed

    private void BTguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTguardarActionPerformed
        String codigo,descrip,serial,ubicacion,movilizacion,referencia,condiciones,depres,acta;
        String sSQL= "";
        String mensaje="";

        codigo=txtcob.getText();
        descrip=txtdesb.getText();
        serial=txtserib.getText();
        ubicacion=txtubib.getText();
        movilizacion=txtmob.getText();
        referencia=txtrefb.getText();
        condiciones=comcon.getSelectedItem().toString();
        depres=txtresb.getText();
        acta=txtactab.getText();

        if(accion.equals("Insertar")){
            sSQL="INSERT INTO control(codigo,descripcion,serial,ubicacion,movilizacion,referencia,condiciones,dep_responsable,acta) VALUES(?,?,?,?,?,?,?,?,?)";

            mensaje="los datos se han insertado con exito";

        }else if(accion.equals("Editar")){
            sSQL="UPDATE control SET codigo = ?,descripcion= ?,serial= ?,ubicacion= ?,movilizacion= ?,referencia= ?,condiciones= ?,dep_responsable= ?,acta= ? WHERE id="+id_actualizar;

            mensaje="los datos se han Editado de forma satisfactoria";
        }
        try {
            Conexion d = new Conexion();
            Connection cn = d.conec();
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1,codigo);
            pst.setString(2,descrip);
            pst.setString(3,serial);
            pst.setString(4,ubicacion);
            pst.setString(5,movilizacion);
            pst.setString(6,referencia);
            pst.setString(7,condiciones);
            pst.setString(8,depres);
            pst.setString(9,acta);

            int n = pst.executeUpdate();

            if (n>0){
                JOptionPane.showMessageDialog(null,mensaje);
            }

        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_BTguardarActionPerformed

    private void txtbuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscaKeyReleased
        String valor = txtbusca.getText();
        try {
            CTab(valor);

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_txtbuscaKeyReleased

    private void txtbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscaActionPerformed

    }//GEN-LAST:event_txtbuscaActionPerformed

    private void txtdesbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdesbKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesbKeyReleased

    private void txtdesbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesbActionPerformed
        txtdesb.transferFocus();

    }//GEN-LAST:event_txtdesbActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed


try{
     obj = new Exportar();
     obj.exportarExcel(TBmos);
    }catch(IOException ex){
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportarActionPerformed
  }
String accion = "Insertar";     
   
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
            java.util.logging.Logger.getLogger(Reme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Reme().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Reme.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Reme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTguardar;
    public javax.swing.JTable TBmos;
    private javax.swing.JButton btactual;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JButton btmoA;
    private javax.swing.JButton btnExportar;
    private javax.swing.JComboBox<String> comcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtactab;
    private javax.swing.JTextField txtbusca;
    private javax.swing.JTextField txtcob;
    private javax.swing.JTextField txtdesb;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmob;
    private javax.swing.JTextField txtrefb;
    private javax.swing.JTextField txtresb;
    private javax.swing.JTextField txtserib;
    private javax.swing.JTextField txtubib;
    // End of variables declaration//GEN-END:variables
 Conexion d = new Conexion();
 Connection cn = d.conec();

}
