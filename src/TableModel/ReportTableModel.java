/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import ADT.LDelivery;
import Entity.Delivery;
import Interface.DeliveryInterface;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ADmin
 */
public class ReportTableModel extends AbstractTableModel {
    
    private DeliveryInterface<Delivery> contents = new LDelivery<>();
    String [] columns = {"Deliveryman ID","Name","Total Deliveries", "Total Distance Travelled (km)"}; 
    
    public ReportTableModel(DeliveryInterface<Delivery> contents){
        this.contents = contents;
    }
    
    public String getColumnName(int col) {
        return columns[col];
    }
    @Override
    public int getRowCount() {
        return this.contents.getNumberOfEntries();
    }

    @Override
    public int getColumnCount() {
        return 4;   
    }

    @Override
    public Object getValueAt(int row, int column) {
       String deliverymanID = null;
        String name = null;
        int totalDeliveries = 0;
        double totalDistances = 0.0;
        row++;
            Delivery delivery = (Delivery) contents.get(row);
             deliverymanID = delivery.getDeliverymanID();
             name = delivery.getDeliverymanName();
             totalDeliveries = delivery.getNumOfDelivery();
             totalDistances = delivery.getTotalDistance();
             
        if(column == 0)
            return deliverymanID;
        else if(column == 1)
            return name;
        else if (column == 2)
            return totalDeliveries;
        else
            return totalDistances;
    }
    
}
