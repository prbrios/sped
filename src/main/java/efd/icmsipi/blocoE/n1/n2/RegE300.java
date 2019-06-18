package efd.icmsipi.blocoE.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.RegE310;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


public class RegE300 {

    @Getter @Inclui
    private final String reg = "E300";

    @Getter @Setter @Inclui
    private String uf;

    @Getter @Setter @Inclui
    private LocalDate dtIni;

    @Getter @Setter @Inclui
    private LocalDate dtfin;

    @Getter @Setter @Filho
    private RegE310 regE310;

    public RegE300(String uf, LocalDate dtIni, LocalDate dtfin) {
        this.uf = uf;
        this.dtIni = dtIni;
        this.dtfin = dtfin;
    }

    public RegE300(){}
}