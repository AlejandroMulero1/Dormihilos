package Ej1;

public class HiloBucle extends Thread {

    @Override
    public void run() {

        while (true) {
            System.out.println("Soy el bucle " + this.getName() + " y estoy trabajando");
            int numAleatorio = (int) (Math.random() * 10000) + 1000;
            try {
                Thread.sleep(numAleatorio);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
