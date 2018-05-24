package groupSteganography;

public class Main {
	ArrayList<Integer> changes= new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void addMesssage (String message) {
		for (int i=0; i<message.length(); i++) {
			int temp=message.charAt(i);
			changes.add(temp);
		}
	}
	public void ModifyAll(ArrayList<Integer> image) {
		for (int i=0; i<changes.size(); i++) {
			image.set(i, changes.get(i)+image.get(i));
		}
	}

}
