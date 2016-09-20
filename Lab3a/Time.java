public class Time
{
  private int hour;
  private int minute;
  private int second;
  
  public Time()
  {
    setTime(0, 0, 0);
  }
  
  public Time(int h)
  {
    setTime(h, 0, 0);
  }
  
  public Time(int h, int m)
  {
    setTime(h, m, 0);
  }
  
  public Time(int h, int m, int s)
  {
    setTime(h, m, s);
  }
  
  public void setTime(int h, int m, int s)
  {
    setHour(h);
    setMinute(m);
    setSecond(s);
  }
  
  public void setHour(int h)
  {
    this.hour = ((h >= 0) && (h < 24) ? h : 0);
  }
  
  public void setMinute(int m)
  {
    this.minute = ((m >= 0) && (m < 60) ? m : 0);
  }
  
  public void setSecond(int s)
  {
    this.second = ((s >= 0) && (s < 60) ? s : 0);
  }
  
  public int getHour()
  {
    return this.hour;
  }
  
  public int getMinute()
  {
    return this.minute;
  }
  
  public int getSecond()
  {
    return this.second;
  }
  
  public String toMilitaryString()
  {
    return (this.hour < 10 ? "0" : "") + this.hour + (this.minute < 10 ? "0" : "") + this.minute;
  }
  
  public String toString()
  {
    return ((this.hour == 12) || (this.hour == 0) ? 12 : this.hour % 12) + ":" + (this.minute < 10 ? "0" : "") + this.minute + ":" + (this.second < 10 ? "0" : "") + this.second + (this.hour < 12 ? " AM" : " PM");
  }
  
  public void tick()
  {
    setSecond(this.second + 1);
    if (this.second == 0) {
      incrementMinute();
    }
  }
  
  public void incrementMinute()
  {
    setMinute(this.minute + 1);
    if (this.minute == 0) {
      incrementHour();
    }
  }
  
  public void incrementHour()
  {
    setHour(this.hour + 1);
  }
}
