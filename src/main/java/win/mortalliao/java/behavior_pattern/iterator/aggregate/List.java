package win.mortalliao.java.behavior_pattern.iterator.aggregate;

import win.mortalliao.java.behavior_pattern.iterator.iterator.Iterator;

/**
 * @author mortal
 */
public interface List {

    Iterator iterator();

    Object get(int index);

    int getSize();

    void add(Object obj);
}
