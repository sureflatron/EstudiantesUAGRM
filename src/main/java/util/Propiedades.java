package util;

public class Propiedades {
    private static String carpetaImagenes;
    private static String urlImagenes;
    private static String url;
    private static int inicio;
    private static int max;

    public static String getCarpetaImagenes() {
        return carpetaImagenes;
    }

    public static void setCarpetaImagenes(String carpetaImagenes) {
        Propiedades.carpetaImagenes = carpetaImagenes;
    }

    public static String getUrlImagenes() {
        return urlImagenes;
    }

    public static void setUrlImagenes(String urlImagenes) {
        Propiedades.urlImagenes = urlImagenes;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        Propiedades.url = url;
    }

    public static int getInicio() {
        return inicio;
    }

    public static void setInicio(int inicio) {
        Propiedades.inicio = inicio;
    }

    public static int getMax() {
        return max;
    }

    public static void setMax(int max) {
        Propiedades.max = max;
    }
}
