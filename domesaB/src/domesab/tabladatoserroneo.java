/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domesab;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;



public class tabladatoserroneo extends DefaultTableCellRenderer {
    
    String accion;
    
   public Component getTableCellRendererComponent(JTable jtable, Object value, boolean isSelected, boolean hasFocus, int row, int column) { 
    Component cell =super.getTableCellRendererComponent(jtable, value, isSelected, hasFocus, row,column);
    if(value instanceof Long){
        long valor=(long)value;
        
        
    }if(column==1 && value.equals(value)){
        
    }
        return this;
   
   }
}
