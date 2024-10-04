package azienda;

import java.util.Scanner;

public class TestDipendente {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Dipendente m1=new Dipendente("00309",1000.00,7.5);
        System.out.println(m1.stampa());
        System.out.println("Inserire ore di straordinario effetuate");
        System.out.println("Stipendio attuale: "+m1.paga(Integer.parseInt(in.next())));
        System.out.println("Inserire nuovo numero matricola");
        m1.setMatricola(in.next());
        System.out.println("Inserire nuovo stipendio");
        m1.setStipendio(Double.parseDouble(in.next()));
        System.out.println("Inserire nuovo stipendio ");
        m1.setStraordinario(Double.parseDouble(in.next()));
        System.out.println("Matricola: "+m1.getMatricola()+"\nStipendio: "+m1.getStipendio()+"\nPrezzo per ora di straordinario: "+ m1.getStraordinario());
    }
}