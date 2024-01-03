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
        eduard.setNickname("Eduard der Ältere");
        King aethelstan = new King(8, "Aethelstan", 894, 924, 939, 939, hausWessex, "Sohn", "Eroberte 927 das dänische Königreich Jórvík (Northumbria) und wurde als Oberherr Britanniens anerkannt. Er war damit der erste König, der über das gesamte Gebiet herrschte, das heute England ausmacht. Nannte sich auch als Erster „König der Engländer“ (rex Anglorum).");
        King edmund = new King(9, "Edmund", 922, 939, 946, 946, hausWessex, "Bruder", "Kämpfte gegen die Dänen um die Herrschaft über Northumbria. Bot dem fränkischen Königssohn Ludwig (dem Überseeischen) Exil.");
        edmund.setNickname("Edmund der Prächtige");
        King eadred = new King(10, "Eadred", 924, 946, 955, 955, hausWessex, "Bruder", "Schloss die Eroberung Northumbrias erfolgreich ab.");
        King eadwig = new King(11, "Eadwig", 941, 955, 959, 959, hausWessex, "Neffe", "Sohn von Edmund der Prächtige. Verbannte den heiligen Dunstan von Canterbury. Northumbria und Mercia sagten sich 957 unter seinem Bruder von ihm los.");
        King edgar = new King(12, "Edgar", 939, 959, 975, 975, hausWessex, "Bruder", "Herrschte bereits seit 957 in Northumbria und Mercia, bevor er seinen Bruder auf den Thron von Wessex nachfolgte. Seine Herrschaft war weitgehend ruhig und konfliktfrei.");
        edgar.setNickname("Edgar der Friedfertige");
        King eduard2 = new King(13,"Eduard", 939, 975, 978, 978, hausWessex, "Sohn", "Wurde nach kurzer Regierungszeit von seiner Stiefmutter ermordet. 1008 heiliggesprochen.");
        eduard2.setNickname("Eduard der Märtyrer");
        King aethelred2 = new King(14, "Aethelred", 968, 978, 1013, 1016, hausWessex, "Halbbruder", "Erbte den Thron durch den Mord seiner Mutter an seinem Halbbruder. Zu seiner Zeit nahmen die Überfälle der Wikinger aus Dänemark und Norwegen wieder zu, denen er mit hohen Tributzahlungen (Danegeld) zu begegnen suchte. Stand zeitweilig mit dem Herzog der Normannen in Konflikt (Landung im Cotentin 991), den er durch seine Heirat mit dessen Schwester beendete. Ordnete in Angst vor einem Anschlag gegen sich die Ermordung aller Dänen in England an und beschwor damit die Rache des Sven Gabelbart herauf, von dem er nach zahlreichen Versuchen schließlich ins Exil getrieben wurde.");
        aethelred2.setNickname("Aethelred der Unberatene");

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
        King edmund2 = new King(16, "Edmund", 989, 1016, 1016, 1016, angelsachsenDänen, "Sohn", "War Knut im Kampf unterlegen und erhielt Wessex als Unterkönigreich des dänischen Englands. Starb noch im selben Jahr wie sein Vater.");
        edmund2.setNickname("Edmund Eisenseite");
        King knut = new King(17, "Knut", 995, 1016, 1035, 1035, angelsachsenDänen, "Sohn", "Setzte auf die Nachricht vom Tod seines Vaters nach England über und unterwarf das Königreich nach dem Tod Edmunds Eisenseite. Begründete ein nordisches Reich, in dem er über Dänemark, England und Norwegen herrschte. Heiratete die Witwe von Æthelred. Etablierte in England das System der Earldoms." );
        knut.setNickname("Knut der Große");
        King haraldI = new King(17, "Harald I.", 1016, 1035, 1040, 1040, angelsachsenDänen, "Sohn", "Behauptete sein Königtum mit der Unterstützung des Earls Godwin gegen die alte angelsächsische Dynastie und seinen Halbbruder.");
        haraldI.setNickname("Harald Hasenfuß");
        King hardiknut = new King(18, "Hardiknut", 1018, 1040, 1042, 1042, angelsachsenDänen, "Halbbruder", "Folgte seinem Vater (Knut der Große) als König in Dänemark, wurde von seinem Halbbruder aber aus England vertrieben. Nach dessen Tod konnte er den englischen Thron besteigen. Als er starb, wurde die angelsächsische Dynastie restauriert.");
        King eduard3 = new King(19, "Eduard", 1004, 1042, 1066, 1066, angelsachsenDänen, "Restaurator", "Sohn von Aethelred. Stützte seine Herrschaft auf dänische und normannische Gefolgsleute. War von besonders religiösem Charakter und begann den Bau der Westminster Abbey. Wehrte erfolgreich Thronansprüche aus Norwegen und Dänemark ab. Schlug die Revolte des Earl Godwin nieder, förderte aber danach dessen Söhne, darunter Harald.");
        King haraldII = new King(20, "Harald II.", 1022,1066, 1066,1066, angelsachsenDänen, "Schwager", "Sohn von Earl Godwin. Earl von Wessex. Durch den Witan zum König gewählt, schlug er eine norwegische Invasion an der Stamford Bridge zurück. Starb im Kampf gegen Wilhelm den Eroberer in der Schlacht bei Hastings.");


        King[] angelsachsenDänenArray = {sven, edmund2, knut, haraldI, hardiknut, eduard3, haraldII};
        angelsachsenDänen.setFounder(sven);
        angelsachsenDänen.setLastKing(haraldII);
            for (int i = 0; i < angelsachsenDänenArray.length; i++){
                kings.add(angelsachsenDänenArray[i]);
        }

        //Rolloniden
        Dynastie rolloniden = new Dynastie("Rolloniden");
        King wilhelm = new King(21, "Wilhelm I.", 1027, 1066, 1087, 1087, rolloniden, "Usurpator", "Neffe 2. Grades von Eduard dem Bekenner. Herzog der Normandie (Wilhelm der Bastard). Beanspruchte die Nachfolge Eduards, führte 1066 die Invasion auf der britischen Insel und besiegte in der Schlacht bei Hastings seinen Rivalen Harald II. Im Anschluss unterwarf er das angelsächsische Königreich und begründete das anglo-normannische Reich. Ließ das Domesday Book erstellen und den Tower of London errichten.");
        wilhelm.setNickname("Wilhelm der Eroberer");
        King wilhelmII = new King(22, "Wilhelm II. Rufus", 1056, 1087, 1100, 1100, rolloniden, "Sohn", "Erbte von seinem Vater das englische Königreich, während die Normandie an seinen älteren Bruder Robert Kurzhose ging. Stand bis zuletzt gegen den französischen König. Ließ die Westminster Hall errichten.");
        King heinrich = new King(23, "Heinrich I.", 1068, 1100, 1135, 1135, rolloniden, "Bruder", "Besiegte seinen Bruder Robert Kurzhose 1106 in der Schlacht bei Tinchebray und vereinte so wieder das anglo-normannische Reich seines Vaters. Verteidigte sein Reich gegen die Ansprüche seines Neffen Wilhelm Clito, den er 1119 in der Schlacht von Brémule besiegte. Etablierte ein „administratives Königtum“ mit einer effizienten Verwaltung und Rechtsprechung. Nach dem Tod seines Erbsohnes beim Untergang des Weißen Schiffs 1120 bestimmte er seine Tochter zur Erbin.");
        heinrich.setNickname("Heinrich I. Beauclerc");
        King stephan = new King(23, "Stephan", 1097, 1135, 1154, 1154, rolloniden, "Neffe", "Usurpierte den Thron gegen seine Cousine Matilda und löste damit den englischen Bürgerkrieg (the Anarchy) aus. Dies führte zu einem politischen Erstarken des baronialen Standes. Musste die Macht nach seiner Gefangennahme in der Schlacht von Lincoln 1141 kurzzeitig an Matilda abtreten. Kämpfte nach seiner Freilassung weiter gegen Matilda und die Anjou, gegen die er 1144 die Normandie verlor. Musste 1153 im Vertrag von Wallingford den Sohn von Matilda schließlich als Erben anerkennen.");
        King matilda = new King(24, "Matilda", 1102, 1141, 1141, 1167, rolloniden, "Tochter", "Witwe Kaiser Heinrichs V. und in zweiter Ehe mit Graf Gottfried Plantagenet von Anjou verheiratet. Kämpfte gegen ihren Cousin Stephan um den Thron. Übernahm 1141 kurzzeitig die Macht, ohne aber gekrönt zu werden. War nach der Schlacht von Winchester 1141 und der Freilassung Stephans gezwungen, das Land wieder zu verlassen.");
        matilda.setNickname("Matilda die Kaiserin");

        King[] rollonidenArray = {wilhelm, wilhelmII, heinrich, stephan, matilda};
        rolloniden.setFounder(wilhelm);
        rolloniden.setLastKing(stephan);
        for (int i = 0; i < rollonidenArray.length; i++){
            kings.add(rollonidenArray[i]);
        }

        //Plantagenet
        Dynastie plantagenet = new Dynastie("Plantagenet");
        King heinrichII = new King(25, "Heinrich II.", 1133, 1154, 1189, 1189, plantagenet, "Sohn", "Begründete durch seine Ehe mit Eleonore von Aquitanien das angevinische Reich. Befand sich im ständigen Kampf gegen seine Söhne und den französischen König. Festigte die englische Königsmacht gegenüber den Baronen." );
        King richard = new King(26, "Richard I.", 1157, 1189, 1199, 1199, plantagenet, "Sohn", "Führte den dritten Kreuzzug (1190–1192) an und geriet in die Gefangenschaft des römisch-deutschen Kaisers. Behauptete sich anschließend erfolgreich gegen den französischen König Philipp II. August im Kampf um seine kontinentalen Besitzungen. Starb bei der Unterwerfung eines seiner Vasallen.");
        richard.setNickname("Richard I. Löwenherz");
        King johann = new King(27, "Johann", 1167, 1199, 1216, 1216, plantagenet, "Bruder", "Unter ihm brach das angevinische Reich zusammen. Normandie, Anjou, Maine und Touraine gingen an den französischen König verloren. Führte erfolgreiche Feldzüge nach Irland und Wales, unterlag gegen Frankreich 1214 bei Roche-aux-Moines und Bouvines. Nach der Revolte seiner Barone musste er 1215 die Magna Charta unterzeichnen. Sein Versuch, diese zu revidieren, führte zum „First Baron’s War“ und der Invasion des französischen Prinzen Ludwig. Starb weitgehend entmachtet.");
        johann.setNickname("Johann Ohneland");
        King heinrichIII = new King(28, "Heinrich III.", 1207, 1216, 1272, 1272, plantagenet, "Sohn", "Stand in den ersten Jahren seiner Herrschaft unter dem Einfluss ausländischer Favoriten, gegen welche die englischen Barone regelmäßig aufbegehrten. Verlor Aquitanien an die französische Krone und war gegen Ludwig IX. den Heiligen 1242 bei Taillebourg unterlegen. Schloss mit diesem 1259 den Vertrag von Paris, der ihm die Gascogne und einen Teil Aquitaniens sicherte, als Vasall Frankreichs. Stand im ständigen Konflikt mit seinen Baronen und musste 1258 die Provisions of Oxford akzeptieren. Seine anschließende Revisionspolitik führte zum „Second Baron’s War“, in dem er nach der Schlacht von Lewes 1264 von Simon de Montfort faktisch entmachtet wurde. Nach der Schlacht von Evesham 1265 wieder im Besitz der Herrschergewalt, musste er dennoch den Baronen weitgehende Mitspracherechte einräumen. Erbaute den Westminster Palace und ließ die Westminster Abbey zur königlichen Grablege ausbauen.");
        King eduardI = new King(29, "Eduard I.", 1239, 1272, 1307, 1307, plantagenet, "Sohn", "Bereits als Prinz ein herausragender politischer und militärischer Akteur, wurde er König während seines Kreuzzugs (1270–1272). Geriet mit König Philipp IV. dem Schönen in Konflikt um seine französischen Besitzungen und unterwarf das Fürstentum Wales. Sein aggressives Ausgreifen auf Schottland führte zum Ausbruch des schottischen Unabhängigkeitskriegs, gegen den er hart vorging („Schottenhammer“). Bei der Belagerung von Stirling Castle ließ er Warwolf bauen. Berief 1295 das Modellparlament ein.");
        eduardI.setNickname("Eduard I. Longshanks");
        King eduardII = new King(30, "Eduard II.", 1284, 1307, 1327, 1327, plantagenet, "Sohn", "Seine Günstlingspolitik (Piers Gaveston, Hugh le Despenser) provozierte Adelsrevolten. Unterlag gegen die Schotten in der Schlacht von Bannockburn 1314, wurde von seiner Ehefrau entmachtet und vermutlich auch ermordet.");
        King eduardIII = new King(31, "Eduard III.", 1312, 1327, 1377, 1377, plantagenet, "Sohn", "Entmachtete seine Mutter und deren Günstling. Festigte die Königsmacht nach innen und begünstigte einen wirtschaftlichen Aufschwung. Formulierte einen Anspruch auf den französischen Thron und löste damit 1337 den hundertjährigen Krieg gegen Frankreich aus. Nach dem Sieg bei Crécy 1346 gewann er Calais als ständigen kontinentalen Brückenkopf und sicherte sich nach dem Sieg bei Poitiers 1356 zeitweise größere Gebiete in Frankreich. Wurde im Alter zunehmend von Günstlingen beeinflusst und verlor die meisten Territorien auf dem Kontinent wieder an Frankreich. Gründete den Hosenbandorden.");
        King richardII = new King(32, "Richard II.", 1367, 1377, 1399, 1400, plantagenet, "Enkel", "Unterdrückte den Bauernaufstand des Wat Tyler und stand in Konflikt mit dem Parlament. Führte den Hundertjährigen Krieg nicht energisch fort und geriet deshalb gegenüber Frankreich in die Defensive. Wurde vom Parlament zugunsten seines Cousins Heinrich Bolingbroke abgesetzt und kurz darauf ermordet.");


        King[] plantagenetArray = {heinrichII, richard, johann, heinrichIII, eduardI, eduardII, eduardIII, richardII};
        rolloniden.setFounder(heinrichII);
        for (int i = 0; i < plantagenetArray.length; i++) {
            kings.add(plantagenetArray[i]);
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
