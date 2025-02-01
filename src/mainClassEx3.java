//scrivere una classe con sufficienti metodi tutti chiamati stampa che possono stampare boolean, int, short, double, long

public class mainClassEx3 {
    
    public static void main(String[] args) {
        
        Esercizio3 ex3=new Esercizio3();

        boolean varB=true;
        ex3.stampa(varB);

        int varInt=123;
        ex3.stampa(varInt);
        ex3.stampa(123.56);// non genera errore perche' ne abbiamo un metodo stampa che prende argomenti double
        ex3.stampa(false);//  non genera errore perche' ne abbiamo un metodo stampa che prende argomenti boolean

        short varShort=23;
        ex3.stampa(varShort);

        double varDouble=23.678;
        ex3.stampa(varDouble);

        long varLong=-1234587;
        ex3.stampa(varLong);
    }
}

class Esercizio3 {
    //scrivere una classe con sufficienti metodi tutti chiamati stampa che possono stampare boolean, int, short, double, long
  
    
    public void stampa(boolean var){
         System.out.println("Il valore da stampare è "+ var);
    }

    public void stampa(int var){
        System.out.println("Il valore da stampare è "+ var);
    }

    public void stampa(short var){
         System.out.println("Il valore da stampare è "+ var);
    }

    public void stampa(double var){
        System.out.println("Il valore da stampare è "+ var);
    }

    public void stampa(long var){
        System.out.println("Il valore da stampare è "+ var);
    }
}
