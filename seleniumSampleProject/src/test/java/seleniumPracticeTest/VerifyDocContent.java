package seleniumPracticeTest;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.util.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyDocContent
{
	
	@Test
	public void verifyContent() throws IOException
	{
		//For defining the URL of PDF
		URL TestURL = new URL("http://www.axmag.com/download/pdfurl-guide.pdf");

		// For converting content inside PDF to text & using PDFBox API with java input stream for parsing
		BufferedInputStream TestFile = new BufferedInputStream(TestURL.openStream());
		PDFParser TestPDF = new PDFParser(TestFile);
		TestPDF.parse();
		String TestText = new PDFTextStripper().getText(TestPDF.getPDDocument());

		// Use TestNG assertion for checking if your text is present in content
		Assert.assertTrue(TestText.contains("text to verify")); 
	}

}
