public class MeetingRoom
{
String uniqueID;
int capacity;
int floorNo;
MeetingRoom(String uniqueID, int capacity, int floorNo)
{
    this.uniqueID=uniqueID;
    this.capacity=capacity;
    this.floorNo=floorNo;
}
public String getUniqueId()
{
    return uniqueID;
}
public int getCapacity()
{
    return capacity;
}
public int getFloorNo()
{
    return floorNo;
}
}


