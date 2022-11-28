import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class PigLatinTest {
	
	@Test
	void testv1()	//vowel 1
	{
		String expected = "appleway";
		String actual = PigLatin.translate("apple");
		assertEquals(expected, actual);
	}
	
	@Test
	void testv2()
	{	
		assertEquals("elseway", PigLatin.translate("else"));
	}
	
	@Test
	void testv3()
	{	
		assertEquals("inway", PigLatin.translate("in"));
	}
	
	@Test
	void testv4()
	{	
		assertEquals("opalway", PigLatin.translate("opal"));
	}
	
	@Test
	void testv5()
	{	
		assertEquals("underway", PigLatin.translate("under"));
	}
	
	@Test
	void test1c1()	//1 consonant 1
	{	
		assertEquals("iraffegay", PigLatin.translate("giraffe"));
	}
	
	@Test
	void test1c2()
	{	
		assertEquals("ixnay", PigLatin.translate("nix"));	//"Ixnay on the upidstay"
	}
	
	@Test
	void test2c()
	{	
		assertEquals("upidstay", PigLatin.translate("stupid"));	//"Who are you calling upidstay?"	
	}
	
	@Test
	void test3c()
	{	
		assertEquals("ongstray", PigLatin.translate("strong"));
	}
	
	@Test
	void testlc()	//lower case
	{	
		assertEquals("amzeegay", PigLatin.translate("GaMzEe"));
	}
	
	@Test
	void testnv()	//no vowels
	{	
		assertEquals("There aren't any vowels", PigLatin.translate("gzlrk"));
	}
}
