package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg1010 {

    @Inclui
    private final String reg = "1010";

    @Inclui
    private String indExp;

    @Inclui
    private String indCcrf;

    @Inclui
    private String indComb;

    @Inclui
    private String indUsina;

    @Inclui
    private String indVa;

    @Inclui
    private String indEe;

    @Inclui
    private String indCart;

    @Inclui
    private String indForm;

    @Inclui
    private String indAer;

    @Inclui
    private String indGiaf1;

    @Inclui
    private String indGiaf3;

    @Inclui
    private String indGiaf4;

    public Reg1010(String indExp, String indCcrf, String indComb, String indUsina, String indVa, String indEe, String indCart, String indForm, String indAer, String indGiaf1, String indGiaf3, String indGiaf4) {
        this.indExp = indExp;
        this.indCcrf = indCcrf;
        this.indComb = indComb;
        this.indUsina = indUsina;
        this.indVa = indVa;
        this.indEe = indEe;
        this.indCart = indCart;
        this.indForm = indForm;
        this.indAer = indAer;
        this.indGiaf1 = indGiaf1;
        this.indGiaf3 = indGiaf3;
        this.indGiaf4 = indGiaf4;
    }

    public Reg1010(){}
}