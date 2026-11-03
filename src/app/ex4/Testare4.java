package app.ex4;

import app.ex4.models.*;

public class Testare4 {

    public static void ruleaza() {
        String scurt = "Tema e corectata";
        String lung = "Tema noua: Observer, de predat vineri";

        Notificator notEmail = new NotificatorEmail();
        Notificator emailCuPrefix = new CuPrefix("[URGENT]", notEmail);
        System.out.println(emailCuPrefix.getNume());
        emailCuPrefix.trimite(scurt);

        try {
            new NotificatorSms().trimite(lung);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        Notificator notSms = new NotificatorSms();
        Notificator SMStaiat = new CuTrunchiere(30, notSms);
        System.out.println(SMStaiat.getNume());
        SMStaiat.trimite(lung);

        Notificator jurnal = new CuJurnal(notSms);
        System.out.println(jurnal.getNume());
        jurnal.trimite(scurt);

        Notificator SmsCuTrunchiereSiJurnal = new CuJurnal(new CuTrunchiere(100, notSms));
        System.out.println(SmsCuTrunchiereSiJurnal.getNume());
        SmsCuTrunchiereSiJurnal.trimite(scurt);

//        Notificator jurnal = new CuJurnal();
//        System.out.println(jurnal.getNume());
//        jurnal.trimite(scurt);
//        Notificator taiatSiJurnal = new SmsCuTrunchiereSiJurnal(30);
//        System.out.println(taiatSiJurnal.getNume());
//        taiatSiJurnal.trimite(lung);
    }
}
