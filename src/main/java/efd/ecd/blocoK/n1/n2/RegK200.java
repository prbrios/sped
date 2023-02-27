package efd.ecd.blocoK.n1.n2;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoK.n1.n2.n3.RegK210;
import efd.ecd.blocoK.n1.n2.n3.RegK300;
import lombok.Getter;
import lombok.Setter;

public class RegK200 {
    
    @Getter @Inclui
    private final String reg = "K200";

    @Getter @Setter @Inclui
    private String codNat;

    @Getter @Setter @Inclui
    private String indCta;

    @Getter @Setter @Inclui
    private Integer nivel;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String codCtaSup;

    @Getter @Setter @Inclui
    private String cta;

    @Getter @Setter @Filho
    private List<RegK210> regK210;

    @Getter @Setter @Filho
    private List<RegK300> regK300;

    public RegK200() {}

    public RegK200(String codNat, String indCta, Integer nivel, String codCta, String codCtaSup, String cta) {
        this.codNat = codNat;
        this.indCta = indCta;
        this.nivel = nivel;
        this.codCta = codCta;
        this.codCtaSup = codCtaSup;
        this.cta = cta;
    }

}
