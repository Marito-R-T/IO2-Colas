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
public class NServidoresUnaCola {
    
    private double miu, lamda;
    private int servidores;
    
    public NServidoresUnaCola(double miu, double lamda, int servidores) {
        this.miu = miu;
        this.lamda = lamda;
        this.servidores = servidores;
    }
    
    public double obtenerTiempoServicio(){
        return 1 / miu;
    }
    
    public double obtenerUtilizacionPromedio() {
        return lamda / miu;
    }
    
    public double obtenerFactorUtilizacion() {
        return lamda / ( servidores * miu );
    }
    
    public double obtenerP0() {
        return 1 / ( sumatoria() + 
                ( ( Math.pow( ( lamda / miu ) , servidores) / factorial(servidores) ) *
                ( ( servidores * miu )  / ( ( servidores * miu ) - lamda ) ) ) );
    }
    
    public double sumatoria() {
        double sumatoria = 0;
        for (int i = 0; i < servidores; i++) {
            sumatoria += Math.pow(( lamda / miu ) , i) / this.factorial(i);
        }
        return sumatoria;
    }
    
    public int factorial(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return factorial(n -1) * n;
        }
    }
    
    public double obtenerP(int n) {
        if (n<=this.servidores){
            return ( ( Math.pow( ( lamda / miu ) , servidores) ) / factorial(servidores) ) * this.obtenerP0();
        } else {
            return ( ( Math.pow( ( lamda / miu ) , servidores) ) / ( factorial(servidores) * Math.pow(servidores, n - servidores) ) ) * this.obtenerP0();
        }
    }
    
    public double obtenerLq() {
        return ((Math.pow(lamda / miu, servidores) * lamda * miu) /
                (factorial(servidores-1) * Math.pow((servidores * miu) - lamda, 2))) *
                this.obtenerP0();
    }
    
    public double obtenerLs() {
        return obtenerLq() + ( lamda / miu );
    }
    
    public double obtenerWq() {
        return obtenerLq() / lamda;
    }
    
    public double obtenerWs() {
        return obtenerWq() + (1/miu);
    }
    
}
