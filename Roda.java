package RodadeCores;
import java.util.Scanner;

public class Roda {
	
	private boolean red;
    private boolean green;
    private boolean blue;

  
    public boolean isRed() {
        return red;
    }

    public void setRed(boolean red) {
        this.red = red;
    }

    public boolean isGreen() {
        return green;
    }

    public void setGreen(boolean green) {
        this.green = green;
    }

    public boolean isBlue() {
        return blue;
    }

    public void setBlue(boolean blue) {
        this.blue = blue;
    }

    public String finalColor() {
        int valor = 0;

        if (red) valor += 100;
        if (green) valor += 10;
        if (blue) valor += 1;

        switch (valor) {
            case 0:
                return "preto";
            case 1:
                return "azul";
            case 10:
                return "lilás";
            case 100:
                return "vermelho";
            case 11:
                return "rosa";
            case 101:
                return "branco";
            case 110:
                return "verde";
            case 111:
                return "dourado";
            default:
                return "cor desconhecida";
        }
    }

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        Roda Colors = new Roda();

        System.out.print("deseja usar o vermelho? (S/N) ");
        String resposta = sc.nextLine().trim().toUpperCase();
        Colors.setRed(resposta.equals("S"));

        System.out.print("deseja usar o verde? (S/N) ");
        resposta = sc.nextLine().trim().toUpperCase();
        Colors.setGreen(resposta.equals("S"));

        System.out.print("deseja usar o azul? (S/N) ");
        resposta = sc.nextLine().trim().toUpperCase();
        Colors.setBlue(resposta.equals("S"));

        System.out.println("sua cor resultante é " + Colors.finalColor());
        
        sc.close();
    }

}
