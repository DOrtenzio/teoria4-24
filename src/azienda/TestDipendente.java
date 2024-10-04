package azienda;

import java.util.Scanner;

public class TestDipendente {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Array
        Dipendente [] teamPulizie=new Dipendente[2];

        //Inizializzi
        for (int i=0;i<teamPulizie.length;i++){
            System.out.println("Inserire nuovo numero matricola n°"+i);
            String s=in.next();
            System.out.println("Inserire nuovo stipendio n°"+i);
            double s1=Double.parseDouble(in.next());
            System.out.println("Inserire nuovo straordinario n°"+i);
            double s2=Double.parseDouble(in.next());
            teamPulizie[i]=new Dipendente(s,s1,s2);
            System.out.println(teamPulizie[i].stampa());
        }

        //Provo altri metodi
        for (int l=0;l<teamPulizie.length;l++){
            System.out.println("Inserire ore di straordinario effetuate matricola n°"+teamPulizie[l].getMatricola());
            System.out.println("Stipendio attuale: matricola n°"+teamPulizie[l].getMatricola()+" è "+teamPulizie[l].paga(Integer.parseInt(in.next())));
            System.out.println("Inserire nuovo numero matricola");
            teamPulizie[l].setMatricola(in.next());
            System.out.println("Inserire nuovo stipendio");
            teamPulizie[l].setStipendio(Double.parseDouble(in.next()));
            System.out.println("Inserire nuovo straordinario ");
            teamPulizie[l].setStraordinario(Double.parseDouble(in.next()));
            System.out.println("Matricola: "+teamPulizie[l].getMatricola()+"\nStipendio: "+teamPulizie[l].getStipendio()+"\nPrezzo per ora di straordinario: "+ teamPulizie[l].getStraordinario());
        }


    }
}