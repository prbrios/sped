package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco0.n1.n2.n3.n4.Reg0205;
import efd.contribuicoes.bloco0.n1.n2.n3.n4.Reg0206;
import efd.contribuicoes.bloco0.n1.n2.n3.n4.Reg0208;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Reg0200 implements Serializable {
	private static final long serialVersionUID = -2374394535670570249L;

	@Inclui
	private final String reg = "0200";

    @Inclui
    private String codItem;

    @Inclui
    private String descrItem;

    @Inclui
    private String codBarra;

    @Inclui
    private String codAndItem;

    @Inclui
    private String unidInv;

    @Inclui(zerosEsquerda = 2)
    private Integer tipoItem;

    @Inclui
    private String codNcm;

    @Inclui
    private String exIpi;

    @Inclui(zerosEsquerda = 2)
    private Integer codGen;

    @Inclui
    private Integer codLst;

    @Inclui
    private BigDecimal aliqIcms;

    @Filho
    private List<Reg0205> reg0205;

    @Filho
    private Reg0206 reg0206;

    @Filho
    private Reg0208 reg0208;

    public Reg0200(String codItem, String descrItem, String codBarra, String codAndItem, String unidInv, Integer tipoItem, String codNcm, String exIpi, Integer codGen, Integer codLst, BigDecimal aliqIcms) {
        this.codItem = codItem;
        this.descrItem = descrItem;
        this.codBarra = codBarra;
        this.codAndItem = codAndItem;
        this.unidInv = unidInv;
        this.tipoItem = tipoItem;
        this.codNcm = codNcm;
        this.exIpi = exIpi;
        this.codGen = codGen;
        this.codLst = codLst;
        this.aliqIcms = aliqIcms;
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

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getCodAndItem() {
        return codAndItem;
    }

    public void setCodAndItem(String codAndItem) {
        this.codAndItem = codAndItem;
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

    public String getCodNcm() {
        return codNcm;
    }

    public void setCodNcm(String codNcm) {
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

    public Integer getCodLst() {
        return codLst;
    }

    public void setCodLst(Integer codLst) {
        this.codLst = codLst;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
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

    public Reg0208 getReg0208() {
        return reg0208;
    }

    public void setReg0208(Reg0208 reg0208) {
        this.reg0208 = reg0208;
    }
    
}
