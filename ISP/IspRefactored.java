package ict301.solid.isp;

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker implements Workable, Eatable {
    public void work() { System.out.println("L'humain travaille."); }
    public void eat() { System.out.println("L'humain mange."); }
}

class RobotWorker implements Workable {
    public void work() { System.out.println("Le robot travaille."); }
}
