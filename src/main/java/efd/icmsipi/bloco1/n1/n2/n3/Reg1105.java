package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.Reg1110;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Reg1105 implements Serializable {
	private static final long serialVersionUID = 2674062267724261764L;

	@Inclui
    private final String reg = "1105";

    @Inclui
    private String codMod;

    @Inclui
    private String serie;

    @Inclui
    private Long numDoc;

    @Inclui
    private String chvNfe;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private String codItem;

    @Filho
    private List<Reg1110> reg1110;

    public Reg1105(String codMod, String serie, Long numDoc, String chvNfe, LocalDate dtDoc, String codItem) {
        this.codMod = codMod;
        this.serie = serie;
        this.numDoc = numDoc;
        this.chvNfe = chvNfe;
        this.dtDoc = dtDoc;
        this.codItem = codItem;
    }

    public Reg1105(){}

    public String getReg() {
        return reg;
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

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public List<Reg1110> getReg1110() {
        return reg1110;
    }

    public void setReg1110(List<Reg1110> reg1110) {
        this.reg1110 = reg1110;
    }
    
}