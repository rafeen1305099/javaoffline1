/**
 * Created by User on 9/19/2015.
 */
public class Room {
    private String hallName;
    private int roomNo;
    private boolean status; // room allotment status
    public Room (){}
    public Room(String s,int n)
    {
        this.status=false;
        this.hallName=s;
        this.roomNo=n;
    }
    public void setHallName(String s)
    {
        this.hallName=s;
    }
    public void setRoomNo(int n)
    {
        this.roomNo=n;
    }
    public void setStatus(boolean n)
    {
        this.status=n;
    }
    public String getHallName()
    {
        return this.hallName;
    }
    public int getRoomNo()
    {
        return this.roomNo;
    }
    public int setStatus()
    {
        if(status) return 1;
        else return 0;
    }
    public int getStatus()
    {
        if (this.status) return 1;
        else return 0;
    }
    public void print()
    {
        if(status){
            System.out.println("Room No:" + getRoomNo()+ " of " + getHallName() + "Hall is currently alloted.");
        }
        else {
            System.out.println("Room No:" + getRoomNo()+ " of " + getHallName() + "Hall is currently available for allotment.");
        }
    }


}
