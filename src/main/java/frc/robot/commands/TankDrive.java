// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  /** Creates a new TankDrive. */
  private final Drivetrain m_drivetrain;
  private final double m_axis1;
  private final double m_axis2;
  

  
  private Drivetrain instance;
  public TankDrive(Drivetrain drivetrain, double leftJoystickAxis, double rightJoystickAxis, double rotateAxis) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_drivetrain = drivetrain;
    m_axis1 = leftJoystickAxis;
    m_axis2 = rightJoystickAxis;
    addRequirements(Drivetrain);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivetrain.tankDrive(m_axis1, m_axis2);
  }
    
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
