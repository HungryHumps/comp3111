package lab5.CI.stringparser;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringParserTest {

	private StringParser stringParser;

	@Before
	public void setUp() throws Exception {
		stringParser = new StringParser();
	}

	@Test
	public void testTransformData() throws ParseException {
		Object[] inputData = new Object[]
				{new SimpleDateFormat("yyyy").parse("2012"),100};
		String pattern = "yyyy-M-d";
		String result = stringParser.transformData(inputData, pattern);
		assertEquals("['2012-1-1',100%]", result);
	}

}
