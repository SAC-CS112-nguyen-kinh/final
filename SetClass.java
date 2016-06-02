package final1;

public class SetClass {

	private int distanceInMile;
	private int airSpeedMPH;
	private int elevationPerMinute;
	private int totalAltitude = 0;
	
	
	public void FlyingObject (int airSpeedMPH, int elevationPerMinute)
	{
		this.airSpeedMPH = 0;
		this.elevationPerMinute = 0;
	}
	
	public void FlyingObject ()
	{
		this.airSpeedMPH = distanceInMile /60;
		this.elevationPerMinute = elevationPerMinute;
	}
	
	
	public void SetAirSpeed(int airSpeedMPH)
	{
		this.airSpeedMPH = distanceInMile / 60 ;
	}
	
	public void SetAltimeter(int elevationPerMinute)
	{
		this.elevationPerMinute = elevationPerMinute;
	}
	
	public void Fly()
	{
		this.totalAltitude = this.totalAltitude + this.elevationPerMinute;
		this.distanceInMile = this.distanceInMile + this.airSpeedMPH;
	}
	
	public int GetAirSpeed()
	{
		return airSpeedMPH;
	}
	public int GetAltimeter()
	{
		return elevationPerMinute;
	}
	
	public String toString()
	{
		return " " + this.distanceInMile + this.totalAltitude;
	}
}
