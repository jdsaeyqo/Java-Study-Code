
public class PenMain {

	public static void main(String[] args) {
		
		//Pen의 기능과 속성을 사용하려면
		//설계용 클래스를 로딩시켜 Pen객체를 생성해야합니다.
		Pen blackPen = new Pen();
		
		//객체의 기능과 속성을 사용하기 위해서는
		//참조 연산자(.)를 사용
		blackPen.color = "검정";
		blackPen.price = 500;
		
		blackPen.write();
		blackPen.info();
		
		Pen redPen= new Pen();
		redPen.color="빨강";
		redPen.price=600;
		
		redPen.write();
		blackPen.write();
		redPen.info();
		
		//bluePen객체 생성
		
		Pen bluePen = new Pen();
		bluePen.color = "파랑";
		bluePen.price = 700;
		
		bluePen.write();
		bluePen.info();
		
	}

}
