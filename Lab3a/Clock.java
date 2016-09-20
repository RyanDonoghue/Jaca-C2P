public class Clock {

	public static void main(String[] args) {
		
		int s = getCurrentSecond();
		int m = getCurrentMinute();
		int h = getCurrentHour();

		
		Time time = new Time(h, m, s);
		
		while(time.getMinute()!=m+1){

			int currentSecond = getCurrentSecond();
			if (currentSecond == s + 1){
				time.tick();
				System.out.println(time.toString());
			}
			s = currentSecond;
		}
	}
	
	public static int getCurrentSecond(){
		return (int) (System.currentTimeMillis()/1000%60);
	}
	
	public static int getCurrentMinute(){
		return (int) (System.currentTimeMillis()/1000/60%60);
	}
	
	public static int getCurrentHour(){
		return (int) (System.currentTimeMillis()/1000/60/60%60%24);
	}

}