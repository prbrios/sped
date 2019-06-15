package efd.contribuicoes.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1501 {

    @Getter @Inclui
    private final String reg = "1501";

    @Getter @Inclui
    private String codPart;

    @Getter @Inclui
    private String codItem;

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui
    private String ser;

    @Getter @Inclui
    private String subSer;

    @Getter @Inclui
    private Integer numDoc;

    @Getter @Inclui
    private LocalDate dtOper;

    @Getter @Inclui
    private String chvNfe;

    @Getter @Inclui
    private BigDecimal vlOper;

    @Getter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Inclui
    private String natBcCred;

    @Getter @Inclui
    private String indOrigCred;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal vlBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
    private String codCcus;

    @Getter @Inclui
    private String descCompl;

    @Getter @Inclui(formatoData = "MMyyyy")
    private LocalDate perEscrit;

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    public Reg1501(String codPart, String codItem, String codMod, String ser, String subSer, Integer numDoc, LocalDate dtOper, String chvNfe, BigDecimal vlOper, Integer cfop, String natBcCred, String indOrigCred, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String codCta, String codCcus, String descCompl, LocalDate perEscrit, Long cnpj) {
        this.codPart = codPart;
        this.codItem = codItem;
        this.codMod = codMod;
        this.ser = ser;
        this.subSer = subSer;
        this.numDoc = numDoc;
        this.dtOper = dtOper;
        this.chvNfe = chvNfe;
        this.vlOper = vlOper;
        this.cfop = cfop;
        this.natBcCred = natBcCred;
        this.indOrigCred = indOrigCred;
        this.cstCofins = cstCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
        this.codCcus = codCcus;
        this.descCompl = descCompl;
        this.perEscrit = perEscrit;
        this.cnpj = cnpj;
    }

    public Reg1501(){ }
}
