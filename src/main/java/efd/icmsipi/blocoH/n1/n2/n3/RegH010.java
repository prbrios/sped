package efd.icmsipi.blocoH.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoH.n1.n2.n3.n4.RegH020;
import efd.icmsipi.blocoH.n1.n2.n3.n4.RegH030;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegH010 implements Serializable {
	private static final long serialVersionUID = -165643234053049370L;

	@Inclui
    private final String reg = "H010";

    @Inclui
    private String codImtem;

    @Inclui
    private String unid;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui
    private BigDecimal vlUnit;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private String indProp;

    @Inclui
    private String codPart;

    @Inclui
    private String txtCompl;

    @Inclui
    private String codCta;

    @Inclui
    private BigDecimal vlItemIr;

    @Filho
    private List<RegH020> regH020;

    @Filho
    private RegH030 regH030;

    public RegH010(String codImtem, String unid, BigDecimal qtd, BigDecimal vlUnit, BigDecimal vlItem, String indProp, String codPart, String txtCompl, String codCta, BigDecimal vlItemIr) {
        this.codImtem = codImtem;
        this.unid = unid;
        this.qtd = qtd;
        this.vlUnit = vlUnit;
        this.vlItem = vlItem;
        this.indProp = indProp;
        this.codPart = codPart;
        this.txtCompl = txtCompl;
        this.codCta = codCta;
        this.vlItemIr = vlItemIr;
    }

    public RegH010(){}

    public String getReg() {
        return reg;
    }

    public String getCodImtem() {
        return codImtem;
    }

    public void setCodImtem(String codImtem) {
        this.codImtem = codImtem;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public BigDecimal getVlUnit() {
        return vlUnit;
    }

    public void setVlUnit(BigDecimal vlUnit) {
        this.vlUnit = vlUnit;
    }

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }

    public String getIndProp() {
        return indProp;
    }

    public void setIndProp(String indProp) {
        this.indProp = indProp;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public BigDecimal getVlItemIr() {
        return vlItemIr;
    }

    public void setVlItemIr(BigDecimal vlItemIr) {
        this.vlItemIr = vlItemIr;
    }

    public List<RegH020> getRegH020() {
        return regH020;
    }

    public void setRegH020(List<RegH020> regH020) {
        this.regH020 = regH020;
    }

    public RegH030 getRegH030() {
        return regH030;
    }

    public void setRegH030(RegH030 regH030) {
        this.regH030 = regH030;
    }
    
}