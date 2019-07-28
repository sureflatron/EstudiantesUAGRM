package util;


import org.apache.log4j.Logger;

import java.io.Serializable;

public class UtilJava implements Serializable {
    private static final Logger log = Logger.getLogger(UtilJava.class);

    public static String validarString(String valor) {
        String newValor = "";
        if (valor != null && !valor.isEmpty()) {
            newValor = valor;
        }
        return newValor;
    }

    public static Integer validarEntero(String valor) {
        Integer newValor = 0;
        if (valor != null && !valor.isEmpty()) {
            try {
                newValor = Integer.valueOf(valor);
            } catch (Exception e) {
                log.error("Error al convertir" + e.getMessage());
            }

        }
        return newValor;
    }

    public static void esperar(int tiempo) {
        try {
            Thread.sleep(tiempo);
        } catch (Exception e) {
            log.error("Error al esperar" + e.getMessage());
        }
    }
}
