package carDetail;

import Helper.XFile;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

public class ListCarDetail {
    
    ArrayList<CarDetail> list = new ArrayList<>();
    private String path = "listCarDetail.dat";
    
    public void add(CarDetail car) {
        list.add(car);
    }
    
    public void print() {
        for (CarDetail car : list) {
            System.out.println(car);
        }
    }

    public void deleteById(String id) {
        for (Iterator<CarDetail> iterator = list.iterator(); iterator.hasNext();) {
            CarDetail value = iterator.next();
            if (value.getId().equals(id)) {
                iterator.remove();
            }
        }
    }
    
    public void loadFile() throws Exception {
        File file = new File(path);
        if (file.exists()) {
            list = (ArrayList<CarDetail>) XFile.readFile(path);
        }
    }
    
    public void writeToFile() throws Exception {
        XFile.writeFile(path, list);
    }
    
    public void renderToTable(DefaultTableModel table, String id) {
        table.setRowCount(0);
        
        int i = 1;
        for (CarDetail car : list) {
            if (car.getId().equals(id)) {
                Object[] row = new Object[]{
                    i, car.getNgayNhap(), car.getNgayXuat(), car.getAmount(), car.getPrice()
                };
                table.addRow(row);
                i++;
            }
        }
        table.fireTableStructureChanged();
    }
     public int sumAmount() {
        int sum = 0;
        for (CarDetail car : list) {
            if(car.getNgayXuat()!=null)
                sum += car.getAmount();
        }
        return sum;
    }
     public int sumAmountById(String id) {
        int sum = 0;
        for (CarDetail car : list) {
            if(car.getNgayXuat()!=null && car.getId().equals(id))
                sum += car.getAmount();
        }
        return sum;
    }
}
