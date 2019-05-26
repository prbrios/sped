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
    private List<BlocoB020> blocoB020 = new ArrayList<BlocoB020>();

    @Filho
    private List<BlocoB030> blocoB030 = new ArrayList<BlocoB030>();

    @Filho
    private List<BlocoB035> blocoB035 = new ArrayList<BlocoB035>();

    @Filho
    private List<BlocoB420> blocoB420 = new ArrayList<BlocoB420>();

    @Filho
    private List<BlocoB440> blocoB440 = new ArrayList<BlocoB440>();

    @Filho
    private List<BlocoB460> blocoB460 = new ArrayList<BlocoB460>();

    @Filho
    private BlocoB470 blocoB470 = new BlocoB470();

    @Filho
    private BlocoB500 blocoB500 = new BlocoB500();

}
