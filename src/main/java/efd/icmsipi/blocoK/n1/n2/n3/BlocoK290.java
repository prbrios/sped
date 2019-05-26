package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.BlocoK291;
import efd.icmsipi.blocoK.n1.n2.n3.n4.BlocoK292;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoK290 {

    @Inclui
    private final String reg = "K290";

    @Inclui
    private LocalDate dtIniOp;

    @Inclui
    private LocalDate dtFinOp;

    @Inclui
    private String codDocOp;

    @Filho
    private List<BlocoK291> blocoK291;

    @Filho
    private List<BlocoK292> blocoK292;

}