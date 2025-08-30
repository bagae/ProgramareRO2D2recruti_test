package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;


public class RobotMap {


    //TODO:Aici vei declara motoarele si servomotoarele
    //Ex:public DcMotor frontRightDrive = null;

    public Servo mgn = null;


    public RobotMap(HardwareMap Init) {
        /**
         * Chassis
         */
        //TODO: In metoda RobotMap vei accesa motoarele si servomotoarele(OBS:Accesarea se face utilizand parametrul Init)
        //Ex:frontRightDrive = Init.get(DcMotor.class, "rightFront");

        /**
         * PROPERTIES
         */
        //TODO: Noi folosim pe robotul nostru motoarele de pe sasiu fără encoder.Vei avea de setat motoarele să meargă fără encoder.
        //Ex:frontRightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        //setează directia motoarelor
        frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        frontRightDrive.setDirection(DcMotor.Direction.FORWARD);
        backRightDrive.setDirection(DcMotor.Direction.FORWARD);




        //TODO:Vei seta Directia servomotoarelor

        mgn.setDirection(Servo.Direction.REVERSE);


    }


}
