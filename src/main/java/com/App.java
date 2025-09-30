package com;

import java.util.Random;

public class App {
  public static void main(String[] args) {
    // instancia de la clase random para crear numeros aleatorios
    Random rand = new Random();
    // creo una pila de tamaño 9
    Stack<Integer> stackOne = new Stack<>(9);
    int count = 0;
    while(count < 5) {
      int newNumber = rand.nextInt(10);
      stackOne.push(newNumber);
      count++;
    }
    stackOne.showData();
    
    System.out.println("--------------------1. PRUEBA DE PILA-------------------");
    System.out.println("Tamaño actual de la pila <stackOne>: " + stackOne.length());
    System.out.println("Dato de la pila: " + stackOne.pick());
    // borrar el dato, como es una pila siempre se borra el que esta arriba
    System.out.println("-------------------BORRANDO UN DATO---------------------");
    stackOne.pop();
    System.out.println("Tamaño actual de la pila <stackOne>: " + stackOne.length());
    System.out.println("Dato de la pila: " + stackOne.pick());
    System.out.println("-------------------------------------------------------");
    System.out.println("CANTIDAD MÁXIMA DE DATOS QUE SE PUEDE GUARDAR EN LA PILA: " + stackOne.getMaxSize());
    System.out.println("-------------------------------------------------------");
    System.out.println("-------------------------------------------------------");
    System.out.println("-------------------2. USANDO 2 PILAS-------------------");
    System.out.println("-------PRIMERA PILA----------");
    Stack<Integer> newStackOne = new Stack<>(7);
    Stack<Integer> newStackTwo = new Stack<>(7);
    
    int newCount = 0;
    int[] newStackOneData = new int[7];
    while(newCount < 7){
      int newNumber = rand.nextInt(10);
      newStackOneData[newCount] = newNumber;
      newStackOne.push(newNumber);
      newCount++;
    }

    newStackOne.showData();
    System.out.println("-------SEGUNDA PILA----------");
    for (int num = newStackOneData.length - 1; num >= 0; num--) {
      newStackTwo.push(newStackOneData[num]);
    }
    newStackTwo.showData();
    System.out.println("-----------------------");

  }
}
