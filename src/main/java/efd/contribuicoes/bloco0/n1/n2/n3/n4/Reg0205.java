package efd.contribuicoes.bloco0.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Reg0205 {

    @Getter @Inclui
private final String reg = "0205";

    @Getter @Setter @Inclui
    private String descrAntItem;

    @Getter @Setter @Inclui
    private LocalDate dtIni;

    @Getter @Setter @Inclui
    private LocalDate dtFim;

    @Getter @Setter @Inclui
    private String codAntItem;

    public Reg0205(String descrAntItem, LocalDate dtIni, LocalDate dtFim, String codAntItem) {
        this.descrAntItem = descrAntItem;
        this.dtIni = dtIni;
        this.dtFim = dtFim;
        this.codAntItem = codAntItem;
    }

    public Reg0205(){}
}
