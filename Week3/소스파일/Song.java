

public class Song{
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song() {
		title = "";
		artist = "";
		year = 0;
		country = "";
	}
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public Song(String title) {
		this.title = title;
		artist = "";
		year = 0;
		country = "";
	}
	public void show() {
		System.out.println(year + "�� " + country + "������ " + artist + "�� �θ� " + title);
	}
	
	public static void main(String args[]) {
		Song song1 = new Song("Dancing Queen", "ABBA", 1978, "Sweden");
		Song song2 = new Song("Hey Jude", "Beatles", 1980, "UK");
		
		song1.show();
		song2.show();
		
	}
}


//Song song = new Song();  -> Song()�� ������. �Ű������� ���� �� ����