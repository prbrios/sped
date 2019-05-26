package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Bloco1200 {

    @Inclui
    private final String reg = "1200";

    @Inclui
    private String codAjApur;

    @Inclui
    private BigDecimal sldCred;

    @Inclui
    private BigDecimal credApr;

    @Inclui
    private BigDecimal credReceb;

    @Inclui
    private BigDecimal credUtil;

    @Inclui
    private BigDecimal sldCredFim;

}