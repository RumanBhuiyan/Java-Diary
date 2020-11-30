
public class threadsObjectClass extends Thread {
    public String name;
    public int time;

    // Constructor
    threadsObjectClass(String name, int time) {
        this.name = name;
        this.time = time;
    }

    // this method is called when t1.start() is called
    public void run() {
        try {
            System.out.println(name + " thread was called. Sleeping...");
            Thread.sleep(time);
            System.out.println(name + " finished sleeping");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
