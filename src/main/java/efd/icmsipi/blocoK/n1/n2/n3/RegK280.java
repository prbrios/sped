package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


public class RegK280 {

    @Getter @Inclui
    private final String reg = "K280";

    @Getter @Setter @Inclui
    private LocalDate dtEst;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal qtdCorPos;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal qtdCodNeg;

    @Getter @Setter @Inclui
    private String indEst;

    @Getter @Setter @Inclui
    private String codPart;

    public RegK280(LocalDate dtEst, String codItem, BigDecimal qtdCorPos, BigDecimal qtdCodNeg, String indEst, String codPart) {
        this.dtEst = dtEst;
        this.codItem = codItem;
        this.qtdCorPos = qtdCorPos;
        this.qtdCodNeg = qtdCodNeg;
        this.indEst = indEst;
        this.codPart = codPart;
    }

    public RegK280(){}
}