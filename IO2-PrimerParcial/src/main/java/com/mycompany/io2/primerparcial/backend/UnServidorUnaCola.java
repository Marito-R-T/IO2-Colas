/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.io2.primerparcial.backend;

/**
 *
 * @author marito
 */
public class UnServidorUnaCola {
    
    private double miu, lamda;
    
    public UnServidorUnaCola(double miu, double lamda) {
        this.miu = miu;
        this.lamda = lamda;
    }
    
    public double obtenerUtilizacionPromedio() {
        return lamda / miu;
    }
    
    public double obtenerP(int n) {
        return (1 - this.obtenerUtilizacionPromedio()) * 
                (Math.pow(this.obtenerUtilizacionPromedio(), n));
    }
   
    public double obtenerPromedioClientesSistema() {
        return this.lamda / (this.miu - this.lamda);
    }
    
    public double obtenerLq() {
        return this.obtenerUtilizacionPromedio() * this.obtenerPromedioClientesSistema();
    }
    
    public double obtenerPromedioTiempoSistema() {
        return 1 / (this.miu - this.lamda);
    }
    
    public double obtenerWq() {
        return this.obtenerUtilizacionPromedio() * this.obtenerPromedioTiempoSistema();
    }
    
    public double obtenerPromedioClientesSistemasN(int n) {
        return (1 - (this.lamda/this.miu)) / Math.pow(this.lamda/this.miu, n);
    }
    
}
