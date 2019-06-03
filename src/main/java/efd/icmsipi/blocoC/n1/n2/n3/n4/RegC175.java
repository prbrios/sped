package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegC175 {

    @Inclui
    private final String reg = "C175";

    @Inclui
    private String indVeicOper;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String uf;

    @Inclui
    private String chassiVeic;

    public RegC175(String indVeicOper, Long cnpj, String uf, String chassiVeic) {
        this.indVeicOper = indVeicOper;
        this.cnpj = cnpj;
        this.uf = uf;
        this.chassiVeic = chassiVeic;
    }

    public RegC175(){}
}
