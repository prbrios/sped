package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BlocoC170 {

    /**
     * 01 - REG
     * Texto fixo contendo "C170"
     */
    private final String reg = "C170";

    /**
     * 02 - NUM_ITEM
     * Número sequencial do item no documento fiscal
     */
    private Integer numItem;

    /**
     * 03 - COD_ITEM
     * Código do item (campo 02 do Registro 0200)
     */
    private String codItem;

    /**
     * 04 - DESCR_COMPL
     * Descrição complementar do item como adotado no documento fiscal
     */
    private String descrCompl;

    /**
     * 05 - QTD
     * Quantidade do item
     */
    private BigDecimal qtd;

    /**
     * 06 - UNID
     * Unidade do item (Campo 02 do registro 0190)
     */
    private String unid;

    /**
     * 07 - VL_ITEM
     * Valor total do item (mercadorias ou serviços)
     */
    private BigDecimal vlItem;

    /**
     * 08 - VL_DESC
     * Valor do desconto comercial
     */
    private BigDecimal vlDesc;

    /**
     * 09 - IND_MOV
     * Movimentação física do ITEM/PRODUTO
     */
    private IndMov indMov;

    /**
     * 10 - CST_ICMS
     * Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4.3.1
     */
    private String cstIcms;

    /**
     * 11 - CFOP
     * Código Fiscal de Operação e Prestação
     */
    private String cfop;

    /**
     * 12 - COD_NAT
     * Código da natureza da operação (campo 02 do Registro 0400)
     */
    private String codNat;

    /**
     * 13 - VL_BC_ICMS
     * Valor da base de cálculo do ICMS
     */
    private BigDecimal vlBcIcms;

    /**
     * 14 - ALIQ_ICMS
     * Alíquota do ICMS
     */
    private BigDecimal aliqIcms;

    /**
     * 15 - VL_ICMS
     * Valor do ICMS creditado/debitado
     */
    private BigDecimal vlIcms;

    /**
     * 16 - VL_BC_ICMS_ST
     * Valor da base de cálculo referente à substituição tributária
     */
    private BigDecimal vlBcIcmsSt;

    /**
     * 17 - ALIQ_ST
     * Alíquota do ICMS da substituição tributária na unidade da federação de destino
     */
    private BigDecimal aliqSt;

    /**
     * 18 - VL_ICMS_ST
     * Valor do ICMS referente à substituição tributária
     */
    private BigDecimal vlIcmsSt;

    /**
     * 19 - IND_APUR
     * Indicador de período de apuração do IPI
     */
    private IndApur indApur;

    /**
     * 20 - CST_IPI
     * Código da Situação Tributária referente ao IPI
     */
    private String cstIpi;

    /**
     * 21 - COD_ENQ
     * Código de enquadramento legal do IPI
     */
    private String codEnq;

    /**
     * 22 - VL_BC_IPI
     * Valor da base de cálculo do IPI
     */
    private BigDecimal vlBcIpi;

    /**
     * 23 - ALIQ_IPI
     * Aliquota IPI
     */
    private BigDecimal aliqIpi;

    /**
     * 24 - VL_IPI
     * Valor do IPI creditado/debitado
     */
    private BigDecimal vlIpi;

    /**
     * 25 - CST_PIS
     * Código da Situação Tributária referente ao PIS
     */
    private String cstPis;

    /**
     * 26 - VL_BC_PIS
     * Valor da base de cálculo do PIS
     */
    private BigDecimal vlBcPis;

    /**
     * 27 - ALIQ_PIS
     * Alíquota do PIS (em percentual)
     */
    private BigDecimal aliqPis;

    /**
     * 28 - QUANT_BC_PIS
     * Quantidade – Base de cálculo PIS
     */
    private BigDecimal quantBcPis;

    /**
     * 29 - ALIQ_PIS
     * Alíquota do PIS (em reais)
     */
    private BigDecimal aliqPisRs;

    /**
     * 30 - VL_PIS
     * Valor do PIS
     */
    private BigDecimal vlPisRs;

    /**
     * 31 - CST_COFINS
     * Código da Situação Tributária referente ao COFINS
     */
    private String cstCofins;

    /**
     * 32 - VL_BC_COFINS
     * Valor da base de cálculo da COFINS
     */
    private BigDecimal vlBcCofins;

    /**
     * 33 - ALIQ_COFINS
     * Alíquota do COFINS (em percentual)
     */
    private BigDecimal aliqCofins;

    /**
     * 34 - QUANT_BC_COFINS
     * Quantidade – Base de cálculo COFINS
     */
    private BigDecimal quantBcCofins;

    /**
     * 35 - ALIQ_COFINS
     * Alíquota da COFINS (em reais)
     */
    private BigDecimal aliqCofinsRs;

    /**
     * 36 - VL_COFINS
     * Valor da COFINS
     */
    private BigDecimal vlCofins;

    /**
     * 37 - COD_CTA
     * Código da conta analítica contábil debitada/creditada
     */
    private String codCta;

    /**
     * 38 - VL_ABAT_NT
     * Valor do abatimento não tributado e não comercial
     */
    private BigDecimal vlAbatNt;

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

    public IndMov getIndMov() {
        return indMov;
    }

    public void setIndMov(IndMov indMov) {
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

    public IndApur getIndApur() {
        return indApur;
    }

    public void setIndApur(IndApur indApur) {
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

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.numItem);
        arr.add(this.codItem);
        arr.add(this.descrCompl);
        arr.add(this.qtd != null ? Parsers.formataNumero(this.qtd, 2) : null);
        arr.add(this.unid);
        arr.add(this.vlItem != null ? Parsers.formataNumero(this.vlItem, 2) : null);
        arr.add(this.vlDesc != null ? Parsers.formataNumero(this.vlDesc, 2) : null);
        arr.add(this.indMov != null ? this.indMov.getCodigo() : null);
        arr.add(this.cstIcms);
        arr.add(this.cfop);
        arr.add(this.codNat);
        arr.add(this.vlBcIcms != null ? Parsers.formataNumero(this.vlBcIcms, 2) : null);
        arr.add(this.aliqIcms != null ? Parsers.formataNumero(this.aliqIcms, 2) : null);
        arr.add(this.vlIcms != null ? Parsers.formataNumero(this.vlIcms, 2) : null);
        arr.add(this.vlBcIcmsSt != null ? Parsers.formataNumero(this.vlBcIcmsSt, 2) : null);
        arr.add(this.aliqSt != null ? Parsers.formataNumero(this.aliqSt, 2) : null);
        arr.add(this.vlIcmsSt != null ? Parsers.formataNumero(this.vlIcmsSt, 2) : null);
        arr.add(this.indApur != null ? this.indApur.getCodigo() : null);
        arr.add(this.cstIpi);
        arr.add(this.codEnq);
        arr.add(this.vlBcIpi != null ? Parsers.formataNumero(this.vlBcIpi, 2) : null);
        arr.add(this.aliqIpi != null ? Parsers.formataNumero(this.aliqIpi, 2) : null);
        arr.add(this.vlIpi != null ? Parsers.formataNumero(this.vlIpi, 2) : null);
        arr.add(this.cstPis);
        arr.add(this.vlBcPis != null ? Parsers.formataNumero(this.vlBcPis, 2) : null);
        arr.add(this.aliqPis != null ? Parsers.formataNumero(this.aliqPis, 2) : null);
        arr.add(this.quantBcPis != null ? Parsers.formataNumero(this.quantBcPis, 2) : null);
        arr.add(this.aliqPisRs != null ? Parsers.formataNumero(this.aliqPisRs, 2) : null);
        arr.add(this.vlPisRs != null ? Parsers.formataNumero(this.vlPisRs, 2) : null);
        arr.add(this.cstCofins);
        arr.add(this.vlBcCofins != null ? Parsers.formataNumero(this.vlBcCofins, 2) : null);
        arr.add(this.aliqCofins != null ? Parsers.formataNumero(this.aliqCofins, 2) : null);
        arr.add(this.quantBcCofins != null ? Parsers.formataNumero(this.quantBcCofins, 2) : null);
        arr.add(this.aliqCofinsRs != null ? Parsers.formataNumero(this.aliqCofinsRs, 2) : null);
        arr.add(this.vlCofins != null ? Parsers.formataNumero(this.vlCofins, 2) : null);
        arr.add(this.codCta);
        arr.add(this.vlAbatNt != null ? Parsers.formataNumero(this.vlAbatNt, 2) : null);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum IndMov {

        SIM("0"),
        NAO("1");

        private String codigo;

        IndMov(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }

    public enum IndApur {

        MENSAL("0"),
        DECENDIAL("1");

        private String codigo;

        IndApur(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }
}
