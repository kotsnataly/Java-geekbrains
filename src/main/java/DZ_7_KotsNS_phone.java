import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DZ_7_KotsNS_phone {
    HashMap<String, String> books;

    DZ_7_KotsNS_phone() {
        this.books = new HashMap<>();
        books.put("Telephone1", "Name1");
        books.put("Telephone2", "Name2");
        books.put("Telephone3", "Name3");
        books.put("Telephone4", "Name4");
        books.put("Telephone5", "Name5");
        books.put("Telephone6", "Name6");
        books.put("Telephone7", "Name7");
        books.put("Telephone8", "Name9");
        books.put("Telephone9", "Name9");
        books.put("Telephone10", "Name9");
    }
    void addPhone(String phone, String name) {
        books.put(phone, name);
    }
    void getPhone(String name) {
        for (Map.Entry<String, String> o : books.entrySet()) {
            o.getValue();
            if (o.getValue().equals(name)) {
                System.out.println(o.getKey());
            }
        }
    }
    public static void main(String[] args) {
        DZ_7_KotsNS_phone dz = new DZ_7_KotsNS_phone();
        dz.getPhone("Name9");
    }

}
