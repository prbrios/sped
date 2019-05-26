package efd.icmsipi.blocoE.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.BlocoE310;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BlocoE300 {

    @Inclui
    private final String reg = "E300";

    @Inclui
    private String uf;

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtfin;

    @Filho
    private BlocoE310 blocoE310;

}