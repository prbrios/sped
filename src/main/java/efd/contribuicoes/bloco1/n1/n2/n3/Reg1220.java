package efd.contribuicoes.bloco1.n1.n2.n3;

import java.math.BigDecimal;
import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg1220 {

    @Getter @Inclui
private final String reg = "1220";

    @Getter @Setter @Inclui(formatoData = "MMyyyy")
    private LocalDate perApuCred;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer origCred;

    @Getter @Setter @Inclui(zerosEsquerda = 3)
    private Integer codCred;

    @Getter @Setter @Inclui
    private BigDecimal vlCred;

    public Reg1220(LocalDate perApuCred, Integer origCred, Integer codCred, BigDecimal vlCred) {
        this.perApuCred = perApuCred;
        this.origCred = origCred;
        this.codCred = codCred;
        this.vlCred = vlCred;
    }

    public Reg1220(){ }
}
