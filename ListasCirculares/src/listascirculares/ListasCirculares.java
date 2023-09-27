/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listascirculares;

import java.util.Scanner;

/**
 *
 * @author skafi
 */
public class ListasCirculares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ColaBanco cola = new ColaBanco();
         Scanner sc =new Scanner (System.in);
String nombre;
int cant=0;
        while (cant<10) {            
            
            for (int i = 0; i < 10; i++) {
                
            
        System.out.println("Desea añadir Turno");
        String condicion=sc.next();
        if(condicion.equals("Si")){
        
             System.out.println("Cliente"+ (i+1)+"\nDigite su nombre");
nombre=sc.next();
        cola.AgregarCliente(nombre);
        }else{
          cola.mostrarCola();

        cola.atenderCliente();   
        }
 }
       cola.mostrarCola();

        cola.atenderCliente();
        }
    }}
    

