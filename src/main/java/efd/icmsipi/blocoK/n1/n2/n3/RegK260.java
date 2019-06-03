package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK265;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegK260 {

    @Inclui
    private final String reg = "K260";

    @Inclui
    private String codOpOs;

    @Inclui
    private String codItem;

    @Inclui
    private LocalDate dtSaida;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdSaida;

    @Inclui
    private LocalDate dtRet;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdRet;

    @Filho
    private List<RegK265> regK265;

    public RegK260(String codOpOs, String codItem, LocalDate dtSaida, BigDecimal qtdSaida, LocalDate dtRet, BigDecimal qtdRet) {
        this.codOpOs = codOpOs;
        this.codItem = codItem;
        this.dtSaida = dtSaida;
        this.qtdSaida = qtdSaida;
        this.dtRet = dtRet;
        this.qtdRet = qtdRet;
    }

    public RegK260(){}
}