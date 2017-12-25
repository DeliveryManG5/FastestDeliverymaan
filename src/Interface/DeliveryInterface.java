/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.Delivery;
import javafx.scene.Node;

/**
 *
 * @author ADmin
 */
public interface DeliveryInterface<T> {
    boolean addRecord(T newDetails);
    boolean searchRecord(String id);
    boolean isEmpty();
    T getRecord(String inputID);
    DeliveryInterface getPendingRecord();
    boolean searchOrder(String id);
    int getNumberOfEntries();
    T get(int givenPosition);
    String toString();
    DeliveryInterface<Delivery> getReportRecord();
    boolean addRecord(int newPosition, T newEntry);
    T getLast();
    void insertionSort();
    void insertInOrder(Node nodeToInsert);
}
