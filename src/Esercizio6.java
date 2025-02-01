public class Esercizio6 {
    public int numero;

     public Esercizio6 (int numero){
         this.numero=numero;
     }

     // metodo che prende come variabile un numero integer N e poi stampa N volte il simbolo asterix *
     // N=2 allora stampa **
     // N=8 allora stampa ********
     public String stampaAsterix(int x){
        String asterixString="";
        for (int i = 0; i < x; i++) {
            asterixString=asterixString+"*";
        }
       return asterixString;
      
     }

     public void stampa(){
          if (numero<=0) {
            System.out.println("Il numero " + numero + " che hai scelto non è valido. Scegli un numero maggiore di 0 per creare la tabellina.");
          }
          else {
            System.out.println("La tabellina per il numero " 
            + stampaAsterix(numero)  // numero
            + " è la seguente:");

            for (int i = 1; i <= 10; i++) {
               int  j=i*numero;
                System.out.println(
                    stampaAsterix(i)
                    + " x " // " per " 
                    + stampaAsterix(numero) 
                    + " = " // " uguale a "
                    + stampaAsterix(j)
                    );
            }
        }
     }
}
