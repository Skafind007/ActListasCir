/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listascirculares;

/**
 *
 * @author skafi
 */
public class ColaBanco {
    private Cliente inicio;
    private Cliente fin;
    

    public ColaBanco() {
        inicio=null;
        fin=null;
    }
   public void AgregarCliente(String nombre){
       Cliente nuevoCli=new Cliente(nombre);
        if (inicio == null) {
            inicio = nuevoCli;
            fin = nuevoCli;
            nuevoCli.siguiente = inicio; // La lista es circular
        } else {
            nuevoCli.siguiente = inicio;
            fin.siguiente = nuevoCli;
            fin = nuevoCli;
        }

        System.out.println(nombre + " se ha unido a la cola.");
    
   }public void atenderCliente() {
        if (inicio != null) {
            String clienteAtendido = inicio.getNombre();
            System.out.println("Atendiendo a " + clienteAtendido);

            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {
                inicio = inicio.siguiente;
                fin.siguiente = inicio; // Actualiza el enlace para mantener la lista circular
            }
        } else {
            System.out.println("La cola está vacía. No hay clientes que atender.");
        }
    }

    public void mostrarCola() {
        if (inicio == null) {
            System.out.println("La cola está vacía.");
            return;
        }

        Cliente actual = inicio;

        System.out.println("Cola de clientes:");
        do {
            System.out.println(actual.getNombre());
            actual = actual.siguiente;
        } while (actual != inicio);
    }} 
