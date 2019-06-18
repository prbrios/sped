package efd.icmsipi.blocoC.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class RegC001 {

    @Getter @Inclui
    private final String reg = "C001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegC100> regC100;

    @Getter @Setter @Filho
    private List<RegC300> regC300;

    @Getter @Setter @Filho
    private List<RegC350> regC350;

    @Getter @Setter @Filho
    private List<RegC400> regC400;

    @Getter @Setter @Filho
    private List<RegC495> regC495;

    @Getter @Setter @Filho
    private List<RegC500> regC500;

    @Getter @Setter @Filho
    private List<RegC600> regC600;

    @Getter @Setter @Filho
    private List<RegC700> regC700;

    @Getter @Setter @Filho
    private List<RegC800> regC800;

    @Getter @Setter @Filho
    private List<RegC860> regC860;

    public RegC001(String indMov) {
        this.indMov = indMov;
    }

    public RegC001(){}
}
