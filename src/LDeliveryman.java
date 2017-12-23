package ADT;


import Client.DeliveryManRegistration;
import Entity.Deliveryman;
import Interface.DeliverymanInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADmin
 */
public class LDeliveryman<T> implements DeliverymanInterface<T> {
    
    private Node firstNode; // reference to first node
    private int numberOfEntries; // number of entries in list
    //private static int counter;
    
    public LDeliveryman() {
        clear();
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
    public DeliverymanInterface<Deliveryman> getActiveRecord() {
        
        DeliverymanInterface<Deliveryman> activeList = new LDeliveryman<>();
        if(!DeliveryManRegistration.deliverymanList.isEmpty()){
            Node currentNode = firstNode;
            for(int i = 0; i < numberOfEntries; i++){
                
                Deliveryman deliveryman = (Deliveryman)currentNode.data;

                String status = deliveryman.getStatus();

                if(status.equals("Full-Time") || status.equals("Part-Time")){
                     activeList.addRecord(deliveryman);
                }
                currentNode = currentNode.next;
        
            }
        }
        return activeList;
    }

    @Override
    public boolean searchRecord(String id) {
        
        boolean found = false;
        for(int i = 0; i < numberOfEntries; i++) {
          Node currentNode = firstNode;
          Deliveryman deliveryman = (Deliveryman)currentNode.data;
          String deliverymanID = deliveryman.getDeliveryManID();
          if(deliverymanID.equals(id)){
            found = true;
          }
          else
            found = false;
        }
        
        return found;
        
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
    public final void clear() {
        firstNode = null;
        numberOfEntries = 0;
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public T getLast() {
        
        T result = null;
        
        if (isEmpty()) // if empty list
        {
            result = null;
        } else {                       
            Node currentNode = firstNode;	// traverse linked list with p pointing to the current node
            while (currentNode.next != null) {	// while have not reached the last node
                currentNode = currentNode.next;
            }
            result = currentNode.data;// currentNode is pointing to the last node
        }
        
        return result;
  
    }
    
    // returns the number of elements in this list.
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
    
    public String toString() {
        String outputStr = "";
        Node currentNode = firstNode;
        while (currentNode != null) {
          outputStr += currentNode.data + "\n";
          currentNode = currentNode.next;
        }
        return outputStr;
    }

    @Override
    public DeliverymanInterface getRecord(String id) {
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
