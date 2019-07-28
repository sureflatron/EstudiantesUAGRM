package main;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Imagen {
    public static void imagen(String ruta, String registro) {

        try {
            /* definimos la URL de la cual vamos a leer */
            URL intlLogoURL = new URL("https://academico.uagrm.edu.bo/biometrico/datosest/" + ruta);

            /* llamamos metodo para que lea de la URL y lo escriba en le fichero pasado */
            writeTo(intlLogoURL.openStream(), new FileOutputStream(new File("F:/imagen/" + registro + ".jpg")));

            System.out.println("Imagen leida y guardada!");

        } catch (MalformedURLException e) {
            e.printStackTrace();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

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
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e) {
                }
            }
        }

        return;
    }
}
