package main;

import java.util.LinkedList;

public class phone_book {
    private LinkedList<String> kisi;
    private LinkedList<String> no;
    
    public phone_book() {
        kisi = new LinkedList<>();
    }
    
    public void getRehber() {
        for(int i = 0; i<kisi.size(); i++){
            System.out.println(kisi.get(i) + " " + no.get(i));
        }
    }

    public void setRehber(String kisi, String no) {
        this.kisi.add(kisi);
        this.no.add(no);
    }
    
    
    
}
