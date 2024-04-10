package Aplicacion;
import java.util.Scanner;

import Controladores.DepartamentoCrontoller;
import Modelos.Departamento;

public class Aplicacion {
    public static void main(String[] args) {
        DepartamentoCrontoller controller = new DepartamentoCrontoller();
        int seguir = 1, opc_menu = 0;
        Scanner scn = new Scanner(System.in);
        while (seguir == 1) {
            System.out.println("***** MENÚ DEPARTAMENTOS *****");
            System.out.println("1. Agregar Departamento");
            System.out.println("2. Buscar Departamento");
            System.out.println("3. Actulizar Departamento");
            System.out.println("4. Eliminar Departamento");
            System.out.print("Digite su opción: ");
            opc_menu = Integer.parseInt(scn.nextLine());
            switch (opc_menu) {
                case 1:
                    String nombre, capital, descripcion;
                    int poblacion;
                    System.out.print("Nombre: ");
                    nombre = scn.nextLine();
                    System.out.print("Capital: ");
                    capital = scn.nextLine();
                    System.out.print("Descripcion: ");
                    descripcion = scn.nextLine();
                    System.out.print("Población: ");
                    poblacion = Integer.parseInt(scn.nextLine());
                    Departamento agregDepartamento = new Departamento(nombre, capital, poblacion, descripcion);
                    controller.agregarDepartamento(agregDepartamento);
                    break;
                case 2:
                    String nombre_buscar;
                    System.out.print("Nombre: ");
                    nombre_buscar = scn.nextLine();
                    Departamento busc = controller.buscDepartamento(nombre_buscar);
                    System.out.println("Nombre: " + busc.getNombre());
                    System.out.println("Capital: "+ busc.getCapital());
                    System.out.println("Descripcion: " + busc.getDescripcion());
                    System.out.println("Población: " + busc.getPoblacion());
                break;
                case 3:
                    String nombreact, capitalact, descripcionact;
                    int poblacionact;
                    System.out.print("Nombre: ");
                    nombreact = scn.nextLine();
                    System.out.print("Capital: ");
                    capitalact = scn.nextLine();
                    System.out.print("Descripcion: ");
                    descripcionact = scn.nextLine();
                    System.out.print("Población: ");
                    poblacionact = Integer.parseInt(scn.nextLine());
                    Departamento act_dept = new Departamento(nombreact, capitalact, poblacionact, descripcionact);
                    controller.actualizarDepartamento(act_dept);
                break;
                case 4:
                    String eliminar;
                    System.out.print("Nombre: ");
                    eliminar = scn.nextLine();
                    controller.eliminarDepartamento(eliminar);
                break;
                default:
                    System.out.println("Opción no valida");
                    seguir = 0;
                    break;
            }
        }
        

    }
}

