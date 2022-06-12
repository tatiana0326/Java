package com.tatianatab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner obj= new Scanner (System.in);

        //PREGUNTA 01
        String nombre;
        String hab;
        System.out.println("***************************");
        System.out.println("BIENVENIDO");
        System.out.println("***************************");
        System.out.println("Ingrese su Nombre de Usuario:");
        nombre=obj.nextLine();
        System.out.println("Ingrese su Habilidad:");
        hab=obj.nextLine();

        System.out.println (nombre+" es "+hab) ;


        //PREGUNTA 02
        int a;
        Cuadrado square = (int x) -> x * x;
        System.out.println("***************************");
        System.out.println("Ingrese un número entero:");
        System.out.println("***************************");
        a=obj.nextInt();
        int answer = square.calculate(a);
        System.out.println(a+" al cuadro es: "+answer);

        //PREGUNTA 03
        double area;
        double radio;
        double circf;
        System.out.println("***************************");
        System.out.println("Ingrese el radio de un circulo:");
        System.out.println("***************************");
        radio = obj.nextDouble();
        area=Math.PI*(radio*radio);
        circf=2*Math.PI*radio;
        System.out.println("El área es: "+ area);
        System.out.println("La circunferencia es: "+ circf);

        //PREGUNTA 04
        List<Automovil> autmoviles = new ArrayList<>();

        Automovil autom1 = new Automovil("Mazda",2008, "KT",24,"turistico");
        Automovil autom2 = new Automovil("Honda",1958, "X6",60,"deportivo");
        Automovil autom3 = new Automovil("Ford",2003, "MK",35,"comercial");
        Automovil autom4 = new Automovil("Daimler",2021, "LW",71,"turistico");

        autmoviles.add(autom1);
        autmoviles.add(autom2);
        autmoviles.add(autom3);
        autmoviles.add(autom4);

        Iterator<Automovil> customerIterator = autmoviles.iterator();
        System.out.println("***************************");
        System.out.println("Lista de Automoviles");
        System.out.println("***************************");

        while (customerIterator.hasNext()){
            System.out.println(customerIterator.next());
        }


        //PREGUNTA 05
        int num;
        num = 8;
        //System.out.println("Ingrese un número :");
        //num=obj.nextInt();

        System.out.println("***************************");
        System.out.println(num + " es par o impar?");

        if (Par.esPar(num)) {
            System.out.println("La respuesta es: par");
        } else {
            System.out.println("La respuesta es: impar");
        }

        //PREGUNTA 06
        double uno=6.3;
        double dos=4.2;
        double respt = uno * dos;
        System.out.println("***************************");
        System.out.println(uno + " * "+dos);
        System.out.println("La respuesta es: "+respt);
    }

}


