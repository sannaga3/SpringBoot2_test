package service;

import java.util.ArrayList;

import entity.Member;

public class MemberServiceImpl implements MemberService {
	
	// インスタンスをシングルトンにして生成する
	private static MemberServiceImpl singleton = new MemberServiceImpl();
	
	// コンストラクターで初期化
	private MemberServiceImpl() {};
	
	// 自身のインスタンスを呼び出す
	public static MemberServiceImpl getInstance() {
		return singleton;
	}
	
    // 自動生成するとアノテーションがつく(@Override) コードに注釈として補足を加えることで、プログラムの動作を変更、開発時のルールの統一、フレームワークへの指示したりできる   https://camp.trainocate.co.jp/magazine/spring-annotation/
	@Override
	public String greet(int i) {
		String[] greetings = {"Good Morning", "Hello", "Good evening"};
		return greetings[i];
	}

	@Override
	public ArrayList<Member> getAll() {
		ArrayList<Member> list = new ArrayList<>();
		Member mem1 = new Member(1, "Bob", "Bob@example.com");
		Member mem2 = new Member(2, "Alice", "Alice@example.com");
		list.add(mem1);
		list.add(mem2);
		
		return list;
	}
	
	@Override
	public int sumOf(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}
}
