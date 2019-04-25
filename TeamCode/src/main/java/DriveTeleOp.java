import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.micdsrobotics.robotplus.hardware.MecanumDrive;
import org.firstinspires.ftc.micdsrobotics.robotplus.hardware.Robot;

@TeleOp(name = "Drive")

public class DriveTeleOp extends OpMode {

    private Robot robot = new HospitalBot();
    private MecanumDrive drivetrain;

    @Override
    public void init() {
        robot.initHardware(hardwareMap);
        drivetrain = (MecanumDrive) robot.getDrivetrain();
    }

    @Override
    public void loop() {
        drivetrain.complexDrive(gamepad1, telemetry);
    }
}
