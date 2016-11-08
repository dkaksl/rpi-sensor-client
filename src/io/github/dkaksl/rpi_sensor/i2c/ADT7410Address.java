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
	B00(0x48),
	B01(0x49),
	B10(0x4A),
	B11(0x4B);

	private final int address;

	private ADT7410Register(int address) {
		this.address = address;
	}

	public int getAddress() {
		return address;
	}
}
