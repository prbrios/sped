package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1210;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Reg1200 {

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

    @Filho
    private List<Reg1210> reg1210;

}