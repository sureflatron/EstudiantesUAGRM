package main;

import org.apache.log4j.Logger;
import util.Propiedades;

import java.io.*;

import java.net.URL;

public class Imagen {
    private static final Logger log = Logger.getLogger(Imagen.class);

    public static void imagen(String ruta, String registro) {
        try {
            /* definimos la URL de la cual vamos a leer */
            URL intlLogoURL = new URL(Propiedades.getUrlImagenes() + ruta);

            /* llamamos metodo para que lea de la URL y lo escriba en le fichero pasado */
            writeTo(intlLogoURL.openStream(), new FileOutputStream(new File(Propiedades.getCarpetaImagenes() + registro + ".jpg")));

            log.info("Imagen leida y guardada!");
            intlLogoURL.openStream().close();
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }

    /**
     * Escribe in en out
     *
     * @param in
     * @param out
     * @throws IOException
     */
    public static void writeTo(InputStream in, OutputStream out) throws IOException {
        try {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e) {
                    log.error(e.getMessage());
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e) {
                    log.error(e.getMessage());
                }
            }
        }

    }
}
