package efd.ecd.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0020 implements Serializable {
	private static final long serialVersionUID = -1480265738284401174L;

	@Inclui
    private final String reg = "0020";

    @Inclui
    private Integer indDec;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String uf;

    @Inclui
    private String ie;

    @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Inclui
    private String im;

    @Inclui(zerosEsquerda = 11)
    private Long nire;

    public Reg0020(Integer indDec, Long cnpj, String uf, String ie, Integer codMun, String im, Long nire) {
        this.indDec = indDec;
        this.cnpj = cnpj;
        this.uf = uf;
        this.ie = ie;
        this.codMun = codMun;
        this.im = im;
        this.nire = nire;
    }

    public Reg0020(){/* */}

    public String getReg() {
        return reg;
    }

    public Integer getIndDec() {
        return indDec;
    }

    public void setIndDec(Integer indDec) {
        this.indDec = indDec;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public Integer getCodMun() {
        return codMun;
    }

    public void setCodMun(Integer codMun) {
        this.codMun = codMun;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public Long getNire() {
        return nire;
    }

    public void setNire(Long nire) {
        this.nire = nire;
    }
    
    
}
