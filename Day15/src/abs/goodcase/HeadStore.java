package abs.goodcase;

public abstract class HeadStore {
	/*
	 * 1.메서드에 abstract를 붙이면 해당 메서드는 추상 메서드가 되며 이 메서드는 상속을 통해
	 * 자식 클래스에서 반드시 오버라이딩을 해야합니다. 그렇지 않으면 에러가 발생.
	 * 2.추상 메서드는 실체가 존재하지 않는 메서드의 틀 역할을 하기 때문에 메서드의 바디부분({})이 없고 세미콜론
	 * 으로 메서드 선언 마감.
	 * 3. 일반 클래스에서는 추상 메서드를 선언할 수 없습니다. 추상 메서드가 하나라도 존재하는 클래스는 반드시 추상 
	 * 클래스가 되어야 합니다.
	 * 4. 추상 클래스 내부에서는 추상 메서드만을 선언할 필요는 없습니다. 일반 메서드도 모두 선언 가능.
	 */

	public abstract void orderApple() ;
	public abstract void orderBanana() ;
	public abstract void orderGrape() ;
	public abstract void orderMelon() ;
	
	public void orderWaterMelon() {
		System.out.println("수박 주스의 갸격은 4000원입니다.");
	}
	public final void orderPeach() {
		System.out.println("복숭아 주스의 가격은 2000원입니다.");
	}



}
