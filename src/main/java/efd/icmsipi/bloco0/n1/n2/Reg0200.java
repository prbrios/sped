package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0205;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0206;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0210;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0220;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Reg0200 implements Serializable {
	private static final long serialVersionUID = 8938068306248565467L;

	@Inclui
    private final String reg = "0200";

    @Inclui
    private String codItem;

    @Inclui
    private String descrItem;

    @Inclui
    private String codBarras;

    @Inclui
    private String codAntItem;

    @Inclui
    private String unidInv;

    @Inclui(zerosEsquerda = 2)
    private Integer tipoItem;

    @Inclui(zerosEsquerda = 8)
    private Integer codNcm;

    @Inclui
    private String exIpi;

    @Inclui(zerosEsquerda = 2)
    private Integer codGen;

    @Inclui
    private String codLst;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui(zerosEsquerda = 7)
    private Integer cest;

    @Filho
    private List<Reg0205> reg0205;

    @Filho
    private Reg0206 reg0206;

    @Filho
    private List<Reg0210> reg0210;

    @Filho
    private List<Reg0220> reg0220;

    public Reg0200(String codItem, String descrItem, String codBarras, String codAntItem, String unidInv,
                   Integer tipoItem, Integer codNcm, String exIpi, Integer codGen, String codLst,
                   BigDecimal aliqIcms, Integer cest) {

        this.codItem = codItem;
        this.descrItem = descrItem;
        this.codBarras = codBarras;
        this.codAntItem = codAntItem;
        this.unidInv = unidInv;
        this.tipoItem = tipoItem;
        this.codNcm = codNcm;
        this.exIpi = exIpi;
        this.codGen = codGen;
        this.codLst = codLst;
        this.aliqIcms = aliqIcms;
        this.cest = cest;
    }

    public Reg0200(){}

    public String getReg() {
        return reg;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getDescrItem() {
        return descrItem;
    }

    public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getCodAntItem() {
        return codAntItem;
    }

    public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
    }

    public String getUnidInv() {
        return unidInv;
    }

    public void setUnidInv(String unidInv) {
        this.unidInv = unidInv;
    }

    public Integer getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(Integer tipoItem) {
        this.tipoItem = tipoItem;
    }

    public Integer getCodNcm() {
        return codNcm;
    }

    public void setCodNcm(Integer codNcm) {
        this.codNcm = codNcm;
    }

    public String getExIpi() {
        return exIpi;
    }

    public void setExIpi(String exIpi) {
        this.exIpi = exIpi;
    }

    public Integer getCodGen() {
        return codGen;
    }

    public void setCodGen(Integer codGen) {
        this.codGen = codGen;
    }

    public String getCodLst() {
        return codLst;
    }

    public void setCodLst(String codLst) {
        this.codLst = codLst;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public Integer getCest() {
        return cest;
    }

    public void setCest(Integer cest) {
        this.cest = cest;
    }

    public List<Reg0205> getReg0205() {
        return reg0205;
    }

    public void setReg0205(List<Reg0205> reg0205) {
        this.reg0205 = reg0205;
    }

    public Reg0206 getReg0206() {
        return reg0206;
    }

    public void setReg0206(Reg0206 reg0206) {
        this.reg0206 = reg0206;
    }

    public List<Reg0210> getReg0210() {
        return reg0210;
    }

    public void setReg0210(List<Reg0210> reg0210) {
        this.reg0210 = reg0210;
    }

    public List<Reg0220> getReg0220() {
        return reg0220;
    }

    public void setReg0220(List<Reg0220> reg0220) {
        this.reg0220 = reg0220;
    }
    

}
