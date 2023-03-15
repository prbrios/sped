package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;



public class RegC170 implements Serializable {
	private static final long serialVersionUID = 6373252562737421905L;

	/**
     * 01 - REG
     * Texto fixo contendo "C170"
     */
    @Getter @Inclui
    private final String reg = "C170";

    /**
     * 02 - NUM_ITEM
     * Número sequencial do item no documento fiscal
     */
    @Getter @Setter @Inclui
    private Integer numItem;

    /**
     * 03 - COD_ITEM
     * Código do item (campo 02 do Registro 0200)
     */
    @Getter @Setter @Inclui
    private String codItem;

    /**
     * 04 - DESCR_COMPL
     * Descrição complementar do item como adotado no documento fiscal
     */
    @Getter @Setter @Inclui
    private String descrCompl;

    /**
     * 05 - QTD
     * Quantidade do item
     */
    @Getter @Setter @Inclui(casasDecimais = 5)
    private BigDecimal qtd;

    /**
     * 06 - UNID
     * Unidade do item (Campo 02 do registro 0190)
     */
    @Getter @Setter @Inclui
    private String unid;

    /**
     * 07 - VL_ITEM
     * Valor total do item (mercadorias ou serviços)
     */
    @Getter @Setter @Inclui
    private BigDecimal vlItem;

    /**
     * 08 - VL_DESC
     * Valor do desconto comercial
     */
    @Getter @Setter @Inclui
    private BigDecimal vlDesc;

    /**
     * 09 - IND_MOV
     * Movimentação física do ITEM/PRODUTO
     */
    @Getter @Setter @Inclui
    private String indMov;

    /**
     * 10 - CST_ICMS
     * Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4.3.1
     */
    @Getter @Setter @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    /**
     * 11 - CFOP
     * Código Fiscal de Operação e Prestação
     */
    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    /**
     * 12 - COD_NAT
     * Código da natureza da operação (campo 02 do Registro 0400)
     */
    @Getter @Setter @Inclui
    private String codNat;

    /**
     * 13 - VL_BC_ICMS
     * Valor da base de cálculo do ICMS
     */
    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    /**
     * 14 - ALIQ_ICMS
     * Alíquota do ICMS
     */
    @Getter @Setter @Inclui
    private BigDecimal aliqIcms;

    /**
     * 15 - VL_ICMS
     * Valor do ICMS creditado/debitado
     */
    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    /**
     * 16 - VL_BC_ICMS_ST
     * Valor da base de cálculo referente à substituição tributária
     */
    @Getter @Setter @Inclui
    private BigDecimal vlBcIcmsSt;

    /**
     * 17 - ALIQ_ST
     * Alíquota do ICMS da substituição tributária na unidade da federação de destino
     */
    @Getter @Setter @Inclui
    private BigDecimal aliqSt;

    /**
     * 18 - VL_ICMS_ST
     * Valor do ICMS referente à substituição tributária
     */
    @Getter @Setter @Inclui
    private BigDecimal vlIcmsSt;

    /**
     * 19 - IND_APUR
     * Indicador de período de apuração do IPI
     */
    @Getter @Setter @Inclui
    private String indApur;

    /**
     * 20 - CST_IPI
     * Código da Situação Tributária referente ao IPI
     */
    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstIpi;

    /**
     * 21 - COD_ENQ
     * Código de enquadramento legal do IPI
     */
    @Getter @Setter @Inclui
    private String codEnq;

    /**
     * 22 - VL_BC_IPI
     * Valor da base de cálculo do IPI
     */
    @Getter @Setter @Inclui
    private BigDecimal vlBcIpi;

    /**
     * 23 - ALIQ_IPI
     * Aliquota IPI
     */
    @Getter @Setter @Inclui
    private BigDecimal aliqIpi;

    /**
     * 24 - VL_IPI
     * Valor do IPI creditado/debitado
     */
    @Getter @Setter @Inclui
    private BigDecimal vlIpi;

    /**
     * 25 - CST_PIS
     * Código da Situação Tributária referente ao PIS
     */
    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    /**
     * 26 - VL_BC_PIS
     * Valor da base de cálculo do PIS
     */
    @Getter @Setter @Inclui
    private BigDecimal vlBcPis;

    /**
     * 27 - ALIQ_PIS
     * Alíquota do PIS (em percentual)
     */
    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    /**
     * 28 - QUANT_BC_PIS
     * Quantidade – Base de cálculo PIS
     */
    @Getter @Setter @Inclui
    private BigDecimal quantBcPis;

    /**
     * 29 - ALIQ_PIS
     * Alíquota do PIS (em reais)
     */
    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisRs;

    /**
     * 30 - VL_PIS
     * Valor do PIS
     */
    @Getter @Setter @Inclui
    private BigDecimal vlPisRs;

    /**
     * 31 - CST_COFINS
     * Código da Situação Tributária referente ao COFINS
     */
    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    /**
     * 32 - VL_BC_COFINS
     * Valor da base de cálculo da COFINS
     */
    @Getter @Setter @Inclui
    private BigDecimal vlBcCofins;

    /**
     * 33 - ALIQ_COFINS
     * Alíquota do COFINS (em percentual)
     */
    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    /**
     * 34 - QUANT_BC_COFINS
     * Quantidade – Base de cálculo COFINS
     */
    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    /**
     * 35 - ALIQ_COFINS
     * Alíquota da COFINS (em reais)
     */
    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofinsRs;

    /**
     * 36 - VL_COFINS
     * Valor da COFINS
     */
    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    /**
     * 37 - COD_CTA
     * Código da conta analítica contábil debitada/creditada
     */
    @Getter @Setter @Inclui
    private String codCta;

    /**
     * 38 - VL_ABAT_NT
     * Valor do abatimento não tributado e não comercial
     */
    @Getter @Setter @Inclui
    private BigDecimal vlAbatNt;

    @Getter @Setter @Filho
    private List<RegC171> regC171;

    @Getter @Setter @Filho
    private RegC172 regC172;

    @Getter @Setter @Filho
    private List<RegC173> regC173;

    @Getter @Setter @Filho
    private List<RegC174> regC174;

    @Getter @Setter @Filho
    private List<RegC175> regC175;

    @Getter @Setter @Filho
    private List<RegC176> regC176;

    @Getter @Setter @Filho
    private RegC177 regC177;

    @Getter @Setter @Filho
    private RegC178 regC178;

    @Getter @Setter @Filho
    private RegC179 regC179;

    @Getter @Setter @Filho
    private RegC180 regC180;

    public RegC170(Integer numItem, String codItem, String descrCompl, BigDecimal qtd, String unid, BigDecimal vlItem, BigDecimal vlDesc, String indMov, Integer cstIcms, Integer cfop, String codNat, BigDecimal vlBcIcms, BigDecimal aliqIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsSt, BigDecimal aliqSt, BigDecimal vlIcmsSt, String indApur, Integer cstIpi, String codEnq, BigDecimal vlBcIpi, BigDecimal aliqIpi, BigDecimal vlIpi, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal quantBcPis, BigDecimal aliqPisRs, BigDecimal vlPisRs, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal quantBcCofins, BigDecimal aliqCofinsRs, BigDecimal vlCofins, String codCta, BigDecimal vlAbatNt) {
        this.numItem = numItem;
        this.codItem = codItem;
        this.descrCompl = descrCompl;
        this.qtd = qtd;
        this.unid = unid;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.indMov = indMov;
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.codNat = codNat;
        this.vlBcIcms = vlBcIcms;
        this.aliqIcms = aliqIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.aliqSt = aliqSt;
        this.vlIcmsSt = vlIcmsSt;
        this.indApur = indApur;
        this.cstIpi = cstIpi;
        this.codEnq = codEnq;
        this.vlBcIpi = vlBcIpi;
        this.aliqIpi = aliqIpi;
        this.vlIpi = vlIpi;
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.quantBcPis = quantBcPis;
        this.aliqPisRs = aliqPisRs;
        this.vlPisRs = vlPisRs;
        this.cstCofins = cstCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.quantBcCofins = quantBcCofins;
        this.aliqCofinsRs = aliqCofinsRs;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
        this.vlAbatNt = vlAbatNt;
    }

    public RegC170(){}
}
