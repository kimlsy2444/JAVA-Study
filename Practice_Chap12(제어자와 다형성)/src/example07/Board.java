package example07;

public class Board {

	private String subject;
	private String content;
	private String  writer;
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	
	public void show() {
		System.out.println("제목 : "+ this.getSubject()); 
		System.out.println("내용 : "+ this.getContent()); 
		System.out.println("작성자 : "+ this.getWriter()); 
		
	}
	
	
}
