// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */

  private final WPI_TalonSRX leftRearMaster = new WPI_TalonSRX(Constants.LEFT_REAR_MASTER_ID);
  private final WPI_TalonSRX rightRearMaster = new WPI_TalonSRX(Constants.RIGHT_REAR_MASTER_ID);
  private final WPI_VictorSPX rightFrontSlave = new WPI_VictorSPX(Constants.RIGHT_FRONT_SLAVE_ID);
  private final WPI_VictorSPX leftFrontSlave = new WPI_VictorSPX(Constants.LEFT_FRONT_SLAVE_ID);
  
  private final SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftRearMaster, leftFrontSlave);
  private final SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightRearMaster, rightFrontSlave);

  private final DifferentialDrive dDrive = new DifferentialDrive(leftMotors, rightMotors);

  public void setDriveMotors(double speed, double rotation) {

    dDrive.arcadeDrive(speed, rotation);

  }


  public DriveTrain() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
