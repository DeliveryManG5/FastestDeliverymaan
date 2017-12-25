/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.Attendance;
import Entity.Delivery;

/**
 *
 * @author ADmin
 */
public interface AttendanceInterface<T> {
    AttendanceInterface filterRecord(String Status);
    T selectRecord(String id);
    int getNumberOfEntries();
    T get(int givenPosition);
    boolean isEmpty();
    boolean addRecord(T newDetails);
    boolean searchRecord(String id);
    T getRecord(String inputID);
    int getPosition(String id);
    boolean updateRecord(int givenPosition, T newAttendance);
    AttendanceInterface filterStatus(); 
    AttendanceInterface<Attendance> getPendingRecord();
    boolean searchOrder(String id);
}
