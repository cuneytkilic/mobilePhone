package main;

import java.util.Scanner;

public class calculator {
    Scanner in = new Scanner(System.in);
    
    String menu = "\n*************************************"
                + "\nChoose a type of operation...\n"
                + "1- Addition\n"
                + "2- Substraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "Press '-1' for exit";
    
    public calculator(){
        while(true){
            System.out.println(menu);
        
            System.out.print("\nYour choice: "); // menu'den işlem seçtiriyoruz.
            Byte choice = in.nextByte();
            
            //kısa kesmek için sadece toplama fonksiyonuna overloading uyguladım.
            if(choice == 1){ // toplama
                
                while(true){
                    System.out.print("Enter the count of number(2 or 3): ");
                    Byte count = in.nextByte();
                
                    if(count == 2){
                    System.out.print("Number 1: ");
                    double numberOne = in.nextDouble();
                    System.out.print("Number 2: ");
                    double numberTwo = in.nextDouble();
                    
                    System.out.println("Toplam: " + addition(numberOne,numberTwo));
                    break;
                }else if(count == 3){
                    System.out.print("Number 1: ");
                    double numberOne = in.nextDouble();
                    System.out.print("Number 2: ");
                    double numberTwo = in.nextDouble();
                    System.out.print("Number 3: ");
                    double numberThree = in.nextDouble();
                    
                    System.out.println("Result: " + addition(numberOne,numberTwo,numberThree));
                    break;
                }else{
                    System.out.println("You entered wrong character!");
                }
                }
            }else if(choice == 2){ // çıkarma
                System.out.print("Number 1: ");
                double numberOne = in.nextDouble();
                System.out.print("Number 2: ");
                double numberTwo = in.nextDouble();
                    
                System.out.println("Result: " + (numberOne-numberTwo));
            }else if(choice == 3){ // çarpma
                System.out.print("Number 1: ");
                double numberOne = in.nextDouble();
                System.out.print("Number 2: ");
                double numberTwo = in.nextDouble();
                    
                System.out.println("Result: " + (numberOne*numberTwo));
            }else if(choice == 4){ // bölme
                System.out.print("Number 1: ");
                double numberOne = in.nextDouble();
                System.out.print("Number 2: ");
                double numberTwo = in.nextDouble();
                    
                System.out.println("Result: " + (numberOne/numberTwo));
            }else if(choice == -1){
                System.out.println("Programdan çıkış yapılıyor...");
                break;
            }else{
                System.out.println("You entered wrong character!");
            }
        }
    }
    public double addition(double n1, double n2){
        return (n1 + n2);
    }
    
    public double addition(double n1, double n2, double n3){
        return (n1 + n2 + n3);
    }
}
