package com.upchiapas.examen;

import java.util.Arrays;
import java.util.Scanner;

public class Tienda {

    static Pizza listaPizzas[];
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

    }
    public static void ordenP(){
        int opcion = 0;
        do {
            Pizza peperoni = new Pizza("Peperoni", 180);
            Pizza hawaina = new Pizza("Hawaina", 200);
            Pizza queso = new Pizza("Queso", 280);
            int op;
            int cantidad;
            String nombre;
            System.out.println("-----------PIZZERIA PIZZASTIFF---------\n");
            System.out.println("Ingrese su nombre: ");
            nombre = entrada.next();
            System.out.println("¿Cuantas pizzas desea ordenar?");
            cantidad = entrada.nextInt();
            listaPizzas = new Pizza[cantidad];
            CatalogoPizza.menu();
            System.out.println("Eliga la opcion de la pizza que usted quiera: ");
            op = entrada.nextInt();
                switch (op){
                    case 1:
                        listaPizzas[0] = peperoni;
                        ticketPepe(cantidad,nombre);
                        break;
                    case 2:
                        listaPizzas[1] = hawaina;
                        ticketHawai(cantidad, nombre);
                        break;
                    case 3:
                        listaPizzas[2] = queso;
                        ticketQueso(cantidad, nombre);
                        break;
                }
        }while (opcion != 3);

    }

    public static void ticketPepe(int cantidad, String nombre){
        System.out.println("Su compra fue la siguiente: ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Usted compro: "+cantidad+" Pizzas");
        System.out.println(listaPizzas[0]+" x "+ cantidad);
        System.out.println("El monto total es "+ cantidad*180);
        System.out.println("¿Cómo le atendimos?");
        System.out.println("www.pizzastiffmx.com");
    }

    public static void ticketHawai(int cantidad, String nombre){
        System.out.println("Su compra fue la siguiente: ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Usted compro: "+cantidad+" Pizzas");
        System.out.println(listaPizzas[1]+" x "+ cantidad);
        System.out.println("El monto total es "+ cantidad*200);
        System.out.println("¿Cómo le atendimos?");
        System.out.println("www.pizzastiffmx.com");
    }

    public static void ticketQueso(int cantidad, String nombre){
        System.out.println("Su compra fue la siguiente: ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Usted compro: "+cantidad+" Pizzas");
        System.out.println(listaPizzas[2]+" x "+ cantidad);
        System.out.println("El monto total es "+ cantidad*280);
        System.out.println("¿Cómo le atendimos?");
        System.out.println("www.pizzastiffmx.com");
    }

}
