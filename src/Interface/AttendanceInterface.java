/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

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
    
}
