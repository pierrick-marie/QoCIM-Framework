/**
 * This file is part of the QoCIM middleware.
 * <p>
 * Copyright (C) 2014 IRIT, Télécom SudParis
 * <p>
 * The QoCIM software is free software: you can redistribute it and/or modify
 * It under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * The QoCIM software platform is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * <p>
 * See the GNU Lesser General Public License
 * for more details: http://www.gnu.org/licenses
 * <p>
 * Initial developer(s): Pierrick MARIE
 * Contributor(s):
 */
package qocim.aggregation.operator.arithmetic;

/**
 * EOperator class presents the enum presentation of all the available operators
 * for summary and aggregation functions. Defining an enumeration type for those
 * operators facilitate their usage with other classes.
 *
 * @author Atif MANZOOR, Pierrick MARIE
 */
public enum EOperator {

	MIN("Min"), MAX("Max");
	private String operator;

	private EOperator(final String operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return operator;
	}
}
