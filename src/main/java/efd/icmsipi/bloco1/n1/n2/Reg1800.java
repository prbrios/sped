package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class Reg1800 {

    @Getter @Inclui
    private final String reg = "1800";

    @Getter @Setter @Inclui
    private BigDecimal vlCarga;

    @Getter @Setter @Inclui
    private BigDecimal vlPass;

    @Getter @Setter @Inclui
    private BigDecimal vlFat;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal indRat;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsAnt;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsApur;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcmsApur;

    @Getter @Setter @Inclui
    private BigDecimal vlDif;

    public Reg1800(BigDecimal vlCarga, BigDecimal vlPass, BigDecimal vlFat, BigDecimal indRat, BigDecimal vlIcmsAnt, BigDecimal vlBcIcms, BigDecimal vlIcmsApur, BigDecimal vlBcIcmsApur, BigDecimal vlDif) {
        this.vlCarga = vlCarga;
        this.vlPass = vlPass;
        this.vlFat = vlFat;
        this.indRat = indRat;
        this.vlIcmsAnt = vlIcmsAnt;
        this.vlBcIcms = vlBcIcms;
        this.vlIcmsApur = vlIcmsApur;
        this.vlBcIcmsApur = vlBcIcmsApur;
        this.vlDif = vlDif;
    }

    public Reg1800(){}
}