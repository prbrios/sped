package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegK200 {

    @Inclui
    private final String reg = "K200";

    @Inclui
    private LocalDate dtEst;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui
    private String indEst;

    @Inclui
    private String codPart;

    public RegK200(LocalDate dtEst, String codItem, BigDecimal qtd, String indEst, String codPart) {
        this.dtEst = dtEst;
        this.codItem = codItem;
        this.qtd = qtd;
        this.indEst = indEst;
        this.codPart = codPart;
    }

    public RegK200(){}
}