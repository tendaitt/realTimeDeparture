package com.assessment.departure.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.assessment.departure.DepartureInfo;
import com.assessment.departure.DepartureTimeController;

public class DepartureTimeControllerTest {

	@Test
	public void testGetDepartureTimeReturnsDepartureInfo() {
		DepartureTimeController departureControllerMock = mock(DepartureTimeController.class);
		DepartureInfo departureInfo = mock(DepartureInfo.class);
		
		when(departureControllerMock.getDepartureTime(1)).thenReturn(departureInfo);
		
		assertEquals(departureControllerMock.getDepartureTime(1), departureInfo);
		
	}

}
