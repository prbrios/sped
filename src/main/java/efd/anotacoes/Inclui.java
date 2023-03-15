package efd.anotacoes;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Inclui {

    String formatoData() default "ddMMyyyy";
    String formatoHora() default "hhmmss";
    int casasDecimais() default 2;
    int zerosEsquerda() default 0;
    @SuppressWarnings("rawtypes")
	Class classe() default String.class;

}
