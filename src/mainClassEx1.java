
public class mainClassEx1 {
    public static void main(String[] args) {
        
        int cnt=0; // variabile in qui conto quanti numeri primi ho stampato, +1 per ogni nuovo numero primo trovato

        for (int i = 2; i < 1000; i++) { 
            if ( eNumeroPrimo(i) ){
                cnt=cnt+1;
                System.out.println("Numero: " + i +" è un numero primo");
                }
            if (cnt>100){ // se ne abbiamo trovati 100 allora usciamo dal ciclo for
                break;
            }

        }
    }

    public static Boolean eNumeroPrimo(int numero){
	  /*
       Numero primo è un numero divisibile solo per uno o per se stesso. 
       Nessun numero è divisibile per più della metà di se stesso. 
       */
      for (int i = 2; i <= numero / 2; i++) {
            int modulo = numero % i;
            if (modulo == 0) {
                return false;
            }
        }
       
        return true; // non abbiamo trovato nessun divisore nel ciclo trane se stesso e 1
    }
}

   
