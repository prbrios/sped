package efd;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import efd.icmsipi.bloco0.n1.Reg0990;
import efd.icmsipi.bloco1.n1.Reg1990;
import efd.icmsipi.bloco9.Reg9999;
import efd.icmsipi.bloco9.n1.Reg9001;
import efd.icmsipi.bloco9.n1.Reg9990;
import efd.icmsipi.bloco9.n1.n2.Reg9900;
import efd.icmsipi.blocoB.n1.RegB990;
import efd.icmsipi.blocoC.n1.RegC990;
import efd.icmsipi.blocoD.n1.RegD990;
import efd.icmsipi.blocoE.n1.RegE990;
import efd.icmsipi.blocoG.n1.RegG990;
import efd.icmsipi.blocoH.n1.RegH990;
import efd.icmsipi.blocoK.n1.RegK990;

public class Conversor {

    static Logger logger = LogManager.getLogger(Conversor.class);

    private List<String> classes = new ArrayList<String>();

    public List<String> getClasses() {
        return classes;
    }

    @SuppressWarnings("rawtypes")
	private void trataObjeto(Object obj) {
        try {
            if(obj != null) {
                for (Field field : obj.getClass().getDeclaredFields()) {

                    field.setAccessible(true);

                    if (field.getName().equals("grupo")) {
                    	continue;
                    }
                    
                    if (field.get(obj) != null) {

                        if (field.get(obj) instanceof ArrayList) {

                            for (Object o : (ArrayList) field.get(obj)) {
                                if (o.getClass().getPackage().getName().startsWith("efd")) {
                                    this.classes.add(o.getClass().getName().substring(o.getClass().getName().indexOf("Reg")));
                                    this.trataObjeto(o);
                                }
                            }

                        } else if (field.get(obj).getClass().getPackage().getName().startsWith("efd")) {

                            this.classes.add(field.get(obj).getClass().getName().substring(field.get(obj).getClass().getName().indexOf("Reg")));
                            this.trataObjeto(field.get(obj));

                        }
                    }

                }
            }

        } catch (Exception e){
        	logger.error("Falha no tratamento: " + e.getMessage());
            e.printStackTrace();
        }

    }

    private static int getQuantidadeRegistrosDoBloco(Object obj){

        Conversor c = new Conversor();
        c.trataObjeto(obj);
        return obj != null ? c.getClasses().size() + 1 : 0;
    }

    public static String converte(Object obj, boolean calculaQuantidades){


        if(obj instanceof IcmsIpi && calculaQuantidades) {

            logger.info("Converter objeto em String com a opção de contagem automatica dos totalizadores dos blocos");
            logger.info("Calculando a quantidade de registros de cada bloco");

            int qtdReg0 = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getReg0001());
            int qtdReg1 = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getReg1001());
            int qtdRegB = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getRegB001());
            int qtdRegC = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getRegC001());
            int qtdRegD = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getRegD001());
            int qtdRegE = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getRegE001());
            int qtdRegG = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getRegG001());
            int qtdRegH = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getRegH001());
            int qtdRegK = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getRegK001());


            if(qtdReg0 > 0){
                ((IcmsIpi) obj).getReg0000().setReg0990(new Reg0990(qtdReg0 + 2));
                logger.info("Blogo 0: " + (qtdReg0 + 2));
            }
            if(qtdReg1 > 0){
                ((IcmsIpi) obj).getReg0000().setReg1990(new Reg1990(qtdReg1 + 1));
                logger.info("Blogo 1: " + (qtdReg1 + 1));
            }
            if(qtdRegB > 0){
                ((IcmsIpi) obj).getReg0000().setRegB990(new RegB990(qtdRegB + 1));
                logger.info("Blogo B: " + (qtdRegB + 1));
            }
            if(qtdRegC > 0){
                ((IcmsIpi) obj).getReg0000().setRegC990(new RegC990(qtdRegC + 1));
                logger.info("Blogo C: " + (qtdRegC + 1));
            }
            if(qtdRegD > 0){
                ((IcmsIpi) obj).getReg0000().setRegD990(new RegD990(qtdRegD + 1));
                logger.info("Blogo D: " + (qtdRegD + 1));
            }
            if(qtdRegE > 0){
                ((IcmsIpi) obj).getReg0000().setRegE990(new RegE990(qtdRegE + 1));
                logger.info("Blogo E: " + (qtdRegE + 1));
            }
            if(qtdRegG > 0){
                ((IcmsIpi) obj).getReg0000().setRegG990(new RegG990(qtdRegG + 1));
                logger.info("Blogo G: " + (qtdRegG + 1));
            }
            if(qtdRegH > 0){
                ((IcmsIpi) obj).getReg0000().setRegH990(new RegH990(qtdRegH + 1));
                logger.info("Blogo H: " + (qtdRegH + 1));
            }
            if(qtdRegK > 0){
                ((IcmsIpi) obj).getReg0000().setRegK990(new RegK990(qtdRegK + 1));
                logger.info("Blogo K: " + (qtdRegK + 1));
            }
            
            Conversor c = new Conversor();
            c.trataObjeto(obj);

            Map<String, Long> resultado = c.getClasses().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            ArrayList<String> sortedKeys = new ArrayList<String>(resultado.keySet());
            Collections.sort(sortedKeys);

            Integer quantidadeTotalLinhas = 3;

            List<Reg9900> reg9900 = new ArrayList<Reg9900>();
            for (String key : sortedKeys) {

                Integer quantidade = Integer.parseInt(resultado.get(key).toString());
                quantidadeTotalLinhas += quantidade;

                Reg9900 reg9900l = new Reg9900();
                reg9900l.setRegBlc(key.substring(3));
                reg9900l.setQtdRegBlc(quantidade);
                reg9900.add(reg9900l);

            }

            reg9900.add(new Reg9900("9001", 1));
            reg9900.add(new Reg9900("9900", reg9900.size() + 3));
            reg9900.add(new Reg9900("9990", 1));
            reg9900.add(new Reg9900("9999", 1));

            Reg9001 reg9001 = new Reg9001();
            reg9001.setIndMov(0);
            reg9001.setReg9900(reg9900);

            Reg9990 reg9990 = new Reg9990();
            reg9990.setQtdLin9(reg9900.size() + 3);

            Reg9999 reg9999 = new Reg9999();
            reg9999.setQtdLin(quantidadeTotalLinhas + reg9900.size());

            IcmsIpi icmsIpi = (IcmsIpi) obj;
            icmsIpi.getReg0000().setReg9001(reg9001);
            icmsIpi.getReg0000().setReg9990(reg9990);
            icmsIpi.setReg9999(reg9999);

            logger.info("Bloco 9: " + (3 +  reg9900.size()));
            
            return Parsers.converteBlocoEmString(icmsIpi, true);

        } else if(obj instanceof Contribuicoes && calculaQuantidades) {

            logger.info("Converter objeto em String com a opção de contagem automatica dos totalizadores dos blocos");
            logger.info("Inicio de conversao da classe Contribuicoes");

            int qtdReg0 = getQuantidadeRegistrosDoBloco(((Contribuicoes) obj).getReg0000().getReg0001());
            int qtdReg1 = getQuantidadeRegistrosDoBloco(((Contribuicoes) obj).getReg0000().getReg1001());
            int qtdRegA = getQuantidadeRegistrosDoBloco(((Contribuicoes) obj).getReg0000().getRegA001());
            int qtdRegC = getQuantidadeRegistrosDoBloco(((Contribuicoes) obj).getReg0000().getRegC001());
            int qtdRegD = getQuantidadeRegistrosDoBloco(((Contribuicoes) obj).getReg0000().getRegD001());
            int qtdRegF = getQuantidadeRegistrosDoBloco(((Contribuicoes) obj).getReg0000().getRegF001());
            int qtdRegI = getQuantidadeRegistrosDoBloco(((Contribuicoes) obj).getReg0000().getRegI001());
            int qtdRegM = getQuantidadeRegistrosDoBloco(((Contribuicoes) obj).getReg0000().getRegM001());
            int qtdRegP = getQuantidadeRegistrosDoBloco(((Contribuicoes) obj).getReg0000().getRegP001());

            if(qtdReg0 > 0){
                ((Contribuicoes) obj).getReg0000().setReg0990(new efd.contribuicoes.bloco0.n1.Reg0990(qtdReg0 + 2));
                logger.info("Bloco 0: " + (qtdReg0 + 2));
            }
            if(qtdReg1 > 0){
                ((Contribuicoes) obj).getReg0000().setReg1990(new efd.contribuicoes.bloco1.n1.Reg1990(qtdReg1 + 1));
                logger.info("Bloco 1: " + (qtdReg1 + 1));
            }
            if(qtdRegA > 0){
                ((Contribuicoes) obj).getReg0000().setRegA990(new efd.contribuicoes.blocoA.n1.RegA990(qtdRegA + 1));
                logger.info("Bloco A: " + (qtdRegA + 1));
            }
            if(qtdRegC > 0){
                ((Contribuicoes) obj).getReg0000().setRegC990(new efd.contribuicoes.blocoC.n1.RegC990(qtdRegC + 1));
                logger.info("Bloco C: " + (qtdRegC + 1));
            }
            if(qtdRegD > 0){
                ((Contribuicoes) obj).getReg0000().setRegD990(new efd.contribuicoes.blocoD.n1.RegD990(qtdRegD + 1));
                logger.info("Bloco D: " + (qtdRegD + 1));
            }
            if(qtdRegF > 0){
                ((Contribuicoes) obj).getReg0000().setRegF990(new efd.contribuicoes.blocoF.n1.RegF990(qtdRegF + 1));
                logger.info("Bloco F: " + (qtdRegF + 1));
            }
            if(qtdRegI > 0){
                ((Contribuicoes) obj).getReg0000().setRegI990(new efd.contribuicoes.blocoI.n1.RegI990(qtdRegI + 1));
                logger.info("Bloco I: " + (qtdRegI + 1));
            }
            if(qtdRegM > 0){
                ((Contribuicoes) obj).getReg0000().setRegM990(new efd.contribuicoes.blocoM.n1.RegM990(qtdRegM + 1));
                logger.info("Bloco M: " + (qtdRegM + 1));
            }
            if(qtdRegP > 0){
                ((Contribuicoes) obj).getReg0000().setRegP990(new efd.contribuicoes.blocoP.n1.RegP990(qtdRegP + 1));
                logger.info("Bloco P: " + (qtdRegP + 1));
            }

            Conversor c = new Conversor();
            c.trataObjeto(obj);

            Map<String, Long> resultado = c.getClasses().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            ArrayList<String> sortedKeys = new ArrayList<String>(resultado.keySet());
            Collections.sort(sortedKeys);

            Integer quantidadeTotalLinhas = 3;

            List<efd.contribuicoes.bloco9.n1.n2.Reg9900> reg9900 = new ArrayList<>();
            for (String key : sortedKeys) {

                Integer quantidade = Integer.parseInt(resultado.get(key).toString());
                quantidadeTotalLinhas += quantidade;

                efd.contribuicoes.bloco9.n1.n2.Reg9900 reg9900l = new efd.contribuicoes.bloco9.n1.n2.Reg9900();
                reg9900l.setRegBlc(key.substring(3));
                reg9900l.setQtdRegBlc(quantidade);
                reg9900.add(reg9900l);

            }

            reg9900.add(new efd.contribuicoes.bloco9.n1.n2.Reg9900("9001", 1));
            reg9900.add(new efd.contribuicoes.bloco9.n1.n2.Reg9900("9900", reg9900.size() + 3));
            reg9900.add(new efd.contribuicoes.bloco9.n1.n2.Reg9900("9990", 1));
            reg9900.add(new efd.contribuicoes.bloco9.n1.n2.Reg9900("9999", 1));

            efd.contribuicoes.bloco9.n1.Reg9001 reg9001 = new efd.contribuicoes.bloco9.n1.Reg9001();
            reg9001.setIndMov(0);
            reg9001.setReg9900(reg9900);

            efd.contribuicoes.bloco9.n1.Reg9990 reg9990 = new efd.contribuicoes.bloco9.n1.Reg9990();
            reg9990.setQtdLin9(reg9900.size() + 3);

            efd.contribuicoes.bloco9.Reg9999 reg9999 = new efd.contribuicoes.bloco9.Reg9999();
            reg9999.setQtdLin(quantidadeTotalLinhas + reg9900.size());

            Contribuicoes contrib = (Contribuicoes) obj;
            contrib.getReg0000().setReg9001(reg9001);
            contrib.getReg0000().setReg9990(reg9990);
            contrib.setReg9999(reg9999);

            logger.info("Bloco 9: " + (3 +  reg9900.size()));
            
            return Parsers.converteBlocoEmString(contrib, true);

        } else if(obj instanceof Ecd && calculaQuantidades) {

            logger.info("Converter objeto em String com a opção de contagem automatica dos totalizadores dos blocos");
            logger.info("Inicio de conversao da classe Contribuicoes");

            int qtdReg0 = getQuantidadeRegistrosDoBloco(((Ecd) obj).getReg0000().getReg0001());
            int qtdRegC = getQuantidadeRegistrosDoBloco(((Ecd) obj).getReg0000().getRegC001());
            int qtdRegI = getQuantidadeRegistrosDoBloco(((Ecd) obj).getReg0000().getRegI001());
            int qtdRegJ = getQuantidadeRegistrosDoBloco(((Ecd) obj).getReg0000().getRegJ001());
            int qtdRegK = getQuantidadeRegistrosDoBloco(((Ecd) obj).getReg0000().getRegK001());

            if(qtdReg0 > 0){
                ((Ecd) obj).getReg0000().setReg0990(new efd.ecd.bloco0.n1.Reg0990(qtdReg0 + 2));
                logger.info("Bloco 0: " + (qtdReg0 + 2));
            }
            if(qtdRegC > 0){
                ((Ecd) obj).getReg0000().setRegC990(new efd.ecd.blocoC.n1.RegC990(qtdRegC + 1));
                logger.info("Bloco C: " + (qtdRegC + 1));
            }
            if(qtdRegI > 0){
                ((Ecd) obj).getReg0000().setRegI990(new efd.ecd.blocoI.n1.RegI990(qtdRegI + 1));
                logger.info("Bloco I: " + (qtdRegI + 2));
            }
            if(qtdRegJ > 0){
                ((Ecd) obj).getReg0000().setRegJ990(new efd.ecd.blocoJ.n1.RegJ990(qtdRegJ + 1));
                logger.info("Bloco J: " + (qtdRegJ + 1));
            }
            if(qtdRegK > 0){
                ((Ecd) obj).getReg0000().setRegK990(new efd.ecd.blocoK.n1.RegK990(qtdRegK + 1));
                logger.info("Bloco K: " + (qtdRegK + 1));
            }

            Conversor c = new Conversor();
            c.trataObjeto(obj);

            Map<String, Long> resultado = c.getClasses().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            ArrayList<String> sortedKeys = new ArrayList<String>(resultado.keySet());
            Collections.sort(sortedKeys);

            Integer quantidadeTotalLinhas = 3;

            List<efd.ecd.bloco9.n1.n2.Reg9900> reg9900 = new ArrayList<>();
            for (String key : sortedKeys) {

                Integer quantidade = Integer.parseInt(resultado.get(key).toString());
                quantidadeTotalLinhas += quantidade;

                efd.ecd.bloco9.n1.n2.Reg9900 reg9900l = new efd.ecd.bloco9.n1.n2.Reg9900();
                reg9900l.setRegBlc(key.substring(3));
                reg9900l.setQtdRegBlc(quantidade);
                reg9900.add(reg9900l);

            }

            reg9900.add(new efd.ecd.bloco9.n1.n2.Reg9900("9001", 1));
            reg9900.add(new efd.ecd.bloco9.n1.n2.Reg9900("9900", reg9900.size() + 3));
            reg9900.add(new efd.ecd.bloco9.n1.n2.Reg9900("9990", 1));
            reg9900.add(new efd.ecd.bloco9.n1.n2.Reg9900("9999", 1));

            efd.ecd.bloco9.n1.Reg9001 reg9001 = new efd.ecd.bloco9.n1.Reg9001();
            reg9001.setIndDad(0);
            reg9001.setReg9900(reg9900);

            efd.ecd.bloco9.n1.Reg9990 reg9990 = new efd.ecd.bloco9.n1.Reg9990();
            reg9990.setQtdLin9(reg9900.size() + 3);

            efd.ecd.bloco9.Reg9999 reg9999 = new efd.ecd.bloco9.Reg9999();
            reg9999.setQtdLin(quantidadeTotalLinhas + reg9900.size());

            Ecd ecd = (Ecd) obj;
            ecd.getReg0000().setReg9001(reg9001);
            ecd.getReg0000().setReg9990(reg9990);
            ecd.setReg9999(reg9999);

            logger.info("Bloco 9: " + (3 +  reg9900.size()));
            
            return Parsers.converteBlocoEmString(ecd, true);

        }

        return Parsers.converteBlocoEmString(obj, true);
    }

    public static String converte(Object obj){
        return Parsers.converteBlocoEmString(obj, true);
    }

    public static String converteBloco(Object obj){
        return Parsers.converteBlocoEmString(obj, false);
    }

}
