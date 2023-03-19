package efd.icmsipi.blocoK.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class RegK100 implements Serializable {
	private static final long serialVersionUID = -610380975310242942L;

	@Inclui
    private final String reg = "K100";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Filho
    private List<RegK200> regK200;

    @Filho
    private List<RegK210> regK210;

    @Filho
    private List<RegK220> regK220;

    @Filho
    private List<RegK230> regK230;

    @Filho
    private List<RegK250> regK250;

    @Filho
    private List<RegK260> regK260;

    @Filho
    private List<RegK270> regK270;

    @Filho
    private List<RegK280> regK280;

    @Filho
    private List<RegK290> regK290;

    @Filho
    private List<RegK300> regK300;

    public RegK100(LocalDate dtIni, LocalDate dtFin) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
    }

    public RegK100(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtIni() {
        return dtIni;
    }

    public void setDtIni(LocalDate dtIni) {
        this.dtIni = dtIni;
    }

    public LocalDate getDtFin() {
        return dtFin;
    }

    public void setDtFin(LocalDate dtFin) {
        this.dtFin = dtFin;
    }

    public List<RegK200> getRegK200() {
        return regK200;
    }

    public void setRegK200(List<RegK200> regK200) {
        this.regK200 = regK200;
    }

    public List<RegK210> getRegK210() {
        return regK210;
    }

    public void setRegK210(List<RegK210> regK210) {
        this.regK210 = regK210;
    }

    public List<RegK220> getRegK220() {
        return regK220;
    }

    public void setRegK220(List<RegK220> regK220) {
        this.regK220 = regK220;
    }

    public List<RegK230> getRegK230() {
        return regK230;
    }

    public void setRegK230(List<RegK230> regK230) {
        this.regK230 = regK230;
    }

    public List<RegK250> getRegK250() {
        return regK250;
    }

    public void setRegK250(List<RegK250> regK250) {
        this.regK250 = regK250;
    }

    public List<RegK260> getRegK260() {
        return regK260;
    }

    public void setRegK260(List<RegK260> regK260) {
        this.regK260 = regK260;
    }

    public List<RegK270> getRegK270() {
        return regK270;
    }

    public void setRegK270(List<RegK270> regK270) {
        this.regK270 = regK270;
    }

    public List<RegK280> getRegK280() {
        return regK280;
    }

    public void setRegK280(List<RegK280> regK280) {
        this.regK280 = regK280;
    }

    public List<RegK290> getRegK290() {
        return regK290;
    }

    public void setRegK290(List<RegK290> regK290) {
        this.regK290 = regK290;
    }

    public List<RegK300> getRegK300() {
        return regK300;
    }

    public void setRegK300(List<RegK300> regK300) {
        this.regK300 = regK300;
    }
    
}