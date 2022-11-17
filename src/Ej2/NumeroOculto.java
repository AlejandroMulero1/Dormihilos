package Ej2;

public class NumeroOculto extends Thread{
    public static int numeroAdivinar;
    public static boolean acertado;


    public void run(){
        int num;
        int respuesta=0;

        while (respuesta==0){
             num = (int) (Math.random()*100)+1;
             respuesta=propuestaNumero(num);
            System.out.println("No se ha encontrado el numero");
        }
        if (respuesta==-1){
            System.out.println("Ha ganado el " + this.getName());
        }
    }

    public static synchronized int propuestaNumero(int numero){
        int res=0;
        if(numero==numeroAdivinar){
            res=-1;
            acertado=true;
        }
        if (acertado && res==0){
            res=1;}
        return res;
    }

    public static void main(String[] args) {
        numeroAdivinar=(int) (Math.random()*100)+1;
        System.out.println(numeroAdivinar);
        for (int i = 0; i < 10; i++){
            Thread hilo= new NumeroOculto();
            hilo.setName("Hilo "+ i);
            hilo.start();
        }

        }
    }

