package selfDividingNumbers;

public class ModStrategy implements Strategy{

	@Override
	public boolean selfDividing(int num) {
		// TODO Auto-generated method stub
		int temp = num;
		for(int i = String.valueOf(num).length()-1;i >= 0;i--) {
			int divided = temp / (int)Math.pow(10, i);
			if(num % divided != 0)
				return false;
			temp = temp %(int)Math.pow(10, i);
		}
		return true;
	}

}
