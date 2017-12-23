/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import Client.TrackStatus;
import Entity.Attendance;
import Interface.AttendanceInterface;

/**
 *
 * @author ADmin
 */
public class LAttendance<T> implements AttendanceInterface<T> {
    
    
    private Node firstNode; // reference to first node
    private int numberOfEntries; // number of entries in list
    
   
    @Override
    public AttendanceInterface<Attendance> filterRecord(String inputStatus) {
         
        AttendanceInterface<Attendance> statusList = new LAttendance<>();
        if(!TrackStatus.attendanceList.isEmpty()){
            
            Node currentNode = firstNode;
            for(int i = 0; i < numberOfEntries; i++){
                Attendance attendance = (Attendance)currentNode.data;
                String status = attendance.getStatus();
                if(status.equals(inputStatus)){
                     statusList.addRecord(attendance);
                }
                currentNode = currentNode.next;
        
            }
        }
        return statusList;
        
    }
    
    public boolean addRecord(T newDetails) {
        
        Node newNode = new Node(newDetails);	// create the new node

        if (isEmpty()) // if empty list
        {
            firstNode = newNode;
        } else {                        // add to end of nonempty list
            Node currentNode = firstNode;	// traverse linked list with p pointing to the current node
            while (currentNode.next != null) {	// while have not reached the last node
                currentNode = currentNode.next;
            }
            currentNode.next = newNode; // make last node reference new node
        }

        numberOfEntries++;
        
        return true;
    }
    
    @Override
    public T selectRecord(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getNumberOfEntries() {
    return numberOfEntries;
  }
    public T get(int givenPosition)
    // returns the element at the specified position in the list.
    {
    T result = null;

    if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
      Node currentNode = firstNode;
      for (int i = 0; i < givenPosition - 1; ++i) {
        currentNode = currentNode.next;		// advance currentNode to next node
      }
      result = currentNode.data;	// currentNode is pointing to the node at givenPosition
    }

    return result;
    }
    public boolean isEmpty() {
        return firstNode == null;
    }
    private class Node {

        private T data;
        private Node next;
        

        private Node(T data) {
          this.data = data;
          this.next = null;
        }

        private Node(T data, Node next) {
          this.data = data;
          this.next = next;
        }
        


        
    } // end Node
}
