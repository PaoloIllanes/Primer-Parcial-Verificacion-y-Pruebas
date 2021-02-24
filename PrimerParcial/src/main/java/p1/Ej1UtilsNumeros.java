package p1;

    public class Ej1UtilsNumeros {
        public  boolean esPrimo(int numero){
            int contador = 2;
            boolean primo=true;
            if(numero<=0){
                return false;
            }
            while ((primo) && (contador!=numero)){
                if (numero % contador == 0)
                    primo = false;
                contador++;
            }
            return primo;
        }
    }

