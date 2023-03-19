package efd.icmsipi.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0005 implements Serializable {
	private static final long serialVersionUID = -3244182407110706470L;

	@Inclui
    private final String reg = "0005";

    @Inclui
    private String fantasia;

    @Inclui(zerosEsquerda = 8)
    private Integer cep;

    @Inclui
    private String end;

    @Inclui
    private String num;

    @Inclui
    private String compl;

    @Inclui
    private String bairro;

    @Inclui
    private String fone;

    @Inclui
    private String fax;

    @Inclui
    private String email;

    public Reg0005(String fantasia, Integer cep, String end, String num, String compl,
                   String bairro, String fone, String fax, String email) {

        this.fantasia = fantasia;
        this.cep = cep;
        this.end = end;
        this.num = num;
        this.compl = compl;
        this.bairro = bairro;
        this.fone = fone;
        this.fax = fax;
        this.email = email;

    }

    public Reg0005(){}

    public String getReg() {
        return reg;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
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
    

}
