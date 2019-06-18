package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegC495 {

    @Getter @Inclui
    private final String reg = "C495";

    @Getter @Setter @Inclui
    private BigDecimal aliqIcms;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal qtdCanc;

    @Getter @Setter @Inclui
    private String unid;

    @Getter @Setter @Inclui
    private BigDecimal vlItem;

    @Getter @Setter @Inclui
    private BigDecimal vlDesc;

    @Getter @Setter @Inclui
    private BigDecimal vlCanc;

    @Getter @Setter @Inclui
    private BigDecimal vlAcmo;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal clIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIsen;

    @Getter @Setter @Inclui
    private BigDecimal vlNt;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsSt;

    public RegC495(BigDecimal aliqIcms, String codItem, BigDecimal qtd, BigDecimal qtdCanc, String unid, BigDecimal vlItem, BigDecimal vlDesc, BigDecimal vlCanc, BigDecimal vlAcmo, BigDecimal vlBcIcms, BigDecimal clIcms, BigDecimal vlIsen, BigDecimal vlNt, BigDecimal vlIcmsSt) {
        this.aliqIcms = aliqIcms;
        this.codItem = codItem;
        this.qtd = qtd;
        this.qtdCanc = qtdCanc;
        this.unid = unid;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.vlCanc = vlCanc;
        this.vlAcmo = vlAcmo;
        this.vlBcIcms = vlBcIcms;
        this.clIcms = clIcms;
        this.vlIsen = vlIsen;
        this.vlNt = vlNt;
        this.vlIcmsSt = vlIcmsSt;
    }

    public RegC495(){}
}