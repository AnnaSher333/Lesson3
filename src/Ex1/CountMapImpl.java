package Ex1;

import java.util.*;

public class CountMapImpl<T> implements CountMap<T> {
    private Map<T, Integer> map;

    public CountMapImpl() {
        this.map = new HashMap<T , Integer>();
    }
    private List<T> container = new ArrayList<>();

    @Override
    public void add(Object o) {
        container.add((T)o);
    }

    @Override
    public int getCount(Object o) {
        return Collections.frequency(container, (T)o);
    }

    @Override
    public int remove(Object o) {
        int count = getCount(o);
        container.remove((T)o);
        return count;
    }

    @Override
    public int size() {
        return (int)container.stream().distinct().count();
    }

    @Override
    public void addAll(CountMap<? extends T> source) {
        System.out.println("???");
    }

    @Override
    public Map<T, Integer> toMap() {
        Map<T, Integer> map = new HashMap<>();
        for (T t: container) {
            int count = getCount(t);
            map.put(t , count);
        }
        return map;
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
        for (T t: container) {
            int count = getCount(t);
            this.map.put(t , count);
        }
    }
}
