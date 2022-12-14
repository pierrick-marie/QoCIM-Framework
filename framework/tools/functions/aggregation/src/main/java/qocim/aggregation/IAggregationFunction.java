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
package qocim.aggregation;

import qocim.information.QInformation;

/**
 * ICDFMFunction is the interface to define a context data flow management
 * function. This function transform a list of context report into new context
 * reports. To do it, the function uses an operator. The resulting context
 * reports are send into a listener.
 *
 * @author Pierrick MARIE
 */
public interface IAggregationFunction {

	/**
	 * This method is used to add an information into a buffer. Once the buffer
	 * is full (@see setNbHandledInformation(Integer)) the operator is executed.
	 *
	 */
	IAggregationFunction addInformation(final QInformation<?> information);

	/**
	 * This method is the core of the function. It apply the treatment of the
	 * operator to the input context reports.
	 */
	void execFunction();

	/**
	 * This method is used to change the operator used by the function.
	 *
	 * @param operator
	 *            The operator.
	 * @return this.
	 */
	IAggregationFunction setOperator(IAgregationOperator operator);

	/**
	 * This method is used to set the listener that will receive the new
	 * information
	 *
	 * @param listener
	 *            The listener.
	 * @return this.
	 */
	IAggregationFunction setResultListener(IResultListener listener);

	/**
	 * This method is used to set the number of context report stored by the
	 * function before the execution of the operator.
	 *
	 * @param nbHandledInformation
	 *            The number of context report stored by the function.
	 * @return this.
	 */
//	IAggregationFunction setNbHandledInformation(Integer nbHandledInformation);
//
//	/**
//	 * This method set the number of second to wait before the execution of the
//	 * operator. When this method is called, the timer is start.
//	 *
//	 * @param timeToWait
//	 *            The number of second to wait.
//	 * @return this.
//	 */
//	IAggregationFunction setTimeToWait(Integer timeToWait);
//
//	/**
//	 * This method configure when the context reports are aggregated. If
//	 * <i>_timerOnly</i> is True, the function is executed every time the
//	 * countdown of the timer reach zero. Then, context report used by the
//	 * function are the last context report added with the
//	 * <i>addContextReport</i> method. The number of context report handled by
//	 * the function is in this case at most <i>nbHandledContextReport</i>.
//	 *
//	 * If <i>_timerOnly</i> is False, the function is executed when the function
//	 * receive <i>nbHandledContextReport</i> context report AND every time the
//	 * countdown of the timer reach zero. In this case, the number of context
//	 * report handled by the function is the last context report added with the
//	 * <i>addContextReport</i> method.
//	 *
//	 * @param timerOnly
//	 * @return this.
//	 */
//	IAggregationFunction setTimerOnly(Boolean timerOnly);
//
//	/**
//	 * @return The field <i>timerOnly</i>.
//	 *
//	 */
//	Boolean isTimerOnly();
//
//	/**
//	 * @return The number of second to wait.
//	 */
//	Integer timeToWait();
//
//	/**
//	 * @return The number of context report stored by the function.
//	 */
//	Integer nbHandledInformation();

	/**
	 * @return The operator used by the function.
	 */
	IAgregationOperator operator();

	/**
	 * @return The current listener used by the function.
	 */
	IResultListener resultListener();
}
