public class threads {
    public static void main(String[] args) {
        threadsObjectClass t1 = new threadsObjectClass("Ruman", 2000);
        t1.start();// calling run method

        threadsObjectClass t2 = new threadsObjectClass("Robiul", 4000);
        t2.start();// calling run method

        threadsObjectClass t3 = new threadsObjectClass("Ontor", 6000);
        t3.start();// calling run method
    }
}