public class Esercizio5 {
   
        public  int cnt=0;

        // primo metodo a che richiama il metodo b() as suo interno
        public void a(){
            if (cnt < 10) {
                // se metto b() come prima riga dell'if si genera errore perche' 
                //non si incrementa il cnt siccome a->b->c->a->b->.... senza mai incrementare il cnt
                cnt = cnt+1;
                System.out.println("Stampo il ciclo "+ cnt);
                b();
            }else {
               return;
            }
            
        }

        // secondo metodo b che richiama il metodo c() as suo interno
        public void b(){
            c();
        }

        // terzo metodo c che richiama il metodo a() as suo interno
        public void c(){
          a();
        }
    
}
