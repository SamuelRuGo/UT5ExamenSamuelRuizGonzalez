/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut5examensamuelruizgonzalez;

/**
 *
 * @author samue
 */
public class Calculadora {
     /**
     * este es el primer operador de la operacion.
     */
        private int operador1;

        
     /**
     * este es el segundo operador de la operacion.
     */
        private int operador2;
     /**
     * esta es la opcion a elegir de la operacion. 
     */
        private String operacion;  

        private int oper2;
        private String operador;  


    /**
     * @return the operador1
     */
    public int getOperador1() {
        return operador1;
    }

    /**
     * @param operador1 the operador1 to set
     */
    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    /**
     * @return the operador2
     */
    public int getOper2() {
        return oper2;
    }

    /**
     * @param operador2 the operador2 to set
     */
    public void setOper2(int operador2) {
        this.oper2 = operador2;
    }

    /**
     * @return the operacion
     */
    public String getOperador() {
        return operador;
    }

    /**
     * @param operacion the operacion to set
     */
    public void setOperador(String operacion) {
        this.operador = operacion;
    }
}
