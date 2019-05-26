package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BlocoK300 {

    @Inclui
    private final String reg = "K300";

    @Inclui
    private LocalDate dtProd;

}