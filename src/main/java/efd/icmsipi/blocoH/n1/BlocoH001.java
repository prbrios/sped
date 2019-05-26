package efd.icmsipi.blocoH.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlocoH001 {

    @Inclui
    private final String reg = "H001";

    @Inclui
    private String indMov;
}