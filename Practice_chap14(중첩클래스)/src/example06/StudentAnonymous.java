package example06;

public class StudentAnonymous {

	// 필드의 초기값
	
	Student student1 = new Student("이준성") {
		// 익명자손 객체의 멤버 메서드
		public void goSchool() {
			System.out.println(this.name+"이 등교합니다.");
		}
		@Override
		public void wake() {
			
			System.out.println("================================");
			System.out.println("필드의 초기값 형태로 만들어진 익명 자손 객체");
			System.out.println(this.name + "이 일어납니다.");
			this.goSchool();
			System.out.println("================================");
		}
		
	};
	
	//로컬 변수의 초기값
	public void method1() {
		Student lStudent = new Student("송하영") {
			
			public void goRoom() {
				System.out.println(this.name+"이 컴백준비를 하러 연습실에 갑니다.");
			}
			
			@Override
			public void wake() {
				
				System.out.println("================================");
				System.out.println("로컬변수의 형태로 만들어진 익명 자손 객체");
				System.out.println(this.name + "이 일어납니다.");
				this.goRoom();
				System.out.println("================================");
			}
			
		};
		lStudent.wake();
		
	}
	
	
	// 메서드의 매개변수 값
	
	public void method2(Student student) {
		student.wake();
	}
}



