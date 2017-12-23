
package TableModel;

import ADT.LDeliveryman;
//import Entity.Deliveryman;
import Interface.DeliverymanInterface;
import javax.swing.table.AbstractTableModel;

public class PendingTableModel extends AbstractTableModel {
    //private DeliverymanInterface<Deliveryman> contents = new LDeliveryman<>();
    String [] columns = {"Deliveryman ID","Name","Order ID"}; 
    
    //public PendingTableModel(DeliverymanInterface<Deliveryman> contents){
      //  this.contents = contents;
    //}
    
    public String getColumnName(int col) {
        return columns[col];
    }
    
    @Override
    public int getRowCount() {
        return this.contents.getNumberOfEntries();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        String deliverymanID = null;
        String name = null;
        String orderID = null;
        row++;
            Deliveryman deliveryman = (Deliveryman) contents.get(row);
             deliverymanID = deliveryman.getDeliveryManID();
             name = deliveryman.getDeliveryManName();
             
            return (column == 0)? deliverymanID:name:orderID;
       
    }
    
}
