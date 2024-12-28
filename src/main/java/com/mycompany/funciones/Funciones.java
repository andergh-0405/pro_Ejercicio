/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.funciones;

import javax.swing.JOptionPane;

/**
 *
 * @author ItsqmetEstudiantes
 */
public class Funciones {

    public static void main(String[] args) {
        String nombre;
        int edad,contador=0;
        double notas[] = {10, 6, 5, 10,8,9,6};
        double notas1[] = {10,9,8,7};
        double notas2 [] ={10,10,10,10};
        //do{

        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        
        mensaje(nombre,edad);
        //promedio (notas);
        JOptionPane.showMessageDialog(null,"El promedio es: "+promedio(notas));
        JOptionPane.showMessageDialog(null,"El promedio es: "+promedio(notas1));
        JOptionPane.showMessageDialog(null,"El promedio es: "+promedio(notas2));
        //contador ++;
        //}while(contador <= 5);
    }
    
    public static void mensaje(String nombres,int edades){
        JOptionPane.showMessageDialog(null,nombres + " tiene "+ edades +" anios");
    }
    
    static double promedio(double [] calificaciones){
        double suma=0;
        double respuesta;
        for(int i=0;i < calificaciones.length;i++){
           suma = suma +calificaciones[i]; 
        }
        respuesta = suma / calificaciones.length;
        return respuesta;
    }
    
}
