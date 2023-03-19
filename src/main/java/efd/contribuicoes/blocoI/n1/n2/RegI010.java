package efd.contribuicoes.blocoI.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoI.n1.n2.n3.RegI100;

import java.io.Serializable;
import java.util.List;

public class RegI010 implements Serializable {
	private static final long serialVersionUID = -424011208510817314L;

	@Inclui
	private final String reg = "I010";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui(zerosEsquerda = 2)
    private Integer indAtiv;

    @Inclui
    private String infoCompl;

    @Filho
    private List<RegI100> regI100;

    public RegI010(Long cnpj, Integer indAtiv, String infoCompl) {
        this.cnpj = cnpj;
        this.indAtiv = indAtiv;
        this.infoCompl = infoCompl;
    }

    public RegI010(){}

    public String getReg() {
        return reg;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getIndAtiv() {
        return indAtiv;
    }

    public void setIndAtiv(Integer indAtiv) {
        this.indAtiv = indAtiv;
    }

    public String getInfoCompl() {
        return infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }

    public List<RegI100> getRegI100() {
        return regI100;
    }

    public void setRegI100(List<RegI100> regI100) {
        this.regI100 = regI100;
    }
    
}
