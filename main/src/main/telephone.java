/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

public final class telephone {
    // telefonun kullanılabilir özellikleri
    // örneğin; hesap makinesi, saat-tarih bilgisi, ses ayarı(0-100 arası), rehberde kayıtlı kişilerin listesi ...
    Scanner in = new Scanner(System.in);
    private calculator hesapla;
    private date_clock zaman;
    private Byte phoneVoice;

    public Byte getPhoneVoice() {
        return phoneVoice;
    }

    public void setPhoneVoice(Byte phoneVoice) {
        this.phoneVoice = phoneVoice;
    }
    String menu = "\n*************************************"
            + "\n--__Telefon Menüsü__--\n"
            + "1- Hesap Makinesi\n"
            + "2- Tarih-Saat bilgisi\n"
            + "3- Ses ayarı\n"
            + "4- Rehber\n"
            + "Telefonu kapatmak için 'q' tuşuna basınız.\n";
    
    public telephone(){ // default constructor
        
        phoneVoice = 50; //default phone voice
        boolean quit = true;
        while(quit){
            
            System.out.println(menu);
            System.out.print("Seçiminiz: ");
            String choice = in.nextLine();
            
            switch(choice){
                case "1":
                    hesapla = new calculator();
                    break;
                case "2":
                    zaman = new date_clock();
                    break;
                case "3":
                    System.out.println("Phone Voice: " + phoneVoice);
                    phoneVoice();
                case "q":
                    System.out.println("Telephone is shutting down..");
                    quit = false;
                    break;
                default:
                    System.out.println("You entered wrong character, please try again!");
                    break;
            }
        }
    }
    public void phoneVoice(){ 
        boolean quit = true;
        String get;
        Byte volume;
        
        while(quit){
            System.out.println("Press ' a ' to adjust the voice of telephone\n"
                             + "Press ' q ' to quit the voice application");
            
            get = in.next();
            
            switch(get){
                case "a":
                    System.out.println("how many new volume do you want to do ?");
                    volume = in.nextByte();
                    if((volume >= 0) && (volume <= 100)){
                        setPhoneVoice(volume);
                        System.out.println("New Volume: " + getPhoneVoice());
                    }
                    else{
                        System.out.println("It must be between 0 and 100");
                    }
                    break;
                case "q":
                    quit = false;
                    break;
                default:
                    System.out.println("You entered wrong character, please try again!");
                    break;
            }
        }
    }
    
}