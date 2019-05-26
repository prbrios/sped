package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.BlocoD696;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoD695 {

    @Inclui
    private final String reg = "D695";

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer nroDocIni;

    @Inclui
    private Integer nroDocFin;

    @Inclui
    private LocalDate dtDocIni;

    @Inclui
    private LocalDate dtDocFin;

    @Inclui
    private String nomMest;

    @Inclui
    private String chvCodDig;

    @Filho
    private List<BlocoD696> blocoD696;

}