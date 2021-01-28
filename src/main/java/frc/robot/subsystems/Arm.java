// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Arm extends SubsystemBase {
  /** Creates a new Arm. */

  Spark m_intake = new Spark(Constants.SPARK_MOTOR_ID);

  public void runIntake(double speed) {

    m_intake.set(speed);

  }

  public Arm() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

    
  }
}
