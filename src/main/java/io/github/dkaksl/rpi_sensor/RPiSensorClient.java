/** 
 * 
 * Copyright (C) 2016 Amani Kilumanga
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package io.github.dkaksl.rpi_sensor;

import java.io.IOException;

import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CFactory;
import com.pi4j.io.i2c.I2CFactory.UnsupportedBusNumberException;

import io.github.dkaksl.rpi_sensor.hardware.ADT7410;
import io.github.dkaksl.rpi_sensor.i2c.ADT7410Address;

/**
 * @author Amani Kilumanga
 *
 */
public class RPiSensorClient {

	/**
	 * @param args
	 * @throws IOException
	 * @throws UnsupportedBusNumberException
	 */
	public static void main(String[] args) throws UnsupportedBusNumberException, IOException {
		I2CBus bus = I2CFactory.getInstance(I2CBus.BUS_1);
		ADT7410 adt7410 = new ADT7410(ADT7410Address.B00, bus);
		System.out.println("Temperature(C): " + adt7410.getTemperatureC());
	}

}
