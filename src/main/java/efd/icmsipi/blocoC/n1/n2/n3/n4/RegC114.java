package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.time.LocalDate;

public class RegC114 implements Serializable {
	private static final long serialVersionUID = 8850413375192512657L;

	@Inclui
    private final String reg = "C114";

    @Inclui
    private String codMod;

    @Inclui
    private String ecfFab;

    @Inclui
    private Integer ecfCx;

    @Inclui
    private Long numDoc;

    @Inclui
    private LocalDate dtDoc;

    public RegC114(String codMod, String ecfFab, Integer ecfCx, Long numDoc, LocalDate dtDoc) {
        this.codMod = codMod;
        this.ecfFab = ecfFab;
        this.ecfCx = ecfCx;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
    }

    public RegC114(){}

    public String getReg() {
        return reg;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getEcfFab() {
        return ecfFab;
    }

    public void setEcfFab(String ecfFab) {
        this.ecfFab = ecfFab;
    }

    public Integer getEcfCx() {
        return ecfCx;
    }

    public void setEcfCx(Integer ecfCx) {
        this.ecfCx = ecfCx;
    }

    public Long getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Long numDoc) {
        this.numDoc = numDoc;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }
    
}
