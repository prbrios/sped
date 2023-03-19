package efd.contribuicoes.blocoA.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoA.n1.n2.n3.RegA100;

import java.io.Serializable;
import java.util.List;

public class RegA010 implements Serializable {
	private static final long serialVersionUID = 4854166169609066815L;

	@Inclui
	private final String reg = "A010";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Filho
    private List<RegA100> regA100;

    public RegA010(Long cnpj) {
        this.cnpj = cnpj;
    }

    public RegA010(){ }

    public String getReg() {
        return reg;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public List<RegA100> getRegA100() {
        return regA100;
    }

    public void setRegA100(List<RegA100> regA100) {
        this.regA100 = regA100;
    }
    
}
