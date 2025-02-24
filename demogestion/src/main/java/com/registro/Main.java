package com.registro;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String, Double> notas = new HashMap<>();


        System.out.println("Ingrese la cantidad de estudiante");
        int cantidad = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese la nota del estudiante " + nombre + ":");
            double nota = teclado.nextDouble();
            teclado.nextLine();


            notas.put(nombre, nota);

             
        }

        System.out.println("\n Lista de estudiante y su nota: ");
        for(Map.Entry<String, Double> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\n Ingrese el nombre del estudiante para buscar la nota: ");
        String nombre = teclado.nextLine();

        if (notas.containsKey(nombre)) {
            System.out.println("La nota de " + nombre + " es: " + notas.get(nombre));
            
        } else {
            System.out.println("Estudiante no encontrado");
        }
       
        //encontrar la nota mas alta del estudiante con mejor rendimieento

        String mejorEstudiante  = "";
        double notaMaxima = Double.MIN_VALUE;

        for(Map.Entry<String, Double> entry : notas.entrySet()) {
            if (entry.getValue() > notaMaxima) {
                notaMaxima = entry.getValue();
                mejorEstudiante = entry.getKey();
            }
        }

        System.out.println("\nEl estudiante con mejor rendimiento es: " + mejorEstudiante + " con unna nota de " + notaMaxima);
    }
}