
package ict301.solid.dip;

class MySQLDatabase {
    public void insert(String data) {}
}

public class OrderProcessor {
    
    private MySQLDatabase database = new MySQLDatabase();

    public void process(String order) {
        database.insert(order);
    }
}
