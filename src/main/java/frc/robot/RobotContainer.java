// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.commands.TeleOpCommand;
import frc.robot.subsystems.DrivetrainSubsystem;

public class RobotContainer {
  public static final XboxController m_driver = new XboxController(0);
  public static final DrivetrainSubsystem m_drivetrain = new DrivetrainSubsystem();

  public RobotContainer() {
    m_drivetrain.setDefaultCommand(new TeleOpCommand(m_driver::getLeftX, m_driver::getLeftY, m_driver::getRightX, m_drivetrain));
    configureBindings();
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
