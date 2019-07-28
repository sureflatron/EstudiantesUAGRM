package main;

import model.EstudianteEntity;
import model.EstudianteDao;
import org.apache.log4j.Logger;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import util.UtilJava;


import java.io.IOException;

/**
 *
 */
public class Init {
    private static final Logger log = Logger.getLogger(Init.class);
    public static final String URL = "https://academico.uagrm.edu.bo/biometrico/datosest/wbiometrico.aspx?reg=";
    public static final int MAX_PAGES = 250000000;
    //public static final int MAX_PAGES = 211111111;


    /**
     * inicio variable donde declaramos el registro inicial
     * @param args varibla de Inicio
     */
    public static void main(String[] args) {

        int inicio = 211177242;
        //int inicio = 211123986;

        operacion(inicio);

        System.exit(0);
    }

    public static void operacion(int numero) {
        for (int i = numero; i < MAX_PAGES; i++) {

            String urlPage = String.format(URL + i);
            log.info("Comprobando entradas de: " + urlPage);

// Compruebo si me da un 200 al hacer la petición
            if (getStatusConnectionCode(urlPage, i) == 200) {

// Obtengo el HTML de la web en un objeto Document2
                Document document = getHtmlDocument(urlPage);
                if (document != null) {

// Busco todas las historias de meneame que estan dentro de:
                    Elements entradas = document.select("body");
                    String valor = "";
                    for (Element elem : entradas) {
                        valor = elem.getElementById("lbl_Reg").text();
                    }

                    obtenerDatos(valor, entradas, i);
                }
            } else {
                log.error("El Status Code no es OK es: " + getStatusConnectionCode(urlPage, i));
            }
        }
    }

    public static int getStatusConnectionCode(String url, int numero) {

        Connection.Response response = null;
        int codeResponse = 400;

        try {
            response = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(100000).ignoreHttpErrors(true).execute();
            codeResponse = response.statusCode();
        } catch (IOException ex) {
            log.error("Excepción al obtener el Status Code: " + ex.getMessage() + "para " + numero);
            UtilJava.esperar(100000000);
        }
        return codeResponse;
    }


    /**
     * Con este método devuelvo un objeto de la clase Document con el contenido del
     * HTML de la web que me permitirá parsearlo con los métodos de la librelia JSoup
     *
     * @param url
     * @return Documento con el HTML
     */
    public static Document getHtmlDocument(String url) {

        Document doc = null;

        try {
            doc = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(100000).get();
        } catch (IOException ex) {
            log.error("Excepción al obtener el HTML de la página" + ex.getMessage());
        }

        return doc;

    }

    public static void obtenerDatos(String valor, Elements entradas, int i) {
        if (!valor.isEmpty()) {

// Paseo cada una de las entradas
            for (Element elem : entradas) {
                EstudianteEntity estudiante = new EstudianteEntity();
                estudiante.setCarrera(elem.getElementById("lbl_Carr").text());
                estudiante.setRegistro(Integer.valueOf(elem.getElementById("lbl_Reg").text()));
                estudiante.setNombres(elem.getElementById("lbl_Nombre").text());
                estudiante.setCi(elem.getElementById("lbl_CI").text());
                estudiante.setNacimiento(elem.getElementById("lbl_FechaNac").text());
                estudiante.setSexo(elem.getElementById("lbl_Sexo").text());
                estudiante.setEstadoCivil(elem.getElementById("lbl_EstadoCivil").text());
                estudiante.setPaísN(elem.getElementById("lbl_Pais").text());
                estudiante.setDptoN(elem.getElementById("lbl_Dpto").text());
                estudiante.setProvinciaN(elem.getElementById("lbl_Prov").text());
                estudiante.setPaís(elem.getElementById("lbl_Nacionalidad").text());
                estudiante.setSangre(elem.getElementById("lbl_TipoSangre").text());
                estudiante.setSeguro(elem.getElementById("lbl_SeguroSocial").text());
                estudiante.setDirección(elem.getElementById("lbl_Direccion").text());
                estudiante.setTeléfono(elem.getElementById("lbl_Telef").text());
                estudiante.setCelular(UtilJava.validarEntero(elem.getElementById("lbl_Celular").text()));
                estudiante.setCasilla(elem.getElementById("lbl_Casilla").text());
                estudiante.setMail(elem.getElementById("lbl_Mail").text());
                estudiante.setNroTitulo(UtilJava.validarEntero(elem.getElementById("lbl_TituloBach").text()));
                estudiante.setYearTitulo(UtilJava.validarEntero(elem.getElementById("lbl_AnoTit").text()));
                estudiante.setEmisionTitulo(elem.getElementById("lbl_UnivEmisionTit").text());
                String ruta = elem.getElementById("Img_Foto").attr("src");

                log.info(estudiante.getNombres());
                EstudianteDao m = new EstudianteDao();
                boolean guardar = m.save(estudiante);
                if (ruta != null && !ruta.isEmpty() && guardar) {
                    Imagen.imagen(ruta, String.valueOf(estudiante.getRegistro()));
                }
                if (!guardar) {
                    log.info("No se guardara la imagen por que el registro " + estudiante.getRegistro() + " no es valido o ya existe");
                }
            }
        } else {
            log.error("Sin Datos para " + i);
        }
    }

}
