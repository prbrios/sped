package efd.contribuicoes.bloco0.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reg0205 {

    @Inclui
    private final String reg = "0205";

    @Inclui
    private String descrAntItem;

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFim;

    @Inclui
    private String codAntItem;

    public Reg0205(String descrAntItem, LocalDate dtIni, LocalDate dtFim, String codAntItem) {
        this.descrAntItem = descrAntItem;
        this.dtIni = dtIni;
        this.dtFim = dtFim;
        this.codAntItem = codAntItem;
    }

    public Reg0205(){}
}