import java.util.Scanner;
public public class Main{
    public static void main(String[] args){
        frente Frente = new frente();
        tras Tras = new tras();
        esquerda Esquerda = new esquerda();
        direita Direita = direita();
        tirarFoto TirarFoto = new tirarFoto();
        
        Scanner funcaoRobo = new Scanner(System.in);

        System.out.print("//======================================================");
        System.out.print("Orientacao para utilizar o robo lunar:");
        System.out.print("Tecla 8 -> move - se para frente.");
        System.out.print("Tecla 2 -> move - se para tras.");
        System.out.print("Tecla 4 -> move - se para esquerda.");
        System.out.print("Tecla 6 -> move - se para direita.");
        System.out.print("Tecla 7 -> Tira foto.");
        System.out.print("========================================================");

        System.out.println("Escolha uma tecla");
        int funcRobo = funcaoRobo.nextInt();
        switch (funcRobo) {
            case 8:
            Frente();
            break;
            case 2:
            Tras();
            break;
            case 4:
            Esquerda();
            break;
            case 6:
            Direita();
            break;
            case 7:
            TirarFoto();
            break;
            default:
            System.out.println("A tecla escolhida não é válida! Opções: W, Z, A, S, 1 e 2.");
        }

    }
    
}
