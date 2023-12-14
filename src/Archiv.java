import java.util.ArrayList;
import java.util.List;

public class Archiv {

    private List<King> kings = new ArrayList<>();
    public Archiv() {
        initalizeKingsAndDynasties();
    }

    public void initalizeKingsAndDynasties(){
        // Haus Wessex
        Dynastie hausWessex = new Dynastie("Haus Wessex");
        King egbert = new King(1, "Egbert", 770, 802, 839, 839, hausWessex, "Usopator", "Egbert baute Wessex zum mächtigsten Königreich der angelsächsischen Heptarchie auf und eroberte 829 das bis dahin dominierende Mercia. Seither wurde er als „Bretwalda“ (bretenanwealda) anerkannt, was einen Oberherrschaftsanspruch auf der britischen Insel implizierte.");
        King aethelwulf = new King(2, "Aethelwulf", 800, 839, 858, 858, hausWessex, "Sohn", "Unterwarf East Anglia, Kent, Sussex und Essex als Unterkönigreiche für Wessex. Unternahm eine Pilgerfahrt nach Rom und wurde 856 von seinem ältesten Sohn vom angelsächsischen Thron gestoßen. Bei seiner Rückkehr übernahm er jedoch zumindest die Herrschaft der vorgenannten Unterkönigreiche, die er nach seinem Tod testamentarisch dem jüngeren Sohn weitergab und damit seine Herrschaft auf seine Söhne aufteilte.");
        King aethelbald = new King(3, "Aethelbald", 834, 855, 860, 865, hausWessex, "Sohn", "Stürzte zunächst seinen Vater, indem er sich in seiner Abwesenheit zum König krönen ließ. Dieser akzeptierte bei seiner Rückkehr jedoch den Sohn als Regent bzw. Mitkönig und beließ ihn auf dem Thron von Wessex, während er die übrigen Gebiete unter der Herrschaft der beiden weiterregierte.");
        King aethelberht = new King(4, "Aethelberht", 835, 860, 865, 865, hausWessex, "Bruder", "War in Nachfolge seines Vaters bereits Unterkönig in Kent, Sussex und Surrey ab 858, als er seinen Bruder beerbte und damit das Herrschaftsgebiet seines Vaters wiedervereinte. In seiner Zeit fielen Wikinger in Nordostengland ein, die zeitweilig auch bis nach Wessex zogen." );
        King aethelred = new King(5,"Aethelred", 837, 865, 871, 871, hausWessex, "Bruder", "Zu Beginn seiner Herrschaft drangen große dänische Wikingerarmeen (das sogenannte Große Heidnische Heer) in England ein, gegen deren Invasion er zusammen mit seinem Bruder Alfred mit wechselseitigem Erfolg kämpfte. Sie zerstörten in den folgenden Jahren die Königreiche Northumbria und East Anglia und begründeten einige dänische Siedlungen. Auch setzten sie sich in Mercia fest, das freigekauft werden musste. Danach wandten sich die Dänen nach Wessex, wogegen er und Alfred vergeblich sich zu verteidigen suchten und er in einer Schlacht fiel.");
        King alfred = new King(6,"Alfred", 847, 871, 899, 899, hausWessex, "Bruder", "Drängte die Dänen aus Wessex zurück und baute gegen diese Befestigungsanlagen im Land aus. Schwächte erfolgreich das von den Skandinaviern beherrschte Danelag. Förderte den Klosterbau und begünstigte eine Blüte der angelsächsischen Kultur. Nannte sich als erster „König der Angelsachsen“ (Anglorum Saxonum rex).");
        alfred.setNickname("Alfred der Große");
        King eduard = new King(7, "Eduard", 871, 899, 924, 924, hausWessex, "Sohn", "Nannte sich ebenfalls „König der Angelsachsen“ und drängte die Dänen bis hinter den Humber zurück.");
        King aethelstan = new King(8, "Aethelstand", 894, 924, 939, 939, hausWessex, "Sohn", "Eroberte 927 das dänische Königreich Jórvík (Northumbria) und wurde als Oberherr Britanniens anerkannt. Er war damit der erste König, der über das gesamte Gebiet herrschte, das heute England ausmacht. Nannte sich auch als Erster „König der Engländer“ (rex Anglorum).");
        King edmund = new King(9, "Edmund", 922, 939, 946, 946, hausWessex, "Bruder", "Kämpfte gegen die Dänen um die Herrschaft über Northumbria. Bot dem fränkischen Königssohn Ludwig (dem Überseeischen) Exil.");
        edmund.setNickname("Edmund der Prächtige");
        King eadred = new King(10, "Eadred", 924, 946, 955, 955, hausWessex, "Bruder", "Schloss die Eroberung Northumbrias erfolgreich ab.");
        King eadwig = new King(11, "Eadwig", 941, 955, 959, 959, hausWessex, "Neffe", "Sohn von Edmund der Prächtige. Verbannte den heiligen Dunstan von Canterbury. Northumbria und Mercia sagten sich 957 unter seinem Bruder von ihm los.");
        King edgar = new King(12, "Edgar", 939, 959, 975, 975, hausWessex, "Bruder", "Herrschte bereits seit 957 in Northumbria und Mercia, bevor er seinen Bruder auf den Thron von Wessex nachfolgte. Seine Herrschaft war weitgehend ruhig und konfliktfrei.");
        edgar.setNickname("Edgar der Friedfertige");
        King eduard2 = new King(13,"Eduard", 939, 975, 978, 978, hausWessex, "Sohn", "Wurde nach kurzer Regierungszeit von seiner Stiefmutter ermordet. 1008 heiliggesprochen.");
        eduard.setNickname("Eduard der Märtyrer");
        King aethelred2 = new King(14, "Aethelred", 968, 978, 1013, 1016, hausWessex, "Halbbruder", "Erbte den Thron durch den Mord seiner Mutter an seinem Halbbruder. Zu seiner Zeit nahmen die Überfälle der Wikinger aus Dänemark und Norwegen wieder zu, denen er mit hohen Tributzahlungen (Danegeld) zu begegnen suchte. Stand zeitweilig mit dem Herzog der Normannen in Konflikt (Landung im Cotentin 991), den er durch seine Heirat mit dessen Schwester beendete. Ordnete in Angst vor einem Anschlag gegen sich die Ermordung aller Dänen in England an und beschwor damit die Rache des Sven Gabelbart herauf, von dem er nach zahlreichen Versuchen schließlich ins Exil getrieben wurde.");

        King[] hausWessexArray = {egbert, aethelwulf, aethelbald, aethelberht, aethelred, alfred, eduard, aethelstan, edmund, eadred, eadwig, edgar, eduard2, aethelred2};
        hausWessex.setKings(hausWessexArray);
        hausWessex.setFounder(egbert);
        hausWessex.setLastKing(aethelred2);
        for (int i = 0; i < hausWessexArray.length; i++) {
            kings.add(hausWessexArray[i]);
        }

        //Angelsachsen und Dänen
        Dynastie angelsachsenDänen = new Dynastie("Angelsachsen und Dänen");
        King sven = new King(15, "Sven", 965, 1013, 1014, 1014, angelsachsenDänen, "Usurpator", "Sohn von Harald Blauzahn. König von Dänemark. Eroberte England und herrschte dort ein Jahr, ohne gekrönt zu werden." );
        sven.setNickname("Sven Gabelbart");

        King[] angelsachsenDänenArray = {sven};
        angelsachsenDänen.setFounder(sven);
            for (int i = 0; i < angelsachsenDänenArray.length; i++){
                kings.add(angelsachsenDänenArray[i]);
        }
    }
    
    public King searchForKingByYear(int year) {
        boolean found = false;
        King king = null;
        for (int i = 0; !found; i++) {
            if (kings.get(i).getDeductionYear() >= year && kings.get(i).getCoronationYear() <= year){
                found = true;
                king = kings.get(i);
            }
        }return king;
    }

    public List<King> getKings() {
        return kings;
    }
    }
