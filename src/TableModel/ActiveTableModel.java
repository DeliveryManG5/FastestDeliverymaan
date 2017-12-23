package TableModel;


import ADT.LDeliveryman;
import Client.DeliveryManRegistration;
import Entity.Deliveryman;
import Interface.DeliverymanInterface;
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
public class ActiveTableModel extends AbstractTableModel {

     private DeliverymanInterface<Deliveryman> contents = new LDeliveryman<>();
     String [] columns = {"Deliveryman ID","Name",};    
    public ActiveTableModel(DeliverymanInterface<Deliveryman> contents){
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
        return 2;
    }

    @Override
    public Object getValueAt(int row, int column){
        String deliverymanID = null;
        String name = null;
        row++;
        //while(row <= numOfEntries ){
            Deliveryman deliveryman = (Deliveryman) contents.get(row);
             deliverymanID = deliveryman.getDeliveryManID();
             name = deliveryman.getDeliveryManName();
          //  row++;
            return (column == 0)? deliverymanID:name;
        //}
        
        //map column index to property
        //return (column == 0)? deliveryman.getDeliveryManID() : deliveryman.getDeliveryManName();
        
    }
}
