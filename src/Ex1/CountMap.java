package Ex1;

import java.util.Map;

public interface CountMap<E> {
    void add(Object o);

    int getCount(Object o);

    //current count
    int remove(Object o);

    int size();

    void addAll(CountMap<? extends E> source);

    Map<E, Integer> toMap();

    void toMap(Map<E, Integer> destination);

}
