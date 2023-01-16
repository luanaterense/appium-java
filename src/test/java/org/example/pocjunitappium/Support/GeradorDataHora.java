package org.example.pocjunitappium.Support;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class GeradorDataHora {
    public static String gerarDataHora() {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("yyyyMMddhhmmss").format(ts);
    }
}
