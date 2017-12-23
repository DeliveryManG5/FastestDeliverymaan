/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.Iterator;

/**
 *
 * @author ADmin
 */
public interface DeliverymanWithIteratorInterface<T> extends DeliverymanInterface<T> {
    public Iterator<T> getIterator();
}
