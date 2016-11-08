/** 
 * 
 * Copyright (C) 2016 Amani Kilumanga
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package io.github.dkaksl.rpi_sensor.hardware;

import java.io.IOException;

import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;

import io.github.dkaksl.rpi_sensor.i2c.ADT7410Address;
import io.github.dkaksl.rpi_sensor.i2c.ADT7410Register;

/**
 * @author Amani Kilumanga
 *
 */
public class ADT7410 {

	private final int address;
	private final I2CDevice device;

	public ADT7410(ADT7410Address register, I2CBus i2cBus) throws IOException {
		this.address = register.getAddress();
		this.device = i2cBus.getDevice(this.address);
	}

	public double getTemperatureC() throws IOException {
		movePointer(ADT7410Register.TEMP_MSB, this.device);
		byte[] tempBytes = getTwoBytes(device);
		int rawTemperature = (tempBytes[0] << 8) | (tempBytes[1]);
		return rawTemperature / 128.0;
	}

	private void movePointer(ADT7410Register register, I2CDevice device) throws IOException {
		device.write((byte) register.getAddress());
	}

	private byte[] getTwoBytes(I2CDevice device) throws IOException {
		byte[] buffer = new byte[2];
		device.read(buffer, 0, buffer.length);
		return buffer;
	}

}
