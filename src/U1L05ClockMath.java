import javax.swing.JOptionPane;

public class U1L05ClockMath {
	public static void main (String [] args){
		//ask the user for a start time and duration
		//give an ending time
		int durationHours;
		int durationMinutes;
		//get start time as a string
		String startTime = JOptionPane.showInputDialog(null, "Give me a start time (ex: 3:10)");
		int duration = JOptionPane.showInputDialog(null, "Give me the duration of your activity in minutes (ex: 120 )");
		//figure out where the colon in
		int colonInd = startTime.indexOf(':');
		//take start of string to where the colon is and make it an integer
		int startHours = Integer.parseInt(startTime.substring(0, colonInd));
		//take colon to end of string and make it an integer
		int startMinutes = Integer.parseInt(startTime.substring(colonInd + 1, startTime.length()));
		//check that it came in correctly
		while(duration != 0) {
			duration /= 60;
			durationHours += 1;
			if(duration < 60) {
				durationMinutes += duration;
			}
		}
		System.out.println("Your activity will be over at: " + str(durationHours)+":" + str(durationMinutes));

}
}	