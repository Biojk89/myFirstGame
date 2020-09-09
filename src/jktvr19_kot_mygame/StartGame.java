/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19_kot_mygame;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class StartGame {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String enteredNumberString;
        Boolean allFine = false;
        int minInt, maxInt;
        System.out.println("Моя первая игра на Java!");
        System.out.println("Задай диапазон!");
        do {
            // Реализовать ввод до корректного ввода числового значения
            System.out.print("Минимальное число: ");
            enteredNumberString = scanner.nextLine();
            minInt = Integer.parseInt(enteredNumberString);
            System.out.print("Максимальное число: ");
            enteredNumberString = scanner.nextLine();
            maxInt = Integer.parseInt(enteredNumberString);
        
        } while(allFine == false);
        int a = rand.nextInt(maxInt - minInt + 1) + 0;
        int i = 3;
        
        System.out.println("Отгадай число от " + minInt + " до " + maxInt);
        
        System.out.print("Введи предполагаемое число, число попыток: ");
        System.out.println(i);
        do {         
            
            int enteredNumber = -1;
            try {
                enteredNumberString = scanner.nextLine();
                enteredNumber = Integer.parseInt(enteredNumberString);
            } catch(Exception e) {
                System.out.println("Ввод не верный. Введите число от 0 до 10");
                System.out.println(e);
                continue;
            }
            
            if (enteredNumber == a) {
                System.out.println("Верно");
                break;
            } else {
                i -= 1;
                if (i <= 0) {
                    break;
                }
                System.out.print("Не верно, попробуй ещё, количество попыток: ");
                System.out.println(i);
                
            }
        } while(i > 0);
        
        if (i == 0) {
            System.out.print("Повезет в любви! Моё число было - ");
            System.out.println(a);
        } else {
            System.out.println("Красавчик");
        }
    }
}
