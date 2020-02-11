package efd.icmsipi.blocoD.n1;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.RegD100;
import efd.icmsipi.blocoD.n1.n2.RegD300;
import efd.icmsipi.blocoD.n1.n2.RegD350;
import efd.icmsipi.blocoD.n1.n2.RegD400;
import efd.icmsipi.blocoD.n1.n2.RegD500;
import efd.icmsipi.blocoD.n1.n2.RegD600;
import efd.icmsipi.blocoD.n1.n2.RegD695;
import lombok.Getter;
import lombok.Setter;


public class RegD001 {

    @Getter @Inclui
    private final String reg = "D001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegD100> regD100;

    @Getter @Setter @Filho
    private List<RegD300> regD300;

    @Getter @Setter @Filho
    private List<RegD350> regD350;

    @Getter @Setter @Filho
    private List<RegD400> regD400;

    @Getter @Setter @Filho
    private List<RegD500> regD500;

    @Getter @Setter @Filho
    private List<RegD600> regD600;

    @Getter @Setter @Filho
    private List<RegD695> regD695;

    public RegD001(String indMov) {
        this.indMov = indMov;
    }

    public RegD001(){}
}