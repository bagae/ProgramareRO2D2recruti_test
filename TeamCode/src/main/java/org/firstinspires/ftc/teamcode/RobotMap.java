package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.hardware.rev.RevColorSensorV3;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

//import org.firstinspires.ftc.teamcode.pedroPathing.localization.PoseUpdater;
//
//import java.io.BufferedReader;
//
//import dev.frozenmilk.dairy.cachinghardware.CachingDcMotorEx;

public class RobotMap {


    //TODO:Aici vei declara motoarele si servomotoarele
    //Ex:public DcMotorEx frontRightDrive = null;

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
        //Ex:frontRightDrive.setMode(DcMotorEx.RunMode.RUN_WITHOUT_ENCODER);

        //setează directia motoarelor
        frontLeftDrive.setDirection(DcMotorEx.Direction.REVERSE);
        backLeftDrive.setDirection(DcMotorEx.Direction.REVERSE);
        frontRightDrive.setDirection(DcMotorEx.Direction.FORWARD);
        backRightDrive.setDirection(DcMotorEx.Direction.FORWARD);




        //TODO:Vei seta Directia motoarelor

        mgn.setDirection(Servo.Direction.REVERSE);


    }


}
