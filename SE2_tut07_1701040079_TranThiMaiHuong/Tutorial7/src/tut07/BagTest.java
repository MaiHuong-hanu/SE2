package tut07;

public class BagTest {
public static void main(String[]args) {
	//create a bag with default size(capacity)
	BagInterface<String> aBag = new ArrayBag<>();
	System.out.println("Current size:"+ aBag.getCurrentSize());
	System.out.println("isEmpty?"+ aBag.isEmpty());
	aBag.add("MAC");
	aBag.add("BlackRouge");
	System.out.println("Current size:"+ aBag.getCurrentSize());
	System.out.println("isEmpty or not?"+ aBag.isEmpty());
	System.out.println("________________");
	//create a bag with customer size(capacity)
	BagInterface<Object> newBag = new ArrayBag<>(8);
	System.out.println("Current size:"+ newBag.getCurrentSize());
	System.out.println("isEmpty or not?"+ newBag.isEmpty());
	newBag.add("DrMarten");
	newBag.add("XiaoMi");
	System.out.println("Current size:"+ newBag.getCurrentSize());
	System.out.println("isEmpty or not?"+ newBag.isEmpty());	
}
}