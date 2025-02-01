//scrivere una classe con sufficienti metodi tutti chiamati stampa che possono stampare boolean, int, short, double, long

public class mainClasseEx3 {
    
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
