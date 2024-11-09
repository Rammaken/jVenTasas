package com;

import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class script_tasas {
    static final String BCVURL = "https://www.bcv.org.ve/";

    public static Double obtenerDolar() {
        Double var_dolar_valor = 0.0;
        try {
            // Ignora los certificados SSL no válidos, aparentemente Java es alergico al certificado de la pagina de BCV 
            TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public X509Certificate[] getAcceptedIssuers() { return null; }
                    public void checkClientTrusted(X509Certificate[] certs, String authType) { }
                    public void checkServerTrusted(X509Certificate[] certs, String authType) { }
                }
            };

            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            
            // Conecta a la URL y obtiene el valor de la tasa elegida
            Document doc = Jsoup.connect(BCVURL).get();
            Element divDolar = doc.getElementById("dolar");
            String temp_valor_obtenido = divDolar.select("strong").text().replace(",", ".");
            
            var_dolar_valor = Double.valueOf(temp_valor_obtenido);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return var_dolar_valor;
    }
        
    public static Double obtenerEuro() {
        Double var_euro_valor = 0.0;
        try {
            TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public X509Certificate[] getAcceptedIssuers() { return null; }
                    public void checkClientTrusted(X509Certificate[] certs, String authType) { }
                    public void checkServerTrusted(X509Certificate[] certs, String authType) { }
                }
            };

            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            
            Document doc = Jsoup.connect(BCVURL).get();
            Element divEuro = doc.getElementById("euro");
            String temp_valor_obtenido = divEuro.select("strong").text().replace(",", ".");
            
            var_euro_valor = Double.valueOf(temp_valor_obtenido);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return var_euro_valor;
    }
    
    public static Double obtenerYuan() {
        Double var_yuan_valor = 0.0;
        try {
            TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public X509Certificate[] getAcceptedIssuers() { return null; }
                    public void checkClientTrusted(X509Certificate[] certs, String authType) { }
                    public void checkServerTrusted(X509Certificate[] certs, String authType) { }
                }
            };

            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            Document doc = Jsoup.connect(BCVURL).get();
            Element divYuan = doc.getElementById("yuan");
            String temp_valor_obtenido = divYuan.select("strong").text().replace(",", ".");
            var_yuan_valor = Double.valueOf(temp_valor_obtenido);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return var_yuan_valor;
    }
    
    public static Double obtenerLira() {
        Double var_lira_valor = 0.0;
        try {
            TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public X509Certificate[] getAcceptedIssuers() { return null; }
                    public void checkClientTrusted(X509Certificate[] certs, String authType) { }
                    public void checkServerTrusted(X509Certificate[] certs, String authType) { }
                }
            };

            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            Document doc = Jsoup.connect(BCVURL).get();
            Element divLira = doc.getElementById("lira");
            String temp_valor_obtenido = divLira.select("strong").text().replace(",", ".");
            
            var_lira_valor = Double.valueOf(temp_valor_obtenido);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return var_lira_valor;
    }
    
    public static Double obtenerRublo() {
        Double var_rublo_valor = 0.0;
        try {
            TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public X509Certificate[] getAcceptedIssuers() { return null; }
                    public void checkClientTrusted(X509Certificate[] certs, String authType) { }
                    public void checkServerTrusted(X509Certificate[] certs, String authType) { }
                }
            };

            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            Document doc = Jsoup.connect(BCVURL).get();
            Element divRublo = doc.getElementById("rublo");
            String temp_valor_obtenido = divRublo.select("strong").text().replace(",", ".");
            
            var_rublo_valor = Double.valueOf(temp_valor_obtenido);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return var_rublo_valor;
    }
}
