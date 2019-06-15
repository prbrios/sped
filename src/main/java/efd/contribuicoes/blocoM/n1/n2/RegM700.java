package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegM700 {

    //TODO: verificar versao do laytou

    @Inclui
    private final String reg = "M700";

    @Inclui
    private String codCont;

    @Inclui
    private BigDecimal vlContApurDifer;

    @Inclui
    private BigDecimal vlCredDescDifer;

    @Inclui
    private BigDecimal vlContDiferAnt;

    @Inclui(formatoData = "MMyyyy")
    private LocalDate perApur;

    @Inclui
    private LocalDate dtReceb;

}
