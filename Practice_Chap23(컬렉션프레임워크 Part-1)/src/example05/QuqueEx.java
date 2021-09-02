package example05;

import java.util.LinkedList;
import java.util.Queue;

public class QuqueEx {

	public static void main(String[] args) {
		
		Queue<Messge> mQueue = new LinkedList<Messge>();
		
		mQueue.offer(new Messge("sendMail", "코길동"));
		mQueue.offer(new Messge("sendSNS", "이나경"));
		mQueue.offer(new Messge("sendMailkakaotal", "송하영"));
		mQueue.offer(new Messge("sendFaceBook", "장규리"));

		
		while(!mQueue.isEmpty()) {
			Messge messge = mQueue.poll();
			System.out.println(mQueue.size());
			switch(messge.getComman()) {
				
			case "sendMail" :
				System.out.println(messge.getTo()+"에게 메일을 보냅니다.");
				break;
				
			case "sendSNS" :
				System.out.println(messge.getTo()+"에게 SNS을 보냅니다.");
				break;
				
			case "sendMailkakaotal" :
				System.out.println(messge.getTo()+"에게 카카오톡 을 보냅니다.");
				break;
				
			case "sendFaceBook" :
				System.out.println(messge.getTo()+"에게 페북을 보냅니다.");
				break;
			}
			
		}
	}

}
