package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;
import java.util.List;

public class Bloco0100 {

    private final String reg = "0100";
    private String nome;
    private String cpf;
    private String crc;
    private String cnpj;
    private String cep;
    private String end;
    private String num;
    private String compl;
    private String bairro;
    private String fone;
    private String fax;
    private String email;
    private String codMun;

    public String getReg() {
        return reg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCrc() {
        return crc;
    }

    public void setCrc(String crc) {
        this.crc = crc;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getCodMun() {
        return codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }

    @Override
    public String toString(){

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.nome);
        arr.add(this.cpf);
        arr.add(this.crc);
        arr.add(this.cnpj);
        arr.add(this.cep);
        arr.add(this.end);
        arr.add(this.num);
        arr.add(this.compl);
        arr.add(this.bairro);
        arr.add(this.fone);
        arr.add(this.fax);
        arr.add(this.email);
        arr.add(this.codMun);

        return Parsers.converteBlocoEmString(arr);

    }
}
