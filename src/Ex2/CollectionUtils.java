package Ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils {
    //добавить все элементы из 1го листа во 2ой лист
    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }
    //создать новый лист
    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }
    //вернуть индекс по элементу
    public static <T> int indexOf(List<? extends T> source, Object o) {
        return source.indexOf((T)o);
    }
    //вернуть лист, указанного размера
    public static <T> List<T> limit(List<? extends T> source, int size) {
        List<T> lim = new ArrayList<>();
        for (int i = 0; i < Math.min(size, source.size()); i++) {
            lim.add(source.get(i));
        }
        return lim;
    }
    //добавить 1 элемент в лист
    public static <T> void add(List<? super T> source, Object o) {
        source.add((T)o);
    }
    //удалить все элементы листа
    public static <T> void removeAll(List<? super T> removeFrom, List<? super T> c2) {
        c2.removeAll(removeFrom);
    }
    //true, если первый лист содержит все элементы второго
    public static <T> boolean containsAll(List<? super T> c1, List<? super T> c2) {
        return c1.containsAll(c2);
    }
    //true, если первый лист содержит хотя бы 1 элемент второго
    public static <T> boolean containsAny(List<? super T> c1, List<? super T> c2) {
        for(Object o: c1){
            if (c2.contains(o))
                return true;
        }
        return false;
    }
    //возвращает лист от min до max
    public static <T extends Comparable> List range(List<? extends T> list, Object min, Object max) {
        List<T> newList = new ArrayList<>();
        for (T t: list){
            if (t.compareTo(min) >= 0 && t.compareTo(max) <=0){
                newList.add(t);
            }
        }
        return newList;
    }
    //возвращает лист от min до max
    public static <T> List range(List<? extends T> list, Object min, Object max, Comparator<? super T> comparator) {
        List<T> newList = new ArrayList<>();
        for (T t: list){
            if (comparator.compare(t , (T)min) >= 0 && comparator.compare(t , (T)max) <= 0){
                newList.add(t);
            }
        }
        return newList;
    }
}
