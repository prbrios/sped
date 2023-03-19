package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.n5.RegC465;
import efd.icmsipi.blocoC.n1.n2.n3.n4.n5.RegC470;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC460 implements Serializable {
	private static final long serialVersionUID = -5295308192945046479L;

	@Inclui
    private final String reg = "C460";

    @Inclui
    private String codMod;

    @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Inclui
    private Long numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui(zerosEsquerda = 14)
    private Long cpfCnpj;

    @Inclui
    private String nomAdq;

    @Filho
    private RegC465 regC465;

    @Filho
    private List<RegC470> regC470;

    public RegC460(String codMod, Integer codSit, Long numDoc, LocalDate dtDoc, BigDecimal vlDoc, BigDecimal vlPis, BigDecimal vlCofins, Long cpfCnpj, String nomAdq) {
        this.codMod = codMod;
        this.codSit = codSit;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.vlDoc = vlDoc;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.cpfCnpj = cpfCnpj;
        this.nomAdq = nomAdq;
    }

    public RegC460(){}

    public String getReg() {
        return reg;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public Integer getCodSit() {
        return codSit;
    }

    public void setCodSit(Integer codSit) {
        this.codSit = codSit;
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

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public Long getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(Long cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNomAdq() {
        return nomAdq;
    }

    public void setNomAdq(String nomAdq) {
        this.nomAdq = nomAdq;
    }

    public RegC465 getRegC465() {
        return regC465;
    }

    public void setRegC465(RegC465 regC465) {
        this.regC465 = regC465;
    }

    public List<RegC470> getRegC470() {
        return regC470;
    }

    public void setRegC470(List<RegC470> regC470) {
        this.regC470 = regC470;
    }
    
}