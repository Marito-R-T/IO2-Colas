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
public class NServidoresNColas {
    
    private final double miu, lamda;
    private final int servidores, colas;
    
    public NServidoresNColas(double miu, double lamda, int servidores) {
        this.miu =  miu;
        this.lamda = lamda;
        this.servidores = servidores;
        this.colas = servidores;
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
        return 1 / this.sumatoria();
    }
    
    public double sumatoria() {
        double sumatoria = 0;
        for (int i = 0; i <= this.colas; i++) {
            sumatoria += (this.factorial(this.colas)/this.factorial(this.colas - i)) *
                    Math.pow(this.lamda/this.miu, i);
        }
        return sumatoria;
    }
    
    public int factorial(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return this.factorial(n -1) * n;
        }
    }
    
    public double obtenerPn(int n) {
        return (this.factorial(this.colas)/this.factorial(this.colas-n)) * 
                Math.pow(this.lamda/this.miu, n)*this.obtenerP0();
    }
    
    public double obtenerP() {
        return 1 - this.obtenerP0();
    }
    
    public double obtenerLs() {
        return this.colas - ((this.miu/this.lamda)*(1-this.obtenerP0()));
    }
    
    public double obtenerLq() {
        return this.colas - (((this.lamda + this.miu)/this.lamda)*(1-this.obtenerP0()));
    }
    
    public double obtenerWs() {
        return this.obtenerLs() / (this.lamda*(this.colas - this.obtenerLs()));
    }
    
    public double obtenerWq() {
        return this.obtenerLq() / (this.lamda*(this.colas-this.obtenerLs()));
    }
    
    public double obtenerP0ocupados(int max_capacidad) {
        return 1 / this.sumarP0(max_capacidad);
    }
    
    public double sumarP0(int max_capacidad){
        double suma = 0;
        for (int i = 0; i < this.colas; i++) {
            suma += Math.pow(this.obtenerUtilizacionPromedio(), i) / this.factorial(i);
            System.out.println(suma);
        }
        suma += (Math.pow(this.obtenerUtilizacionPromedio(), this.colas) / this.factorial(this.colas)) * (max_capacidad - this.colas + 1);
            System.out.println(suma);
        return suma;
    }
    
    public double obtenerOcupados(int max_capacidad) {
        return (this.lamda * (1 - ((this.obtenerPelev(max_capacidad)/
                (this.factorial(this.colas)*Math.pow(this.servidores, max_capacidad - this.colas))) * 
                this.obtenerP0ocupados(max_capacidad)))) /
                (this.miu);
    }
    
    public double obtenerPelev(int numero) {
        return Math.pow(this.obtenerUtilizacionPromedio(), numero);
    }
    
    public double obtenerOciosos(int max_capacidad) {
        return this.colas - this.obtenerOcupados(max_capacidad);
    }
    
    public double obtenerPXosiosos(int max_capacidad, int x_servidores) {
        double sumatoria = 0;
        double p0 = this.obtenerP0ocupados(max_capacidad);
        for (int i = 0; i <= this.colas - x_servidores; i++) {
            if(i == 0) 
                sumatoria += p0;
            else
                sumatoria += (this.obtenerPelev(i) / this.factorial(i)) * p0;
        }
        return sumatoria;
    }
    
}
