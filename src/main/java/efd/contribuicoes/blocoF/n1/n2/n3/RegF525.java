package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegF525 implements Serializable {
	private static final long serialVersionUID = -8968465742425463371L;

	@Inclui
	private final String reg = "F525";

    @Inclui
    private BigDecimal vlRec;

    @Inclui
    private String indRec;

    @Inclui
    private String cnpjCpf;

    @Inclui
    private String numDoc;

    @Inclui
    private String codItem;

    @Inclui
    private BigDecimal vlRecDet;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private String infoComp;

    @Inclui
    private String codCta;

    public RegF525(BigDecimal vlRec, String indRec, String cnpjCpf, String numDoc, String codItem, BigDecimal vlRecDet, Integer cstPis, Integer cstCofins, String infoComp, String codCta) {
        this.vlRec = vlRec;
        this.indRec = indRec;
        this.cnpjCpf = cnpjCpf;
        this.numDoc = numDoc;
        this.codItem = codItem;
        this.vlRecDet = vlRecDet;
        this.cstPis = cstPis;
        this.cstCofins = cstCofins;
        this.infoComp = infoComp;
        this.codCta = codCta;
    }

    public RegF525(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlRec() {
        return vlRec;
    }

    public void setVlRec(BigDecimal vlRec) {
        this.vlRec = vlRec;
    }

    public String getIndRec() {
        return indRec;
    }

    public void setIndRec(String indRec) {
        this.indRec = indRec;
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getVlRecDet() {
        return vlRecDet;
    }

    public void setVlRecDet(BigDecimal vlRecDet) {
        this.vlRecDet = vlRecDet;
    }

    public Integer getCstPis() {
        return cstPis;
    }

    public void setCstPis(Integer cstPis) {
        this.cstPis = cstPis;
    }

    public Integer getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(Integer cstCofins) {
        this.cstCofins = cstCofins;
    }

    public String getInfoComp() {
        return infoComp;
    }

    public void setInfoComp(String infoComp) {
        this.infoComp = infoComp;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
}
