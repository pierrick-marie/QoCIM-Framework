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
package qocim.datamodel.precision.simple.definitions;

import qocim.datamodel.precision.simple.definitions.values.MaxPrecisionValue;
import qocim.datamodel.precision.simple.definitions.values.MinPrecisionValue;
import qocim.model.Direction;
import qocim.model.QoCDefinition;
import qocim.model.tools.IQoCEvaluator;

import javax.measure.unit.SI;
import java.net.URI;
import java.net.URISyntaxException;

public class SimpleDefinition extends QoCDefinition {

	public static final String NAME = "Precision definition";
	public static final String ID = "10.1.1";

	public SimpleDefinition() {
		super(NAME, ID);
		setIsInvariant(false);
		try {
			setProviderUri(new URI("//sensor"));
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
		setDirection(Direction.LOWER);
		setIsDefault(true);
		setDescription(new PrecisionDescription());
		setUnit(SI.METER.toString());
		setMaxValue(new MaxPrecisionValue().setDefinitionId(ID));
		setMinValue(new MinPrecisionValue().setDefinitionId(ID));
	}
}
