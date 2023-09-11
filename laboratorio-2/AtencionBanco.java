import java.util.Queue;
import java.util.LinkedList;

import java.util.ArrayList;

class AtencionBanco {

  record Cliente (Integer documentoIdentidad, String nombre, String apellido){}

  public static void main(String[] args){
    
    Queue<Cliente> listaClientes = new LinkedList<Cliente>();
    
    listaClientes.add( new Cliente(3454889,"Juan","Pérez") );
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.add( new Cliente(44456456,"María","García") );
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.add( new Cliente(3487387,"Carlos","Pérez Garcia") );
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.poll();
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.poll();
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.poll();
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.add( new Cliente(8478347,"Ana","Martínez") );
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.add( new Cliente(5457557,"Luisa","Hernández") );
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.add( new Cliente(9248934,"Javier","López") );
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.add( new Cliente(3489483,"Laura","Ramírez") );
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.poll();
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.add( new Cliente(3498398,"Martín","Torres") );
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.poll();
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.add( new Cliente(9090909,"Sofia","Vargas") );
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.poll();
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.poll();
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.poll();
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.poll();
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");

    listaClientes.add( new Cliente(9389384,"Daniel","Sánchez") );
    System.out.println("Quedan " + listaClientes.size() + " clientes en la fila");
  }
}
