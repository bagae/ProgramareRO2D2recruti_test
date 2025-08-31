package systems;


import static systems.claw.clawStatus.INITIALIZE;
import static systems.claw.clawStatus.CLOSED;
import static systems.claw.clawStatus.OPENED;

import com.acmerobotics.dashboard.config.Config;

import org.firstinspires.ftc.teamcode.RobotMap;

@Config
public class claw {
    public enum clawStatus
    {
        INITIALIZE,

        OPENED,
        CLOSED,
        //TODO:adauga starea de inter_transfer

    }

    public claw()
    {
        CS = INITIALIZE;
        PS = INITIALIZE;
    }

    public static clawStatus CS = INITIALIZE, PS = INITIALIZE;


//    public static double opened = 0.33;
//    public static double initialize = 0.43;
//
//    public static double claw_intern = 0.51;
//    public static double closed_sample = 0.56;
//
//    public static double inter_ransfer = 0.43;

    public void update(RobotMap r)
    {
        if(PS != CS || CS == INITIALIZE ||CS == CLOSED|| CS == OPENED)
        {
            switch (CS)
            {   //TODO: rezolvă problema cu claw-ul.De ce nu este declarat?
                // TODO:seteaza pozițiile corecte
                case INITIALIZE:
                {
                    r.claw.setPosition();
                    break;
                }




               //TODO:adauga cazurile  pentru celelalte stări




            }
        }

        PS = CS;
    }
}
