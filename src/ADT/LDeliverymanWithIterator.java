/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import Entity.Deliveryman;
import Interface.DeliverymanInterface;
import Interface.DeliverymanWithIteratorInterface;
import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 *
 * @author ADmin
 */
public class LDeliverymanWithIterator<T> implements DeliverymanWithIteratorInterface<T> {
    private Node firstNode;
    private int numberOfEntries;

    public LDeliverymanWithIterator() {
        clear();
    }

    @Override
    public Iterator<T> getIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
    public boolean updateRecord(T oldDeliveryman, T newDeliveryman) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String generateDeliverymanID() {
        String deliveryManID = null;
        if(isEmpty()){
            deliveryManID = "D1001";
        }else{
            Deliveryman deliveryman = (Deliveryman)this.getLast();
            String lastID = deliveryman.getDeliveryManID();
            
            deliveryManID = "D" + (Integer.parseInt(lastID.substring(1,lastID.length()))+1);
        } 
        return deliveryManID;
    }

    @Override
    public DeliverymanInterface getActiveRecord() {
        DeliverymanInterface<Deliveryman> activeList = new LDeliveryman<>();
        if(!isEmpty()){
            for(int i = 0; i < numberOfEntries; i++){
                Node currentNode = firstNode;
                Deliveryman deliveryman = (Deliveryman)currentNode.data;

                String status = deliveryman.getStatus();

                if(status.equals("Full-Time") || status.equals("Part-Time")){
                     activeList.addRecord(deliveryman);
                }
        
            }
        }
        return activeList;
    }

    @Override
    public DeliverymanInterface getRecord(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DeliverymanInterface getPendingDelivery() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DeliverymanInterface getAvailable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T getLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean searchRecord(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfEntries() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T get(int row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private class LinkedListIterator implements Iterator<T> {

        private Node currentNode;

        public LinkedListIterator() {
          currentNode = firstNode;
        }

        @Override
        public boolean hasNext() {
          return currentNode != null;
        }

        @Override
        public T next() {
          if (hasNext()) {
            T returnData = currentNode.data;
            currentNode = currentNode.next;
            return returnData;
          } else {
            throw new NoSuchElementException("Illegal call to next(); iterator is after end of list.");
          }
        }

        @Override
        public void remove() {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
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
  }
}
