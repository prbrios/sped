package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegM605 {

    @Getter @Inclui
    private final String reg = "M605";

    @Getter @Inclui
    private String numCampo;

    @Getter @Inclui
    private String codRec;

    @Getter @Inclui
    private BigDecimal vlDebito;

    public RegM605(String numCampo, String codRec, BigDecimal vlDebito) {
        this.numCampo = numCampo;
        this.codRec = codRec;
        this.vlDebito = vlDebito;
    }

    public RegM605(){}
}
