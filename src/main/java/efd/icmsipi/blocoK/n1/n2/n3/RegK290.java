package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK291;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK292;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegK290 {

    @Inclui
    private final String reg = "K290";

    @Inclui
    private LocalDate dtIniOp;

    @Inclui
    private LocalDate dtFinOp;

    @Inclui
    private String codDocOp;

    @Filho
    private List<RegK291> regK291;

    @Filho
    private List<RegK292> regK292;

}