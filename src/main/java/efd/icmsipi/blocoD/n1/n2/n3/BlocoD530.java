package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BlocoD530 {

    @Inclui
    private final String reg = "D530";

    @Inclui
    private String indServ;

    @Inclui
    private LocalDate dtIniServ;

    @Inclui
    private LocalDate dtFinServ;

    @Inclui
    private Integer perFiscal;

    @Inclui
    private String codArea;

    @Inclui
    private Integer terminal;

}