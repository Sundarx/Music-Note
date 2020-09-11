//SUNDAR RAJ
public interface NoteADT
{
	// Sets a numeric value of the note
	public abstract void setValue(int value);

	// Sets a String value of the note from the numeric value
	public abstract void setStrValue();

	// Sets the key color of the note from the String value
	public abstract void setKeyColor();

	// Calculates and sets frequency of the note
	public abstract void setFrequency();

	// Sets the duration of the note
	public abstract void setLength(int length);

	// Sets a String value to the duration of the note
	public abstract void setStrLength();

	// Returns numeric value of note object
	public abstract int getValue();

	// Returns key String value of note object
	public abstract String getStrValue();

	// Returns key color of the note object
	public abstract String getKeyColor();

	// Returns the frequency of the note object
	public abstract double getFrequency();

	// Returns duration of the note object
	public abstract String getLength();
}