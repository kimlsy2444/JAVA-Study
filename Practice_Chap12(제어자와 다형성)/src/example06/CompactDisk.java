package example06;

public class CompactDisk extends Product {
	

	private String albumTitle;
	private String artist;
	
	
	
	public CompactDisk(int proudctID, String description, String maker, int price, String albumTitle, String artist) {
		super(proudctID, description, maker, price);
		this.albumTitle = albumTitle;
		this.artist = artist;
	}
	

	public String getAlbumTitle() {
		return albumTitle;
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public void showInfo() {
	
		super.showInfo(); // 조상크래스의 매서드를 명시적 호출
		System.out.println("앨범제목 >> " + this.getAlbumTitle()); 
		System.out.println("가수 >> " + this.getArtist()); 
	
		 
	}
	
}
