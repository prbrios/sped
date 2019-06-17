package efd.contribuicoes.bloco1.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.n3.n4.Reg1102;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1101 {

    @Getter @Inclui
    private final String reg = "1101";

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
    private Integer cstPis;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal vlBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui
    private String codCta;

    @Getter @Inclui
    private String codCcus;

    @Getter @Inclui
    private String descCompl;

    @Getter @Inclui
    private LocalDate perEscrit;

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Filho
    private Reg1102 reg1102;

    public Reg1101(String codPart, String codItem, String codMod, String ser, String subSer, Integer numDoc, LocalDate dtOper, String chvNfe, BigDecimal vlOper, Integer cfop, String natBcCred, String indOrigCred, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, String codCta, String codCcus, String descCompl, LocalDate perEscrit, Long cnpj) {
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
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.codCta = codCta;
        this.codCcus = codCcus;
        this.descCompl = descCompl;
        this.perEscrit = perEscrit;
        this.cnpj = cnpj;
    }

    public Reg1101(){ }
}
