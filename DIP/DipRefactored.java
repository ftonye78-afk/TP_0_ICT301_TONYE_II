package ict301.solid.dip;

interface Database {
    void insert(String data);
}

class MySQLDatabase implements Database {
    public void insert(String data) { System.out.println("Save in MySQL"); }
}

class MongoDBDatabase implements Database {
    public void insert(String data) { System.out.println("Save in MongoDB"); }
}

public class OrderProcessorRefactored {
    private Database database;

    public OrderProcessorRefactored(Database db) {
        this.database = db;
    }

    public void process(String order) {
        database.insert(order);
    }
}

