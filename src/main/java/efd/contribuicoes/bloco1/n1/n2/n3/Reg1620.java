package efd.contribuicoes.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1620 {

    @Getter @Inclui
    private final String reg = "1620";

    @Getter @Inclui(formatoData = "MMyyyy")
    private LocalDate perApuCred;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer origCred;

    @Getter @Inclui(zerosEsquerda = 3)
    private Integer codCred;

    @Getter @Inclui
    private BigDecimal vlCred;

    public Reg1620(LocalDate perApuCred, Integer origCred, Integer codCred, BigDecimal vlCred) {
        this.perApuCred = perApuCred;
        this.origCred = origCred;
        this.codCred = codCred;
        this.vlCred = vlCred;
    }

    public Reg1620(){ }
}
