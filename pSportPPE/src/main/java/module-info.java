module com.pSportPPE.pSportPPE {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.desktop;
    requires com.keepautomation.barcode;

    opens com.pSportPPE.pSportPPE to javafx.fxml;
    exports com.pSportPPE.pSportPPE;
}
