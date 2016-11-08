/** 
 * 
 * Copyright (C) 2016 Amani Kilumanga
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package io.github.dkaksl.rpi_sensor.i2c;

/**
 * @author Amani Kilumanga
 *
 */
public enum ADT7410Register {
	TEMP_MSB(0x00),
	TEMP_LSB(0x01),
	STATUS(0x02),
	CONFIGURATION(0x03),
	T_HIGH_SETPOINT_MSB(0x04),
	T_HIGH_SETPOINT_LSB(0x05),
	T_LOW_SETPOINT_MSB(0x06),
	T_LOW_SETPOINT_LSB(0x07),
	T_CRIT_SETPOINT_MSB(0x08),
	T_CRIT_SETPOINT_LSB(0x09),
	T_HYST_SETPOINT(0x0A),
	ID(0x0B),
	SOFTWARE_RESET(0x2F);

	private final int address;

	private ADT7410Register(int address) {
		this.address = address;
	}

	public int getAddress() {
		return address;
	}
}
