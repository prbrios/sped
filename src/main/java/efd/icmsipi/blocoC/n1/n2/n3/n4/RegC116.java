package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.time.LocalDate;

public class RegC116 implements Serializable {
	private static final long serialVersionUID = -5350329206951233157L;

	@Inclui
    private final String reg = "C116";

    @Inclui
    private String codMod;

    @Inclui
    private Long nrSat;

    @Inclui
    private String chvNfe;

    @Inclui
    private Integer numCfe;

    @Inclui
    private LocalDate dtDoc;

    public RegC116(String codMod, Long nrSat, String chvNfe, Integer numCfe, LocalDate dtDoc) {
        this.codMod = codMod;
        this.nrSat = nrSat;
        this.chvNfe = chvNfe;
        this.numCfe = numCfe;
        this.dtDoc = dtDoc;
    }

    public RegC116(){}

    public String getReg() {
        return reg;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public Long getNrSat() {
        return nrSat;
    }

    public void setNrSat(Long nrSat) {
        this.nrSat = nrSat;
    }

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    public Integer getNumCfe() {
        return numCfe;
    }

    public void setNumCfe(Integer numCfe) {
        this.numCfe = numCfe;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }
    
}
