/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class EjerciciosPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta magdalena = new Cuenta();
        magdalena.numero = 1012;
        magdalena.clave = 1234;
        magdalena.usuario = "Magdalena Sanchez";
        magdalena.saldo = 0;
        boolean resultado = magdalena.consignar(100000);
        if (resultado == true){
            System.out.println("Consignación exitosa");
        }else{
            System.out.println("Consignación no exitosa");
        }
        Cuenta joselito = new Cuenta();
        joselito.numero = 1013;
        joselito.clave = 9876;
        joselito.usuario = "Joselito Perez";
        joselito.saldo = 500000;
        resultado = joselito.cambiar_clave(5555, 9876);
        if (resultado == true){
            System.out.println("Cambio de clave exitoso");
        }else{
            System.out.println("Cambio de clave no exitoso");
        }
        System.out.println(joselito.consultar_saldo(5555));
        // TODO code application logic here
    }
    
}
