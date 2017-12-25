
package TableModel;

import ADT.LAttendance;
import ADT.LDelivery;
import ADT.LDeliveryman;
import Entity.Attendance;
import Entity.Delivery;
import Interface.AttendanceInterface;
import Interface.DeliveryInterface;
//import Entity.Deliveryman;
import Interface.DeliverymanInterface;
import javax.swing.table.AbstractTableModel;

public class PendingTableModel extends AbstractTableModel {
    private AttendanceInterface<Attendance> contents = new LAttendance<>();
    String [] columns = {"Deliveryman ID","Name","Order ID"}; 
    
    public PendingTableModel(AttendanceInterface<Attendance> contents){
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
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        String deliverymanID = null;
        String name = null;
        String orderID = null;
        row++;
            Attendance attendance = (Attendance) contents.get(row);
             deliverymanID = attendance.getDeliverymanID();
             name = attendance.getName();
             orderID = attendance.getOrderID();
        if(column == 0)
            return deliverymanID;
        else if(column == 1)
            return name;
        else
            return orderID;
       
    }
    
}
