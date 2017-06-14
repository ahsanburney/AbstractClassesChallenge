package com.ahsanburney;

import java.util.List;

/**
 * Created by Kulsum on 6/12/2017.
 */
public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem item);

}
