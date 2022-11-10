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
package qocim.cdfm.functions.operators.test;


public class TestMinAggregationOperator {

	// # # # # # CONSTANTS # # # # #

//	private static final String DEFAULT_ENTITY_URI = "myuri://localhost";
//	private static final String DEFAULT_ENTITY_NAME = "entity_name";
//	private static final String DEFAULT_OBSERVABLE_URI = "sensor";
//	private static final String DEFAULT_OBSERVABLE_NAME = "observable_name";
//	private static final double DEFAULT_OBSERVATION_VALUE = 42.0;
//	private static final String DEFAULT_SECOND_OBSERVABLE_URI = "my_sensor";
//
//	// # # # # # PRIVATE VARIABLES # # # # #
//
//	private static Integer counter_contextObservationId;
//	private static List<ContextReport> list_contextReport;
//	private ContextReport expectedContextReport;
//	private static ContextDataModelFacade contextDataFacade;
//	private static CDFMFunction function;
//	private static IQoCIMFunctionListener resultListener;
//	private static qocim.cdfm.function.IAgregationOperator minSelectionOperator;
//	private static Map<String, String> map_operatorParameters;
//
//	// # # # # # PUBLIC METHODS # # # # #
//
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		// - - - - - INITIALIZE THE VARIABLES - - - - -
//		QoCIMLogger.logger.setLevel(Level.OFF);
//		contextDataFacade = new ContextDataModelFacade("facade");
//		list_contextReport = new ArrayList<ContextReport>();
//		counter_contextObservationId = 0;
//		minSelectionOperator = new MinSelectionAggregator();
//		map_operatorParameters = new HashMap<String, String>();
//	}
//
//	@Before
//	public void setUp() throws Exception {
//		list_contextReport.clear();
//		function = new CDFMFunction();
//		map_operatorParameters.clear();
//	}
//
//	@After
//	public void execTest() {
//		// - - - - - INIT VARIABLES - - - - -
//		resultListener = new ResultListenerTest(expectedContextReport);
//		function.setResultListener(resultListener);
//		function.setOperator(minSelectionOperator);
//		function.setNbHandledContextReport(list_contextReport.size());
//		for (final ContextReport loop_contextReport : list_contextReport) {
//			function.addContextReport(loop_contextReport);
//		}
//	}
//
//	@Test
//	public void testConfigig_ONEobservable_TENobservations() {
//		// - - - - - INIT VARIABLES - - - - -
//		final int NB_OBSERVATION = 10;
//		final ContextReport contextReport = contextDataFacade.createContextReport("01 - 0");
//		final double[] arrayValues = new double[NB_OBSERVATION];
//		Integer indexArrayValue = 0;
//		Double contextObservationValue = 1.0;
//		final Min min = new Min();
//		ContextEntity contextEntity, expectedContextEntity;
//		ContextObservable contextObservable, expectedContextObservable;
//		// - - - - - CORE OF THE METHOD - - - - -
//		contextEntity = createContextEntity(DEFAULT_ENTITY_NAME, DEFAULT_ENTITY_URI);
//		contextObservable = createContextObservable(DEFAULT_OBSERVABLE_NAME, DEFAULT_OBSERVABLE_URI, contextEntity);
//		for (int index_observation = 0; index_observation < NB_OBSERVATION; index_observation++) {
//			createContextObservation(contextObservationValue, contextReport, contextObservable);
//			arrayValues[indexArrayValue++] = contextObservationValue++;
//		}
//		list_contextReport.add(contextReport);
//		expectedContextReport = contextDataFacade.createContextReport("01 - 0");
//		expectedContextEntity = createContextEntity(DEFAULT_ENTITY_NAME, DEFAULT_ENTITY_URI);
//		expectedContextObservable = createContextObservable(DEFAULT_OBSERVABLE_NAME, DEFAULT_OBSERVABLE_URI,
//				expectedContextEntity);
//		createContextObservation(min.evaluate(arrayValues), expectedContextReport, expectedContextObservable);
//		map_operatorParameters.put(SelectionAggregationOperator.PARAM_CONTEXT_OBSERVABLE_URI_SELECTION,
//				DEFAULT_OBSERVABLE_URI);
//		minSelectionOperator.setParameters(map_operatorParameters);
//	}
//
//	@Test
//	public void testConfigig_ALLobservable() {
//		// - - - - - INIT VARIABLES - - - - -
//		final int NB_OBSERVATION = 10;
//		final ContextReport contextReport = contextDataFacade.createContextReport("01 - 0");
//		final double[] arrayValues1 = new double[NB_OBSERVATION];
//		final double[] arrayValues2 = new double[NB_OBSERVATION];
//		Integer indexArrayValue = 0;
//		Double contextObservationValue = 1.0;
//		final Min min = new Min();
//		ContextEntity contextEntity, expectedContextEntity;
//		ContextObservable contextObservable1, expectedContextObservable1, contextObservable2,
//				expectedContextObservable2;
//		// - - - - - CORE OF THE METHOD - - - - -
//		contextEntity = createContextEntity(DEFAULT_ENTITY_NAME, DEFAULT_ENTITY_URI);
//		contextObservable1 = createContextObservable(DEFAULT_OBSERVABLE_NAME, DEFAULT_OBSERVABLE_URI, contextEntity);
//		contextObservable2 = createContextObservable(DEFAULT_OBSERVABLE_NAME, DEFAULT_SECOND_OBSERVABLE_URI,
//				contextEntity);
//		for (int index_observation = 0; index_observation < NB_OBSERVATION; index_observation++) {
//			createContextObservation(contextObservationValue, contextReport, contextObservable1);
//			arrayValues1[indexArrayValue] = contextObservationValue++;
//			createContextObservation(contextObservationValue, contextReport, contextObservable2);
//			arrayValues2[indexArrayValue++] = contextObservationValue++;
//		}
//		list_contextReport.add(contextReport);
//		expectedContextReport = contextDataFacade.createContextReport("01 - 0");
//		expectedContextEntity = createContextEntity(DEFAULT_ENTITY_NAME, DEFAULT_ENTITY_URI);
//		expectedContextObservable1 = createContextObservable(DEFAULT_OBSERVABLE_NAME, DEFAULT_OBSERVABLE_URI,
//				expectedContextEntity);
//		expectedContextObservable2 = createContextObservable(DEFAULT_OBSERVABLE_NAME, DEFAULT_SECOND_OBSERVABLE_URI,
//				expectedContextEntity);
//		createContextObservation(min.evaluate(arrayValues1), expectedContextReport, expectedContextObservable1);
//		createContextObservation(min.evaluate(arrayValues2), expectedContextReport, expectedContextObservable2);
//		map_operatorParameters.put(SelectionAggregationOperator.PARAM_CONTEXT_OBSERVABLE_URI_SELECTION,
//				SelectionAggregationOperator.KEYWORD_ALL_ELEMENTS);
//		minSelectionOperator.setParameters(map_operatorParameters);
//	}
//
//	@Test
//	public void testConfigig_ALLobservable_TENcomparableQocMetaData() {
//		// - - - - - INIT VARIABLES - - - - -
//		final int NB_QOC_METADATA = 10;
//		final ContextReport contextReport = contextDataFacade.createContextReport("01 - 0");
//		final double[] arrayValues1 = new double[NB_QOC_METADATA];
//		final double[] arrayValues2 = new double[NB_QOC_METADATA];
//		final Min min = new Min();
//		final ContextObservable contextObservable1, expectedContextObservable1, contextObservable2,
//				expectedContextObservable2;
//		final ContextObservation<?> contextObservation1, expectedContextObservation1, contextObservation2,
//				expectedContextObservation2;
//		Integer indexArrayValue = 0;
//		Double qocMetricValue = 1.0;
//		ContextEntity contextEntity, expectedContextEntity;
//		// - - - - - CORE OF THE METHOD - - - - -
//		contextEntity = createContextEntity(DEFAULT_ENTITY_NAME, DEFAULT_ENTITY_URI);
//		contextObservable1 = createContextObservable(DEFAULT_OBSERVABLE_NAME, DEFAULT_OBSERVABLE_URI, contextEntity);
//		contextObservable2 = createContextObservable(DEFAULT_OBSERVABLE_NAME, DEFAULT_SECOND_OBSERVABLE_URI,
//				contextEntity);
//		contextObservation1 = createContextObservation(DEFAULT_OBSERVATION_VALUE, contextReport, contextObservable1);
//		contextObservation2 = createContextObservation(DEFAULT_OBSERVATION_VALUE, contextReport, contextObservable2);
//		for (int index_observation = 0; index_observation < NB_QOC_METADATA; index_observation++) {
//			contextObservation1.listQocIndicator
//					.add(TestCriterionZeroFactory.getInstance().newQoCIndicator("" + indexArrayValue, qocMetricValue));
//			arrayValues1[indexArrayValue] = qocMetricValue++;
//			contextObservation2.listQocIndicator
//					.add(TestCriterionZeroFactory.getInstance().newQoCIndicator("" + indexArrayValue, qocMetricValue));
//			arrayValues2[indexArrayValue++] = qocMetricValue++;
//		}
//		list_contextReport.add(contextReport);
//		expectedContextReport = contextDataFacade.createContextReport("01 - 0");
//		expectedContextEntity = createContextEntity(DEFAULT_ENTITY_NAME, DEFAULT_ENTITY_URI);
//		expectedContextObservable1 = createContextObservable(DEFAULT_OBSERVABLE_NAME, DEFAULT_OBSERVABLE_URI,
//				expectedContextEntity);
//		expectedContextObservation1 = createContextObservation(DEFAULT_OBSERVATION_VALUE, expectedContextReport,
//				expectedContextObservable1);
//		expectedContextObservation1.listQocIndicator.add(TestCriterionZeroFactory.getInstance()
//				.newQoCIndicator("" + indexArrayValue, min.evaluate(arrayValues1)));
//		expectedContextObservable2 = createContextObservable(DEFAULT_OBSERVABLE_NAME, DEFAULT_SECOND_OBSERVABLE_URI,
//				expectedContextEntity);
//		expectedContextObservation2 = createContextObservation(DEFAULT_OBSERVATION_VALUE, expectedContextReport,
//				expectedContextObservable2);
//		expectedContextObservation2.listQocIndicator.add(TestCriterionZeroFactory.getInstance()
//				.newQoCIndicator("" + indexArrayValue, min.evaluate(arrayValues2)));
//		map_operatorParameters.put(SelectionAggregationOperator.PARAM_CONTEXT_OBSERVABLE_URI_SELECTION,
//				SelectionAggregationOperator.KEYWORD_ALL_ELEMENTS);
//		map_operatorParameters.put(SelectionAggregationOperator.PARAM_QOC_DEFINITION_ID_SELECTION,
//				TestCriterionZeroQoCMetricDefinition.ID_DEFAULTVALUE);
//		minSelectionOperator.setParameters(map_operatorParameters);
//	}
//
//	@Test
//	public void testConfigig_ALLobservable_ALLqocMetaData() {
//		// - - - - - INIT VARIABLES - - - - -
//		final int NB_QOC_METADATA = 10;
//		final ContextReport contextReport = contextDataFacade.createContextReport("01 - 0");
//		final double[] arrayValues1_1 = new double[NB_QOC_METADATA];
//		final double[] arrayValues1_2 = new double[NB_QOC_METADATA];
//		final double[] arrayValues2_1 = new double[NB_QOC_METADATA];
//		final double[] arrayValues2_2 = new double[NB_QOC_METADATA];
//		final Min min = new Min();
//		final ContextObservable contextObservable1, expectedContextObservable1, contextObservable2,
//				expectedContextObservable2;
//		final ContextObservation<?> contextObservation1, expectedContextObservation1, contextObservation2,
//				expectedContextObservation2;
//		Integer indexArrayValue = 0;
//		Double qocMetricValue = 1.0;
//		ContextEntity contextEntity, expectedContextEntity;
//		// - - - - - CORE OF THE METHOD - - - - -
//		contextEntity = createContextEntity(DEFAULT_ENTITY_NAME, DEFAULT_ENTITY_URI);
//		contextObservable1 = createContextObservable(DEFAULT_OBSERVABLE_NAME, DEFAULT_OBSERVABLE_URI, contextEntity);
//		contextObservable2 = createContextObservable(DEFAULT_OBSERVABLE_NAME, DEFAULT_SECOND_OBSERVABLE_URI,
//				contextEntity);
//		contextObservation1 = createContextObservation(DEFAULT_OBSERVATION_VALUE, contextReport, contextObservable1);
//		contextObservation2 = createContextObservation(DEFAULT_OBSERVATION_VALUE, contextReport, contextObservable2);
//		for (int index_observation = 0; index_observation < NB_QOC_METADATA; index_observation++) {
//			contextObservation1.listQocIndicator
//					.add(TestCriterionZeroFactory.getInstance().newQoCIndicator("" + indexArrayValue, qocMetricValue));
//			arrayValues1_1[indexArrayValue] = qocMetricValue++;
//			contextObservation1.listQocIndicator
//					.add(TestCriterionOneFactory.getInstance().newQoCIndicator("" + indexArrayValue, qocMetricValue));
//			arrayValues1_2[indexArrayValue] = qocMetricValue++;
//			contextObservation2.listQocIndicator
//					.add(TestCriterionZeroFactory.getInstance().newQoCIndicator("" + indexArrayValue, qocMetricValue));
//			arrayValues2_1[indexArrayValue] = qocMetricValue++;
//			contextObservation2.listQocIndicator
//					.add(TestCriterionOneFactory.getInstance().newQoCIndicator("" + indexArrayValue, qocMetricValue));
//			arrayValues2_2[indexArrayValue++] = qocMetricValue++;
//		}
//		list_contextReport.add(contextReport);
//		expectedContextReport = contextDataFacade.createContextReport("01 - 0");
//		expectedContextEntity = createContextEntity(DEFAULT_ENTITY_NAME, DEFAULT_ENTITY_URI);
//		expectedContextObservable1 = createContextObservable(DEFAULT_OBSERVABLE_NAME, DEFAULT_OBSERVABLE_URI,
//				expectedContextEntity);
//		expectedContextObservation1 = createContextObservation(DEFAULT_OBSERVATION_VALUE, expectedContextReport,
//				expectedContextObservable1);
//		expectedContextObservation1.listQocIndicator.add(TestCriterionZeroFactory.getInstance()
//				.newQoCIndicator("" + indexArrayValue, min.evaluate(arrayValues1_1)));
//		expectedContextObservation1.listQocIndicator.add(TestCriterionOneFactory.getInstance()
//				.newQoCIndicator("" + indexArrayValue, min.evaluate(arrayValues1_2)));
//		expectedContextObservable2 = createContextObservable(DEFAULT_OBSERVABLE_NAME, DEFAULT_SECOND_OBSERVABLE_URI,
//				expectedContextEntity);
//		expectedContextObservation2 = createContextObservation(DEFAULT_OBSERVATION_VALUE, expectedContextReport,
//				expectedContextObservable2);
//		expectedContextObservation2.listQocIndicator.add(TestCriterionZeroFactory.getInstance()
//				.newQoCIndicator("" + indexArrayValue, min.evaluate(arrayValues2_1)));
//		expectedContextObservation2.listQocIndicator.add(TestCriterionOneFactory.getInstance()
//				.newQoCIndicator("" + indexArrayValue, min.evaluate(arrayValues2_2)));
//		map_operatorParameters.put(SelectionAggregationOperator.PARAM_CONTEXT_OBSERVABLE_URI_SELECTION,
//				SelectionAggregationOperator.KEYWORD_ALL_ELEMENTS);
//		map_operatorParameters.put(SelectionAggregationOperator.PARAM_QOC_DEFINITION_ID_SELECTION,
//				SelectionAggregationOperator.KEYWORD_ALL_ELEMENTS);
//		minSelectionOperator.setParameters(map_operatorParameters);
//	}
//
//	// # # # # # PRIVATE METHODS # # # # #
//
//	private static ContextEntity createContextEntity(final String _contextEntityName, final String _contextEntityUri) {
//		// - - - - - INITIALIZE THE VARIABLES - - - - -
//		ContextEntity ret_contextEntity = null;
//		// - - - - - CORE OF THE METHOD - - - - -
//		try {
//			ret_contextEntity = contextDataFacade.createContextEntity(_contextEntityName, new URI(_contextEntityUri));
//		} catch (final URISyntaxException e) {
//			e.printStackTrace();
//			return null;
//		}
//		// - - - - - RETURN STATEMENT - - - - -
//		return ret_contextEntity;
//	}
//
//	private static ContextObservable createContextObservable(final String _contextObservableName,
//			final String _contextObservableUri, final ContextEntity _contextEntity) {
//		// - - - - - INITIALIZE THE VARIABLES - - - - -
//		ContextObservable ret_contextObservable = null;
//		// - - - - - CORE OF THE METHOD - - - - -
//		try {
//			ret_contextObservable = contextDataFacade.createContextObservable(_contextObservableName,
//					new URI(_contextObservableUri), _contextEntity);
//		} catch (final URISyntaxException e) {
//			e.printStackTrace();
//			return null;
//		}
//		// - - - - - RETURN STATEMENT - - - - -
//		return ret_contextObservable;
//	}
//
//	private static ContextObservation<?> createContextObservation(final Double _contextObservationValue,
//			final ContextReport _contextReport, final ContextObservable _contextObservable) {
//		// - - - - - INITIALIZE THE VARIABLES - - - - -
//		final ContextObservation<?> observation = contextDataFacade.createContextObservation(
//				"id - " + counter_contextObservationId++, _contextObservationValue, _contextObservable);
//		// - - - - - CORE OF THE METHOD - - - - -
//		contextDataFacade.addContextObservation(_contextReport, observation);
//		contextDataFacade.addContextObservation(_contextObservable, observation);
//		// - - - - - RETURN STATEMENT - - - - -
//		return observation;
//	}
}