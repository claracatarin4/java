package AV1triangulo;
import java.util.Scanner;

public class Triangulo {
	
	Scanner sc = new Scanner(System.in);
	
	private int ladoA , ladoB , ladoC;
	
	
	public void lerLados() {
		
		
		System.out.println("Insira um número:");
		this.ladoA = sc.nextInt();
		
		System.out.println("Insira o segundo número:");
		this.ladoB = sc.nextInt();
		
		System.out.println("Insira o terceiro número:");
		this.ladoC = sc.nextInt();
		
		
	}
	
	public boolean checaValidade() {
		
		if ((this.ladoA > 0) &  (this.ladoB > 0) & (this.ladoC > 0)) {
			
			
			if (this.ladoA + this.ladoB <= this.ladoC ||
	             this.ladoC + this.ladoA <= this.ladoB ||
	             this.ladoB + this.ladoC <= this.ladoA) {
			 
	            System.out.println("Não é triângulo!!");	            
	            return false;
	       
	        	} else {
	        		return true;
	        	}
	        		
	  
	        } else {
	        	return false;
	        }
				
		}
	
	public void tipoTriangulo() {
		
	    if (this.ladoA == this.ladoB && this.ladoA == this.ladoC) {
	        System.out.println("é um triângulo equilátero!");
	        
	    } else if (this.ladoA == this.ladoB || this.ladoA == this.ladoC || this.ladoB == this.ladoC) {
	        System.out.println("é um triângulo isóceles!!");
	        
	    } else {
	        System.out.println("é um triângulo escaleno!!");
	    }
	}
	
	public static void main(String[] args) {
		
        Triangulo triangulo = new Triangulo();

        triangulo.lerLados();
        
        if (triangulo.checaValidade()) {
            triangulo.tipoTriangulo();
        }
		
			
	}
	
		

}
