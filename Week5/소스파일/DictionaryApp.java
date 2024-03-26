
abstract class Pairmap{
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends Pairmap{
	protected int count = 0;
	
	public Dictionary(int capacity) {
		keyArray = new String[capacity];
		valueArray = new String[capacity];
	}
	
	//Override�� �߻�Ŭ���� ����
	String get(String key) {
		for(int i = 0; i < count; i++) {
			if(keyArray[i].equals(key))
				return valueArray[i];
		}
		
		return null;
	}
	
	void put(String key, String value) {
		int i = 0;
		for(i = 0; i < count; i++) {
			if(keyArray[i].equals(key))
				break;
		}
		
		if(i == count) {	//key�� dictionary�� �������� ����.
			if(i < keyArray.length) {
				keyArray[i] = key;
				valueArray[i] = value;
				count++;
			}
		}
		else {
			keyArray[i] = key;
			valueArray[i] = value;
		}
	}
	
	String delete (String key) {
		int i = 0;
		for(i = 0; i < count; i++) {
			if(keyArray[i].equals(key))
				break;
		}
		
		if(i == count)
			return null;
		
		String value = valueArray[i];
		
		int last = count - 1;
		for(int j = i; j < last; j++) {
			keyArray[j] = valueArray[j+1];
		}
		
		count--;
		return value;
	}
	
	int length() { return count; }
}

public class DictionaryApp {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");
		
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
	}

}
