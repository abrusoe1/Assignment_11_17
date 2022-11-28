import java.util.*;

public class PigLatin {
	
	public static String translate(String plaintext)
	{
		String ptlc = plaintext.toLowerCase();	//ptlc = plaintext lower case
		if (ptlc.charAt(0) == 'a' || ptlc.charAt(0) == 'e' || ptlc.charAt(0) == 'i' || ptlc.charAt(0) == 'o' || ptlc.charAt(0) == 'u')
		{
			String pl = ptlc + "way";	// Pig Latin
			return pl;
		}
		else
		{
			int vowelposition = -1;
			for (int i = 0; i < ptlc.length(); i++)
			{
				if (ptlc.charAt(i) == 'a' || ptlc.charAt(i) == 'e' || ptlc.charAt(i) == 'i' || ptlc.charAt(i) == 'o' || ptlc.charAt(i) == 'u')
				{
					vowelposition = i;
					break;	//without this line it was looking for the last vowel (erstrongay rather than ongerstray on stronger, for example)
				}
			}
			if (vowelposition == -1)
			{
				String oops = "There aren't any vowels";
				return oops;
			}
			else
			{
				String pl = ptlc;
				for (int i = 0; i < vowelposition; i++)
				{
					pl = (pl + pl.charAt(0));
					pl = pl.substring(1);
				}
				pl = (pl + "ay");
				return pl;
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("Please enter a word to be translated into Pig Latin: ");
		Scanner scnr = new Scanner (System.in);
		String plaintext = scnr.next();
		String plf = translate(plaintext);
		System.out.println(plf);	//Pig Latin Final
		scnr.close();
	}

}
