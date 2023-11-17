public class Archiv {

    public Archiv() {
        initalizeKingsAndDynasties();
    }

    public void initalizeKingsAndDynasties(){
        // Haus Wessex
        Dynastie dynastie1 = new Dynastie("Haus Wessex", 14 );
        King egbert = new King(1, "Egbert", 770, 802, 839, 839, dynastie1, "Egbert baute Wessex zum mächtigsten Königreich der angelsächsischen Heptarchie auf und eroberte 829 das bis dahin dominierende Mercia. Seither wurde er als „Bretwalda“ (bretenanwealda) anerkannt, was einen Oberherrschaftsanspruch auf der britischen Insel implizierte.");
        dynastie1.setFounder(egbert);
        King aethelwulf = new King(2, "Æthelwulf", 800, 839, 858, 858, dynastie1, "Sohn von Egbert. Unterwarf East Anglia, Kent, Sussex und Essex als Unterkönigreiche für Wessex. Unternahm eine Pilgerfahrt nach Rom und wurde 856 von seinem ältesten Sohn vom angelsächsischen Thron gestoßen. Bei seiner Rückkehr übernahm er jedoch zumindest die Herrschaft der vorgenannten Unterkönigreiche, die er nach seinem Tod testamentarisch dem jüngeren Sohn weitergab und damit seine Herrschaft auf seine Söhne aufteilte.");

        King[] array = {egbert, aethelwulf};
        dynastie1.setKings(array);
    }
}
