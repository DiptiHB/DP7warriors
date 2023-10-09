package com.interfaceadvance;
interface closet
{
  public static final int closetNo=1;
  void closetofRoom();
  
	  public default void UseCloset()
	  {
		 System.out.println("NOTE: Closet only can get used by roommate"); 
		 showOwner();
		 NoofRoommate();
	  }
	  private void showOwner()
	  {
	     System.out.println("order by :Owner ms.D'souza");
	  }
	  public static void NoofRoommate()
	  {
		  System.out.println("number of roommates are 4.");
	  }
}
class Room implements closet
{
	
	 public void closetofRoom()
	 {
		System.out.println("This closet belongs to Room 111 having name 'Orchid'"); 
		System.out.println("Closet have compartments like below:");
		System.out.println(" 1)new cloths \n 2)old cloths \n 3)night wears \n 4)party wears \n 5)shoes and sandels \n 6)secret compartment");
	 }
}
public class ClosetinRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     closet c;
     c=new Room();
     c.UseCloset();
     c.closetofRoom();
    
	}

}
