package efd.icmsipi.blocoG.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


public class RegG140 {

    @Getter @Inclui
    private final String reg = "G140";

    @Getter @Setter @Inclui
    private Integer numItem;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 5)
    private BigDecimal qtde;

    @Getter @Setter @Inclui
    private String unid;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsOpAplicado;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsStAplicado;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsFrtAplicado;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsDifAplicado;

    public RegG140(Integer numItem, String codItem, BigDecimal qtde, String unid, BigDecimal vlIcmsOpAplicado, BigDecimal vlIcmsStAplicado, BigDecimal vlIcmsFrtAplicado, BigDecimal vlIcmsDifAplicado) {
        this.numItem = numItem;
        this.codItem = codItem;
        this.qtde = qtde;
        this.unid = unid;
        this.vlIcmsOpAplicado = vlIcmsOpAplicado;
        this.vlIcmsStAplicado = vlIcmsStAplicado;
        this.vlIcmsFrtAplicado = vlIcmsFrtAplicado;
        this.vlIcmsDifAplicado = vlIcmsDifAplicado;
    }

    public RegG140(){}
}