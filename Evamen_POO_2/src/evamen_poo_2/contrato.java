/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evamen_poo_2;

/**
 *
 * @author alex_
 */
public class contrato extends Com {

    public contrato() {
        super();
    }

    public contrato(String name, String apellido, int salario) {
        super(name, apellido, salario);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getsalario() {
        return salario;
    }

    @Override
    public void setSalario(int Salario) {
        this.salario = Salario;
    }

  @Override
    public int CalcularSalario() {
    return ((salario) * (12));
    }
    @Override
    public void imprimirDatos() {
        System.out.println("Nombre del empleado por contrato: " + name + " " 
                + apellido + " " + CalcularSalario() );
}
    
}
