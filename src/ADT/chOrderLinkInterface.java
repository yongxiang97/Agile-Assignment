/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import Model.OrderStatus;

/**
 *
 * @author Win8
 */
public interface chOrderLinkInterface<T> {

    public void add(T newEntry);

    public int getNumberOfEntries();

    public T getEntry(int j);


    
}
