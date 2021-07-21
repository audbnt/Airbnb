package bonnet.airbnb.outils;
import java.util.ArrayList;

public class Compare2<T extends Comparable> {

    private ArrayList<T> list;

    public Compare2() {
        list = new ArrayList<>();
    }

    public Compare2(ArrayList<? extends T> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
    }

    public void add(T element) {
        list.add(element);
    }

    public T get(int indice) {
        return list.get(indice);
    }

    public T getHigher() {

        T higher = null;
        int maxValue = Integer.MIN_VALUE;

        for (T t : list) {
            if (t.getValueToCompare() > maxValue) {
                maxValue = t.getValueToCompare();
                higher = t;
            }
        }

        return higher;
    }

    public T getLower() {

        T lower = null;
        int minValue = Integer.MAX_VALUE;

        for (T t : list) {
            if (t.getValueToCompare() < minValue) {
                minValue = t.getValueToCompare();
                lower = t;
            }
        }

        return lower;
    }

}