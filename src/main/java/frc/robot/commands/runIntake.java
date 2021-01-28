// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Arm;

public class runIntake extends CommandBase {

  Arm m_arm;
  XboxController m_controller;

  /** Creates a new runIntake. */
  public runIntake(Arm subsystem, XboxController controller) {
    // Use addRequirements() here to declare subsystem dependencies.

    addRequirements(subsystem);
    m_controller = controller;  

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    while(m_controller.getAButton()) {

      m_arm.runIntake(Constants.INTAKE_MOTOR_SPEED_A);

    }

    while(m_controller.getBButton()) {

      m_arm.runIntake(Constants.INTAKE_MOTOR_SPEED_B);

    }



  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

    m_arm.runIntake(0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
