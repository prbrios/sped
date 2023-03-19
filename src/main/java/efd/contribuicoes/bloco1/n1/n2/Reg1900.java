package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1900 implements Serializable {
	private static final long serialVersionUID = 5245162614486968297L;

	@Inclui
	private final String reg = "1900";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer subSer;

    @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Inclui
    private BigDecimal vltotRec;

    @Inclui
    private Integer quantDoc;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private String infCompl;

    @Inclui
    private String codCta;

    public Reg1900(Long cnpj, String codMod, String ser, Integer subSer, Integer codSit, BigDecimal vltotRec, Integer quantDoc, Integer cstPis, Integer cstCofins, Integer cfop, String infCompl, String codCta) {
        this.cnpj = cnpj;
        this.codMod = codMod;
        this.ser = ser;
        this.subSer = subSer;
        this.codSit = codSit;
        this.vltotRec = vltotRec;
        this.quantDoc = quantDoc;
        this.cstPis = cstPis;
        this.cstCofins = cstCofins;
        this.cfop = cfop;
        this.infCompl = infCompl;
        this.codCta = codCta;
    }

    public Reg1900(){ }

    public String getReg() {
        return reg;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
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

    public Integer getSubSer() {
        return subSer;
    }

    public void setSubSer(Integer subSer) {
        this.subSer = subSer;
    }

    public Integer getCodSit() {
        return codSit;
    }

    public void setCodSit(Integer codSit) {
        this.codSit = codSit;
    }

    public BigDecimal getVltotRec() {
        return vltotRec;
    }

    public void setVltotRec(BigDecimal vltotRec) {
        this.vltotRec = vltotRec;
    }

    public Integer getQuantDoc() {
        return quantDoc;
    }

    public void setQuantDoc(Integer quantDoc) {
        this.quantDoc = quantDoc;
    }

    public Integer getCstPis() {
        return cstPis;
    }

    public void setCstPis(Integer cstPis) {
        this.cstPis = cstPis;
    }

    public Integer getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(Integer cstCofins) {
        this.cstCofins = cstCofins;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public String getInfCompl() {
        return infCompl;
    }

    public void setInfCompl(String infCompl) {
        this.infCompl = infCompl;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
}
