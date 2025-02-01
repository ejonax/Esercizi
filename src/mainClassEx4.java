public class mainClassEx4 {
    public static void main(String[] args) {
       
        int i=1;
        while (i<10){
            // var boolean che non cambia il valore, cosi while interno sara' sempre true 
            boolean j=true;
            
            while (j==true){
                System.out.println("Questo è un ciclo infinito");
            }
            i=i+1;
        }
    }
    
}
