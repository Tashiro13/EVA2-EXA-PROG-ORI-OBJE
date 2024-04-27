/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evamen_poo_2;

/**
 *
 * @author alex_
 */
public class Evamen_POO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Com com = new Com();
        horas Hora = new horas();
        contrato cont = new contrato();
                 com.setApellido("perez");
         cont.setApellido("Marinez");
         Hora.setApellido("Jimenez");
         com.setName("Rodolfo");
         com.setName("Ali");
         com.setName("Pedro");
         com.setSalario(16);
         com.setSalario(11);
         com.setSalario(12);
        imprimirDatos(com);
        imprimirDatos(Hora);
        imprimirDatos(cont);
       
    }
    
        public static void imprimirDatos(MostrarDatos datos){
     datos.imprimirDatos();
        Com estu;
        contrato contra;
        horas hora;
        
}
}
