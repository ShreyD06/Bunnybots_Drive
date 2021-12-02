// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilib;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */
  private TalonSRX motorLeft1 = new TalonSRX(Constants.LEFTMOTOR1);
  private TalonSRX motorLeft2 = new TalonSRX(Constants.LEFTMOTOR2);
  private TalonSRX motorRight1 = new TalonSRX(Constants.RIGHTMOTOR1);
  private TalonSRX motorRight2 = new TalonSRX(Constants.RIGHTMOTOR2);
  private SpeedControllerGroup left = new SpeedControllerGroup(motorLeft1, motorLeft2);
  private SpeedControllerGroup right = new SpeedControllerGroup(motorRight1, motorRight2);
  


  public DifferentialDrive m_drive = new DifferentialDrive(left, right);
  public Drivetrain() {

  }

  public void tankDrive(double leftJoystickAxis, double rightJoystickAxis) {
    drive.tankDrive(leftJoystickAxis, rightJoystickAxis);
  }
  @Override
  public void periodic() {
  }
}
