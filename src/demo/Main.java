package demo;

import java.util.ArrayList;

import entity.Member;
import service.MemberServiceImpl;

public class Main {

	public static void main(String[] args) {
//		MemberServiceImpl service = new MemberServiceImpl();
		// シングルトンで生成したインスタンスを変数化してから各メソッドを実行していく。単体テストでは MemberServiceImpl service = を MemberService service = とインターフェス名で行うことがある。
		MemberServiceImpl service = MemberServiceImpl.getInstance();
		
		System.out.println(service.greet(2));
		
		System.out.println(service.getAll());
		ArrayList<Member> list = service.getAll();
		for (Member m : list) {
			System.out.println(m.getId() + "," + m.getName() + "," + m.getEmail());
		}
		
		System.out.println(service.sumOf(1, 3));
	}

}
