package efd.icmsipi.blocoK.n1.n2.n3;

import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK291;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK292;
import lombok.Getter;
import lombok.Setter;


public class RegK290 {

    @Getter @Inclui
    private final String reg = "K290";

    @Getter @Setter @Inclui
    private LocalDate dtIniOp;

    @Getter @Setter @Inclui
    private LocalDate dtFinOp;

    @Getter @Setter @Inclui
    private String codDocOp;

    @Getter @Setter @Filho
    private List<RegK291> regK291;

    @Getter @Setter @Filho
    private List<RegK292> regK292;

    public RegK290(LocalDate dtIniOp, LocalDate dtFinOp, String codDocOp) {
        this.dtIniOp = dtIniOp;
        this.dtFinOp = dtFinOp;
        this.codDocOp = codDocOp;
    }

    public RegK290(){}
}