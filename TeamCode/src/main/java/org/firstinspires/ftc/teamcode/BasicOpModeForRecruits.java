package org.firstinspires.ftc.teamcode;
// TODO : Dacă ai nevoie poți importa clase sau librării suplimentare
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.teamcode.values;

@TeleOp(name="cum_vreti_sa_apara_pe_driver_station", group="Linear OpMode")
@Disabled
public class BasicOpModeForRecruits extends LinearOpMode {

    // timer
    private ElapsedTime runtime = new ElapsedTime();

    // Declararea motoarelor
    //Ex:
    private DcMotor frontLeftDrive = null;
    //Declararea servomotoarelor
    //Ex:
    private Servo mgn=null;

    @Override
    public void runOpMode() {

        // TODO: Inițializează toate motoarele și servo-urile folosind hardwareMap
        // Ex: frontLeftDrive  = hardwareMap.get(DcMotor.class, "nume_din_configuratie");

        // Setează direcția motoarelor pentru ca robotul să meargă înainte când împingi stick-ul înainte
        frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        frontRightDrive.setDirection(DcMotor.Direction.FORWARD);
        backRightDrive.setDirection(DcMotor.Direction.FORWARD);

        // Status inițial
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Așteaptă apăsarea butonului START
        waitForStart();
        runtime.reset();

        // Rulează până la STOP
        while (opModeIsActive()) {

            // Citește valorile de la joystick
            double drive  = -gamepad1.left_stick_y;  // față/spate
            double strafe =  gamepad1.left_stick_x;  // stânga/dreapta
            double turn   =  gamepad1.right_stick_x; // rotație

            // Calculează puterea pentru fiecare motor (mecanum)
            double frontLeftPower  = drive + strafe + turn;
            double backLeftPower   = drive - strafe + turn;
            double frontRightPower = drive - strafe - turn;
            double backRightPower  = drive + strafe - turn;

            // TODO: Normalizează valorile de putere să nu depășească [-1, 1]
            double max = "to_do";

            frontLeftPower  /= max;
            backLeftPower   /= max;
            frontRightPower /= max;
            backRightPower  /= max;

            // TODO: Trimite puterea calculată la motoare
            // Ex: frontLeftDrive.setPower(frontLeftPower);



            //TODO: Alegeti-vă trei servomotoare și programați-le.Vei folosi metoda setPosition pentru a seta pozitia unui mecanism.
            //Prima oara folosește butoanele de pe gamepad pentru a seta poziția servomotoarelor
            //Apoi setează pozițiile prestabilite folosind butoanele,utilizand state-urile din clasa definita pt state-uri
            // TODO: Adaugă mesaje pe telemetry (pentru debugging)
            // Ex: telemetry.addData("Timp rulare", "%.1f", runtime.seconds());
            telemetry.update();
        }
    }
}
// TODO: Retine ca daca vrei poti folosi si clasa values pentru ca codul sa para mai frumos scris si mai putin incarcat
//pentru a folosi valorile declarate in values ,vei folosi values.nume_valoare

// TODO: Dacă reușești să termini tot, poți face o clasă RobotMap
// unde declari și inițializezi toate motoarele și servo-urile 
//TODO: Cum putem schimba codul astfel incat sa folosim si clasa RobotMap?
//Indiciu:RobotMap r = new RobotMap(hardwareMap);
