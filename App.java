public class App{
    private static final int size = 4;
    Memoria[] VirtualRam = new Memoria[size];
    Memoria[] HardRam = new Memoria[2*size];
    String[] Commands = {};
    public static void main(String[] args){
        // O Commands vai estar numa estrutura csv, onde ao reconhecer uma vírgula, define que o comando se encerrou
        // O VirtualRam é a área crítica da memória, do tipo de objeto Memoria, pois vai armazenar todas as informações necessárias sobre a memória
        // Vai ter um método para verificar o boolean acessed dentro de cada objeto Memoria, caso true ele pula pro próximo, caso falso ele escolhe esse elemento

    }
    public void VerificarAcesso(){
        for (Memoria pagina : HardRam) {
            if (HardRam[idx].getAccessed() == false){
                // Atribui valor ou lê o valor contido
            }            
        }
    }
    public void Modificar(int idx) {
        
    }
}