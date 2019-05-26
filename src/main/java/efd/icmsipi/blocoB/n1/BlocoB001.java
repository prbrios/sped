package efd.icmsipi.blocoB.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoB.n1.n2.*;
import efd.icmsipi.blocoB.n1.n2.n3.BlocoB035;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BlocoB001 {

    @Inclui
    private final String reg = "B001";

    @Inclui
    private String indDad;

    @Filho
    private List<BlocoB020> blocoB020;

    @Filho
    private List<BlocoB030> blocoB030;

    @Filho
    private List<BlocoB035> blocoB035;

    @Filho
    private List<BlocoB350> blocoB350;

    @Filho
    private List<BlocoB420> blocoB420;

    @Filho
    private List<BlocoB440> blocoB440;

    @Filho
    private List<BlocoB460> blocoB460;

    @Filho
    private BlocoB470 blocoB470;

    @Filho
    private BlocoB500 blocoB500;

}
