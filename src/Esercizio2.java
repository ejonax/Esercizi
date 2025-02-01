/*scrivere una classe chiamata Tabellina il cui costruttore prendere in ingresso un int, 
la classe ha un metodo chiamato stampa che non prende in ingresso niente e quando invocato stampa a video tutta la tabellina del numero con cui la classe e' stata costruita
*/
public class Esercizio2 {

     public int numero;

     public Esercizio2 (int numero){
         this.numero=numero;
     }

     public void stampa(){
          if (numero<=0) {
            System.out.println("Il numero " + numero + " che hai scelto non è valido. Scegli un numero maggiore di 0 per creare la tabellina.");
          }
          else {
            System.out.println("La tabellina per il numero " + numero + " è la seguente:");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + "*" + i + "=" + i*numero);
            }
        }
     }
}
