package efd.icmsipi.blocoH.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoH.n1.n2.RegH005;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegH001 {

    @Inclui
    private final String reg = "H001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegH005> regH005;
}