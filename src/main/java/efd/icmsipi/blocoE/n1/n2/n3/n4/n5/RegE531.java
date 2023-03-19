package efd.icmsipi.blocoE.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegE531 implements Serializable {
	private static final long serialVersionUID = -2582122340408243674L;

	@Inclui
    private final String reg = "E531";

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer sub;

    @Inclui
    private Long numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private String codItem;

    @Inclui
    private BigDecimal vlAjitem;

    @Inclui
    private String chvNfe;

    public RegE531(String codPart, String codMod, String ser, Integer sub, Long numDoc, LocalDate dtDoc, String codItem, BigDecimal vlAjitem, String chvNfe) {
        this.codPart = codPart;
        this.codMod = codMod;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.codItem = codItem;
        this.vlAjitem = vlAjitem;
        this.chvNfe = chvNfe;
    }

    public RegE531(){}

    public String getReg() {
        return reg;
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

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public Integer getSub() {
        return sub;
    }

    public void setSub(Integer sub) {
        this.sub = sub;
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

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getVlAjitem() {
        return vlAjitem;
    }

    public void setVlAjitem(BigDecimal vlAjitem) {
        this.vlAjitem = vlAjitem;
    }

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }
    
}