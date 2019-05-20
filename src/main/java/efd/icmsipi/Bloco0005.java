package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;
import java.util.List;

public class Bloco0005 {

    private String reg = "0005";
    private String fantasia;
    private String cep;
    private String end;
    private String num;
    private String compl;
    private String bairro;
    private String fone;
    private String fax;
    private String email;

    public String getReg() {
        return reg;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCompl() {
        return compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.fantasia);
        arr.add(this.cep);
        arr.add(this.end);
        arr.add(this.num);
        arr.add(this.compl);
        arr.add(this.bairro);
        arr.add(this.fone);
        arr.add(this.fax);
        arr.add(this.email);

        return Parsers.converteBlocoEmString(arr);

    }
}
