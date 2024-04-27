/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evamen_poo_2;

/**
 *
 * @author alex_
 */
public class horas extends Salario implements MostrarDatos{
    String name, apellido;
    int  salario;

    public horas() {
            this.name = "nada";
        this.apellido = "nada";
        this.salario = 0;
    }

    public horas(String name, String apellido, int salario) {
        this.name = name;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int Salario) {
        this.salario = Salario;
    }
    
    @Override
    public int CalcularSalario() {
     return ((salario) * (24 * 52));
    }

    
    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + name + " " 
                + apellido + " " + CalcularSalario() );
}}