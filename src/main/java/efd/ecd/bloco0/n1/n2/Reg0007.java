package efd.ecd.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0007 {
    
    @Getter @Inclui
    private final String reg = "0007";

    @Getter @Setter @Inclui
    private String codEntRef;

    @Getter @Setter @Inclui
    private String codInscr;

    public Reg0007(String codEntRef, String codInscr) {
        this.codEntRef = codEntRef;
        this.codInscr = codInscr;
    }

    public Reg0007() {/* */}
}
