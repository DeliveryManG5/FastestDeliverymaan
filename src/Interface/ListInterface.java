package Interface;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BryanLee
 */
public interface ListInterface<T> {

    public boolean add(T newEntry);
    T getRestaurant1Record();
    T getRestaurant2Record();
    public T get(int givenPosition);
    T getCustomer();
    public boolean add(int newPosition, T newEntry);
//    public T remove(int givenPosition);
    public void clear();
    boolean remove(T anEntry);
    String generateOrderID();
    String generateReceiptNo();
    T getLast();
    public boolean replace(int givenPosition, T newEntry);
    public T getEntry(int givenPosition);
    public boolean contains(T anEntry);
    public int getNumberOfEntries();
    public boolean isEmpty();
    public boolean isFull();
    ListInterface getOrder();
    public double getSubTotal();
    int getPosition(String pNumber);
    T getRecord(String pNumber);
    T getPaymentLast();
    boolean searchPhoneNumber(String phoneNumber);
    ListInterface filterStatus();
    boolean searchRecord(String OrderID);
    boolean updateRecord(int givenPosition, T newFoodOrder);
    T getOrderRecord(String inputID);
    T getCustID(String custID);
    int getOrderPosition(String id);
}
