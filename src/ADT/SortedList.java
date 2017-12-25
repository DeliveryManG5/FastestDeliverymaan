/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import Entity.Delivery;
import Interface.DeliveryInterface;
import Interface.SortedListInterface;


public class SortedList<T> implements SortedListInterface<T>{

    @Override
    public void sorting(DeliveryInterface<Delivery> list) {
        
       
        int numOfEntries = list.getNumberOfEntries();
        int a = 0;
        
        for (int i = numOfEntries; i >= 0; i--) {
            for (int b = 1; b < numOfEntries; b++) {
                a = b + 1;
                
                Delivery secondDelivery = list.get(b);
                Delivery firstDelivery = list.get(a);
                
                int second = secondDelivery.getNumOfDelivery();
                int first = firstDelivery.getNumOfDelivery();
                if (second < first) {
                    swap(b, a, (LDelivery<Delivery>) list);
                }
            }
            
        }
    }
     
  
    private void swap(int i, int j, LDelivery<Delivery> list) {
  
        Delivery temp;
        temp = list.get(i);
        list.updateRecord(i, list.get(j)); 
        list.updateRecord(j, temp); 
    }
     
}
