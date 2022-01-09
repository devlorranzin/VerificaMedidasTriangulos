/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regrasDeNegocio;
import java.util.Scanner;
/**
 *
 * @author 03441689216
 */
public class Iniciar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner berti = new Scanner (System.in);
        System.out.print("Digite um numero: ");
        float lado1 = berti.nextFloat();
        System.out.print("Digite o 2 valor: ");
        float lado2 = berti.nextFloat();
        System.out.print("Digite o 3 valor: ");
        float lado3 = berti.nextFloat();
        
        VerificarMedidas te = new VerificarMedidas ();
            
        te.setLado1(lado1);
        te.setLado2(lado2);
        te.setLado3(lado3);
        te.verificadorDeMedidas();
        
    }
    
}
