/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domesab;



import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;




public class colortabla extends DefaultTableCellRenderer{

  
    
    
    @Override
    @SuppressWarnings("CastConflictsWithInstanceof")
    public Component getTableCellRendererComponent(JTable jtable, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       Component cell =super.getTableCellRendererComponent(jtable, value, isSelected, hasFocus, row,column); //To change body of generated methods, choose Tools | Templates.
      
if(column==7 && value.equals("Optimo"))
{
    
       cell.setBackground(Color.GREEN);
    }else if(column==7 && value.equals("Dañado")){
        cell.setBackground(Color.RED);
    }
    else if(column==7 && value.equals("Evaluación")){
        cell.setBackground(Color.YELLOW);
    }
     else if(column==7 && value.equals("Desincorporado")){
        cell.setBackground(Color.ORANGE);
    }
 
    else{
        cell.setBackground(Color.WHITE);
    }
if(isSelected){
    cell.setForeground(Color.BLACK);
    cell.setBackground(Color.GRAY);
}

    
  
   
    
    
      

    
    return this;


    }
    }
     
 
 
            
    
    

