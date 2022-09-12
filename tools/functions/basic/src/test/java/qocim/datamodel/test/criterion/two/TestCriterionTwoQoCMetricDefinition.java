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
package qocim.datamodel.test.criterion.two;

import java.util.Date;
import java.util.List;

import qocim.datamodel.Order;
import qocim.datamodel.QoCMetaData;
import qocim.datamodel.QoCMetricDefinition;
import qocim.datamodel.information.QInformation;

public class TestCriterionTwoQoCMetricDefinition extends QoCMetricDefinition {

	// # # # # # CONSTANTS # # # # #

	public static final String ID_DEFAULTVALUE = "2.1";
	public static final boolean IS_INVARIANT_DEFAULTVALUE = false;
	public static final String UNIT_DEFAULTVALUE = "unit";
	public static final String PROVIDER_URI_DEFAULTVALUE = "//test";
	public static final double MIN_VALUE_DEFAULTVALUE = Double.MIN_VALUE;
	public static final double MAX_VALUE_DEFAULTVALUE = Double.MAX_VALUE;
	public static final Order DIRECTION_DEFAULTVALUE = Order.UNKNOWN;

	// # # # # # PRIVATE VARIABLES # # # # #

	private Double currentQoCValue;

	// # # # # # PUBLIC METHODS # # # # #

	public TestCriterionTwoQoCMetricDefinition() {
		// - - - - - CORE OF THE METHOD - - - - -
		super();
		id(ID_DEFAULTVALUE);
		isInvariant(IS_INVARIANT_DEFAULTVALUE);
		unit(UNIT_DEFAULTVALUE);
		minValue(MIN_VALUE_DEFAULTVALUE);
		maxValue(MAX_VALUE_DEFAULTVALUE);
		direction(DIRECTION_DEFAULTVALUE);
		providerUri(PROVIDER_URI_DEFAULTVALUE);
		description(new TestCriterionTwoDescription());
		currentQoCValue = MIN_VALUE_DEFAULTVALUE;
		description().container(this);
	}

	@Override
	public Double computeQoCMetricValue(final QInformation<?> information,
										final List<QoCMetaData> qoCMetaDataList) {
		// - - - - - RETURN STATEMENT - - - - -
		return ++currentQoCValue;
	}
}