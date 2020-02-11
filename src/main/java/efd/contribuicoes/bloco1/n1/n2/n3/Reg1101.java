package efd.contribuicoes.bloco1.n1.n2.n3;

import java.math.BigDecimal;
import java.time.LocalDate;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.n3.n4.Reg1102;
import lombok.Getter;
import lombok.Setter;

public class Reg1101 {

    @Getter @Inclui
private final String reg = "1101";

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
    private Integer cstPis;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal vlBcPis;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String codCcus;

    @Getter @Setter @Inclui
    private String descCompl;

    @Getter @Setter @Inclui
    private LocalDate perEscrit;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
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
