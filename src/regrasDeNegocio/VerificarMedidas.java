/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regrasDeNegocio;

/**
 *
 * @author 03441689216
 */
public class VerificarMedidas {
    private float lado1;
    private float lado2;
    private float lado3;
    
    public void setLado1 (float lado1){
        this.lado1 = lado1;
    }
    public void setLado2 (float lado2){
        this.lado2 = lado2;
    }
    public void setLado3 (float lado3){
        this.lado3 = lado3;
    }
    public void verificadorDeMedidas (){
        if (this.lado1==this.lado2&&this.lado2==this.lado3) {
            System.out.println("É um triangulo Equilatero");
            
        }
            if (this.lado1==this.lado2&&this.lado2!=this.lado3) {
            System.out.println("É um triangulo isosceles");
        }
        if (this.lado1!=this.lado2&&this.lado2!=this.lado3) {
            System.out.println("É um triangulo Escaleno");
        }
        
        }
           }

