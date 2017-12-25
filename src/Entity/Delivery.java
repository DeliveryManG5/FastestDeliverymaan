/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ADmin
 */
public class Delivery {
    String deliverymanID;
    String deliverymanName;
    String OrderID;
    String custName;
    String deliveryAddress;
    int numOfDelivery;
    double totalDistance;

    public Delivery() {
    }

    public Delivery(String deliverymanID, String deliverymanName, String OrderID, String custName, String deliveryAddress, int numOfDelivery, double totalDistance) {
        this.deliverymanID = deliverymanID;
        this.deliverymanName = deliverymanName;
        this.OrderID = OrderID;
        this.custName = custName;
        this.deliveryAddress = deliveryAddress;
        this.numOfDelivery = numOfDelivery;
        this.totalDistance = totalDistance;
    }

    


   

    public String getDeliverymanID() {
        return deliverymanID;
    }

    public String getDeliverymanName() {
        return deliverymanName;
    }

    public String getOrderID() {
        return OrderID;
    }

    public String getCustName() {
        return custName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public int getNumOfDelivery() {
        return numOfDelivery;
    }

    public double getTotalDistance() {
        return totalDistance;
    }


    
    public void setDeliverymanID(String deliverymanID) {
        this.deliverymanID = deliverymanID;
    }

    public void setDeliverymanName(String deliverymanName) {
        this.deliverymanName = deliverymanName;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setNumOfDelivery(int numOfDelivery) {
        this.numOfDelivery = numOfDelivery;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    @Override
    public String toString() {
        return "Delivery{" + "deliverymanID=" + deliverymanID + ", deliverymanName=" + deliverymanName + ", OrderID=" + OrderID + ", custName=" + custName + ", deliveryAddress=" + deliveryAddress + ", numOfDelivery=" + numOfDelivery + ", totalDistance=" + totalDistance + '}';
    }

    

    
    
    
    
}
