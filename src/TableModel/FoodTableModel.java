package TableModel;


import ADT.LListWS;
import Entity.MenuWS;
import ADT.ListInterface;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADmin
 */
public class FoodTableModel extends AbstractTableModel {

     private ListInterface<MenuWS> contents = new LListWS<>();
     String [] columns = {"FOOD ID","Food","Price"};    
    public FoodTableModel(ListInterface<MenuWS> contents){
        this.contents = contents;
    } 
    
    public String getColumnName(int col) {
        return columns[col];
    }
    @Override
    public int getRowCount(){
        return this.contents.getNumberOfEntries();
    }

    @Override
    public int getColumnCount(){
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column){
        String foodID = null;
        String foodName = null;
        String price = null;
        row++;
            MenuWS food = (MenuWS) contents.getEntry(row);
             foodID = food.getFoodid();
             foodName = food.getFood();
             price = food.getPrice();
                     
            if(column == 0)
                return foodID;
            else if(column == 1)
                return foodName;
            else
                return price;
            
            
    }
}
