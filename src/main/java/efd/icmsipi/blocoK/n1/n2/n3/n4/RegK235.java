package efd.icmsipi.blocoK.n1.n2.n3.n4;

import java.math.BigDecimal;
import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegK235 {

    @Getter @Inclui
    private final String reg = "K235";

    @Getter @Setter @Inclui
    private LocalDate dtSaida;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtd;

    @Getter @Setter @Inclui
    private String codInsSubst;

    public RegK235(LocalDate dtSaida, String codItem, BigDecimal qtd, String codInsSubst) {
        this.dtSaida = dtSaida;
        this.codItem = codItem;
        this.qtd = qtd;
        this.codInsSubst = codInsSubst;
    }

    public RegK235(){}
}