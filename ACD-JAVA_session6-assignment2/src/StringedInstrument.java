
public class StringedInstrument extends maininstument {

	// this class extends the abstract class Instrument and adds an attribute numberOfStrings. 
	
	
	
	int numberOfStrings;
	int numberOfholes;
	
	public void play()
	{}
	
	
}

class tambura extends StringedInstrument
{
	//This class extends the StringedInstrument class and provides body to the play method.
	
	
	public void play()
	{
		name="tambura";
		numberOfStrings = 20;
		
		System.out.println("The name of the instrument is: "+name+" and it has: "+numberOfStrings+" strings.");
	}
	
	
}



class veena extends StringedInstrument
{
	//this class also extends the StringedInstrument method and provides body for the play method.
	
	public void play()
	{
		name="veena";
		numberOfholes=25;
		
		System.out.println("The name of the instrument is: "+name+" and it has: "+numberOfholes+" strings.");
	}
	
	
}