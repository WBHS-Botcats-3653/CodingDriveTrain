// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrain;

public class ArcadeDrive extends CommandBase {
  
  DriveTrain m_drive;
  XboxController m_controller;

  public ArcadeDrive(DriveTrain subsystem, XboxController controller) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
    m_drive = subsystem;
    m_controller = controller;

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    m_drive.setDriveMotors(m_controller.getRawAxis(Constants.XBOX_LEFT_JOYSTICK_Y_AXIS), m_controller.getRawAxis(Constants.XBOX_RIGHT_JOYSTICK_X_AXIS));

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

    m_drive.setDriveMotors(0, 0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
