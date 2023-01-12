/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion1;

import java.util.Scanner;

/**
 *
 * @author fenix
 */
public class SESION1 {

    Persona persona = new Persona();
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Ingrese Opcion");
        op = ent.nextByte();
        
        
        switch(op){
            
            case 1:
                Persona p1 = new Persona();
                System.out.println("Datos primera persona");              
                System.out.println("Nombre" + " " + p1.getNombre());
                System.out.println("Paterno" + " "+ p1.getAp_paterno());
                System.out.println("Materno" + " " + p1.getAp_materno());
                System.out.println("Edad" + " " + p1.getEdad());

                   Persona p2 = new Persona();
                   p2.setNombre("Felix");
                    p2.setAp_paterno("Lamadrid");
                System.out.println("Datos primera persona");              
                System.out.println("Nombre" + " " + p2.getNombre());
                System.out.println("Paterno" + " "+ p2.getAp_paterno());
                System.out.println("Materno" + " " + p2.getAp_materno());
                System.out.println("Edad" + " " + p2.getEdad());
                break;
        }
    }
    
}
