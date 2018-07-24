package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String x = "";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(i%2);
			char c = s.charAt(i);
			if(i%2 == 1) {
			 c = Character.toUpperCase(c);
			}
			if(i%2 == 0) {
				c = Character.toLowerCase(c);
			}
			x += c;
		}
		return x;
	}

}
