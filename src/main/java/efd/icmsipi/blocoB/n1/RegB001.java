package efd.icmsipi.blocoB.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoB.n1.n2.*;
import efd.icmsipi.blocoB.n1.n2.n3.RegB035;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegB001 {

    @Inclui
    private final String reg = "B001";

    @Inclui
    private String indDad;

    @Filho
    private List<RegB020> regB020;

    @Filho
    private List<RegB030> regB030;

    @Filho
    private List<RegB035> regB035;

    @Filho
    private List<RegB350> regB350;

    @Filho
    private List<RegB420> regB420;

    @Filho
    private List<RegB440> regB440;

    @Filho
    private List<RegB460> regB460;

    @Filho
    private RegB470 regB470;

    @Filho
    private RegB500 regB500;

}
