//SUNDAR RAJ
import java.util.Scanner;

public class NoteClientDemoClass
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int input = 0;

		while(input != 7)
		{
			System.out.println(	"1- Sixteenth note\n" +
								"2- Eigtht note\n" +
								"3- Quarter note\n" +
					   		 	"4- Half note\n" +
					   		 	"5- Whole note\n" +
								"6- Use default constructor\n" +
								"7- Exit program\n");

			System.out.println("Enter a number for the length of the note\n"
								+ "or use the default constructor.");
			input = keyboard.nextInt();

			if (input >= 1 && input <= 5)
			{
				int length = input;
				System.out.println("Enter a number between -48 and 39 " +
									"for the value of the note: ");
				int value = keyboard.nextInt();

				NoteDataStructureClass note = new NoteDataStructureClass(value, length);
				System.out.println(note);
			}

			else if(input == 6)
			{
				System.out.println("\n---Default Constructor---");
				System.out.println(	"1- Sixteenth note\n" +
									"2- Eigtht note\n" +
									"3- Quarter note\n" +
								 	"4- Half note\n" +
							 	 	"5- Whole note\n" +
							 	 	"6- Use default constructor note\n");

				System.out.println("Enter a number to modify the length of the " +
									"default constructor note or use the " +
									"default constructor note.");
				int length = keyboard.nextInt();

				if(length == 6)
				{
					NoteDataStructureClass note = new NoteDataStructureClass();
					System.out.println(note);
				}

				else
				{
					System.out.println("Enter a number between -48 and 39 " +
									"for the value of the note: ");
					int value = keyboard.nextInt();

					NoteDataStructureClass note = new NoteDataStructureClass();
					note.setValue(value);
					note.setLength(length);
					System.out.println(note);
				}
			}

			else if(input == 7)
			{
				System.out.println("---Program exited---");
				System.exit(0);
			}

			else
			{
				System.out.println("Invalid Entry");
			}

			System.out.println();
		}
	}
}

