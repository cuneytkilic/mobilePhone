package main;

import java.util.Scanner;

public class login {

    private String username;
    private String password;
    
    public String getUser_name() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    // kullanıcı giriş bilgileri isteniyor ve kontrol ediliyor...
   
    public void controlUserInfo(){
        int entry = 3;
        Scanner input = new Scanner(System.in);
        
        while(true){
            
            System.out.print("Username: ");
            String isim = input.nextLine();

            System.out.print("Password: ");
            String sifre = input.nextLine();

            if(username.equals(isim) && password.equals(sifre)){
                System.out.println("Entry has been completed successfully. Telephone is starting...");
                telephone telefon = new telephone();
                return;
            }else{
                entry--;
                System.out.println("\nKullanıcı adı veya Parola hatalı!\nKalan deneme hakkınız: " + entry);
            }
            // giriş hakkı kalmadığında telefon kilitleniyor.
            if(entry == 0){
                System.out.println("Access denied. Telephone is blocked!");
                return;
            }
        }
        
    }
}
