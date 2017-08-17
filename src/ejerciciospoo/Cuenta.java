/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
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
    public int numero;
    public int clave;
    public String usuario;
    public double saldo;
    
}
