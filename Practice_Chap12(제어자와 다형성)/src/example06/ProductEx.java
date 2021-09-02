package example06;

import java.util.Scanner;

public class ProductEx {
	
	// 클래스 영역 공유데이터로 사용
	static int productID = 0;
	static int numberOfProduct = 0;
	static Product[] p = new Product[10];
	static	Scanner sin = new Scanner(System.in);
	public static void main(String[] args) {
	
	
		
		int choice = 0;
		
		while(choice!=3) {
			int type = 0;
			
			System.out.println("상품 조회 프로그램 입니다.");
			System.out.print("|상품 추가 (1)|상품조회(2)|끝내기(3)| >> ");
			choice = sin.nextInt();
			
			switch(choice){
			case 1 : 
				if(numberOfProduct>= p.length) {
					System.out.println("더이상 상품추가 불가 "); 
					break;
				}
				System.out.print("|책(1)|음악(2)|회화책(3)| >> "); 
				type = sin.nextInt();
				if(type < 1 || type >3) {
					System.out.println("잘못 입력함");
					break;
				}
				addProduct(type);
				break;
				
			case 2 : 
				for(int i = 0;i<numberOfProduct;i++)
				{
					p[i].showInfo();
				}
				break;
				
			case 3 :
				System.out.println("프로그램 종료");
				break;

			}
		}
		
		
	}
	
	
	public static void  addProduct(int type) {
		sin.nextLine();
		System.out.print("상품설명 >>");
		String desc = sin.nextLine();
		
		System.out.print("생산자 >> "); 
		String maker = sin.nextLine();
		
		System.out.print("가격 >> "); 
		int price = sin.nextInt();
		
		switch(type) {
		
		case 1 : 
			
			sin.nextLine();
			System.out.print("일반책 제목 >> ");
			String title = sin.nextLine();
			
			System.out.print("저자 >> ");
			String aothor = sin.nextLine();
			
			System.out.print("국제 표준도서번호 (ex.0001) >> ");
			int ISBN = sin.nextInt();
			
			//필드의 다형성 (조상 객체배열에 자손의 인스턴슬르 넣고 있음 )
			p[numberOfProduct] = new Book
			(productID++,desc,maker,price,ISBN,title,aothor);
			break;
			
		case 2 :
			sin.nextLine();
			System.out.print("앪범 제목 >> ");
			String albumTitle = sin.nextLine();
			
			System.out.print("가수 >> ");
			String artist = sin.nextLine();
			
			p[numberOfProduct] = new CompactDisk
			(productID++,desc,maker,price,albumTitle,artist);
			break;
			
		case 3 :
			
			sin.nextLine();
			System.out.print("회화책 제목 >> ");
			String title2 = sin.nextLine();
			
			System.out.print("저자 >> ");
			String aothor2 = sin.nextLine();
			
			System.out.print("언어 >> ");
			String language = sin.nextLine();
			
			System.out.print("국제 표준도서번호 (ex.0001) >> ");
			int ISBN2 = sin.nextInt();
			
			p[numberOfProduct] = new ConversationBook
			(productID++,desc,maker,price,ISBN2,title2,aothor2,language);
			break;
			
		}
		numberOfProduct++;
		
	}
	
	
	
	
	
	
}
