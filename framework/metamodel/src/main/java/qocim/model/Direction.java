/**
 * This file is part of the QoCIM middleware.
 *
 * Copyright (C) 2014 IRIT, Télécom SudParis
 *
 * The QoCIM software is free software: you can redistribute it and/or modify
 * It under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The QoCIM software platform is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * See the GNU Lesser General Public License
 * for more details: http://www.gnu.org/licenses
 *
 * Initial developer(s): Pierrick MARIE
 * Contributor(s):
 */
package qocim.model;

/**
 *
 * Order represents the direction of the QoC criterion. It brings semantic
 * interpretation of the value of the QoC.
 *
 * <ul>
 * <li>LOWER means when the value of the attribute QoCMetricValue.value
 * increases, the QoC decreases.</li>
 * <li>UPPER means when the value of the attribute QoCMetricValue.value
 * increases, the QoC increases.</li>
 * <li>UNKNOWN is a default value when no direction is set</li>
 * </ul>
 *
 * @see QoCDefinition
 * @see QoCValue
 *
 * @author Pierrick MARIE
 */
public enum Direction {
	LOWER("Lower"), UPPER("Upper"), UNKNOWN("Unknown");

	final String order;

	private Direction(final String _order) {
		order = _order;
	}

	@Override
	public String toString() {
		return order;
	}

	public static Direction getEnum(final String stringValue) {
		switch (stringValue) {
			case "Lower" : return Direction.LOWER;
			case "Upper" : return Direction.UPPER;
			default : return Direction.UNKNOWN;
		}
	}
}
