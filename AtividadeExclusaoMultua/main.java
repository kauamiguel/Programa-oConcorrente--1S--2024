public class main {
    public static void main(String[] args){

        Contador contador = new Contador(0);

        Incremento inc1 = new Incremento(contador);
        Incremento inc2 = new Incremento(contador);
        Incremento inc3 = new Incremento(contador);
        Incremento inc4 = new Incremento(contador);

        inc1.run();
        inc2.run();
        inc3.run();
        inc4.run();

        try {
            inc1.join();
            inc2.join();
            inc3.join();
            inc4.join();
            System.out.println("Contador : " + contador.getValue());
        } catch (Exception e) {
            System.out.println("Sucks");
        } 

        
    }
}
