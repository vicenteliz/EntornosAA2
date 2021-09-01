package com.mycompany.entornosaa2;

import com.mycompany.entornosaa2.Domain.Parcela;
import com.mycompany.entornosaa2.Domain.Piso;
import com.mycompany.entornosaa2.Domain.Vehiculo;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Vicente
 */
public class Agencia {

    private boolean salir;
    private Scanner teclado;
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private ArrayList<Piso> pisos = new ArrayList<>();
    private ArrayList<Parcela> parcelas = new ArrayList<>();

    public Agencia() {
        salir = false;
        teclado = new Scanner(System.in);

    }

    // Ejecutar en Application
    public void ejecutar() {

        do {
            System.out.println("Aplicación de alquileres");
            System.out.println("1: Registar un nuevo alquiler de vehiculo");
            System.out.println("2: Registrar un nuevo alquiler de piso");
            System.out.println("3: Registrar un nuevo alquiler de parcela");
            System.out.println("4: Visualizar registro de vehiculo");
            System.out.println("5: Visualizar registro de piso");
            System.out.println("6: Visualizar registro de parcela");
            System.out.println("x: Salir");

            System.out.println("Selecciona lo que desea hacer:");
            String eleccion = teclado.nextLine();

            switch (eleccion) {

                case "1":
                    registarVehiculo();
                    break;
                case "2":
                    registarPiso();
                    break;
                case "3":
                    registarParcela();
                    break;
                case "4":
                    verVehiculo();  
                    break;
                case "5":
                    verPiso();
                    break;
                case "6":
                    verParcela();
                    break;
                case "x":
                    salir = true;
                    System.out.println("Ha salido de la aplicación");
                    break;

                default:
                    System.out.println("Opción seleccionada no valida");
            }
        } while (!salir);
    }



    //registro del vehiculo

    public void registarVehiculo() {

        int idVehiculo = 0;
        String color = "";
        String matricula = "";
        int caballos = 0;
        float longitud = 0;
        
        System.out.println("Ingrese Id Vehiculo: ");
        idVehiculo = Integer.parseInt(teclado.nextLine());
        //teclado.nextLine();
        System.out.println("Ingrese color del vehiculo: ");
        color = teclado.nextLine();
        System.out.println("Ingrese la matricula del vehiculo: ");
        matricula = teclado.nextLine();
        System.out.println("Ingrese caballos del vehiculo: ");
        caballos = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese longitud del vehiculo: ");
        longitud = Float.parseFloat(teclado.nextLine());
        //teclado.nextLine();
        //Creacion de un nuevo onjeto dentro del Array
        vehiculos.add(new Vehiculo(idVehiculo, color, matricula, caballos, longitud));

    }

    // Metodo de registro de piso
    public void registarPiso() {

        int idPiso = 0;
        String ciudad = "";
        String direccion = "";
        int fechaConstruccion = 0;
        float precioDia = 0;

        System.out.println("Ingrese Id Piso: ");
        idPiso = Integer.parseInt(teclado.nextLine());
        //teclado.nextLine();
        System.out.println("Ingrese la ciudad donde se encuentra el piso: ");
        ciudad = teclado.nextLine();
        System.out.println("Ingrese la direccion del piso: ");
        direccion = teclado.nextLine();
        System.out.println("Ingrese cuando se construyo el piso: ");
        fechaConstruccion = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el precio por dia del piso: ");
        precioDia = Float.parseFloat(teclado.nextLine());
        //teclado.nextLine();
        //Creacion de un nuevo onjeto dentro del Array
        pisos.add(new Piso(idPiso, ciudad, direccion, fechaConstruccion, precioDia));

    }

    // Metodo de registro de parcela    
    public void registarParcela() {

        int idParcela = 0;
        String ciudad = "";
        String camping = "";
        int clase = 0;
        float longitud = 0;

        System.out.println("Ingrese Id Parcela: ");
        idParcela = Integer.parseInt(teclado.nextLine());
        //teclado.nextLine();
        System.out.println("Ingrese la ciudad donde se encuentra la parcela: ");
        ciudad = teclado.nextLine();
        System.out.println("Ingrese el camping donde se encuentra la parcela: ");
        camping = teclado.nextLine();
        System.out.println("Ingrese el numero identificatorio de clase de parcela: ");
        clase = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese la longitud de la parcela: ");
        longitud = Float.parseFloat(teclado.nextLine());
        //teclado.nextLine();
        //Creacion de un nuevo onjeto dentro del Array
        parcelas.add(new Parcela(idParcela, ciudad, camping, clase, longitud));

    }
    
    // Metodo de visionado de vehiculo
    public void verVehiculo() {
        
        int idVehiculo = 0;
        
        System.out.println("Ingrese Id Vehiculo: ");
        idVehiculo = teclado.nextInt() - 1;
        teclado.nextLine();

        //System.out.println("Ingrese Id Vehiculo: ");
        //idVehiculo = teclado.nextInt();
        
        System.out.println(vehiculos.get(idVehiculo));                
    }
    
    // Metodo de visionado de piso
     public void verPiso() {
        
        int idPiso = 0;
        
        System.out.println("Ingrese Id Piso: ");
        idPiso = teclado.nextInt() - 1;
        teclado.nextLine();

        //System.out.println("Ingrese Id Vehiculo: ");
        //idVehiculo = teclado.nextInt();
        
        System.out.println(pisos.get(idPiso));                
    }
     
     // Metodo de visionado de parcela
      public void verParcela() {
        
        int idParcela = 0;
        
        System.out.println("Ingrese Id Parcela: ");
        idParcela = teclado.nextInt() - 1;
        teclado.nextLine();

        //System.out.println("Ingrese Id Vehiculo: ");
        //idVehiculo = teclado.nextInt();
        
        System.out.println(parcelas.get(idParcela));                
    }

}