// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    //Motor Controller CAN IDs
	public static final int LEFT_REAR_MASTER_ID = 9;
	public static final int RIGHT_REAR_MASTER_ID = 10;
	public static final int RIGHT_FRONT_SLAVE_ID = 11;
    public static final int LEFT_FRONT_SLAVE_ID = 12;
    

    //XBOX Controller
	public static final int XBOX_CONTROLLER_PORT = 0;
	public static final int XBOX_LEFT_JOYSTICK_Y_AXIS = 4;
	public static final int XBOX_RIGHT_JOYSTICK_X_AXIS = 9;


	//Intake Motor ID
	public static final int SPARK_MOTOR_ID = 2;
	public static final double INTAKE_MOTOR_SPEED_A = 0.25;
	public static final double INTAKE_MOTOR_SPEED_B = -0.25;




}
