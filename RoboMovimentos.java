public class RoboMovimentos{

    private int carga = 100;
    private int botaoFrente = -5;
    private int botaoTras = -5;
    private int bataoDireita = -5;
    private int botaoEsquerda = -5;
    private int botaoTirarFoto = -10;

    public RoboMovimentos(){

    }

    public int frente(){
        if(opcao = w){
            carga = carga + botaoFrente;
            System.out.print("Robo andou para frente, sua bateria é de: " + carga);
            
        }

    public int tras(){
        if(opcao = s){
            carga = carga + botaoTras;
            System.out.print("Robo andou para tras, sua bateria é de: " + carga);

        }

    public int esquerda(){
        if(opcao = a){
            carga = carga + botaoEsquerda;
            System.out.print("Robo andou para esquerda, sua bateria é de: " + carga);

        }

        public int direita(){
            if(opcao = s){
                carga = carga + batoaDireita;
                System.out.print("Robo andou para direita, sua bateria é de: " + carga);
    
            }

        public int tiraFoto(){
            if(opcao = 1){
                carga = carga + botaoTirarFoto;
                System.out.print("Robo tirou uma foto, sua bateria é de: " + carga);

            }

    }
   
}
