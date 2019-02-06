package main;

public class Telephone_starting {
    
    public Telephone_starting(String username, String password){
        login log = new login();
        
        log.setUsername(username);// sisteme kayıtlı kullanıcı adı olarak tanımlıyoruz.
        log.setPassword(password);// sisteme kayıtlı şifre olarak tanımlıyoruz.
        
        log.controlUserInfo(); // kullanıcıdan, kullanıcı adı ve şifre isteyerek sistemde kayıtlı olan kullanıcı adı ve şifreyle karşılaştırıyoruz. 
                               // Kullanıcı adı ve şifre doğru girilirse telefon açılıyor.
    }
}