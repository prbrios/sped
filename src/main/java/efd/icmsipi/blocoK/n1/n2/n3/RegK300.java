package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK301;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK302;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegK300 {

    @Inclui
    private final String reg = "K300";

    @Inclui
    private LocalDate dtProd;

    @Filho
    private List<RegK301> regK301;

    @Filho
    private List<RegK302> regK302;

    public RegK300(LocalDate dtProd) {
        this.dtProd = dtProd;
    }

    public RegK300(){}
}