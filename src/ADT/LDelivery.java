/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import Client.HomePage;
import Entity.Delivery;
import Interface.DeliveryInterface;
import Interface.DeliverymanInterface;
import java.util.Collections;

/**
 *
 * @author ADmin
 */
public class LDelivery<T> implements DeliveryInterface<T>  {
    
    private Node firstNode; // reference to first node
    private int numberOfEntries; // number of entries in list
    @Override
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
    public boolean searchRecord(String id) {
        boolean found = false;
        Node currentNode = firstNode;
        for(int i = 0; i < numberOfEntries; i++) {
            System.out.println(HomePage.deliveryList);
          Delivery delivery = (Delivery)currentNode.data;
          String orderID = delivery.getOrderID();
          
          if(orderID == null || !orderID.equals(id)){
            currentNode = currentNode.next;
          }
          else{
             found = true;
          }
        }
        
        return found;
    }
    
     public T getRecord(String inputID) {
        
        T result = null;
        
        if(HomePage.deliveryList.isEmpty()){// if empty list
        
            result = null;
        } else {                       
            Node currentNode = firstNode;	// traverse linked list with p pointing to the current node
            for(int i = 0; i < numberOfEntries; i++){
                
                Delivery delivery = (Delivery)currentNode.data;

                String id = delivery.getOrderID();
                if(id == null || !id.equals(inputID))
                    currentNode = currentNode.next;
                else 
                    result = currentNode.data;
        
            }
            
            
        }
        
        return result;
  
    }
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public DeliveryInterface getPendingRecord() {
        DeliveryInterface<Delivery> pendingList = new LDelivery<>();
        if(!HomePage.deliveryList.isEmpty()){
            Node currentNode = firstNode;
            for(int i = 0; i < numberOfEntries; i++){
                Delivery delivery = (Delivery)currentNode.data;
                String orderID = delivery.getOrderID();
                if(orderID != null){
                     pendingList.addRecord(delivery);
                }
                currentNode = currentNode.next;
        
            }
        }
        return pendingList;
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

    public boolean searchOrder(String id) {
        
        boolean found = false;
        Node currentNode = firstNode;
        for(int i = 0; i < numberOfEntries; i++) {
          
          Delivery delivery = (Delivery)currentNode.data;
          String deliverymanID = delivery.getOrderID();
          if(deliverymanID == null){
            currentNode = currentNode.next;
          }
          else if(deliverymanID.equals(id)){
            found = true;
          }
          else{
              currentNode = currentNode.next;
          }
        }
        
        return found;
        
    }
    
     
//     public T getLast() {
//        
//        T result = null;
//        
//        if (isEmpty()) // if empty list
//        {
//            result = null;
//        } else {                       
//            Node currentNode = firstNode;	// traverse linked list with p pointing to the current node
//            while (currentNode.next != null) {	// while have not reached the last node
//                currentNode = currentNode.next;
//            }
//            result = currentNode.data;// currentNode is pointing to the last node
//        }
//        
//        return result;
//  
//    }
    @Override
 public boolean addRecord(int newPosition, T newEntry) { 
    boolean isSuccessful = true;

    if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1)) {
      Node newNode = new Node(newEntry);

      if (isEmpty() || (newPosition == 1)) {     // case 1: add to beginning of list
        newNode.next = firstNode;
        firstNode = newNode;
      } else {								                      // case 2: list is not empty and newPosition > 1
        Node nodeBefore = firstNode;
        for (int i = 1; i < newPosition - 1; ++i) {
          nodeBefore = nodeBefore.next;		// advance nodeBefore to its next node
        }

        newNode.next = nodeBefore.next;	// make new node point to current node at newPosition
        nodeBefore.next = newNode;		// make the node before point to the new node
      }

      numberOfEntries++;
    } else {
      isSuccessful = false;
    }

    return isSuccessful;
  }
     public String toString() {
        String outputStr = "";
        Node currentNode = firstNode;
        while (currentNode != null) {
          outputStr += currentNode.data + "\n";
          currentNode = currentNode.next;
        }
        return outputStr;
    }
     public boolean updateRecord(int givenPosition, T newDelivery) {
        boolean isSuccessful = true;

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
          Node currentNode = firstNode;
          for (int i = 0; i < givenPosition - 1; ++i) {
            currentNode = currentNode.next;		// advance currentNode to next node
          }
          currentNode.data = newDelivery;	// currentNode is pointing to the node at givenPosition
        } else {
          isSuccessful = false;
        }

        return isSuccessful;
    }

    @Override
    public T getLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertionSort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void insertInOrder(javafx.scene.Node nodeToInsert) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DeliveryInterface<Delivery> getReportRecord() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
