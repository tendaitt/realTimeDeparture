package com.assessment.departure.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.assessment.departure.DepartureInfo;
import com.assessment.departure.NextBusDAO;

public class NextBusDAOTest {

	@Test
	public void testRetrieveDepartureInfoReturnsDepartureInfo() {
		NextBusDAO nextBusDAOMock = mock(NextBusDAO.class);
		DepartureInfo departureInfo = mock(DepartureInfo.class);
		
		when(nextBusDAOMock.retrieveDepartureInfo()).thenReturn(departureInfo);
		
		assertEquals(nextBusDAOMock.retrieveDepartureInfo(), departureInfo);
		
	}
	
	
}
