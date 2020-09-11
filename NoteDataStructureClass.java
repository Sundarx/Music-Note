//SUNDAR RAJ
import java.text.DecimalFormat;

public class NoteDataStructureClass implements NoteADT
{
	private int value;
	private String strValue;
	private int length;
	private String strLength;
	private String keyColor;
	private double frequency;

	public NoteDataStructureClass()
	{

		this(-9, 3); // (Middle C, Quarter note)
	}

	public NoteDataStructureClass(int value, int length)
	{
		setValue(value);
		setLength(length);
	}

	public NoteDataStructureClass(NoteDataStructureClass ndsc)
	{
		setValue(ndsc.value);
		setLength(ndsc.length);
	}

	// Sets a numeric value of the note
	public void setValue(int value)
	{
		this.value = value;
		setStrValue();
		setKeyColor();
		setFrequency();
	}

	// Sets a String value of the note from the numeric value
	public void setStrValue()
	{
		if	(value == 0 || value == 12 || value == 24 || value == 36 ||
			value == -12 || value == -24 || value == -36 || value == -48)
		{
			strValue = "A";
		}
		else if(value == 1 || value == 13 || value == 25 || value == 37 ||
				value == -11 || value == -23 || value == -35 || value == -47)
		{
			strValue = "A#";
		}
		else if(value == 2 || value == 14 || value == 26 || value == 38 ||
				value == -10 || value == -22 || value == -34 || value == -46)
		{
			strValue = "B";
		}
		else if(value == 3 || value == 15 || value == 27 || value == 39 ||
				value == -9 || value == -21 || value == -33 || value == -45)
		{
			strValue = "C";
		}
		else if(value == 4 || value == 16 || value == 28 || value == -8 ||
				value == -20 || value == -32 || value == -44)
		{
			strValue = "C#";
		}
		else if(value == 5 || value == 17 || value == 29 || value == -7 ||
				value == -19 || value == -31 || value == -43)
		{
			strValue = "D";
		}
		else if(value == 6 || value == 18 || value == 30 || value == -6 ||
				value == -18 || value == -30 || value == -42)
		{
			strValue = "D#";
		}
		else if(value == 7 || value == 19 || value == 31 || value == -5 ||
				value == -17 || value == -29 || value == -41)
		{
			strValue = "E";
		}
		else if(value == 8 || value == 20 ||value == 32 || value == -4 ||
				value == -16 || value == -28 || value == -40)
		{
			strValue = "F";
		}
		else if(value == 9 || value == 21 || value == 33 || value == -3 ||
				value == -15 || value == -27 || value == - 39)
		{
			strValue = "F#";
		}
		else if(value == 10 || value == 22 || value == 34 || value == -2 ||
				value == -14 || value == -26 || value == -38)
		{
			strValue = "G";
		}
		else if(value == 11 || value == 23 || value == 35 || value == -1 ||
				value == -13 || value == -25 || value == -36)
		{
			strValue = "G#";
		}
		else
		{
			strValue = "Not in range";
		}
	}

	// Sets the key color of the note from the String value
	public void setKeyColor()
	{
		if(strValue.length() != 1)
		{
			keyColor = "Black key (sharp)";
		}
		else //(strValue.length() == 1)
		{
			keyColor = "White key (natural)";
		}
	}

	// Calculates and sets frequency of the note
	public void setFrequency()
	{
		frequency = 440.0 * Math.pow(2, value / 12.0);
	}

	// Sets the duration of the note
	public void setLength(int length)
	{
		this.length = length;
		setStrLength();
	}

	// Sets a String value to the duration of the note
	public void setStrLength()
	{
		if (length == 1)
		{
			strLength = "Sixteenth note";
		}
		if (length == 2)
		{
			strLength = "Eighth note";
		}
		if (length == 3)
		{
			strLength = "Quarter note";
		}
		if (length == 4)
		{
			strLength = "Half note";
		}
		if (length == 5)
		{
			strLength = "Whole note";
		}
	}

	// Returns numeric value of note object
	public int getValue()
	{
		return value;
	}

	// Returns key String value of note object
	public String getStrValue()
	{
		return strValue;
	}

	// Returns key color of the note object
	public String getKeyColor()
	{
		return keyColor;
	}

	// Returns the frequency of the note object
	public double getFrequency()
	{
		return frequency;
	}

	// Returns duration of the note object
	public String getLength()
	{
		return strLength;
	}

	// Overriden toString() method
	public String toString()
	{
		DecimalFormat fmt = new DecimalFormat("#,###.######");
		return 	  "\n" + getStrValue()
			 	+ "\nLength: " + getLength()
			 	+ "\nValue: " + getValue()
			 	+ "\n" + getKeyColor()
			 	+ "\n" + fmt.format(getFrequency()) + " Hz";
	}
}