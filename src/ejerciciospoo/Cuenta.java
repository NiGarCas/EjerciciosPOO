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
public class Cuenta {
    //Metodos
    public boolean consignar (double monto){
        if (monto > 0){
            this.saldo = this.saldo + monto;
            return true;
        }else{
            return false;
        }
    }
    public boolean retirar (double monto){
        if ((monto > 0) && (monto <= saldo)){
            this.saldo = this.saldo - monto;
            return true;
        }else{
            return false;
        }
    }
    public boolean cambiar_clave (int nueva_clave, int clave_actual){
        if (clave_actual != this.clave){
            System.out.println("Clave actual incorrecta");
            return false;
        }else{
            this.clave = nueva_clave;
            return true;
        }
    }
    public double consultar_saldo (int clave_actual){
        return this.saldo;
    }
    //Atributos
    public int numero;
    public int clave;
    public String usuario;
    public double saldo;
    //Atributos
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
