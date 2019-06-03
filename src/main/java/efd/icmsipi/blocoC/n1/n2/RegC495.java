package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC495 {

    @Inclui
    private final String reg = "C495";

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtdCanc;

    @Inclui
    private String unid;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlCanc;

    @Inclui
    private BigDecimal vlAcmo;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal clIcms;

    @Inclui
    private BigDecimal vlIsen;

    @Inclui
    private BigDecimal vlNt;

    @Inclui
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