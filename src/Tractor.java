public interface Tractor {
   static boolean crawler = true;

    void move();
    //static method
    static void dig(){
        System.out.println ("One bucket, two buckets, three buckets - fuuuuuf");
    }
}
