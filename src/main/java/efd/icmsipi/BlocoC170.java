package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.math.BigDecimal;

public class BlocoC170 {

    /**
     * 01 - REG
     * Texto fixo contendo "C170"
     */
    @Inclui private final String reg = "C170";

    /**
     * 02 - NUM_ITEM
     * Número sequencial do item no documento fiscal
     */
    @Inclui private Integer numItem;

    /**
     * 03 - COD_ITEM
     * Código do item (campo 02 do Registro 0200)
     */
    @Inclui private String codItem;

    /**
     * 04 - DESCR_COMPL
     * Descrição complementar do item como adotado no documento fiscal
     */
    @Inclui private String descrCompl;

    /**
     * 05 - QTD
     * Quantidade do item
     */
    @Inclui private BigDecimal qtd;

    /**
     * 06 - UNID
     * Unidade do item (Campo 02 do registro 0190)
     */
    @Inclui private String unid;

    /**
     * 07 - VL_ITEM
     * Valor total do item (mercadorias ou serviços)
     */
    @Inclui private BigDecimal vlItem;

    /**
     * 08 - VL_DESC
     * Valor do desconto comercial
     */
    @Inclui private BigDecimal vlDesc;

    /**
     * 09 - IND_MOV
     * Movimentação física do ITEM/PRODUTO
     */
    @Inclui private String indMov;

    /**
     * 10 - CST_ICMS
     * Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4.3.1
     */
    @Inclui private String cstIcms;

    /**
     * 11 - CFOP
     * Código Fiscal de Operação e Prestação
     */
    @Inclui private String cfop;

    /**
     * 12 - COD_NAT
     * Código da natureza da operação (campo 02 do Registro 0400)
     */
    @Inclui private String codNat;

    /**
     * 13 - VL_BC_ICMS
     * Valor da base de cálculo do ICMS
     */
    @Inclui private BigDecimal vlBcIcms;

    /**
     * 14 - ALIQ_ICMS
     * Alíquota do ICMS
     */
    @Inclui private BigDecimal aliqIcms;

    /**
     * 15 - VL_ICMS
     * Valor do ICMS creditado/debitado
     */
    @Inclui private BigDecimal vlIcms;

    /**
     * 16 - VL_BC_ICMS_ST
     * Valor da base de cálculo referente à substituição tributária
     */
    @Inclui private BigDecimal vlBcIcmsSt;

    /**
     * 17 - ALIQ_ST
     * Alíquota do ICMS da substituição tributária na unidade da federação de destino
     */
    @Inclui private BigDecimal aliqSt;

    /**
     * 18 - VL_ICMS_ST
     * Valor do ICMS referente à substituição tributária
     */
    @Inclui private BigDecimal vlIcmsSt;

    /**
     * 19 - IND_APUR
     * Indicador de período de apuração do IPI
     */
    @Inclui private String indApur;

    /**
     * 20 - CST_IPI
     * Código da Situação Tributária referente ao IPI
     */
    @Inclui private String cstIpi;

    /**
     * 21 - COD_ENQ
     * Código de enquadramento legal do IPI
     */
    @Inclui private String codEnq;

    /**
     * 22 - VL_BC_IPI
     * Valor da base de cálculo do IPI
     */
    @Inclui private BigDecimal vlBcIpi;

    /**
     * 23 - ALIQ_IPI
     * Aliquota IPI
     */
    @Inclui private BigDecimal aliqIpi;

    /**
     * 24 - VL_IPI
     * Valor do IPI creditado/debitado
     */
    @Inclui private BigDecimal vlIpi;

    /**
     * 25 - CST_PIS
     * Código da Situação Tributária referente ao PIS
     */
    @Inclui private String cstPis;

    /**
     * 26 - VL_BC_PIS
     * Valor da base de cálculo do PIS
     */
    @Inclui private BigDecimal vlBcPis;

    /**
     * 27 - ALIQ_PIS
     * Alíquota do PIS (em percentual)
     */
    @Inclui private BigDecimal aliqPis;

    /**
     * 28 - QUANT_BC_PIS
     * Quantidade – Base de cálculo PIS
     */
    @Inclui private BigDecimal quantBcPis;

    /**
     * 29 - ALIQ_PIS
     * Alíquota do PIS (em reais)
     */
    @Inclui private BigDecimal aliqPisRs;

    /**
     * 30 - VL_PIS
     * Valor do PIS
     */
    @Inclui private BigDecimal vlPisRs;

    /**
     * 31 - CST_COFINS
     * Código da Situação Tributária referente ao COFINS
     */
    @Inclui private String cstCofins;

    /**
     * 32 - VL_BC_COFINS
     * Valor da base de cálculo da COFINS
     */
    @Inclui private BigDecimal vlBcCofins;

    /**
     * 33 - ALIQ_COFINS
     * Alíquota do COFINS (em percentual)
     */
    @Inclui private BigDecimal aliqCofins;

    /**
     * 34 - QUANT_BC_COFINS
     * Quantidade – Base de cálculo COFINS
     */
    @Inclui private BigDecimal quantBcCofins;

    /**
     * 35 - ALIQ_COFINS
     * Alíquota da COFINS (em reais)
     */
    @Inclui private BigDecimal aliqCofinsRs;

    /**
     * 36 - VL_COFINS
     * Valor da COFINS
     */
    @Inclui private BigDecimal vlCofins;

    /**
     * 37 - COD_CTA
     * Código da conta analítica contábil debitada/creditada
     */
    @Inclui private String codCta;

    /**
     * 38 - VL_ABAT_NT
     * Valor do abatimento não tributado e não comercial
     */
    @Inclui private BigDecimal vlAbatNt;

    public String getReg() {
        return reg;
    }

    public Integer getNumItem() {
        return numItem;
    }

    public void setNumItem(Integer numItem) {
        this.numItem = numItem;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getDescrCompl() {
        return descrCompl;
    }

    public void setDescrCompl(String descrCompl) {
        this.descrCompl = descrCompl;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public String getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getCodNat() {
        return codNat;
    }

    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public BigDecimal getAliqSt() {
        return aliqSt;
    }

    public void setAliqSt(BigDecimal aliqSt) {
        this.aliqSt = aliqSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public String getIndApur() {
        return indApur;
    }

    public void setIndApur(String indApur) {
        this.indApur = indApur;
    }

    public String getCstIpi() {
        return cstIpi;
    }

    public void setCstIpi(String cstIpi) {
        this.cstIpi = cstIpi;
    }

    public String getCodEnq() {
        return codEnq;
    }

    public void setCodEnq(String codEnq) {
        this.codEnq = codEnq;
    }

    public BigDecimal getVlBcIpi() {
        return vlBcIpi;
    }

    public void setVlBcIpi(BigDecimal vlBcIpi) {
        this.vlBcIpi = vlBcIpi;
    }

    public BigDecimal getAliqIpi() {
        return aliqIpi;
    }

    public void setAliqIpi(BigDecimal aliqIpi) {
        this.aliqIpi = aliqIpi;
    }

    public BigDecimal getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
    }

    public String getCstPis() {
        return cstPis;
    }

    public void setCstPis(String cstPis) {
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

    public BigDecimal getQuantBcPis() {
        return quantBcPis;
    }

    public void setQuantBcPis(BigDecimal quantBcPis) {
        this.quantBcPis = quantBcPis;
    }

    public BigDecimal getAliqPisRs() {
        return aliqPisRs;
    }

    public void setAliqPisRs(BigDecimal aliqPisRs) {
        this.aliqPisRs = aliqPisRs;
    }

    public BigDecimal getVlPisRs() {
        return vlPisRs;
    }

    public void setVlPisRs(BigDecimal vlPisRs) {
        this.vlPisRs = vlPisRs;
    }

    public String getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(String cstCofins) {
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

    public BigDecimal getQuantBcCofins() {
        return quantBcCofins;
    }

    public void setQuantBcCofins(BigDecimal quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }

    public BigDecimal getAliqCofinsRs() {
        return aliqCofinsRs;
    }

    public void setAliqCofinsRs(BigDecimal aliqCofinsRs) {
        this.aliqCofinsRs = aliqCofinsRs;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public BigDecimal getVlAbatNt() {
        return vlAbatNt;
    }

    public void setVlAbatNt(BigDecimal vlAbatNt) {
        this.vlAbatNt = vlAbatNt;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }
}
