import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GenericData<T> {
    private ArrayList<T> dataList;

    public GenericData() {
        dataList = new ArrayList<>();
    }

    public void addData(T data) {
        dataList.add(data);
    }

    public void removeData(T data) {
        dataList.remove(data);
    }

    public void editData(int index, T newData) {
        dataList.set(index, newData);
    }

    public void displayData() {
        Collections.sort(dataList, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                if (o1 instanceof Tradisional && o2 instanceof Tradisional) {
                    return ((Tradisional) o1).getKodeAlatMusik().compareTo(((Tradisional) o2).getKodeAlatMusik());
                } else if (o1 instanceof Elektronik && o2 instanceof Elektronik) {
                    return ((Elektronik) o1).getKodeAlatMusik().compareTo(((Elektronik) o2).getKodeAlatMusik());
                }
                return 0;
            }
        });

        for (T data : dataList) {
            System.out.println(data);
        }
    }

    public ArrayList<T> getDataList() {
        return dataList;
    }
}