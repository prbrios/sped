package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.BlocoK301;
import efd.icmsipi.blocoK.n1.n2.n3.n4.BlocoK302;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoK300 {

    @Inclui
    private final String reg = "K300";

    @Inclui
    private LocalDate dtProd;

    @Filho
    private List<BlocoK301> blocoK301;

    @Filho
    private List<BlocoK302> blocoK302;

}