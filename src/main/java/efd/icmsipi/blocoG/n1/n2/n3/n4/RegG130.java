package efd.icmsipi.blocoG.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.n3.n4.n5.RegG140;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class RegG130 implements Serializable {
	private static final long serialVersionUID = 744845467171861085L;

	@Inclui
    private final String reg = "G130";

    @Inclui
    private String indEmit;

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui
    private String serie;

    @Inclui
    private Long numDoc;

    @Inclui
    private String chvNfeCte;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private String numDa;

    @Filho
    private List<RegG140> regG140;

    public RegG130(String indEmit, String codPart, String codMod, String serie, Long numDoc, String chvNfeCte, LocalDate dtDoc) {
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codMod = codMod;
        this.serie = serie;
        this.numDoc = numDoc;
        this.chvNfeCte = chvNfeCte;
        this.dtDoc = dtDoc;
    }

    public RegG130(){}

    public String getReg() {
        return reg;
    }

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Long getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Long numDoc) {
        this.numDoc = numDoc;
    }

    public String getChvNfeCte() {
        return chvNfeCte;
    }

    public void setChvNfeCte(String chvNfeCte) {
        this.chvNfeCte = chvNfeCte;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public String getNumDa() {
        return numDa;
    }

    public void setNumDa(String numDa) {
        this.numDa = numDa;
    }

    public List<RegG140> getRegG140() {
        return regG140;
    }

    public void setRegG140(List<RegG140> regG140) {
        this.regG140 = regG140;
    }
    
}