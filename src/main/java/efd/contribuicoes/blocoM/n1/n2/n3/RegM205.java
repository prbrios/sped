package efd.contribuicoes.blocoM.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegM205 {

    @Getter @Inclui
private final String reg = "M205";

    @Getter @Setter @Inclui
    private String numCampo;

    @Getter @Setter @Inclui
    private String codRec;

    @Getter @Setter @Inclui
    private BigDecimal vlDebito;

    public RegM205(String numCampo, String codRec, BigDecimal vlDebito) {
        this.numCampo = numCampo;
        this.codRec = codRec;
        this.vlDebito = vlDebito;
    }

    public RegM205(){}
}
