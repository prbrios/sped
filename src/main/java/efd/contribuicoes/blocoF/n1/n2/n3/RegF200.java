package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF205;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF210;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF211;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegF200 implements Serializable {
	private static final long serialVersionUID = 2886675183928658036L;

	@Inclui
	private final String reg = "F200";

    @Inclui(zerosEsquerda = 2)
    private Integer indOper;

    @Inclui(zerosEsquerda = 2)
    private Integer unidImob;

    @Inclui
    private String identEmp;

    @Inclui
    private String descUnidImob;

    @Inclui
    private String numCont;

    @Inclui
    private String cpfCnpjAdqu;

    @Inclui(formatoData = "MMyyyy")
    private LocalDate dtOper;

    @Inclui
    private BigDecimal vlTotVend;

    @Inclui
    private BigDecimal vlRecAcum;

    @Inclui
    private BigDecimal vlTotRec;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private BigDecimal percRecReceb;

    @Inclui
    private Integer indNatEmp;

    @Inclui
    private String infComp;

    @Filho
    private List<RegF205> regF205;

    @Filho
    private List<RegF210> regF210;

    @Filho
    private List<RegF211> regF211;

    public RegF200(Integer indOper, Integer unidImob, String identEmp, String descUnidImob, String numCont, String cpfCnpjAdqu, LocalDate dtOper, BigDecimal vlTotVend, BigDecimal vlRecAcum, BigDecimal vlTotRec, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, BigDecimal percRecReceb, Integer indNatEmp, String infComp) {
        this.indOper = indOper;
        this.unidImob = unidImob;
        this.identEmp = identEmp;
        this.descUnidImob = descUnidImob;
        this.numCont = numCont;
        this.cpfCnpjAdqu = cpfCnpjAdqu;
        this.dtOper = dtOper;
        this.vlTotVend = vlTotVend;
        this.vlRecAcum = vlRecAcum;
        this.vlTotRec = vlTotRec;
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.percRecReceb = percRecReceb;
        this.indNatEmp = indNatEmp;
        this.infComp = infComp;
    }

    public RegF200(){ }

    public String getReg() {
        return reg;
    }

    public Integer getIndOper() {
        return indOper;
    }

    public void setIndOper(Integer indOper) {
        this.indOper = indOper;
    }

    public Integer getUnidImob() {
        return unidImob;
    }

    public void setUnidImob(Integer unidImob) {
        this.unidImob = unidImob;
    }

    public String getIdentEmp() {
        return identEmp;
    }

    public void setIdentEmp(String identEmp) {
        this.identEmp = identEmp;
    }

    public String getDescUnidImob() {
        return descUnidImob;
    }

    public void setDescUnidImob(String descUnidImob) {
        this.descUnidImob = descUnidImob;
    }

    public String getNumCont() {
        return numCont;
    }

    public void setNumCont(String numCont) {
        this.numCont = numCont;
    }

    public String getCpfCnpjAdqu() {
        return cpfCnpjAdqu;
    }

    public void setCpfCnpjAdqu(String cpfCnpjAdqu) {
        this.cpfCnpjAdqu = cpfCnpjAdqu;
    }

    public LocalDate getDtOper() {
        return dtOper;
    }

    public void setDtOper(LocalDate dtOper) {
        this.dtOper = dtOper;
    }

    public BigDecimal getVlTotVend() {
        return vlTotVend;
    }

    public void setVlTotVend(BigDecimal vlTotVend) {
        this.vlTotVend = vlTotVend;
    }

    public BigDecimal getVlRecAcum() {
        return vlRecAcum;
    }

    public void setVlRecAcum(BigDecimal vlRecAcum) {
        this.vlRecAcum = vlRecAcum;
    }

    public BigDecimal getVlTotRec() {
        return vlTotRec;
    }

    public void setVlTotRec(BigDecimal vlTotRec) {
        this.vlTotRec = vlTotRec;
    }

    public Integer getCstPis() {
        return cstPis;
    }

    public void setCstPis(Integer cstPis) {
        this.cstPis = cstPis;
    }

    public BigDecimal getVlBcPis() {
        return vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }

    public BigDecimal getAliqPis() {
        return aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public Integer getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(Integer cstCofins) {
        this.cstCofins = cstCofins;
    }

    public BigDecimal getVlBcCofins() {
        return vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }

    public BigDecimal getAliqCofins() {
        return aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public BigDecimal getPercRecReceb() {
        return percRecReceb;
    }

    public void setPercRecReceb(BigDecimal percRecReceb) {
        this.percRecReceb = percRecReceb;
    }

    public Integer getIndNatEmp() {
        return indNatEmp;
    }

    public void setIndNatEmp(Integer indNatEmp) {
        this.indNatEmp = indNatEmp;
    }

    public String getInfComp() {
        return infComp;
    }

    public void setInfComp(String infComp) {
        this.infComp = infComp;
    }

    public List<RegF205> getRegF205() {
        return regF205;
    }

    public void setRegF205(List<RegF205> regF205) {
        this.regF205 = regF205;
    }

    public List<RegF210> getRegF210() {
        return regF210;
    }

    public void setRegF210(List<RegF210> regF210) {
        this.regF210 = regF210;
    }

    public List<RegF211> getRegF211() {
        return regF211;
    }

    public void setRegF211(List<RegF211> regF211) {
        this.regF211 = regF211;
    }
    
}
