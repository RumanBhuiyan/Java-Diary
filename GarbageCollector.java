//Garbage Collector 
// 1.https://www.geeksforgeeks.org/garbage-collection-java/
// 2.https://www.guru99.com/java-garbage-collection.html
public class GarbageCollector {
    public static String name;
    public static double age;

    public static void main(String[] args) throws InterruptedException {
        // creates two block of two variable called name,age in heap memory
        // they contain the reference of that address of heap memory
        GarbageCollector first = new GarbageCollector();
        GarbageCollector second = new GarbageCollector();
        // null can be assigned only in Reference type object not primitive type
        // now first doesn't have any reference so block of heap memory will be
        // garbage collector
        first = null;
        // though JVM performs garbage collection automatically to do this manually
        // requesting JVM for running Garbage Collector
        System.gc();

        second = null;
        // requesting JVM for running Garbage Collector
        Runtime.getRuntime().gc();
    }

    @Override
    // finalize method is called on object once
    // before garbage collecting it
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected : " + this);
    }
}
