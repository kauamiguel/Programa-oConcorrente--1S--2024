public class ThreadTest extends Thread {
    public void run(){
        for (int i = 0; i <= 5; i++){
            System.out.println(i + " " + getName());
        }

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Problems");
        }
    }
}
