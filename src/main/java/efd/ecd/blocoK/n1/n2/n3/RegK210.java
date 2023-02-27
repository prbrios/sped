package efd.ecd.blocoK.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegK210 {
    
    @Getter @Inclui
    private final String reg = "K210";
    
    @Getter @Setter @Inclui
    private Integer codEmp;

    @Getter @Setter @Inclui
    private String codCtaEmp;

    public RegK210() {}
    
    public RegK210(Integer codEmp, String codCtaEmp) {
        this.codEmp = codEmp;
        this.codCtaEmp = codCtaEmp;
    }
    
}
