package efd.icmsipi.blocoK.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.BlocoK100;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BlocoK001 {

    @Inclui
    private final String reg = "K001";

    @Inclui
    private String indMov;

    @Filho
    private List<BlocoK100> blocoK100;

}