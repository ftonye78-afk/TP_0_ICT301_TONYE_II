package ict301.solid.isp;

public interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    public void work() { System.out.println("L'humain travaille."); }
    public void eat() { System.out.println("L'humain mange."); }
}

class RobotWorker implements Worker {
    public void work() { System.out.println("Le robot travaille."); }
    public void eat() { 
        
        throw new UnsupportedOperationException(); 
    }
}

