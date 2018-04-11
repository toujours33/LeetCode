package selfDividingNumbers;

public class CharStrategy implements Strategy{

	@Override
	public boolean selfDividing(int num) {
		// TODO Auto-generated method stub
		String nString = String.valueOf(num);
		for (Character character : nString.toCharArray()) {
			if(num % (int)(character - '0') != 0)
				return false;
		}
		return true;
	}

}
