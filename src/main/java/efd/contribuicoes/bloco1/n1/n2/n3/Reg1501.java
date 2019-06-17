package efd.contribuicoes.bloco1.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.n3.n4.Reg1502;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1501 {

    @Getter @Inclui
private final String reg = "1501";

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private String subSer;

    @Getter @Setter @Inclui
    private Integer numDoc;

    @Getter @Setter @Inclui
    private LocalDate dtOper;

    @Getter @Setter @Inclui
    private String chvNfe;

    @Getter @Setter @Inclui
    private BigDecimal vlOper;

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Setter @Inclui
    private String natBcCred;

    @Getter @Setter @Inclui
    private String indOrigCred;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal vlBcCofins;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String codCcus;

    @Getter @Setter @Inclui
    private String descCompl;

    @Getter @Setter @Inclui(formatoData = "MMyyyy")
    private LocalDate perEscrit;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Filho
    private Reg1502 reg1502;

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
