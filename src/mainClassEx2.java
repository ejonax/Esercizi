public class mainClassEx2 {
    public static void main(String[] args) {
        
        Esercizio2 esempio1=new Esercizio2(0);
        esempio1.stampa();

        Esercizio2 esempio2=new Esercizio2(-2);
        esempio2.stampa();

        Esercizio2 esempio3=new Esercizio2(9);
        esempio3.stampa();

        Esercizio2 esempio4=new Esercizio2(39);
        esempio4.stampa();

        Esercizio2 esempio5=new Esercizio2(1);
        esempio5.stampa();

    }
}

/*scrivere una classe chiamata Tabellina il cui costruttore prendere in ingresso un int, 
la classe ha un metodo chiamato stampa che non prende in ingresso niente e quando invocato stampa a video tutta la tabellina del numero con cui la classe e' stata costruita
*/
class Esercizio2 {

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