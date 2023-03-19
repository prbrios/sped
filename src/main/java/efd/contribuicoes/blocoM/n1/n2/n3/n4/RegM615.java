package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegM615 implements Serializable {
	private static final long serialVersionUID = 6707055253933656674L;

	@Inclui
	private final String reg = "M615";

    @Inclui
    private String indAjBc;

    @Inclui
    private BigDecimal vlAjBc;

    @Inclui
    private String codAjBc;

    @Inclui
    private String numDoc;

    @Inclui
    private String descrAjBc;

    @Inclui
    private LocalDate dtRef;

    @Inclui
    private String codCta;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String infoCompl;

    public RegM615(String indAjBc, BigDecimal vlAjBc, String codAjBc, String numDoc, String descrAjBc, LocalDate dtRef, String codCta, Long cnpj, String infoCompl) {
        this.indAjBc = indAjBc;
        this.vlAjBc = vlAjBc;
        this.codAjBc = codAjBc;
        this.numDoc = numDoc;
        this.descrAjBc = descrAjBc;
        this.dtRef = dtRef;
        this.codCta = codCta;
        this.cnpj = cnpj;
        this.infoCompl = infoCompl;
    }

    public RegM615(){}

    public String getReg() {
        return reg;
    }

    public String getIndAjBc() {
        return indAjBc;
    }

    public void setIndAjBc(String indAjBc) {
        this.indAjBc = indAjBc;
    }

    public BigDecimal getVlAjBc() {
        return vlAjBc;
    }

    public void setVlAjBc(BigDecimal vlAjBc) {
        this.vlAjBc = vlAjBc;
    }

    public String getCodAjBc() {
        return codAjBc;
    }

    public void setCodAjBc(String codAjBc) {
        this.codAjBc = codAjBc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getDescrAjBc() {
        return descrAjBc;
    }

    public void setDescrAjBc(String descrAjBc) {
        this.descrAjBc = descrAjBc;
    }

    public LocalDate getDtRef() {
        return dtRef;
    }

    public void setDtRef(LocalDate dtRef) {
        this.dtRef = dtRef;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getInfoCompl() {
        return infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }
    
}
