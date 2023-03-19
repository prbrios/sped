package efd.contribuicoes.blocoP.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoP.n1.n2.n3.RegP100;

import java.io.Serializable;
import java.util.List;

public class RegP010 implements Serializable {
	private static final long serialVersionUID = -5673751750710690189L;

	@Inclui
	private final String reg = "P010";

    @Inclui
    private Long cnpj;

    @Filho
    private List<RegP100> regP100;

    public RegP010(Long cnpj) {
        this.cnpj = cnpj;
    }

    public RegP010(){}

    public String getReg() {
        return reg;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public List<RegP100> getRegP100() {
        return regP100;
    }

    public void setRegP100(List<RegP100> regP100) {
        this.regP100 = regP100;
    }
    
}
