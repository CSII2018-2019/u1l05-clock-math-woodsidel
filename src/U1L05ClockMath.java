import javax.swing.JOptionPane;

public class U1L05ClockMath {
	public static void main (String [] args){
		//ask the user for a start time and duration
		//give an ending time
		
		//get start time as a string
		String startTime = JOptionPane.showInputDialog(null, "Give me a start time (ex: 3:10)");
		String endTime = JOptionPane.showInputDialog(null, "Give me an end time (ex: 3:10)");
		//figure out where the colon in
		int colonInd = startTime.indexOf(':');
		int indColon = endTime.indexOf(':');
		//take start of string to where the colon is and make it an integer
		int startHours = Integer.parseInt(startTime.substring(0, colonInd));
		int endHours = Integer.parseInt(endTime.substring(0, indColon));
		//take colon to end of string and make it an integer
		int startMinutes = Integer.parseInt(startTime.substring(colonInd + 1, startTime.length()));
		int endMinutes = Integer.parseInt(endTime.substring(colonInd + 1, endTime.length()));
		//check that it came in correctly
		if(endHours<startHours) {
			endHours += 12;
		}
		System.out.println("Hours: " + str(endHours-startHours)+"\n Minutes: " + str(endMinutes-startMinutes));
		
		
		
		
		
	}

	private static String str(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
