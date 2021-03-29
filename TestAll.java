import java.awt.*;

public class TestAll {

    public static void main(String[] args) {
     
        Point A = new Point(1, 2);
        A = null;

        System.gc();
        Runtime.getRuntime().gc();
    } 
   
}
