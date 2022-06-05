package acount;

import Helper.XFile;
import java.io.File;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ListAccount {

    ArrayList<Account> list = new ArrayList<>();
    private String path = "listAccount.dat";

    public void add(Account account) {
        list.add(account);
    }
    public Account findByName(String name){
        for (Account account : list) {
            if (account.getName().equals(name)) {
                return account;
            }
        }
        return null;
    }

    public boolean checkName(String name) {
        for (Account account : list) {
            if (account.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public boolean checkPass(String pass){
        for (Account account : list) {
            if(account.getPass().equals(pass))
                    return true;
        }
        return false;
    }

    public boolean deleteByName(String name) {
        for (Account account : list) {
            if (account.getName().equals(name)) {
                list.remove(account);
                return true;
            }
        }
        return false;
    }
    
    

    public boolean loadFile() throws Exception {
        File file = new File(path);
        if (file.exists()) {
            list = (ArrayList<Account>) XFile.readFile(path);
            return true;
        } else {
            return false;
        }
    }

    public void writeToFile() throws Exception {
        XFile.writeFile(path, list);
    }

    public void renderToTable(DefaultTableModel table) {
        table.setRowCount(0);

        int i = 1;
        for (Account account : list) {
            Object[] row = new Object[]{
                i, account.getName(), account.getPass(), account.getType(), account.getStatus()
            };
            table.addRow(row);
            i++;
        }
        table.fireTableStructureChanged();
    }

    public void print() {
        for (Account account : list) {
            System.out.println(account);
        }
    }
}
