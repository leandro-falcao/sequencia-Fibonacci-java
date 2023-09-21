public class fib {
    long tempoInicial = System.currentTimeMillis();

    public static void main(String[] args, Object nb) {
        
        long atual = 1;
        long anterior = 0;

        long guardado;
        int mil = 1000;
        long ate =  30;

        for(long i = 0; i < ate; i++){
            System.out.println( "linhad " +(i+1) +" valor: (" +atual +")");

            
            // System.out.println("linha (" +(i+1) +")" +"a seqquencia de fibonnacci é: " +atual );

            guardado = atual;
            atual = atual + anterior;
            anterior = guardado;


            long numer = mil*mil*mil;
            // if(i >= ate-1){
                // System.out.println("Bateu os "+numer +", fechando aqui");
                // break;
            // }
            // System.out.println("Bateu os "+numer +", fechando aqui");

          
            
        }

    } //end class Main

      
        public static int interar(int nb){

                System.out.println( "linha " +(nb+1) +" valor: (" +atual +")");
                    guardado = atual;
                    atual = atual + anterior;   
                    anterior = guardado;
                    
            } 
            
        System.out.println("ultimo nume: " +guardado);
        long tempofinal = System.currentTimeMillis();
        long tempoPercorrido = tempofinal - tempoInicial;
        
        System.out.println("gastamos: " +tempoPercorrido +" milesegundos para execultar a tarefa " );


    



} //end prog