package azienda;

public class Dipendente {
    private String matricola;
    private double stipendio;
    private double straordinario;

    public Dipendente( String matricola, double stipendio, double straordinario){
        this.matricola=matricola;
        this.stipendio=stipendio;
        this.straordinario=straordinario;
    }

    public double getStipendio() { return stipendio; }
    public double paga(int oredistraordinario){
        return stipendio+(oredistraordinario*straordinario);
    }
    public String stampa(){
        return "Matricola: "+matricola+"\nStipendio: "+stipendio+"\nPrezzo per ora di straordinario: "+straordinario;
    }
}
