public class main {
    public static void main(String[] args){
        ThreadTest thread1 = new ThreadTest();
        ThreadTest thread2 = new ThreadTest();
        ThreadTest thread3 = new ThreadTest();
        ThreadTest thread4 = new ThreadTest();
        ThreadTest thread5 = new ThreadTest();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
