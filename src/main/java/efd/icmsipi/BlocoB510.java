package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class BlocoB510 {

    @Inclui private final String reg = "B510";
    @Inclui private String indProf;
    @Inclui private String indEsc;
    @Inclui private String indSoc;
    @Inclui private String cpf;
    @Inclui private String nome;

    public String getReg() {
        return reg;
    }

    public String getIndProf() {
        return indProf;
    }

    public void setIndProf(String indProf) {
        this.indProf = indProf;
    }

    public String getIndEsc() {
        return indEsc;
    }

    public void setIndEsc(String indEsc) {
        this.indEsc = indEsc;
    }

    public String getIndSoc() {
        return indSoc;
    }

    public void setIndSoc(String indSoc) {
        this.indSoc = indSoc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}
